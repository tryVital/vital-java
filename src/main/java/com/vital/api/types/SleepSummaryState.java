/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SleepSummaryState {
    TENTATIVE("tentative"),

    CONFIRMED("confirmed");

    private final String value;

    SleepSummaryState(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
