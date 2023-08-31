package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkCreateRequest.Builder.class)
public final class LinkCreateRequest {
    private final String userId;

    private final Optional<OffsetDateTime> expiresAt;

    private LinkCreateRequest(String userId, Optional<OffsetDateTime> expiresAt) {
        this.userId = userId;
        this.expiresAt = expiresAt;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkCreateRequest && equalTo((LinkCreateRequest) other);
    }

    private boolean equalTo(LinkCreateRequest other) {
        return userId.equals(other.userId) && expiresAt.equals(other.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.expiresAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        _FinalStage userId(String userId);

        Builder from(LinkCreateRequest other);
    }

    public interface _FinalStage {
        LinkCreateRequest build();

        _FinalStage expiresAt(Optional<OffsetDateTime> expiresAt);

        _FinalStage expiresAt(OffsetDateTime expiresAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, _FinalStage {
        private String userId;

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LinkCreateRequest other) {
            userId(other.getUserId());
            expiresAt(other.getExpiresAt());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public _FinalStage expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.of(expiresAt);
            return this;
        }

        @Override
        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public _FinalStage expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        @Override
        public LinkCreateRequest build() {
            return new LinkCreateRequest(userId, expiresAt);
        }
    }
}
