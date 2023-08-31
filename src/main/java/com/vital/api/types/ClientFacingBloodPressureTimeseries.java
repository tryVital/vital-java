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
@JsonDeserialize(builder = ClientFacingBloodPressureTimeseries.Builder.class)
public final class ClientFacingBloodPressureTimeseries {
    private final Optional<Integer> id;

    private final OffsetDateTime timestamp;

    private final Optional<Integer> timezoneOffset;

    private final double systolic;

    private final double diastolic;

    private final Optional<String> type;

    private final String unit;

    private ClientFacingBloodPressureTimeseries(
            Optional<Integer> id,
            OffsetDateTime timestamp,
            Optional<Integer> timezoneOffset,
            double systolic,
            double diastolic,
            Optional<String> type,
            String unit) {
        this.id = id;
        this.timestamp = timestamp;
        this.timezoneOffset = timezoneOffset;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.type = type;
        this.unit = unit;
    }

    /**
     * @return Measurement id, note, this field has been deprecated and is no longer used
     */
    @JsonProperty("id")
    public Optional<Integer> getId() {
        return id;
    }

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

    @JsonProperty("systolic")
    public double getSystolic() {
        return systolic;
    }

    @JsonProperty("diastolic")
    public double getDiastolic() {
        return diastolic;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingBloodPressureTimeseries
                && equalTo((ClientFacingBloodPressureTimeseries) other);
    }

    private boolean equalTo(ClientFacingBloodPressureTimeseries other) {
        return id.equals(other.id)
                && timestamp.equals(other.timestamp)
                && timezoneOffset.equals(other.timezoneOffset)
                && systolic == other.systolic
                && diastolic == other.diastolic
                && type.equals(other.type)
                && unit.equals(other.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.timestamp, this.timezoneOffset, this.systolic, this.diastolic, this.type, this.unit);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        SystolicStage timestamp(OffsetDateTime timestamp);

        Builder from(ClientFacingBloodPressureTimeseries other);
    }

    public interface SystolicStage {
        DiastolicStage systolic(double systolic);
    }

    public interface DiastolicStage {
        UnitStage diastolic(double diastolic);
    }

    public interface UnitStage {
        _FinalStage unit(String unit);
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
    public static final class Builder implements TimestampStage, SystolicStage, DiastolicStage, UnitStage, _FinalStage {
        private OffsetDateTime timestamp;

        private double systolic;

        private double diastolic;

        private String unit;

        private Optional<String> type = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingBloodPressureTimeseries other) {
            id(other.getId());
            timestamp(other.getTimestamp());
            timezoneOffset(other.getTimezoneOffset());
            systolic(other.getSystolic());
            diastolic(other.getDiastolic());
            type(other.getType());
            unit(other.getUnit());
            return this;
        }

        @Override
        @JsonSetter("timestamp")
        public SystolicStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Override
        @JsonSetter("systolic")
        public DiastolicStage systolic(double systolic) {
            this.systolic = systolic;
            return this;
        }

        @Override
        @JsonSetter("diastolic")
        public UnitStage diastolic(double diastolic) {
            this.diastolic = diastolic;
            return this;
        }

        @Override
        @JsonSetter("unit")
        public _FinalStage unit(String unit) {
            this.unit = unit;
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
         * <p>Measurement id, note, this field has been deprecated and is no longer used</p>
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
        public ClientFacingBloodPressureTimeseries build() {
            return new ClientFacingBloodPressureTimeseries(
                    id, timestamp, timezoneOffset, systolic, diastolic, type, unit);
        }
    }
}
