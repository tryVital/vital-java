/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingWorkoutDurationSampleIntensity {
    LOW("low"),

    MEDIUM("medium"),

    HIGH("high");

    private final String value;

    ClientFacingWorkoutDurationSampleIntensity(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
