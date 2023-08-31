package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingBloodOxygenTimeseries.Builder.class)
public final class ClientFacingBloodOxygenTimeseries {
    private final Optional<Integer> id;

    private final OffsetDateTime timestamp;

    private final Optional<Integer> timezoneOffset;

    private final double value;

    private final Optional<String> type;

    private final String unit;

    private ClientFacingBloodOxygenTimeseries(
            Optional<Integer> id,
            OffsetDateTime timestamp,
            Optional<Integer> timezoneOffset,
            double value,
            Optional<String> type,
            String unit) {
        this.id = id;
        this.timestamp = timestamp;
        this.timezoneOffset = timezoneOffset;
        this.value = value;
        this.type = type;
        this.unit = unit;
    }

    /**
     * @return Measurement id. Note, this field has been deprecated and is no longer used
     */
    @JsonProperty("id")
    public Optional<Integer> getId() {
        return id;
    }

    /**
     * @return The timestamp of the measurement.
     */
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * @return Time zone UTC offset of the measurement. Positive offset indicates east of UTC; negative offset indicates west of UTC; and null indicates the time zone information is unavailable at source.
     */
    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @return The value of the measurement.
     */
    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    /**
     * @return The reading type of the measurement, e.g. cuff, scale, manual_scan, etc.
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return Measured in percentage (spo2).
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingBloodOxygenTimeseries && equalTo((ClientFacingBloodOxygenTimeseries) other);
    }

    private boolean equalTo(ClientFacingBloodOxygenTimeseries other) {
        return id.equals(other.id)
                && timestamp.equals(other.timestamp)
                && timezoneOffset.equals(other.timezoneOffset)
                && value == other.value
                && type.equals(other.type)
                && unit.equals(other.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.timestamp, this.timezoneOffset, this.value, this.type, this.unit);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        ValueStage timestamp(OffsetDateTime timestamp);

        Builder from(ClientFacingBloodOxygenTimeseries other);
    }

    public interface ValueStage {
        UnitStage value(double value);
    }

    public interface UnitStage {
        _FinalStage unit(String unit);
    }

    public interface _FinalStage {
        ClientFacingBloodOxygenTimeseries build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimestampStage, ValueStage, UnitStage, _FinalStage {
        private OffsetDateTime timestamp;

        private double value;

        private String unit;

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingBloodOxygenTimeseries other) {
            id(other.getId());
            timestamp(other.getTimestamp());
            timezoneOffset(other.getTimezoneOffset());
            value(other.getValue());
            type(other.getType());
            unit(other.getUnit());
            return this;
        }

        /**
         * <p>The timestamp of the measurement.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("timestamp")
        public ValueStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The value of the measurement.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("value")
        public UnitStage value(double value) {
            this.value = value;
            return this;
        }

        /**
         * <p>Measured in percentage (spo2).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("unit")
        public _FinalStage unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * <p>The reading type of the measurement, e.g. cuff, scale, manual_scan, etc.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage type(String type) {
            this.type = Optional.of(type);
            return this;
        }

        @Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<String> type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Time zone UTC offset of the measurement. Positive offset indicates east of UTC; negative offset indicates west of UTC; and null indicates the time zone information is unavailable at source.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage timezoneOffset(Integer timezoneOffset) {
            this.timezoneOffset = Optional.of(timezoneOffset);
            return this;
        }

        @Override
        @JsonSetter(value = "timezone_offset", nulls = Nulls.SKIP)
        public _FinalStage timezoneOffset(Optional<Integer> timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
         * <p>Measurement id. Note, this field has been deprecated and is no longer used</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage id(Integer id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<Integer> id) {
            this.id = id;
            return this;
        }

        @Override
        public ClientFacingBloodOxygenTimeseries build() {
            return new ClientFacingBloodOxygenTimeseries(id, timestamp, timezoneOffset, value, type, unit);
        }
    }
}
