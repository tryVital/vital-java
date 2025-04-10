/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Ethnicity {
    HISPANIC("hispanic"),

    NON_HISPANIC("non_hispanic"),

    ASHKENAZI_JEWISH("ashkenazi_jewish"),

    OTHER("other");

    private final String value;

    Ethnicity(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
