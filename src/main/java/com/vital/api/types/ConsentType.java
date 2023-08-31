package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConsentType {
    TERMS_OF_USE("terms-of-use"),

    TELEHEALTH_INFORMED_CONSENT("telehealth-informed-consent"),

    MOBILE_TERMS_AND_CONDITIONS("mobile-terms-and-conditions"),

    NOTICE_OF_PRIVACY_PRACTICES("notice-of-privacy-practices"),

    PRIVACY_POLICY("privacy-policy"),

    HIPAA_AUTHORIZATION("hipaa-authorization");

    private final String value;

    ConsentType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
