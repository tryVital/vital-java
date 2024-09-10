/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OvulationTestEntryTestResult {
    NEGATIVE("negative"),

    POSITIVE("positive"),

    LUTEINIZING_HORMONE_SURGE("luteinizing_hormone_surge"),

    ESTROGEN_SURGE("estrogen_surge"),

    INDETERMINATE("indeterminate");

    private final String value;

    OvulationTestEntryTestResult(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
