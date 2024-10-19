/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus {
    RECEIVED_WALK_IN_TEST_ORDERED("received.walk_in_test.ordered"),

    RECEIVED_WALK_IN_TEST_REQUISITION_CREATED("received.walk_in_test.requisition_created"),

    COMPLETED_WALK_IN_TEST_COMPLETED("completed.walk_in_test.completed"),

    SAMPLE_WITH_LAB_WALK_IN_TEST_PARTIAL_RESULTS("sample_with_lab.walk_in_test.partial_results"),

    FAILED_WALK_IN_TEST_SAMPLE_ERROR("failed.walk_in_test.sample_error"),

    CANCELLED_WALK_IN_TEST_CANCELLED("cancelled.walk_in_test.cancelled"),

    COLLECTING_SAMPLE_WALK_IN_TEST_APPOINTMENT_PENDING("collecting_sample.walk_in_test.appointment_pending"),

    COLLECTING_SAMPLE_WALK_IN_TEST_APPOINTMENT_SCHEDULED("collecting_sample.walk_in_test.appointment_scheduled"),

    COLLECTING_SAMPLE_WALK_IN_TEST_APPOINTMENT_CANCELLED("collecting_sample.walk_in_test.appointment_cancelled"),

    RECEIVED_AT_HOME_PHLEBOTOMY_ORDERED("received.at_home_phlebotomy.ordered"),

    RECEIVED_AT_HOME_PHLEBOTOMY_REQUISITION_CREATED("received.at_home_phlebotomy.requisition_created"),

    COLLECTING_SAMPLE_AT_HOME_PHLEBOTOMY_APPOINTMENT_PENDING(
            "collecting_sample.at_home_phlebotomy.appointment_pending"),

    COLLECTING_SAMPLE_AT_HOME_PHLEBOTOMY_APPOINTMENT_SCHEDULED(
            "collecting_sample.at_home_phlebotomy.appointment_scheduled"),

    COLLECTING_SAMPLE_AT_HOME_PHLEBOTOMY_DRAW_COMPLETED("collecting_sample.at_home_phlebotomy.draw_completed"),

    COLLECTING_SAMPLE_AT_HOME_PHLEBOTOMY_APPOINTMENT_CANCELLED(
            "collecting_sample.at_home_phlebotomy.appointment_cancelled"),

    COMPLETED_AT_HOME_PHLEBOTOMY_COMPLETED("completed.at_home_phlebotomy.completed"),

    SAMPLE_WITH_LAB_AT_HOME_PHLEBOTOMY_PARTIAL_RESULTS("sample_with_lab.at_home_phlebotomy.partial_results"),

    CANCELLED_AT_HOME_PHLEBOTOMY_CANCELLED("cancelled.at_home_phlebotomy.cancelled"),

    FAILED_AT_HOME_PHLEBOTOMY_SAMPLE_ERROR("failed.at_home_phlebotomy.sample_error"),

    RECEIVED_TESTKIT_ORDERED("received.testkit.ordered"),

    RECEIVED_TESTKIT_AWAITING_REGISTRATION("received.testkit.awaiting_registration"),

    RECEIVED_TESTKIT_REQUISITION_CREATED("received.testkit.requisition_created"),

    RECEIVED_TESTKIT_REGISTERED("received.testkit.registered"),

    COLLECTING_SAMPLE_TESTKIT_TRANSIT_CUSTOMER("collecting_sample.testkit.transit_customer"),

    COLLECTING_SAMPLE_TESTKIT_OUT_FOR_DELIVERY("collecting_sample.testkit.out_for_delivery"),

    COLLECTING_SAMPLE_TESTKIT_WITH_CUSTOMER("collecting_sample.testkit.with_customer"),

    COLLECTING_SAMPLE_TESTKIT_TRANSIT_LAB("collecting_sample.testkit.transit_lab"),

    SAMPLE_WITH_LAB_TESTKIT_DELIVERED_TO_LAB("sample_with_lab.testkit.delivered_to_lab"),

    COMPLETED_TESTKIT_COMPLETED("completed.testkit.completed"),

    FAILED_TESTKIT_FAILURE_TO_DELIVER_TO_CUSTOMER("failed.testkit.failure_to_deliver_to_customer"),

    FAILED_TESTKIT_FAILURE_TO_DELIVER_TO_LAB("failed.testkit.failure_to_deliver_to_lab"),

    FAILED_TESTKIT_SAMPLE_ERROR("failed.testkit.sample_error"),

    FAILED_TESTKIT_LOST("failed.testkit.lost"),

    CANCELLED_TESTKIT_CANCELLED("cancelled.testkit.cancelled"),

    CANCELLED_TESTKIT_DO_NOT_PROCESS("cancelled.testkit.do_not_process");

    private final String value;

    OrderStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
