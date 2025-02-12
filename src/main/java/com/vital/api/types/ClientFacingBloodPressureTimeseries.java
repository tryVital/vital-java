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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingBloodPressureTimeseries.Builder.class)
public final class ClientFacingBloodPressureTimeseries {
    private final Optional<Integer> id;

    private final Optional<Integer> timezoneOffset;

    private final Optional<String> type;

    private final String unit;

    private final String timestamp;

    private final double systolic;

    private final double diastolic;

    private final Map<String, Object> additionalProperties;

    private ClientFacingBloodPressureTimeseries(
            Optional<Integer> id,
            Optional<Integer> timezoneOffset,
            Optional<String> type,
            String unit,
            String timestamp,
            double systolic,
            double diastolic,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.timezoneOffset = timezoneOffset;
        this.type = type;
        this.unit = unit;
        this.timestamp = timestamp;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Deprecated
     */
    @JsonProperty("id")
    public Optional<Integer> getId() {
        return id;
    }

    /**
     * @return Time zone UTC offset in seconds. Positive offset indicates east of UTC; negative offset indicates west of UTC; and null indicates the time zone information is unavailable at source.
     */
    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @return The reading type of the measurement. This is applicable only to Cholesterol, IGG, IGE and InsulinInjection.
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return The unit of the value. We use SI units where possible, e.g. mmol/L for glucose/cholesterol, bpm for heart rate, etc.
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("systolic")
    public double getSystolic() {
        return systolic;
    }

    @JsonProperty("diastolic")
    public double getDiastolic() {
        return diastolic;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingBloodPressureTimeseries
                && equalTo((ClientFacingBloodPressureTimeseries) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingBloodPressureTimeseries other) {
        return id.equals(other.id)
                && timezoneOffset.equals(other.timezoneOffset)
                && type.equals(other.type)
                && unit.equals(other.unit)
                && timestamp.equals(other.timestamp)
                && systolic == other.systolic
                && diastolic == other.diastolic;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.timezoneOffset, this.type, this.unit, this.timestamp, this.systolic, this.diastolic);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UnitStage builder() {
        return new Builder();
    }

    public interface UnitStage {
        TimestampStage unit(String unit);

        Builder from(ClientFacingBloodPressureTimeseries other);
    }

    public interface TimestampStage {
        SystolicStage timestamp(String timestamp);
    }

    public interface SystolicStage {
        DiastolicStage systolic(double systolic);
    }

    public interface DiastolicStage {
        _FinalStage diastolic(double diastolic);
    }

    public interface _FinalStage {
        ClientFacingBloodPressureTimeseries build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UnitStage, TimestampStage, SystolicStage, DiastolicStage, _FinalStage {
        private String unit;

        private String timestamp;

        private double systolic;

        private double diastolic;

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingBloodPressureTimeseries other) {
            id(other.getId());
            timezoneOffset(other.getTimezoneOffset());
            type(other.getType());
            unit(other.getUnit());
            timestamp(other.getTimestamp());
            systolic(other.getSystolic());
            diastolic(other.getDiastolic());
            return this;
        }

        /**
         * <p>The unit of the value. We use SI units where possible, e.g. mmol/L for glucose/cholesterol, bpm for heart rate, etc.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("unit")
        public TimestampStage unit(String unit) {
            this.unit = unit;
            return this;
        }

        @java.lang.Override
        @JsonSetter("timestamp")
        public SystolicStage timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @java.lang.Override
        @JsonSetter("systolic")
        public DiastolicStage systolic(double systolic) {
            this.systolic = systolic;
            return this;
        }

        @java.lang.Override
        @JsonSetter("diastolic")
        public _FinalStage diastolic(double diastolic) {
            this.diastolic = diastolic;
            return this;
        }

        /**
         * <p>The reading type of the measurement. This is applicable only to Cholesterol, IGG, IGE and InsulinInjection.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage type(String type) {
            this.type = Optional.of(type);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<String> type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Time zone UTC offset in seconds. Positive offset indicates east of UTC; negative offset indicates west of UTC; and null indicates the time zone information is unavailable at source.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timezoneOffset(Integer timezoneOffset) {
            this.timezoneOffset = Optional.of(timezoneOffset);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timezone_offset", nulls = Nulls.SKIP)
        public _FinalStage timezoneOffset(Optional<Integer> timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
         * <p>Deprecated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage id(Integer id) {
            this.id = Optional.of(id);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<Integer> id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public ClientFacingBloodPressureTimeseries build() {
            return new ClientFacingBloodPressureTimeseries(
                    id, timezoneOffset, type, unit, timestamp, systolic, diastolic, additionalProperties);
        }
    }
}
