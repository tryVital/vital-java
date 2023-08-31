package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OAuthProviders {
    OURA("oura"),

    FITBIT("fitbit"),

    GARMIN("garmin"),

    STRAVA("strava"),

    WAHOO("wahoo"),

    IHEALTH("ihealth"),

    WITHINGS("withings"),

    GOOGLE_FIT("google_fit"),

    DEXCOM_V_3("dexcom_v3"),

    POLAR("polar");

    private final String value;

    OAuthProviders(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}