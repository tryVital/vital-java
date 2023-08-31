package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DemoProviders {
    APPLE_HEALTH_KIT("apple_health_kit"),

    FITBIT("fitbit"),

    FREESTYLE_LIBRE("freestyle_libre"),

    OURA("oura");

    private final String value;

    DemoProviders(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
