package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeseriesResource {
    CALORIES_ACTIVE("calories_active"),

    CALORIES_BASAL("calories_basal"),

    DISTANCE("distance"),

    BLOOD_OXYGEN("blood_oxygen"),

    BLOOD_PRESSURE("blood_pressure"),

    BODY_FAT("body/fat"),

    BODY_WEIGHT("body/weight"),

    CHOLESTEROL("cholesterol"),

    CHOLESTEROL_LDL("cholesterol/ldl"),

    CHOLESTEROL_HDL("cholesterol/hdl"),

    CHOLESTEROL_TOTAL("cholesterol/total"),

    CHOLESTEROL_TRIGLYCERIDES("cholesterol/triglycerides"),

    FLOORS_CLIMBED("floors_climbed"),

    GLUCOSE("glucose"),

    HEARTRATE("heartrate"),

    HRV("hrv"),

    HEARTRATE_VARIABILITY("heartrate_variability"),

    HYPNOGRAM("hypnogram"),

    IGE("ige"),

    IGG("igg"),

    RESPIRATORY_RATE("respiratory_rate"),

    STEPS("steps"),

    STRESS_LEVEL("stress_level"),

    VO_2_MAX("vo2_max"),

    WATER("water"),

    CAFFEINE("caffeine"),

    MINDFULNESS_MINUTES("mindfulness_minutes");

    private final String value;

    TimeseriesResource(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}