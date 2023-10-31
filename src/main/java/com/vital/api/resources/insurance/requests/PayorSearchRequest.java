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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PayorSearchRequest.Builder.class)
public final class PayorSearchRequest {
    private final String insuranceName;

    private final Optional<String> insuranceState;

    private final Map<String, Object> additionalProperties;

    private PayorSearchRequest(
            String insuranceName, Optional<String> insuranceState, Map<String, Object> additionalProperties) {
        this.insuranceName = insuranceName;
        this.insuranceState = insuranceState;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("insurance_name")
    public String getInsuranceName() {
        return insuranceName;
    }

    @JsonProperty("insurance_state")
    public Optional<String> getInsuranceState() {
        return insuranceState;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PayorSearchRequest && equalTo((PayorSearchRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PayorSearchRequest other) {
        return insuranceName.equals(other.insuranceName) && insuranceState.equals(other.insuranceState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.insuranceName, this.insuranceState);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static InsuranceNameStage builder() {
        return new Builder();
    }

    public interface InsuranceNameStage {
        _FinalStage insuranceName(String insuranceName);

        Builder from(PayorSearchRequest other);
    }

    public interface _FinalStage {
        PayorSearchRequest build();

        _FinalStage insuranceState(Optional<String> insuranceState);

        _FinalStage insuranceState(String insuranceState);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements InsuranceNameStage, _FinalStage {
        private String insuranceName;

        private Optional<String> insuranceState = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(PayorSearchRequest other) {
            insuranceName(other.getInsuranceName());
            insuranceState(other.getInsuranceState());
            return this;
        }

        @Override
        @JsonSetter("insurance_name")
        public _FinalStage insuranceName(String insuranceName) {
            this.insuranceName = insuranceName;
            return this;
        }

        @Override
        public _FinalStage insuranceState(String insuranceState) {
            this.insuranceState = Optional.of(insuranceState);
            return this;
        }

        @Override
        @JsonSetter(value = "insurance_state", nulls = Nulls.SKIP)
        public _FinalStage insuranceState(Optional<String> insuranceState) {
            this.insuranceState = insuranceState;
            return this;
        }

        @Override
        public PayorSearchRequest build() {
            return new PayorSearchRequest(insuranceName, insuranceState, additionalProperties);
        }
    }
}