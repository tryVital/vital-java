/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingInsulinInjectionSampleType {
    RAPID_ACTING("rapid_acting"),

    LONG_ACTING("long_acting");

    private final String value;

    ClientFacingInsulinInjectionSampleType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
