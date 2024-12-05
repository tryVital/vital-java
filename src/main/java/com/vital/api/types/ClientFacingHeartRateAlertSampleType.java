/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingHeartRateAlertSampleType {
    LOW_HEART_RATE("low_heart_rate"),

    HIGH_HEART_RATE("high_heart_rate"),

    IRREGULAR_RHYTHM("irregular_rhythm");

    private final String value;

    ClientFacingHeartRateAlertSampleType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}