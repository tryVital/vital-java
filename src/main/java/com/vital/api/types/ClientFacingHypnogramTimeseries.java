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
@JsonDeserialize(builder = ClientFacingHypnogramTimeseries.Builder.class)
public final class ClientFacingHypnogramTimeseries {
    private final Optional<Integer> id;

    private final Optional<Integer> timezoneOffset;

    private final Optional<String> type;

    private final String unit;

    private final OffsetDateTime timestamp;

    private final OffsetDateTime start;

    private final OffsetDateTime end;

    private final double value;

    private final Map<String, Object> additionalProperties;

    private ClientFacingHypnogramTimeseries(
            Optional<Integer> id,
            Optional<Integer> timezoneOffset,
            Optional<String> type,
            String unit,
            OffsetDateTime timestamp,
            OffsetDateTime start,
            OffsetDateTime end,
            double value,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.timezoneOffset = timezoneOffset;
        this.type = type;
        this.unit = unit;
        this.timestamp = timestamp;
        this.start = start;
        this.end = end;
        this.value = value;
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

    /**
     * @return enum: 1: deep, 2: light, 3: rem, 4: awake, -1: missing_data.
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
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
     * @return Hypnogram for sleep stages {&quot;deep&quot;: 1, &quot;light&quot;: 2, &quot;rem&quot;: 3, &quot;awake&quot;: 4, &quot;manual&quot;: 5, &quot;missing_data&quot;: -1}
     */
    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingHypnogramTimeseries && equalTo((ClientFacingHypnogramTimeseries) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingHypnogramTimeseries other) {
        return id.equals(other.id)
                && timezoneOffset.equals(other.timezoneOffset)
                && type.equals(other.type)
                && unit.equals(other.unit)
                && timestamp.equals(other.timestamp)
                && start.equals(other.start)
                && end.equals(other.end)
                && value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.timezoneOffset, this.type, this.unit, this.timestamp, this.start, this.end, this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UnitStage builder() {
        return new Builder();
    }

    public interface UnitStage {
        TimestampStage unit(String unit);

        Builder from(ClientFacingHypnogramTimeseries other);
    }

    public interface TimestampStage {
        StartStage timestamp(OffsetDateTime timestamp);
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
        ClientFacingHypnogramTimeseries build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UnitStage, TimestampStage, StartStage, EndStage, ValueStage, _FinalStage {
        private String unit;

        private OffsetDateTime timestamp;

        private OffsetDateTime start;

        private OffsetDateTime end;

        private double value;

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingHypnogramTimeseries other) {
            id(other.getId());
            timezoneOffset(other.getTimezoneOffset());
            type(other.getType());
            unit(other.getUnit());
            timestamp(other.getTimestamp());
            start(other.getStart());
            end(other.getEnd());
            value(other.getValue());
            return this;
        }

        /**
         * <p>enum: 1: deep, 2: light, 3: rem, 4: awake, -1: missing_data.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("unit")
        public TimestampStage unit(String unit) {
            this.unit = unit;
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
         * <p>Hypnogram for sleep stages {&quot;deep&quot;: 1, &quot;light&quot;: 2, &quot;rem&quot;: 3, &quot;awake&quot;: 4, &quot;manual&quot;: 5, &quot;missing_data&quot;: -1}</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
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
        public ClientFacingHypnogramTimeseries build() {
            return new ClientFacingHypnogramTimeseries(
                    id, timezoneOffset, type, unit, timestamp, start, end, value, additionalProperties);
        }
    }
}
