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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingBodyTemperatureSample.Builder.class)
public final class ClientFacingBodyTemperatureSample {
    private final Optional<Integer> id;

    private final Optional<Integer> timezoneOffset;

    private final Optional<String> type;

    private final OffsetDateTime timestamp;

    private final OffsetDateTime start;

    private final OffsetDateTime end;

    private final double value;

    private final Optional<ClientFacingBodyTemperatureSampleSensorLocation> sensorLocation;

    private final Map<String, Object> additionalProperties;

    private ClientFacingBodyTemperatureSample(
            Optional<Integer> id,
            Optional<Integer> timezoneOffset,
            Optional<String> type,
            OffsetDateTime timestamp,
            OffsetDateTime start,
            OffsetDateTime end,
            double value,
            Optional<ClientFacingBodyTemperatureSampleSensorLocation> sensorLocation,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.timezoneOffset = timezoneOffset;
        this.type = type;
        this.timestamp = timestamp;
        this.start = start;
        this.end = end;
        this.value = value;
        this.sensorLocation = sensorLocation;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<Integer> getId() {
        return id;
    }

    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return "°C";
    }

    /**
     * @return Depracated. The start time (inclusive) of the interval.
     */
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * @return The start time (inclusive) of the interval.
     */
    @JsonProperty("start")
    public OffsetDateTime getStart() {
        return start;
    }

    /**
     * @return The end time (exclusive) of the interval.
     */
    @JsonProperty("end")
    public OffsetDateTime getEnd() {
        return end;
    }

    /**
     * @return The recorded value for the interval.
     */
    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @JsonProperty("sensor_location")
    public Optional<ClientFacingBodyTemperatureSampleSensorLocation> getSensorLocation() {
        return sensorLocation;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingBodyTemperatureSample && equalTo((ClientFacingBodyTemperatureSample) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingBodyTemperatureSample other) {
        return id.equals(other.id)
                && timezoneOffset.equals(other.timezoneOffset)
                && type.equals(other.type)
                && timestamp.equals(other.timestamp)
                && start.equals(other.start)
                && end.equals(other.end)
                && value == other.value
                && sensorLocation.equals(other.sensorLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.timezoneOffset,
                this.type,
                this.timestamp,
                this.start,
                this.end,
                this.value,
                this.sensorLocation);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        StartStage timestamp(OffsetDateTime timestamp);

        Builder from(ClientFacingBodyTemperatureSample other);
    }

    public interface StartStage {
        EndStage start(OffsetDateTime start);
    }

    public interface EndStage {
        ValueStage end(OffsetDateTime end);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        ClientFacingBodyTemperatureSample build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);

        _FinalStage sensorLocation(Optional<ClientFacingBodyTemperatureSampleSensorLocation> sensorLocation);

        _FinalStage sensorLocation(ClientFacingBodyTemperatureSampleSensorLocation sensorLocation);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimestampStage, StartStage, EndStage, ValueStage, _FinalStage {
        private OffsetDateTime timestamp;

        private OffsetDateTime start;

        private OffsetDateTime end;

        private double value;

        private Optional<ClientFacingBodyTemperatureSampleSensorLocation> sensorLocation = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingBodyTemperatureSample other) {
            id(other.getId());
            timezoneOffset(other.getTimezoneOffset());
            type(other.getType());
            timestamp(other.getTimestamp());
            start(other.getStart());
            end(other.getEnd());
            value(other.getValue());
            sensorLocation(other.getSensorLocation());
            return this;
        }

        /**
         * <p>Depracated. The start time (inclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("timestamp")
        public StartStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The start time (inclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("start")
        public EndStage start(OffsetDateTime start) {
            this.start = start;
            return this;
        }

        /**
         * <p>The end time (exclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("end")
        public ValueStage end(OffsetDateTime end) {
            this.end = end;
            return this;
        }

        /**
         * <p>The recorded value for the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        public _FinalStage sensorLocation(ClientFacingBodyTemperatureSampleSensorLocation sensorLocation) {
            this.sensorLocation = Optional.of(sensorLocation);
            return this;
        }

        @Override
        @JsonSetter(value = "sensor_location", nulls = Nulls.SKIP)
        public _FinalStage sensorLocation(Optional<ClientFacingBodyTemperatureSampleSensorLocation> sensorLocation) {
            this.sensorLocation = sensorLocation;
            return this;
        }

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
        public ClientFacingBodyTemperatureSample build() {
            return new ClientFacingBodyTemperatureSample(
                    id, timezoneOffset, type, timestamp, start, end, value, sensorLocation, additionalProperties);
        }
    }
}