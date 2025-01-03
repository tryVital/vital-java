/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AppointmentEventStatus {
    PENDING("pending"),

    SCHEDULED("scheduled"),

    COMPLETED("completed"),

    CANCELLED("cancelled"),

    IN_PROGRESS("in_progress");

    private final String value;

    AppointmentEventStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
