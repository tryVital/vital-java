/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProviderMfaRequestMethod {
    SMS("sms"),

    EMAIL("email");

    private final String value;

    ProviderMfaRequestMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
