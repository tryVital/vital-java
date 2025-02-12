/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingElectrocardiogramClassification {
    SINUS_RHYTHM("sinus_rhythm"),

    ATRIAL_FIBRILLATION("atrial_fibrillation"),

    INCONCLUSIVE("inconclusive");

    private final String value;

    ClientFacingElectrocardiogramClassification(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
