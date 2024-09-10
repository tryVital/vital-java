/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.profile.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ProfileGetRequest.Builder.class)
public final class ProfileGetRequest {
    private final Optional<String> provider;

    private final Map<String, Object> additionalProperties;

    private ProfileGetRequest(Optional<String> provider, Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Provider oura/strava etc
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProfileGetRequest && equalTo((ProfileGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProfileGetRequest other) {
        return provider.equals(other.provider);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.provider);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> provider = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ProfileGetRequest other) {
            provider(other.getProvider());
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        public ProfileGetRequest build() {
            return new ProfileGetRequest(provider, additionalProperties);
        }
    }
}
