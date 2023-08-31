package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OpenLoopResourceIdType {
    APPOINTMENT("Appointment"),

    FORM_ANSWER_GROUP("FormAnswerGroup"),

    ENTRY("Entry"),

    NOTE("Note");

    private final String value;

    OpenLoopResourceIdType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
