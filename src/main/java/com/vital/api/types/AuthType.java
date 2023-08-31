package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthType {
    PASSWORD("password"),

    OAUTH("oauth"),

    EMAIL("email");

    private final String value;

    AuthType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
