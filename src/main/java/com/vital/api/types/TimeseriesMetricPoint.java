package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimeseriesMetricPoint.Builder.class)
public final class TimeseriesMetricPoint {
    private final OffsetDateTime date;

    private final double value;

    private TimeseriesMetricPoint(OffsetDateTime date, double value) {
        this.date = date;
        this.value = value;
    }

    @JsonProperty("date")
    public OffsetDateTime getDate() {
        return date;
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimeseriesMetricPoint && equalTo((TimeseriesMetricPoint) other);
    }

    private boolean equalTo(TimeseriesMetricPoint other) {
        return date.equals(other.date) && value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.date, this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        ValueStage date(OffsetDateTime date);

        Builder from(TimeseriesMetricPoint other);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        TimeseriesMetricPoint build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateStage, ValueStage, _FinalStage {
        private OffsetDateTime date;

        private double value;

        private Builder() {}

        @Override
        public Builder from(TimeseriesMetricPoint other) {
            date(other.getDate());
            value(other.getValue());
            return this;
        }

        @Override
        @JsonSetter("date")
        public ValueStage date(OffsetDateTime date) {
            this.date = date;
            return this;
        }

        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        public TimeseriesMetricPoint build() {
            return new TimeseriesMetricPoint(date, value);
        }
    }
}
