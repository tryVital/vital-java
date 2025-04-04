/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingForcedExpiratoryVolume1ChangedEventType {
    DAILY_DATA_FORCED_EXPIRATORY_VOLUME_1_CREATED("daily.data.forced_expiratory_volume_1.created"),

    DAILY_DATA_FORCED_EXPIRATORY_VOLUME_1_UPDATED("daily.data.forced_expiratory_volume_1.updated");

    private final String value;

    ClientFacingForcedExpiratoryVolume1ChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
