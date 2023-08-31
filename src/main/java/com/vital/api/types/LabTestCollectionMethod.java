package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LabTestCollectionMethod {
    TESTKIT("testkit"),

    WALK_IN_TEST("walk_in_test"),

    AT_HOME_PHLEBOTOMY("at_home_phlebotomy");

    private final String value;

    LabTestCollectionMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
