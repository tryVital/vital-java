package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PasswordProviders {
    WHOOP("whoop"),

    RENPHO("renpho"),

    PELOTON("peloton"),

    ZWIFT("zwift"),

    EIGHT_SLEEP("eight_sleep"),

    BEURER_API("beurer_api"),

    DEXCOM("dexcom"),

    HAMMERHEAD("hammerhead"),

    MY_FITNESS_PAL("my_fitness_pal");

    private final String value;

    PasswordProviders(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
