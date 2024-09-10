/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LabTestSampleType {
    DRIED_BLOOD_SPOT("dried_blood_spot"),

    SERUM("serum"),

    SALIVA("saliva"),

    URINE("urine");

    private final String value;

    LabTestSampleType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
