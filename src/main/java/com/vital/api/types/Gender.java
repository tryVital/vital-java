package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {
    FEMALE("female"),

    MALE("male"),

    OTHER("other"),

    UNKNOWN("unknown");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}