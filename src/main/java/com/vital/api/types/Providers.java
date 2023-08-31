package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Providers {
    OURA("oura"),

    FITBIT("fitbit"),

    GARMIN("garmin"),

    WHOOP("whoop"),

    STRAVA("strava"),

    RENPHO("renpho"),

    PELOTON("peloton"),

    WAHOO("wahoo"),

    ZWIFT("zwift"),

    FREESTYLE_LIBRE("freestyle_libre"),

    FREESTYLE_LIBRE_BLE("freestyle_libre_ble"),

    EIGHT_SLEEP("eight_sleep"),

    WITHINGS("withings"),

    APPLE_HEALTH_KIT("apple_health_kit"),

    MANUAL("manual"),

    IHEALTH("ihealth"),

    GOOGLE_FIT("google_fit"),

    BEURER_API("beurer_api"),

    BEURER_BLE("beurer_ble"),

    OMRON_BLE("omron_ble"),

    ACCUCHEK_BLE("accuchek_ble"),

    CONTOUR_BLE("contour_ble"),

    DEXCOM("dexcom"),

    DEXCOM_V_3("dexcom_v3"),

    HAMMERHEAD("hammerhead"),

    MY_FITNESS_PAL("my_fitness_pal"),

    HEALTH_CONNECT("health_connect"),

    POLAR("polar");

    private final String value;

    Providers(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}