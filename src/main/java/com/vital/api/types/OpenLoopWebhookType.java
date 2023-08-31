package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OpenLoopWebhookType {
    APPOINTMENT_CREATED("appointment.created"),

    APPOINTMENT_UPDATED("appointment.updated"),

    APPOINTMENT_DELETED("appointment.deleted"),

    BILLING_ITEM_CREATED("billing_item.created"),

    BILLING_ITEM_UPDATED("billing_item.updated"),

    CMS_1500_CREATED("cms1500.created"),

    CMS_1500_UPDATED("cms1500.updated"),

    CMS_1500_DELETED("cms1500.deleted"),

    COMMENT_CREATED("comment.created"),

    COMMENT_UPDATED("comment.updated"),

    COMMENT_DELETED("comment.deleted"),

    CONVERSATION_MEMBERSHIP_VIEWED("conversation_membership.viewed"),

    DOCUMENT_CREATED("document.created"),

    DOCUMENT_UPDATED("document.updated"),

    DOCUMENT_DELETED("document.deleted"),

    ENTRY_CREATED("entry.created"),

    ENTRY_UPDATED("entry.updated"),

    ENTRY_DELETED("entry.deleted"),

    FORM_ANSWER_GROUP_CREATED("form_answer_group.created"),

    FORM_ANSWER_GROUP_DELETED("form_answer_group.deleted"),

    FORM_ANSWER_GROUP_LOCKED("form_answer_group.locked"),

    GOAL_CREATED("goal.created"),

    GOAL_UPDATED("goal.updated"),

    GOAL_DELETED("goal.deleted"),

    GOAL_HISTORY_CREATED("goal_history.created"),

    INSURANCE_AUTHORIZATION_CREATED("insurance_authorization.created"),

    INSURANCE_AUTHORIZATION_UPDATED("insurance_authorization.updated"),

    INSURANCE_AUTHORIZATION_DELETED("insurance_authorization.deleted"),

    MESSAGE_CREATED("message.created"),

    MESSAGE_DELETED("message.deleted"),

    METRIC_ENTRY_CREATED("metric_entry.created"),

    METRIC_ENTRY_UPDATED("metric_entry.updated"),

    METRIC_ENTRY_DELETED("metric_entry.deleted"),

    PATIENT_CREATED("patient.created"),

    PATIENT_UPDATED("patient.updated"),

    PAYMENT_CREATED("payment.created"),

    PAYMENT_UPDATED("payment.updated"),

    PAYMENT_DELETED("payment.deleted"),

    POLICY_CREATED("policy.created"),

    POLICY_UPDATED("policy.updated"),

    POLICY_DELETED("policy.deleted"),

    REQUESTED_FORM_COMPLETION_CREATED("requested_form_completion.created"),

    REQUESTED_FORM_COMPLETION_UPDATED("requested_form_completion.updated"),

    REQUESTED_FORM_COMPLETION_DELETED("requested_form_completion.deleted"),

    TASK_CREATED("task.created"),

    TASK_UPDATED("task.updated"),

    TASK_DELETED("task.deleted");

    private final String value;

    OpenLoopWebhookType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
