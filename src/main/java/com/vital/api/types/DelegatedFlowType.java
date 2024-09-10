/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DelegatedFlowType {
    ORDER_AND_RESULTS_WITH_CUSTOMER_PHYSICIAN_NETWORK("order_and_results_with_customer_physician_network"),

    ORDER_WITH_VITAL_PHYSICIAN_NETWORK("order_with_vital_physician_network"),

    ORDER_AND_RESULTS_WITH_VITAL_PHYSICIAN_NETWORK("order_and_results_with_vital_physician_network");

    private final String value;

    DelegatedFlowType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
