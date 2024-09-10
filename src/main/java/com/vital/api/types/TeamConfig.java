/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TeamConfig.Builder.class)
public final class TeamConfig {
    private final LibreConfig libreview;

    private final Optional<Boolean> textsEnabled;

    private final Optional<Boolean> pushHistoricalData;

    private final Optional<Boolean> providerRawData;

    private final Optional<Boolean> rejectDuplicateConnection;

    private final Optional<Boolean> sdkPerDeviceActivityTimeseries;

    private final Optional<EventDestinationPreferences> edsPreferences;

    private final Optional<List<String>> eventTypePrefixes;

    private final Map<String, Object> additionalProperties;

    private TeamConfig(
            LibreConfig libreview,
            Optional<Boolean> textsEnabled,
            Optional<Boolean> pushHistoricalData,
            Optional<Boolean> providerRawData,
            Optional<Boolean> rejectDuplicateConnection,
            Optional<Boolean> sdkPerDeviceActivityTimeseries,
            Optional<EventDestinationPreferences> edsPreferences,
            Optional<List<String>> eventTypePrefixes,
            Map<String, Object> additionalProperties) {
        this.libreview = libreview;
        this.textsEnabled = textsEnabled;
        this.pushHistoricalData = pushHistoricalData;
        this.providerRawData = providerRawData;
        this.rejectDuplicateConnection = rejectDuplicateConnection;
        this.sdkPerDeviceActivityTimeseries = sdkPerDeviceActivityTimeseries;
        this.edsPreferences = edsPreferences;
        this.eventTypePrefixes = eventTypePrefixes;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("libreview")
    public LibreConfig getLibreview() {
        return libreview;
    }

    @JsonProperty("texts_enabled")
    public Optional<Boolean> getTextsEnabled() {
        return textsEnabled;
    }

    @JsonProperty("push_historical_data")
    public Optional<Boolean> getPushHistoricalData() {
        return pushHistoricalData;
    }

    @JsonProperty("provider_raw_data")
    public Optional<Boolean> getProviderRawData() {
        return providerRawData;
    }

    @JsonProperty("reject_duplicate_connection")
    public Optional<Boolean> getRejectDuplicateConnection() {
        return rejectDuplicateConnection;
    }

    @JsonProperty("sdk_per_device_activity_timeseries")
    public Optional<Boolean> getSdkPerDeviceActivityTimeseries() {
        return sdkPerDeviceActivityTimeseries;
    }

    @JsonProperty("eds_preferences")
    public Optional<EventDestinationPreferences> getEdsPreferences() {
        return edsPreferences;
    }

    @JsonProperty("event_type_prefixes")
    public Optional<List<String>> getEventTypePrefixes() {
        return eventTypePrefixes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamConfig && equalTo((TeamConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TeamConfig other) {
        return libreview.equals(other.libreview)
                && textsEnabled.equals(other.textsEnabled)
                && pushHistoricalData.equals(other.pushHistoricalData)
                && providerRawData.equals(other.providerRawData)
                && rejectDuplicateConnection.equals(other.rejectDuplicateConnection)
                && sdkPerDeviceActivityTimeseries.equals(other.sdkPerDeviceActivityTimeseries)
                && edsPreferences.equals(other.edsPreferences)
                && eventTypePrefixes.equals(other.eventTypePrefixes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.libreview,
                this.textsEnabled,
                this.pushHistoricalData,
                this.providerRawData,
                this.rejectDuplicateConnection,
                this.sdkPerDeviceActivityTimeseries,
                this.edsPreferences,
                this.eventTypePrefixes);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LibreviewStage builder() {
        return new Builder();
    }

    public interface LibreviewStage {
        _FinalStage libreview(LibreConfig libreview);

        Builder from(TeamConfig other);
    }

    public interface _FinalStage {
        TeamConfig build();

        _FinalStage textsEnabled(Optional<Boolean> textsEnabled);

        _FinalStage textsEnabled(Boolean textsEnabled);

        _FinalStage pushHistoricalData(Optional<Boolean> pushHistoricalData);

        _FinalStage pushHistoricalData(Boolean pushHistoricalData);

        _FinalStage providerRawData(Optional<Boolean> providerRawData);

        _FinalStage providerRawData(Boolean providerRawData);

        _FinalStage rejectDuplicateConnection(Optional<Boolean> rejectDuplicateConnection);

        _FinalStage rejectDuplicateConnection(Boolean rejectDuplicateConnection);

        _FinalStage sdkPerDeviceActivityTimeseries(Optional<Boolean> sdkPerDeviceActivityTimeseries);

        _FinalStage sdkPerDeviceActivityTimeseries(Boolean sdkPerDeviceActivityTimeseries);

        _FinalStage edsPreferences(Optional<EventDestinationPreferences> edsPreferences);

        _FinalStage edsPreferences(EventDestinationPreferences edsPreferences);

        _FinalStage eventTypePrefixes(Optional<List<String>> eventTypePrefixes);

        _FinalStage eventTypePrefixes(List<String> eventTypePrefixes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LibreviewStage, _FinalStage {
        private LibreConfig libreview;

        private Optional<List<String>> eventTypePrefixes = Optional.empty();

        private Optional<EventDestinationPreferences> edsPreferences = Optional.empty();

        private Optional<Boolean> sdkPerDeviceActivityTimeseries = Optional.empty();

        private Optional<Boolean> rejectDuplicateConnection = Optional.empty();

        private Optional<Boolean> providerRawData = Optional.empty();

        private Optional<Boolean> pushHistoricalData = Optional.empty();

        private Optional<Boolean> textsEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TeamConfig other) {
            libreview(other.getLibreview());
            textsEnabled(other.getTextsEnabled());
            pushHistoricalData(other.getPushHistoricalData());
            providerRawData(other.getProviderRawData());
            rejectDuplicateConnection(other.getRejectDuplicateConnection());
            sdkPerDeviceActivityTimeseries(other.getSdkPerDeviceActivityTimeseries());
            edsPreferences(other.getEdsPreferences());
            eventTypePrefixes(other.getEventTypePrefixes());
            return this;
        }

        @java.lang.Override
        @JsonSetter("libreview")
        public _FinalStage libreview(LibreConfig libreview) {
            this.libreview = libreview;
            return this;
        }

        @java.lang.Override
        public _FinalStage eventTypePrefixes(List<String> eventTypePrefixes) {
            this.eventTypePrefixes = Optional.of(eventTypePrefixes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "event_type_prefixes", nulls = Nulls.SKIP)
        public _FinalStage eventTypePrefixes(Optional<List<String>> eventTypePrefixes) {
            this.eventTypePrefixes = eventTypePrefixes;
            return this;
        }

        @java.lang.Override
        public _FinalStage edsPreferences(EventDestinationPreferences edsPreferences) {
            this.edsPreferences = Optional.of(edsPreferences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "eds_preferences", nulls = Nulls.SKIP)
        public _FinalStage edsPreferences(Optional<EventDestinationPreferences> edsPreferences) {
            this.edsPreferences = edsPreferences;
            return this;
        }

        @java.lang.Override
        public _FinalStage sdkPerDeviceActivityTimeseries(Boolean sdkPerDeviceActivityTimeseries) {
            this.sdkPerDeviceActivityTimeseries = Optional.of(sdkPerDeviceActivityTimeseries);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sdk_per_device_activity_timeseries", nulls = Nulls.SKIP)
        public _FinalStage sdkPerDeviceActivityTimeseries(Optional<Boolean> sdkPerDeviceActivityTimeseries) {
            this.sdkPerDeviceActivityTimeseries = sdkPerDeviceActivityTimeseries;
            return this;
        }

        @java.lang.Override
        public _FinalStage rejectDuplicateConnection(Boolean rejectDuplicateConnection) {
            this.rejectDuplicateConnection = Optional.of(rejectDuplicateConnection);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reject_duplicate_connection", nulls = Nulls.SKIP)
        public _FinalStage rejectDuplicateConnection(Optional<Boolean> rejectDuplicateConnection) {
            this.rejectDuplicateConnection = rejectDuplicateConnection;
            return this;
        }

        @java.lang.Override
        public _FinalStage providerRawData(Boolean providerRawData) {
            this.providerRawData = Optional.of(providerRawData);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider_raw_data", nulls = Nulls.SKIP)
        public _FinalStage providerRawData(Optional<Boolean> providerRawData) {
            this.providerRawData = providerRawData;
            return this;
        }

        @java.lang.Override
        public _FinalStage pushHistoricalData(Boolean pushHistoricalData) {
            this.pushHistoricalData = Optional.of(pushHistoricalData);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "push_historical_data", nulls = Nulls.SKIP)
        public _FinalStage pushHistoricalData(Optional<Boolean> pushHistoricalData) {
            this.pushHistoricalData = pushHistoricalData;
            return this;
        }

        @java.lang.Override
        public _FinalStage textsEnabled(Boolean textsEnabled) {
            this.textsEnabled = Optional.of(textsEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "texts_enabled", nulls = Nulls.SKIP)
        public _FinalStage textsEnabled(Optional<Boolean> textsEnabled) {
            this.textsEnabled = textsEnabled;
            return this;
        }

        @java.lang.Override
        public TeamConfig build() {
            return new TeamConfig(
                    libreview,
                    textsEnabled,
                    pushHistoricalData,
                    providerRawData,
                    rejectDuplicateConnection,
                    sdkPerDeviceActivityTimeseries,
                    edsPreferences,
                    eventTypePrefixes,
                    additionalProperties);
        }
    }
}
