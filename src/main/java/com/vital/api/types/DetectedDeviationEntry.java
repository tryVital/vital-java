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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DetectedDeviationEntry.Builder.class)
public final class DetectedDeviationEntry {
    private final String date;

    private final DetectedDeviationEntryDeviation deviation;

    private final Map<String, Object> additionalProperties;

    private DetectedDeviationEntry(
            String date, DetectedDeviationEntryDeviation deviation, Map<String, Object> additionalProperties) {
        this.date = date;
        this.deviation = deviation;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("deviation")
    public DetectedDeviationEntryDeviation getDeviation() {
        return deviation;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DetectedDeviationEntry && equalTo((DetectedDeviationEntry) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DetectedDeviationEntry other) {
        return date.equals(other.date) && deviation.equals(other.deviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.date, this.deviation);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        DeviationStage date(String date);

        Builder from(DetectedDeviationEntry other);
    }

    public interface DeviationStage {
        _FinalStage deviation(DetectedDeviationEntryDeviation deviation);
    }

    public interface _FinalStage {
        DetectedDeviationEntry build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateStage, DeviationStage, _FinalStage {
        private String date;

        private DetectedDeviationEntryDeviation deviation;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DetectedDeviationEntry other) {
            date(other.getDate());
            deviation(other.getDeviation());
            return this;
        }

        @Override
        @JsonSetter("date")
        public DeviationStage date(String date) {
            this.date = date;
            return this;
        }

        @Override
        @JsonSetter("deviation")
        public _FinalStage deviation(DetectedDeviationEntryDeviation deviation) {
            this.deviation = deviation;
            return this;
        }

        @Override
        public DetectedDeviationEntry build() {
            return new DetectedDeviationEntry(date, deviation, additionalProperties);
        }
    }
}