/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CervicalMucusEntryQuality {
    DRY("dry"),

    STICKY("sticky"),

    CREAMY("creamy"),

    WATERY("watery"),

    EGG_WHITE("egg_white");

    private final String value;

    CervicalMucusEntryQuality(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}