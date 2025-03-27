/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientFacingPeakExpiratoryFlowRateChangedEventType {
    DAILY_DATA_PEAK_EXPIRATORY_FLOW_RATE_CREATED("daily.data.peak_expiratory_flow_rate.created"),

    DAILY_DATA_PEAK_EXPIRATORY_FLOW_RATE_UPDATED("daily.data.peak_expiratory_flow_rate.updated");

    private final String value;

    ClientFacingPeakExpiratoryFlowRateChangedEventType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
