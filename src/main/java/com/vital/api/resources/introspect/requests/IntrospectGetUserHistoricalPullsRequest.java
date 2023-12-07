/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.introspect.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Providers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = IntrospectGetUserHistoricalPullsRequest.Builder.class)
public final class IntrospectGetUserHistoricalPullsRequest {
    private final Optional<String> userId;

    private final Optional<Providers> provider;

    private final Optional<Integer> userLimit;

    private final Optional<String> cursor;

    private final Map<String, Object> additionalProperties;

    private IntrospectGetUserHistoricalPullsRequest(
            Optional<String> userId,
            Optional<Providers> provider,
            Optional<Integer> userLimit,
            Optional<String> cursor,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.provider = provider;
        this.userLimit = userLimit;
        this.cursor = cursor;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("provider")
    public Optional<Providers> getProvider() {
        return provider;
    }

    @JsonProperty("user_limit")
    public Optional<Integer> getUserLimit() {
        return userLimit;
    }

    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IntrospectGetUserHistoricalPullsRequest
                && equalTo((IntrospectGetUserHistoricalPullsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(IntrospectGetUserHistoricalPullsRequest other) {
        return userId.equals(other.userId)
                && provider.equals(other.provider)
                && userLimit.equals(other.userLimit)
                && cursor.equals(other.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.provider, this.userLimit, this.cursor);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> userId = Optional.empty();

        private Optional<Providers> provider = Optional.empty();

        private Optional<Integer> userLimit = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(IntrospectGetUserHistoricalPullsRequest other) {
            userId(other.getUserId());
            provider(other.getProvider());
            userLimit(other.getUserLimit());
            cursor(other.getCursor());
            return this;
        }

        @JsonSetter(value = "user_id", nulls = Nulls.SKIP)
        public Builder userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Optional.of(userId);
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<Providers> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(Providers provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @JsonSetter(value = "user_limit", nulls = Nulls.SKIP)
        public Builder userLimit(Optional<Integer> userLimit) {
            this.userLimit = userLimit;
            return this;
        }

        public Builder userLimit(Integer userLimit) {
            this.userLimit = Optional.of(userLimit);
            return this;
        }

        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public Builder cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        public IntrospectGetUserHistoricalPullsRequest build() {
            return new IntrospectGetUserHistoricalPullsRequest(
                    userId, provider, userLimit, cursor, additionalProperties);
        }
    }
}
