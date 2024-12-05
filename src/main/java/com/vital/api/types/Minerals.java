/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Minerals {
    SODIUM("sodium"),

    POTASSIUM("potassium"),

    CALCIUM("calcium"),

    PHOSPHORUS("phosphorus"),

    MAGNESIUM("magnesium"),

    IRON("iron"),

    ZINC("zinc"),

    FLUORIDE("fluoride"),

    CHLORIDE("chloride");

    private final String value;

    Minerals(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
