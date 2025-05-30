/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingHeartRateRecoveryOneMinuteChangedEventType {
    DAILY_DATA_HEART_RATE_RECOVERY_ONE_MINUTE_CREATED("daily.data.heart_rate_recovery_one_minute.created"),

    DAILY_DATA_HEART_RATE_RECOVERY_ONE_MINUTE_UPDATED("daily.data.heart_rate_recovery_one_minute.updated");

    private final String value;

    ClientFacingHeartRateRecoveryOneMinuteChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
