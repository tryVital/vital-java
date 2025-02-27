/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingVo2MaxChangedEventType {
    DAILY_DATA_VO_2_MAX_CREATED("daily.data.vo2_max.created"),

    DAILY_DATA_VO_2_MAX_UPDATED("daily.data.vo2_max.updated");

    private final String value;

    ClientFacingVo2MaxChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
