package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Fats.Builder.class)
public final class Fats {
    private final Optional<Double> saturated;

    private final Optional<Double> monounsaturated;

    private final Optional<Double> polyunsaturated;

    private final Optional<Double> omega3;

    private final Optional<Double> omega6;

    private final Optional<Double> total;

    private Fats(
            Optional<Double> saturated,
            Optional<Double> monounsaturated,
            Optional<Double> polyunsaturated,
            Optional<Double> omega3,
            Optional<Double> omega6,
            Optional<Double> total) {
        this.saturated = saturated;
        this.monounsaturated = monounsaturated;
        this.polyunsaturated = polyunsaturated;
        this.omega3 = omega3;
        this.omega6 = omega6;
        this.total = total;
    }

    @JsonProperty("saturated")
    public Optional<Double> getSaturated() {
        return saturated;
    }

    @JsonProperty("monounsaturated")
    public Optional<Double> getMonounsaturated() {
        return monounsaturated;
    }

    @JsonProperty("polyunsaturated")
    public Optional<Double> getPolyunsaturated() {
        return polyunsaturated;
    }

    @JsonProperty("omega3")
    public Optional<Double> getOmega3() {
        return omega3;
    }

    @JsonProperty("omega6")
    public Optional<Double> getOmega6() {
        return omega6;
    }

    @JsonProperty("total")
    public Optional<Double> getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Fats && equalTo((Fats) other);
    }

    private boolean equalTo(Fats other) {
        return saturated.equals(other.saturated)
                && monounsaturated.equals(other.monounsaturated)
                && polyunsaturated.equals(other.polyunsaturated)
                && omega3.equals(other.omega3)
                && omega6.equals(other.omega6)
                && total.equals(other.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.saturated, this.monounsaturated, this.polyunsaturated, this.omega3, this.omega6, this.total);
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
        private Optional<Double> saturated = Optional.empty();

        private Optional<Double> monounsaturated = Optional.empty();

        private Optional<Double> polyunsaturated = Optional.empty();

        private Optional<Double> omega3 = Optional.empty();

        private Optional<Double> omega6 = Optional.empty();

        private Optional<Double> total = Optional.empty();

        private Builder() {}

        public Builder from(Fats other) {
            saturated(other.getSaturated());
            monounsaturated(other.getMonounsaturated());
            polyunsaturated(other.getPolyunsaturated());
            omega3(other.getOmega3());
            omega6(other.getOmega6());
            total(other.getTotal());
            return this;
        }

        @JsonSetter(value = "saturated", nulls = Nulls.SKIP)
        public Builder saturated(Optional<Double> saturated) {
            this.saturated = saturated;
            return this;
        }

        public Builder saturated(Double saturated) {
            this.saturated = Optional.of(saturated);
            return this;
        }

        @JsonSetter(value = "monounsaturated", nulls = Nulls.SKIP)
        public Builder monounsaturated(Optional<Double> monounsaturated) {
            this.monounsaturated = monounsaturated;
            return this;
        }

        public Builder monounsaturated(Double monounsaturated) {
            this.monounsaturated = Optional.of(monounsaturated);
            return this;
        }

        @JsonSetter(value = "polyunsaturated", nulls = Nulls.SKIP)
        public Builder polyunsaturated(Optional<Double> polyunsaturated) {
            this.polyunsaturated = polyunsaturated;
            return this;
        }

        public Builder polyunsaturated(Double polyunsaturated) {
            this.polyunsaturated = Optional.of(polyunsaturated);
            return this;
        }

        @JsonSetter(value = "omega3", nulls = Nulls.SKIP)
        public Builder omega3(Optional<Double> omega3) {
            this.omega3 = omega3;
            return this;
        }

        public Builder omega3(Double omega3) {
            this.omega3 = Optional.of(omega3);
            return this;
        }

        @JsonSetter(value = "omega6", nulls = Nulls.SKIP)
        public Builder omega6(Optional<Double> omega6) {
            this.omega6 = omega6;
            return this;
        }

        public Builder omega6(Double omega6) {
            this.omega6 = Optional.of(omega6);
            return this;
        }

        @JsonSetter(value = "total", nulls = Nulls.SKIP)
        public Builder total(Optional<Double> total) {
            this.total = total;
            return this;
        }

        public Builder total(Double total) {
            this.total = Optional.of(total);
            return this;
        }

        public Fats build() {
            return new Fats(saturated, monounsaturated, polyunsaturated, omega3, omega6, total);
        }
    }
}