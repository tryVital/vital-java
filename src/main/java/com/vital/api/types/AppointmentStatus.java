package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AppointmentStatus {
    CONFIRMED("confirmed"),

    PENDING("pending"),

    IN_PROGRESS("in_progress"),

    COMPLETED("completed"),

    CANCELLED("cancelled");

    private final String value;

    AppointmentStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}