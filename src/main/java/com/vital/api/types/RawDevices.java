package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RawDevices.Builder.class)
public final class RawDevices {
    private final List<DeviceV2InDb> devices;

    private RawDevices(List<DeviceV2InDb> devices) {
        this.devices = devices;
    }

    @JsonProperty("devices")
    public List<DeviceV2InDb> getDevices() {
        return devices;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RawDevices && equalTo((RawDevices) other);
    }

    private boolean equalTo(RawDevices other) {
        return devices.equals(other.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.devices);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<DeviceV2InDb> devices = new ArrayList<>();

        private Builder() {}

        public Builder from(RawDevices other) {
            devices(other.getDevices());
            return this;
        }

        @JsonSetter(value = "devices", nulls = Nulls.SKIP)
        public Builder devices(List<DeviceV2InDb> devices) {
            this.devices.clear();
            this.devices.addAll(devices);
            return this;
        }

        public Builder addDevices(DeviceV2InDb devices) {
            this.devices.add(devices);
            return this;
        }

        public Builder addAllDevices(List<DeviceV2InDb> devices) {
            this.devices.addAll(devices);
            return this;
        }

        public RawDevices build() {
            return new RawDevices(devices);
        }
    }
}
