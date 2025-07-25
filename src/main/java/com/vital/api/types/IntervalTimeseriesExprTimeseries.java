/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IntervalTimeseriesExprTimeseries {
    STEPS("steps"),

    DISTANCE("distance"),

    VO_2_MAX("vo2_max"),

    HEART_RATE_ALERT("heart_rate_alert"),

    STAND_HOUR("stand_hour"),

    SLEEP_BREATHING_DISTURBANCE("sleep_breathing_disturbance"),

    INSULIN_INJECTION("insulin_injection"),

    WATER("water"),

    CAFFEINE("caffeine"),

    MINDFULNESS_MINUTES("mindfulness_minutes"),

    CALORIES_ACTIVE("calories_active"),

    FLOORS_CLIMBED("floors_climbed"),

    CALORIES_BASAL("calories_basal"),

    AFIB_BURDEN("afib_burden"),

    STAND_DURATION("stand_duration"),

    SLEEP_APNEA_ALERT("sleep_apnea_alert"),

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

    BODY_MASS_INDEX("body_mass_index"),

    LEAN_BODY_MASS("lean_body_mass"),

    WAIST_CIRCUMFERENCE("waist_circumference"),

    HEART_RATE_RECOVERY_ONE_MINUTE("heart_rate_recovery_one_minute"),

    WORKOUT_SWIMMING_STROKE("workout_swimming_stroke"),

    WORKOUT_DISTANCE("workout_distance"),

    CARBOHYDRATES("carbohydrates");

    private final String value;

    IntervalTimeseriesExprTimeseries(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
