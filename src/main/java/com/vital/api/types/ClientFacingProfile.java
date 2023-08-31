package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingProfile.Builder.class)
public final class ClientFacingProfile {
    private final String userId;

    private final String id;

    private final Optional<Integer> height;

    private final ClientFacingSource source;

    private ClientFacingProfile(String userId, String id, Optional<Integer> height, ClientFacingSource source) {
        this.userId = userId;
        this.id = id;
        this.height = height;
        this.source = source;
    }

    /**
     * @return User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("height")
    public Optional<Integer> getHeight() {
        return height;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingProfile && equalTo((ClientFacingProfile) other);
    }

    private boolean equalTo(ClientFacingProfile other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && height.equals(other.height)
                && source.equals(other.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.id, this.height, this.source);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        IdStage userId(String userId);

        Builder from(ClientFacingProfile other);
    }

    public interface IdStage {
        SourceStage id(String id);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ClientFacingProfile build();

        _FinalStage height(Optional<Integer> height);

        _FinalStage height(Integer height);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, IdStage, SourceStage, _FinalStage {
        private String userId;

        private String id;

        private ClientFacingSource source;

        private Optional<Integer> height = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingProfile other) {
            userId(other.getUserId());
            id(other.getId());
            height(other.getHeight());
            source(other.getSource());
            return this;
        }

        /**
         * <p>User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_id")
        public IdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public SourceStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @Override
        public _FinalStage height(Integer height) {
            this.height = Optional.of(height);
            return this;
        }

        @Override
        @JsonSetter(value = "height", nulls = Nulls.SKIP)
        public _FinalStage height(Optional<Integer> height) {
            this.height = height;
            return this;
        }

        @Override
        public ClientFacingProfile build() {
            return new ClientFacingProfile(userId, id, height, source);
        }
    }
}