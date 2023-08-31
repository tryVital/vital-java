package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IngestibleTimeseriesResource {
    BLOOD_PRESSURE("blood_pressure"),

    BLOOD_OXYGEN("blood_oxygen"),

    GLUCOSE("glucose"),

    HEARTRATE("heartrate"),

    HEARTRATE_VARIABILITY("heartrate_variability"),

    WATER("water"),

    CAFFEINE("caffeine"),

    MINDFULNESS_MINUTES("mindfulness_minutes");

    private final String value;

    IngestibleTimeseriesResource(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
