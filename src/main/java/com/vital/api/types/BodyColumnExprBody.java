/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BodyColumnExprBody {
    MEASURED_AT("measured_at"),

    WEIGHT_KILOGRAM("weight_kilogram"),

    FAT_MASS_PERCENTAGE("fat_mass_percentage"),

    WATER_PERCENTAGE("water_percentage"),

    MUSCLE_MASS_PERCENTAGE("muscle_mass_percentage"),

    VISCERAL_FAT_INDEX("visceral_fat_index"),

    BONE_MASS_PERCENTAGE("bone_mass_percentage"),

    BODY_MASS_INDEX("body_mass_index"),

    LEAN_BODY_MASS_KILOGRAM("lean_body_mass_kilogram"),

    WAIST_CIRCUMFERENCE_CENTIMETER("waist_circumference_centimeter"),

    SOURCE_TYPE("source_type"),

    SOURCE_PROVIDER("source_provider"),

    SOURCE_APP_ID("source_app_id"),

    SOURCE_DEVICE_ID("source_device_id"),

    TIME_ZONE("time_zone");

    private final String value;

    BodyColumnExprBody(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
