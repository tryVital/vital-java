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
@JsonDeserialize(builder = PscAreaInfoDetails.Builder.class)
public final class PscAreaInfoDetails {
    private final boolean appointmentWithVital;

    private final int withinRadius;

    private final String radius;

    private final Map<String, Object> additionalProperties;

    private PscAreaInfoDetails(
            boolean appointmentWithVital, int withinRadius, String radius, Map<String, Object> additionalProperties) {
        this.appointmentWithVital = appointmentWithVital;
        this.withinRadius = withinRadius;
        this.radius = radius;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("appointment_with_vital")
    public boolean getAppointmentWithVital() {
        return appointmentWithVital;
    }

    @JsonProperty("within_radius")
    public int getWithinRadius() {
        return withinRadius;
    }

    @JsonProperty("radius")
    public String getRadius() {
        return radius;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PscAreaInfoDetails && equalTo((PscAreaInfoDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PscAreaInfoDetails other) {
        return appointmentWithVital == other.appointmentWithVital
                && withinRadius == other.withinRadius
                && radius.equals(other.radius);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.appointmentWithVital, this.withinRadius, this.radius);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AppointmentWithVitalStage builder() {
        return new Builder();
    }

    public interface AppointmentWithVitalStage {
        WithinRadiusStage appointmentWithVital(boolean appointmentWithVital);

        Builder from(PscAreaInfoDetails other);
    }

    public interface WithinRadiusStage {
        RadiusStage withinRadius(int withinRadius);
    }

    public interface RadiusStage {
        _FinalStage radius(String radius);
    }

    public interface _FinalStage {
        PscAreaInfoDetails build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AppointmentWithVitalStage, WithinRadiusStage, RadiusStage, _FinalStage {
        private boolean appointmentWithVital;

        private int withinRadius;

        private String radius;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PscAreaInfoDetails other) {
            appointmentWithVital(other.getAppointmentWithVital());
            withinRadius(other.getWithinRadius());
            radius(other.getRadius());
            return this;
        }

        @java.lang.Override
        @JsonSetter("appointment_with_vital")
        public WithinRadiusStage appointmentWithVital(boolean appointmentWithVital) {
            this.appointmentWithVital = appointmentWithVital;
            return this;
        }

        @java.lang.Override
        @JsonSetter("within_radius")
        public RadiusStage withinRadius(int withinRadius) {
            this.withinRadius = withinRadius;
            return this;
        }

        @java.lang.Override
        @JsonSetter("radius")
        public _FinalStage radius(String radius) {
            this.radius = radius;
            return this;
        }

        @java.lang.Override
        public PscAreaInfoDetails build() {
            return new PscAreaInfoDetails(appointmentWithVital, withinRadius, radius, additionalProperties);
        }
    }
}
