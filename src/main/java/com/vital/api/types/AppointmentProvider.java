package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AppointmentProvider {
    GETLABS("getlabs"),

    AXLEHEALTH("axlehealth");

    private final String value;

    AppointmentProvider(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
