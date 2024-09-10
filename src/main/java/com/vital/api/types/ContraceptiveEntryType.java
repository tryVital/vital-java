/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContraceptiveEntryType {
    UNSPECIFIED("unspecified"),

    IMPLANT("implant"),

    INJECTION("injection"),

    IUD("iud"),

    INTRAVAGINAL_RING("intravaginal_ring"),

    ORAL("oral"),

    PATCH("patch");

    private final String value;

    ContraceptiveEntryType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
