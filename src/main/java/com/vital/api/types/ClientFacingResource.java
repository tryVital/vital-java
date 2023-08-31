package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingResource {
    PROFILE("profile"),

    ACTIVITY("activity"),

    SLEEP("sleep"),

    BODY("body"),

    WORKOUTS("workouts"),

    WORKOUT_STREAM("workout_stream"),

    CONNECTION("connection"),

    ORDER("order"),

    GLUCOSE("glucose"),

    HEARTRATE("heartrate"),

    HRV("hrv"),

    HYPNOGRAM("hypnogram"),

    IGE("ige"),

    IGG("igg"),

    BLOOD_OXYGEN("blood_oxygen"),

    BLOOD_PRESSURE("blood_pressure"),

    CHOLESTEROL("cholesterol"),

    DEVICE("device"),

    WEIGHT("weight"),

    FAT("fat"),

    MEAL("meal"),

    WATER("water"),

    CAFFEINE("caffeine"),

    MINDFULNESS_MINUTES("mindfulness_minutes"),

    STEPS("steps"),

    CALORIES_ACTIVE("calories_active"),

    DISTANCE("distance"),

    FLOORS_CLIMBED("floors_climbed"),

    RESPIRATORY_RATE("respiratory_rate"),

    VO_2_MAX("vo2_max"),

    CALORIES_BASAL("calories_basal"),

    STRESS_LEVEL("stress_level"),

    SLEEP_STREAM("sleep_stream");

    private final String value;

    ClientFacingResource(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}