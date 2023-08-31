package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PhysicianNetworkT {
    WHEEL("WHEEL"),

    OPENLOOP("OPENLOOP");

    private final String value;

    PhysicianNetworkT(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
