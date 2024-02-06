/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HistoricalPullStatus {
    SUCCESS("success"),

    FAILURE("failure"),

    IN_PROGRESS("in_progress");

    private final String value;

    HistoricalPullStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}