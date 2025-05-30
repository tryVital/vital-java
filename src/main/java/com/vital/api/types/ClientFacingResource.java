/**
 * This file was auto-generated by Fern from our API Definition.
 */
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

    RESULT("result"),

    APPOINTMENT("appointment"),

    GLUCOSE("glucose"),

    HEARTRATE("heartrate"),

    HRV("hrv"),

    IGE("ige"),

    IGG("igg"),

    BLOOD_OXYGEN("blood_oxygen"),

    BLOOD_PRESSURE("blood_pressure"),

    CHOLESTEROL("cholesterol"),

    DEVICE("device"),

    WEIGHT("weight"),

    FAT("fat"),

    BODY_TEMPERATURE("body_temperature"),

    BODY_TEMPERATURE_DELTA("body_temperature_delta"),

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

    MENSTRUAL_CYCLE("menstrual_cycle"),

    SLEEP_CYCLE("sleep_cycle"),

    ELECTROCARDIOGRAM("electrocardiogram"),

    ELECTROCARDIOGRAM_VOLTAGE("electrocardiogram_voltage"),

    AFIB_BURDEN("afib_burden"),

    HEART_RATE_ALERT("heart_rate_alert"),

    STAND_HOUR("stand_hour"),

    STAND_DURATION("stand_duration"),

    SLEEP_APNEA_ALERT("sleep_apnea_alert"),

    SLEEP_BREATHING_DISTURBANCE("sleep_breathing_disturbance"),

    WHEELCHAIR_PUSH("wheelchair_push"),

    FORCED_EXPIRATORY_VOLUME_1("forced_expiratory_volume_1"),

    FORCED_VITAL_CAPACITY("forced_vital_capacity"),

    PEAK_EXPIRATORY_FLOW_RATE("peak_expiratory_flow_rate"),

    INHALER_USAGE("inhaler_usage"),

    FALL("fall"),

    UV_EXPOSURE("uv_exposure"),

    DAYLIGHT_EXPOSURE("daylight_exposure"),

    HANDWASHING("handwashing"),

    BASAL_BODY_TEMPERATURE("basal_body_temperature"),

    HEART_RATE_RECOVERY_ONE_MINUTE("heart_rate_recovery_one_minute"),

    BODY_MASS_INDEX("body_mass_index"),

    LEAN_BODY_MASS("lean_body_mass"),

    WAIST_CIRCUMFERENCE("waist_circumference"),

    WORKOUT_DISTANCE("workout_distance"),

    WORKOUT_SWIMMING_STROKE("workout_swimming_stroke"),

    WORKOUT_DURATION("workout_duration"),

    INSULIN_INJECTION("insulin_injection"),

    CARBOHYDRATES("carbohydrates"),

    NOTE("note"),

    SLEEP_STREAM("sleep_stream"),

    HYPNOGRAM("hypnogram");

    private final String value;

    ClientFacingResource(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
