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
@JsonDeserialize(builder = PscAreaInfo.Builder.class)
public final class PscAreaInfo {
    private final PscAreaInfoDetails patientServiceCenters;

    private final Map<String, Object> additionalProperties;

    private PscAreaInfo(PscAreaInfoDetails patientServiceCenters, Map<String, Object> additionalProperties) {
        this.patientServiceCenters = patientServiceCenters;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("patient_service_centers")
    public PscAreaInfoDetails getPatientServiceCenters() {
        return patientServiceCenters;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PscAreaInfo && equalTo((PscAreaInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PscAreaInfo other) {
        return patientServiceCenters.equals(other.patientServiceCenters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.patientServiceCenters);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PatientServiceCentersStage builder() {
        return new Builder();
    }

    public interface PatientServiceCentersStage {
        _FinalStage patientServiceCenters(PscAreaInfoDetails patientServiceCenters);

        Builder from(PscAreaInfo other);
    }

    public interface _FinalStage {
        PscAreaInfo build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PatientServiceCentersStage, _FinalStage {
        private PscAreaInfoDetails patientServiceCenters;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(PscAreaInfo other) {
            patientServiceCenters(other.getPatientServiceCenters());
            return this;
        }

        @Override
        @JsonSetter("patient_service_centers")
        public _FinalStage patientServiceCenters(PscAreaInfoDetails patientServiceCenters) {
            this.patientServiceCenters = patientServiceCenters;
            return this;
        }

        @Override
        public PscAreaInfo build() {
            return new PscAreaInfo(patientServiceCenters, additionalProperties);
        }
    }
}
