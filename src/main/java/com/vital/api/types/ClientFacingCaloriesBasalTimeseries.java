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
@JsonDeserialize(builder = ClientFacingCaloriesBasalTimeseries.Builder.class)
public final class ClientFacingCaloriesBasalTimeseries {
    private final Optional<Integer> id;

    private final Optional<Integer> timezoneOffset;

    private final Optional<String> type;

    private final String timestamp;

    private final double value;

    private final Map<String, Object> additionalProperties;

    private ClientFacingCaloriesBasalTimeseries(
            Optional<Integer> id,
            Optional<Integer> timezoneOffset,
            Optional<String> type,
            String timestamp,
            double value,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.timezoneOffset = timezoneOffset;
        this.type = type;
        this.timestamp = timestamp;
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

    /**
     * @return The reading type of the measurement. This is applicable only to Cholesterol, IGG, IGE and InsulinInjection.
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return Measured in kilocalories (kcal)
     */
    @JsonProperty("unit")
    public String getUnit() {
        return "kcal";
    }

    /**
     * @return The timestamp of the measurement.
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @return Basal Metabolic Rate at the time or interval::kilocalories
     */
    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingCaloriesBasalTimeseries
                && equalTo((ClientFacingCaloriesBasalTimeseries) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingCaloriesBasalTimeseries other) {
        return id.equals(other.id)
                && timezoneOffset.equals(other.timezoneOffset)
                && type.equals(other.type)
                && timestamp.equals(other.timestamp)
                && value == other.value;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.timezoneOffset, this.type, this.timestamp, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        ValueStage timestamp(String timestamp);

        Builder from(ClientFacingCaloriesBasalTimeseries other);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        ClientFacingCaloriesBasalTimeseries build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimestampStage, ValueStage, _FinalStage {
        private String timestamp;

        private double value;

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingCaloriesBasalTimeseries other) {
            id(other.getId());
            timezoneOffset(other.getTimezoneOffset());
            type(other.getType());
            timestamp(other.getTimestamp());
            value(other.getValue());
            return this;
        }

        /**
         * <p>The timestamp of the measurement.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timestamp")
        public ValueStage timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>Basal Metabolic Rate at the time or interval::kilocalories</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
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
        public ClientFacingCaloriesBasalTimeseries build() {
            return new ClientFacingCaloriesBasalTimeseries(
                    id, timezoneOffset, type, timestamp, value, additionalProperties);
        }
    }
}
