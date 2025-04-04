/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingLeanBodyMassChangedEventType {
    DAILY_DATA_LEAN_BODY_MASS_CREATED("daily.data.lean_body_mass.created"),

    DAILY_DATA_LEAN_BODY_MASS_UPDATED("daily.data.lean_body_mass.updated");

    private final String value;

    ClientFacingLeanBodyMassChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
