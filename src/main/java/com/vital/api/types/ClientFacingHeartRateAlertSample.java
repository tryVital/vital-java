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
@JsonDeserialize(builder = ClientFacingHeartRateAlertSample.Builder.class)
public final class ClientFacingHeartRateAlertSample {
    private final Optional<Integer> id;

    private final Optional<Integer> timezoneOffset;

    private final ClientFacingHeartRateAlertSampleType type;

    private final OffsetDateTime timestamp;

    private final OffsetDateTime start;

    private final OffsetDateTime end;

    private final int value;

    private final Map<String, Object> additionalProperties;

    private ClientFacingHeartRateAlertSample(
            Optional<Integer> id,
            Optional<Integer> timezoneOffset,
            ClientFacingHeartRateAlertSampleType type,
            OffsetDateTime timestamp,
            OffsetDateTime start,
            OffsetDateTime end,
            int value,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.timezoneOffset = timezoneOffset;
        this.type = type;
        this.timestamp = timestamp;
        this.start = start;
        this.end = end;
        this.value = value;
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

    @JsonProperty("type")
    public ClientFacingHeartRateAlertSampleType getType() {
        return type;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return "count";
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

    @JsonProperty("value")
    public int getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingHeartRateAlertSample && equalTo((ClientFacingHeartRateAlertSample) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingHeartRateAlertSample other) {
        return id.equals(other.id)
                && timezoneOffset.equals(other.timezoneOffset)
                && type.equals(other.type)
                && timestamp.equals(other.timestamp)
                && start.equals(other.start)
                && end.equals(other.end)
                && value == other.value;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.timezoneOffset, this.type, this.timestamp, this.start, this.end, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        TimestampStage type(ClientFacingHeartRateAlertSampleType type);

        Builder from(ClientFacingHeartRateAlertSample other);
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
        _FinalStage value(int value);
    }

    public interface _FinalStage {
        ClientFacingHeartRateAlertSample build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage, TimestampStage, StartStage, EndStage, ValueStage, _FinalStage {
        private ClientFacingHeartRateAlertSampleType type;

        private OffsetDateTime timestamp;

        private OffsetDateTime start;

        private OffsetDateTime end;

        private int value;

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingHeartRateAlertSample other) {
            id(other.getId());
            timezoneOffset(other.getTimezoneOffset());
            type(other.getType());
            timestamp(other.getTimestamp());
            start(other.getStart());
            end(other.getEnd());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public TimestampStage type(ClientFacingHeartRateAlertSampleType type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Depracated. The start time (inclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timestamp")
        public StartStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The start time (inclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("start")
        public EndStage start(OffsetDateTime start) {
            this.start = start;
            return this;
        }

        /**
         * <p>The end time (exclusive) of the interval.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("end")
        public ValueStage end(OffsetDateTime end) {
            this.end = end;
            return this;
        }

        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(int value) {
            this.value = value;
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
        public ClientFacingHeartRateAlertSample build() {
            return new ClientFacingHeartRateAlertSample(
                    id, timezoneOffset, type, timestamp, start, end, value, additionalProperties);
        }
    }
}
