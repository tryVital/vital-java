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
@JsonDeserialize(builder = BiomarkerResult.Builder.class)
public final class BiomarkerResult {
    private final String name;

    private final Optional<String> slug;

    private final double value;

    private final String result;

    private final ResultType type;

    private final Optional<String> unit;

    private final Optional<OffsetDateTime> timestamp;

    private final Optional<String> notes;

    private final Optional<Double> minRangeValue;

    private final Optional<Double> maxRangeValue;

    private final Optional<Boolean> isAboveMaxRange;

    private final Optional<Boolean> isBelowMinRange;

    private final Optional<String> interpretation;

    private final Optional<String> loinc;

    private final Optional<String> loincSlug;

    private final Map<String, Object> additionalProperties;

    private BiomarkerResult(
            String name,
            Optional<String> slug,
            double value,
            String result,
            ResultType type,
            Optional<String> unit,
            Optional<OffsetDateTime> timestamp,
            Optional<String> notes,
            Optional<Double> minRangeValue,
            Optional<Double> maxRangeValue,
            Optional<Boolean> isAboveMaxRange,
            Optional<Boolean> isBelowMinRange,
            Optional<String> interpretation,
            Optional<String> loinc,
            Optional<String> loincSlug,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.slug = slug;
        this.value = value;
        this.result = result;
        this.type = type;
        this.unit = unit;
        this.timestamp = timestamp;
        this.notes = notes;
        this.minRangeValue = minRangeValue;
        this.maxRangeValue = maxRangeValue;
        this.isAboveMaxRange = isAboveMaxRange;
        this.isBelowMinRange = isBelowMinRange;
        this.interpretation = interpretation;
        this.loinc = loinc;
        this.loincSlug = loincSlug;
        this.additionalProperties = additionalProperties;
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

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("type")
    public ResultType getType() {
        return type;
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

    @JsonProperty("interpretation")
    public Optional<String> getInterpretation() {
        return interpretation;
    }

    @JsonProperty("loinc")
    public Optional<String> getLoinc() {
        return loinc;
    }

    @JsonProperty("loinc_slug")
    public Optional<String> getLoincSlug() {
        return loincSlug;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BiomarkerResult && equalTo((BiomarkerResult) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BiomarkerResult other) {
        return name.equals(other.name)
                && slug.equals(other.slug)
                && value == other.value
                && result.equals(other.result)
                && type.equals(other.type)
                && unit.equals(other.unit)
                && timestamp.equals(other.timestamp)
                && notes.equals(other.notes)
                && minRangeValue.equals(other.minRangeValue)
                && maxRangeValue.equals(other.maxRangeValue)
                && isAboveMaxRange.equals(other.isAboveMaxRange)
                && isBelowMinRange.equals(other.isBelowMinRange)
                && interpretation.equals(other.interpretation)
                && loinc.equals(other.loinc)
                && loincSlug.equals(other.loincSlug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.slug,
                this.value,
                this.result,
                this.type,
                this.unit,
                this.timestamp,
                this.notes,
                this.minRangeValue,
                this.maxRangeValue,
                this.isAboveMaxRange,
                this.isBelowMinRange,
                this.interpretation,
                this.loinc,
                this.loincSlug);
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
        ResultStage value(double value);
    }

    public interface ResultStage {
        TypeStage result(String result);
    }

    public interface TypeStage {
        _FinalStage type(ResultType type);
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

        _FinalStage interpretation(Optional<String> interpretation);

        _FinalStage interpretation(String interpretation);

        _FinalStage loinc(Optional<String> loinc);

        _FinalStage loinc(String loinc);

        _FinalStage loincSlug(Optional<String> loincSlug);

        _FinalStage loincSlug(String loincSlug);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, ValueStage, ResultStage, TypeStage, _FinalStage {
        private String name;

        private double value;

        private String result;

        private ResultType type;

        private Optional<String> loincSlug = Optional.empty();

        private Optional<String> loinc = Optional.empty();

        private Optional<String> interpretation = Optional.empty();

        private Optional<Boolean> isBelowMinRange = Optional.empty();

        private Optional<Boolean> isAboveMaxRange = Optional.empty();

        private Optional<Double> maxRangeValue = Optional.empty();

        private Optional<Double> minRangeValue = Optional.empty();

        private Optional<String> notes = Optional.empty();

        private Optional<OffsetDateTime> timestamp = Optional.empty();

        private Optional<String> unit = Optional.empty();

        private Optional<String> slug = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BiomarkerResult other) {
            name(other.getName());
            slug(other.getSlug());
            value(other.getValue());
            result(other.getResult());
            type(other.getType());
            unit(other.getUnit());
            timestamp(other.getTimestamp());
            notes(other.getNotes());
            minRangeValue(other.getMinRangeValue());
            maxRangeValue(other.getMaxRangeValue());
            isAboveMaxRange(other.getIsAboveMaxRange());
            isBelowMinRange(other.getIsBelowMinRange());
            interpretation(other.getInterpretation());
            loinc(other.getLoinc());
            loincSlug(other.getLoincSlug());
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
        public ResultStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        @JsonSetter("result")
        public TypeStage result(String result) {
            this.result = result;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(ResultType type) {
            this.type = type;
            return this;
        }

        @Override
        public _FinalStage loincSlug(String loincSlug) {
            this.loincSlug = Optional.of(loincSlug);
            return this;
        }

        @Override
        @JsonSetter(value = "loinc_slug", nulls = Nulls.SKIP)
        public _FinalStage loincSlug(Optional<String> loincSlug) {
            this.loincSlug = loincSlug;
            return this;
        }

        @Override
        public _FinalStage loinc(String loinc) {
            this.loinc = Optional.of(loinc);
            return this;
        }

        @Override
        @JsonSetter(value = "loinc", nulls = Nulls.SKIP)
        public _FinalStage loinc(Optional<String> loinc) {
            this.loinc = loinc;
            return this;
        }

        @Override
        public _FinalStage interpretation(String interpretation) {
            this.interpretation = Optional.of(interpretation);
            return this;
        }

        @Override
        @JsonSetter(value = "interpretation", nulls = Nulls.SKIP)
        public _FinalStage interpretation(Optional<String> interpretation) {
            this.interpretation = interpretation;
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
                    result,
                    type,
                    unit,
                    timestamp,
                    notes,
                    minRangeValue,
                    maxRangeValue,
                    isAboveMaxRange,
                    isBelowMinRange,
                    interpretation,
                    loinc,
                    loincSlug,
                    additionalProperties);
        }
    }
}
