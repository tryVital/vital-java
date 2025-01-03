/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CompanyDetails.Builder.class)
public final class CompanyDetails {
    private final String name;

    private final Address address;

    private final Map<String, Object> additionalProperties;

    private CompanyDetails(String name, Address address, Map<String, Object> additionalProperties) {
        this.name = name;
        this.address = address;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CompanyDetails && equalTo((CompanyDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CompanyDetails other) {
        return name.equals(other.name) && address.equals(other.address);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.address);
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

        Builder from(CompanyDetails other);
    }

    public interface AddressStage {
        _FinalStage address(Address address);
    }

    public interface _FinalStage {
        CompanyDetails build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, AddressStage, _FinalStage {
        private String name;

        private Address address;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CompanyDetails other) {
            name(other.getName());
            address(other.getAddress());
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
        public CompanyDetails build() {
            return new CompanyDetails(name, address, additionalProperties);
        }
    }
}
