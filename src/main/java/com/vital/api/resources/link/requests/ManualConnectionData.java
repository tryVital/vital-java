package com.vital.api.resources.link.requests;

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
@JsonDeserialize(builder = ManualConnectionData.Builder.class)
public final class ManualConnectionData {
    private final String userId;

    private final Optional<String> providerId;

    private ManualConnectionData(String userId, Optional<String> providerId) {
        this.userId = userId;
        this.providerId = providerId;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("provider_id")
    public Optional<String> getProviderId() {
        return providerId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ManualConnectionData && equalTo((ManualConnectionData) other);
    }

    private boolean equalTo(ManualConnectionData other) {
        return userId.equals(other.userId) && providerId.equals(other.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.providerId);
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

        Builder from(ManualConnectionData other);
    }

    public interface _FinalStage {
        ManualConnectionData build();

        _FinalStage providerId(Optional<String> providerId);

        _FinalStage providerId(String providerId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, _FinalStage {
        private String userId;

        private Optional<String> providerId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ManualConnectionData other) {
            userId(other.getUserId());
            providerId(other.getProviderId());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public _FinalStage providerId(String providerId) {
            this.providerId = Optional.of(providerId);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_id", nulls = Nulls.SKIP)
        public _FinalStage providerId(Optional<String> providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        public ManualConnectionData build() {
            return new ManualConnectionData(userId, providerId);
        }
    }
}
