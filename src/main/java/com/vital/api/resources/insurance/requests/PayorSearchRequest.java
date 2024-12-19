/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.insurance.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.PayorCodeExternalProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PayorSearchRequest.Builder.class)
public final class PayorSearchRequest {
    private final Optional<String> insuranceName;

    private final Optional<PayorCodeExternalProvider> provider;

    private final Optional<String> providerId;

    private final Map<String, Object> additionalProperties;

    private PayorSearchRequest(
            Optional<String> insuranceName,
            Optional<PayorCodeExternalProvider> provider,
            Optional<String> providerId,
            Map<String, Object> additionalProperties) {
        this.insuranceName = insuranceName;
        this.provider = provider;
        this.providerId = providerId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("insurance_name")
    public Optional<String> getInsuranceName() {
        return insuranceName;
    }

    @JsonProperty("provider")
    public Optional<PayorCodeExternalProvider> getProvider() {
        return provider;
    }

    @JsonProperty("provider_id")
    public Optional<String> getProviderId() {
        return providerId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PayorSearchRequest && equalTo((PayorSearchRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PayorSearchRequest other) {
        return insuranceName.equals(other.insuranceName)
                && provider.equals(other.provider)
                && providerId.equals(other.providerId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.insuranceName, this.provider, this.providerId);
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
        private Optional<String> insuranceName = Optional.empty();

        private Optional<PayorCodeExternalProvider> provider = Optional.empty();

        private Optional<String> providerId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PayorSearchRequest other) {
            insuranceName(other.getInsuranceName());
            provider(other.getProvider());
            providerId(other.getProviderId());
            return this;
        }

        @JsonSetter(value = "insurance_name", nulls = Nulls.SKIP)
        public Builder insuranceName(Optional<String> insuranceName) {
            this.insuranceName = insuranceName;
            return this;
        }

        public Builder insuranceName(String insuranceName) {
            this.insuranceName = Optional.of(insuranceName);
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<PayorCodeExternalProvider> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(PayorCodeExternalProvider provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @JsonSetter(value = "provider_id", nulls = Nulls.SKIP)
        public Builder providerId(Optional<String> providerId) {
            this.providerId = providerId;
            return this;
        }

        public Builder providerId(String providerId) {
            this.providerId = Optional.of(providerId);
            return this;
        }

        public PayorSearchRequest build() {
            return new PayorSearchRequest(insuranceName, provider, providerId, additionalProperties);
        }
    }
}
