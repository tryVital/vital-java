package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ManualProviders {
    BEURER_BLE("beurer_ble"),

    OMRON_BLE("omron_ble"),

    ACCUCHEK_BLE("accuchek_ble"),

    CONTOUR_BLE("contour_ble"),

    FREESTYLE_LIBRE_BLE("freestyle_libre_ble"),

    APPLE_HEALTH_KIT("apple_health_kit"),

    MANUAL("manual"),

    HEALTH_CONNECT("health_connect");

    private final String value;

    ManualProviders(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
