package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Micros.Builder.class)
public final class Micros {
    private final Optional<Map<String, Double>> minerals;

    private final Optional<Map<String, Double>> traceElements;

    private final Optional<Map<String, Double>> vitamins;

    private Micros(
            Optional<Map<String, Double>> minerals,
            Optional<Map<String, Double>> traceElements,
            Optional<Map<String, Double>> vitamins) {
        this.minerals = minerals;
        this.traceElements = traceElements;
        this.vitamins = vitamins;
    }

    @JsonProperty("minerals")
    public Optional<Map<String, Double>> getMinerals() {
        return minerals;
    }

    @JsonProperty("trace_elements")
    public Optional<Map<String, Double>> getTraceElements() {
        return traceElements;
    }

    @JsonProperty("vitamins")
    public Optional<Map<String, Double>> getVitamins() {
        return vitamins;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Micros && equalTo((Micros) other);
    }

    private boolean equalTo(Micros other) {
        return minerals.equals(other.minerals)
                && traceElements.equals(other.traceElements)
                && vitamins.equals(other.vitamins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.minerals, this.traceElements, this.vitamins);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Map<String, Double>> minerals = Optional.empty();

        private Optional<Map<String, Double>> traceElements = Optional.empty();

        private Optional<Map<String, Double>> vitamins = Optional.empty();

        private Builder() {}

        public Builder from(Micros other) {
            minerals(other.getMinerals());
            traceElements(other.getTraceElements());
            vitamins(other.getVitamins());
            return this;
        }

        @JsonSetter(value = "minerals", nulls = Nulls.SKIP)
        public Builder minerals(Optional<Map<String, Double>> minerals) {
            this.minerals = minerals;
            return this;
        }

        public Builder minerals(Map<String, Double> minerals) {
            this.minerals = Optional.of(minerals);
            return this;
        }

        @JsonSetter(value = "trace_elements", nulls = Nulls.SKIP)
        public Builder traceElements(Optional<Map<String, Double>> traceElements) {
            this.traceElements = traceElements;
            return this;
        }

        public Builder traceElements(Map<String, Double> traceElements) {
            this.traceElements = Optional.of(traceElements);
            return this;
        }

        @JsonSetter(value = "vitamins", nulls = Nulls.SKIP)
        public Builder vitamins(Optional<Map<String, Double>> vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public Builder vitamins(Map<String, Double> vitamins) {
            this.vitamins = Optional.of(vitamins);
            return this;
        }

        public Micros build() {
            return new Micros(minerals, traceElements, vitamins);
        }
    }
}
