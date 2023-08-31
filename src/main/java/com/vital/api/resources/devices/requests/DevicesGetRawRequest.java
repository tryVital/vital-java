package com.vital.api.resources.devices.requests;

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
@JsonDeserialize(builder = DevicesGetRawRequest.Builder.class)
public final class DevicesGetRawRequest {
    private final Optional<String> provider;

    private DevicesGetRawRequest(Optional<String> provider) {
        this.provider = provider;
    }

    /**
     * @return Provider oura/strava etc
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesGetRawRequest && equalTo((DevicesGetRawRequest) other);
    }

    private boolean equalTo(DevicesGetRawRequest other) {
        return provider.equals(other.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.provider);
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
        private Optional<String> provider = Optional.empty();

        private Builder() {}

        public Builder from(DevicesGetRawRequest other) {
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

        public DevicesGetRawRequest build() {
            return new DevicesGetRawRequest(provider);
        }
    }
}
