package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MarkerType {
    BIOMARKER("biomarker"),

    PANEL("panel");

    private final String value;

    MarkerType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
