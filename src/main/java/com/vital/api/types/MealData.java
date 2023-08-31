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
@JsonDeserialize(builder = MealData.Builder.class)
public final class MealData {
    private final Optional<Energy> energy;

    private final Optional<Macros> macros;

    private final Optional<Micros> micros;

    private MealData(Optional<Energy> energy, Optional<Macros> macros, Optional<Micros> micros) {
        this.energy = energy;
        this.macros = macros;
        this.micros = micros;
    }

    @JsonProperty("energy")
    public Optional<Energy> getEnergy() {
        return energy;
    }

    @JsonProperty("macros")
    public Optional<Macros> getMacros() {
        return macros;
    }

    @JsonProperty("micros")
    public Optional<Micros> getMicros() {
        return micros;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MealData && equalTo((MealData) other);
    }

    private boolean equalTo(MealData other) {
        return energy.equals(other.energy) && macros.equals(other.macros) && micros.equals(other.micros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.energy, this.macros, this.micros);
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
        private Optional<Energy> energy = Optional.empty();

        private Optional<Macros> macros = Optional.empty();

        private Optional<Micros> micros = Optional.empty();

        private Builder() {}

        public Builder from(MealData other) {
            energy(other.getEnergy());
            macros(other.getMacros());
            micros(other.getMicros());
            return this;
        }

        @JsonSetter(value = "energy", nulls = Nulls.SKIP)
        public Builder energy(Optional<Energy> energy) {
            this.energy = energy;
            return this;
        }

        public Builder energy(Energy energy) {
            this.energy = Optional.of(energy);
            return this;
        }

        @JsonSetter(value = "macros", nulls = Nulls.SKIP)
        public Builder macros(Optional<Macros> macros) {
            this.macros = macros;
            return this;
        }

        public Builder macros(Macros macros) {
            this.macros = Optional.of(macros);
            return this;
        }

        @JsonSetter(value = "micros", nulls = Nulls.SKIP)
        public Builder micros(Optional<Micros> micros) {
            this.micros = micros;
            return this;
        }

        public Builder micros(Micros micros) {
            this.micros = Optional.of(micros);
            return this;
        }

        public MealData build() {
            return new MealData(energy, macros, micros);
        }
    }
}
