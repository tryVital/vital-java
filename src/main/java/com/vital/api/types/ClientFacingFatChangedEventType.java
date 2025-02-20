/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingFatChangedEventType {
    DAILY_DATA_FAT_CREATED("daily.data.fat.created"),

    DAILY_DATA_FAT_UPDATED("daily.data.fat.updated");

    private final String value;

    ClientFacingFatChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
