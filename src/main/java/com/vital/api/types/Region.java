package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Region {
    US("us"),

    EU("eu"),

    SG("sg"),

    DE("de"),

    AU("au"),

    BR("br"),

    NL("nl");

    private final String value;

    Region(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
