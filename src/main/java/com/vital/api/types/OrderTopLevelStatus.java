package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderTopLevelStatus {
    RECEIVED("received"),

    COLLECTING_SAMPLE("collecting_sample"),

    SAMPLE_WITH_LAB("sample_with_lab"),

    COMPLETED("completed"),

    CANCELLED("cancelled"),

    FAILED("failed");

    private final String value;

    OrderTopLevelStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
