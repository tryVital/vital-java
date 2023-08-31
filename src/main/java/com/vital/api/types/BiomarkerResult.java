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
@JsonDeserialize(builder = BiomarkerResult.Builder.class)
public final class BiomarkerResult {
    private final String name;

    private final Optional<String> slug;

    private final double value;

    private final Optional<String> unit;

    private final Optional<OffsetDateTime> timestamp;

    private final Optional<String> notes;

    private final Optional<Double> minRangeValue;

    private final Optional<Double> maxRangeValue;

    private final Optional<Boolean> isAboveMaxRange;

    private final Optional<Boolean> isBelowMinRange;

    private BiomarkerResult(
            String name,
            Optional<String> slug,
            double value,
            Optional<String> unit,
            Optional<OffsetDateTime> timestamp,
            Optional<String> notes,
            Optional<Double> minRangeValue,
            Optional<Double> maxRangeValue,
            Optional<Boolean> isAboveMaxRange,
            Optional<Boolean> isBelowMinRange) {
        this.name = name;
        this.slug = slug;
        this.value = value;
        this.unit = unit;
        this.timestamp = timestamp;
        this.notes = notes;
        this.minRangeValue = minRangeValue;
        this.maxRangeValue = maxRangeValue;
        this.isAboveMaxRange = isAboveMaxRange;
        this.isBelowMinRange = isBelowMinRange;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @JsonProperty("unit")
    public Optional<String> getUnit() {
        return unit;
    }

    @JsonProperty("timestamp")
    public Optional<OffsetDateTime> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("notes")
    public Optional<String> getNotes() {
        return notes;
    }

    @JsonProperty("min_range_value")
    public Optional<Double> getMinRangeValue() {
        return minRangeValue;
    }

    @JsonProperty("max_range_value")
    public Optional<Double> getMaxRangeValue() {
        return maxRangeValue;
    }

    @JsonProperty("is_above_max_range")
    public Optional<Boolean> getIsAboveMaxRange() {
        return isAboveMaxRange;
    }

    @JsonProperty("is_below_min_range")
    public Optional<Boolean> getIsBelowMinRange() {
        return isBelowMinRange;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BiomarkerResult && equalTo((BiomarkerResult) other);
    }

    private boolean equalTo(BiomarkerResult other) {
        return name.equals(other.name)
                && slug.equals(other.slug)
                && value == other.value
                && unit.equals(other.unit)
                && timestamp.equals(other.timestamp)
                && notes.equals(other.notes)
                && minRangeValue.equals(other.minRangeValue)
                && maxRangeValue.equals(other.maxRangeValue)
                && isAboveMaxRange.equals(other.isAboveMaxRange)
                && isBelowMinRange.equals(other.isBelowMinRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.slug,
                this.value,
                this.unit,
                this.timestamp,
                this.notes,
                this.minRangeValue,
                this.maxRangeValue,
                this.isAboveMaxRange,
                this.isBelowMinRange);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        ValueStage name(String name);

        Builder from(BiomarkerResult other);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        BiomarkerResult build();

        _FinalStage slug(Optional<String> slug);

        _FinalStage slug(String slug);

        _FinalStage unit(Optional<String> unit);

        _FinalStage unit(String unit);

        _FinalStage timestamp(Optional<OffsetDateTime> timestamp);

        _FinalStage timestamp(OffsetDateTime timestamp);

        _FinalStage notes(Optional<String> notes);

        _FinalStage notes(String notes);

        _FinalStage minRangeValue(Optional<Double> minRangeValue);

        _FinalStage minRangeValue(Double minRangeValue);

        _FinalStage maxRangeValue(Optional<Double> maxRangeValue);

        _FinalStage maxRangeValue(Double maxRangeValue);

        _FinalStage isAboveMaxRange(Optional<Boolean> isAboveMaxRange);

        _FinalStage isAboveMaxRange(Boolean isAboveMaxRange);

        _FinalStage isBelowMinRange(Optional<Boolean> isBelowMinRange);

        _FinalStage isBelowMinRange(Boolean isBelowMinRange);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, ValueStage, _FinalStage {
        private String name;

        private double value;

        private Optional<Boolean> isBelowMinRange = Optional.empty();

        private Optional<Boolean> isAboveMaxRange = Optional.empty();

        private Optional<Double> maxRangeValue = Optional.empty();

        private Optional<Double> minRangeValue = Optional.empty();

        private Optional<String> notes = Optional.empty();

        private Optional<OffsetDateTime> timestamp = Optional.empty();

        private Optional<String> unit = Optional.empty();

        private Optional<String> slug = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(BiomarkerResult other) {
            name(other.getName());
            slug(other.getSlug());
            value(other.getValue());
            unit(other.getUnit());
            timestamp(other.getTimestamp());
            notes(other.getNotes());
            minRangeValue(other.getMinRangeValue());
            maxRangeValue(other.getMaxRangeValue());
            isAboveMaxRange(other.getIsAboveMaxRange());
            isBelowMinRange(other.getIsBelowMinRange());
            return this;
        }

        @Override
        @JsonSetter("name")
        public ValueStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        public _FinalStage isBelowMinRange(Boolean isBelowMinRange) {
            this.isBelowMinRange = Optional.of(isBelowMinRange);
            return this;
        }

        @Override
        @JsonSetter(value = "is_below_min_range", nulls = Nulls.SKIP)
        public _FinalStage isBelowMinRange(Optional<Boolean> isBelowMinRange) {
            this.isBelowMinRange = isBelowMinRange;
            return this;
        }

        @Override
        public _FinalStage isAboveMaxRange(Boolean isAboveMaxRange) {
            this.isAboveMaxRange = Optional.of(isAboveMaxRange);
            return this;
        }

        @Override
        @JsonSetter(value = "is_above_max_range", nulls = Nulls.SKIP)
        public _FinalStage isAboveMaxRange(Optional<Boolean> isAboveMaxRange) {
            this.isAboveMaxRange = isAboveMaxRange;
            return this;
        }

        @Override
        public _FinalStage maxRangeValue(Double maxRangeValue) {
            this.maxRangeValue = Optional.of(maxRangeValue);
            return this;
        }

        @Override
        @JsonSetter(value = "max_range_value", nulls = Nulls.SKIP)
        public _FinalStage maxRangeValue(Optional<Double> maxRangeValue) {
            this.maxRangeValue = maxRangeValue;
            return this;
        }

        @Override
        public _FinalStage minRangeValue(Double minRangeValue) {
            this.minRangeValue = Optional.of(minRangeValue);
            return this;
        }

        @Override
        @JsonSetter(value = "min_range_value", nulls = Nulls.SKIP)
        public _FinalStage minRangeValue(Optional<Double> minRangeValue) {
            this.minRangeValue = minRangeValue;
            return this;
        }

        @Override
        public _FinalStage notes(String notes) {
            this.notes = Optional.of(notes);
            return this;
        }

        @Override
        @JsonSetter(value = "notes", nulls = Nulls.SKIP)
        public _FinalStage notes(Optional<String> notes) {
            this.notes = notes;
            return this;
        }

        @Override
        public _FinalStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = Optional.of(timestamp);
            return this;
        }

        @Override
        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public _FinalStage timestamp(Optional<OffsetDateTime> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Override
        public _FinalStage unit(String unit) {
            this.unit = Optional.of(unit);
            return this;
        }

        @Override
        @JsonSetter(value = "unit", nulls = Nulls.SKIP)
        public _FinalStage unit(Optional<String> unit) {
            this.unit = unit;
            return this;
        }

        @Override
        public _FinalStage slug(String slug) {
            this.slug = Optional.of(slug);
            return this;
        }

        @Override
        @JsonSetter(value = "slug", nulls = Nulls.SKIP)
        public _FinalStage slug(Optional<String> slug) {
            this.slug = slug;
            return this;
        }

        @Override
        public BiomarkerResult build() {
            return new BiomarkerResult(
                    name,
                    slug,
                    value,
                    unit,
                    timestamp,
                    notes,
                    minRangeValue,
                    maxRangeValue,
                    isAboveMaxRange,
                    isBelowMinRange);
        }
    }
}
