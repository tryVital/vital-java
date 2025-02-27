/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AllowedRadius {
    TEN("10"),

    TWENTY("20"),

    TWENTY_FIVE("25"),

    FIFTY("50");

    private final String value;

    AllowedRadius(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
