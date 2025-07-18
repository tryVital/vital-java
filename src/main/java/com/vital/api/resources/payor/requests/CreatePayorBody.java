/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.payor.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Address;
import com.vital.api.types.PayorCodeExternalProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreatePayorBody.Builder.class)
public final class CreatePayorBody {
    private final String name;

    private final Address address;

    private final Optional<PayorCodeExternalProvider> provider;

    private final Optional<String> providerPayorId;

    private final Map<String, Object> additionalProperties;

    private CreatePayorBody(
            String name,
            Address address,
            Optional<PayorCodeExternalProvider> provider,
            Optional<String> providerPayorId,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.address = address;
        this.provider = provider;
        this.providerPayorId = providerPayorId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("provider")
    public Optional<PayorCodeExternalProvider> getProvider() {
        return provider;
    }

    @JsonProperty("provider_payor_id")
    public Optional<String> getProviderPayorId() {
        return providerPayorId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreatePayorBody && equalTo((CreatePayorBody) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreatePayorBody other) {
        return name.equals(other.name)
                && address.equals(other.address)
                && provider.equals(other.provider)
                && providerPayorId.equals(other.providerPayorId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.address, this.provider, this.providerPayorId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        AddressStage name(String name);

        Builder from(CreatePayorBody other);
    }

    public interface AddressStage {
        _FinalStage address(Address address);
    }

    public interface _FinalStage {
        CreatePayorBody build();

        _FinalStage provider(Optional<PayorCodeExternalProvider> provider);

        _FinalStage provider(PayorCodeExternalProvider provider);

        _FinalStage providerPayorId(Optional<String> providerPayorId);

        _FinalStage providerPayorId(String providerPayorId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, AddressStage, _FinalStage {
        private String name;

        private Address address;

        private Optional<String> providerPayorId = Optional.empty();

        private Optional<PayorCodeExternalProvider> provider = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreatePayorBody other) {
            name(other.getName());
            address(other.getAddress());
            provider(other.getProvider());
            providerPayorId(other.getProviderPayorId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public AddressStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("address")
        public _FinalStage address(Address address) {
            this.address = address;
            return this;
        }

        @java.lang.Override
        public _FinalStage providerPayorId(String providerPayorId) {
            this.providerPayorId = Optional.of(providerPayorId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider_payor_id", nulls = Nulls.SKIP)
        public _FinalStage providerPayorId(Optional<String> providerPayorId) {
            this.providerPayorId = providerPayorId;
            return this;
        }

        @java.lang.Override
        public _FinalStage provider(PayorCodeExternalProvider provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<PayorCodeExternalProvider> provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        public CreatePayorBody build() {
            return new CreatePayorBody(name, address, provider, providerPayorId, additionalProperties);
        }
    }
}
