package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponsibleRelationship {
    SELF("Self"),

    SPOUSE("Spouse"),

    OTHER_RELATIONSHIP("Other Relationship");

    private final String value;

    ResponsibleRelationship(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
