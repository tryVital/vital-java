package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ApiKeyRole {
    VITAL_ADMIN("vital_admin"),

    DEFAULT("default");

    private final String value;

    ApiKeyRole(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
