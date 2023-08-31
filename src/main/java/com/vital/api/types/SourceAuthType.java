package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceAuthType {
    OAUTH("oauth"),

    TEAM_OAUTH("team_oauth"),

    SDK("sdk"),

    PASSWORD("password"),

    EMAIL("email"),

    APP("app"),

    EMPTY("");

    private final String value;

    SourceAuthType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
