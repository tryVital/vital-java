/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingHrvChangedEventType {
    DAILY_DATA_HRV_CREATED("daily.data.hrv.created"),

    DAILY_DATA_HRV_UPDATED("daily.data.hrv.updated");

    private final String value;

    ClientFacingHrvChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
