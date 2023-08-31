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
@JsonDeserialize(builder = Macros.Builder.class)
public final class Macros {
    private final Optional<Double> carbs;

    private final Optional<Double> protein;

    private final Optional<Fats> fats;

    private final Optional<Double> alcohol;

    private final Optional<Double> water;

    private final Optional<Double> fibre;

    private final Optional<Double> sugar;

    private Macros(
            Optional<Double> carbs,
            Optional<Double> protein,
            Optional<Fats> fats,
            Optional<Double> alcohol,
            Optional<Double> water,
            Optional<Double> fibre,
            Optional<Double> sugar) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
        this.alcohol = alcohol;
        this.water = water;
        this.fibre = fibre;
        this.sugar = sugar;
    }

    @JsonProperty("carbs")
    public Optional<Double> getCarbs() {
        return carbs;
    }

    @JsonProperty("protein")
    public Optional<Double> getProtein() {
        return protein;
    }

    @JsonProperty("fats")
    public Optional<Fats> getFats() {
        return fats;
    }

    @JsonProperty("alcohol")
    public Optional<Double> getAlcohol() {
        return alcohol;
    }

    @JsonProperty("water")
    public Optional<Double> getWater() {
        return water;
    }

    @JsonProperty("fibre")
    public Optional<Double> getFibre() {
        return fibre;
    }

    @JsonProperty("sugar")
    public Optional<Double> getSugar() {
        return sugar;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Macros && equalTo((Macros) other);
    }

    private boolean equalTo(Macros other) {
        return carbs.equals(other.carbs)
                && protein.equals(other.protein)
                && fats.equals(other.fats)
                && alcohol.equals(other.alcohol)
                && water.equals(other.water)
                && fibre.equals(other.fibre)
                && sugar.equals(other.sugar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.carbs, this.protein, this.fats, this.alcohol, this.water, this.fibre, this.sugar);
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
        private Optional<Double> carbs = Optional.empty();

        private Optional<Double> protein = Optional.empty();

        private Optional<Fats> fats = Optional.empty();

        private Optional<Double> alcohol = Optional.empty();

        private Optional<Double> water = Optional.empty();

        private Optional<Double> fibre = Optional.empty();

        private Optional<Double> sugar = Optional.empty();

        private Builder() {}

        public Builder from(Macros other) {
            carbs(other.getCarbs());
            protein(other.getProtein());
            fats(other.getFats());
            alcohol(other.getAlcohol());
            water(other.getWater());
            fibre(other.getFibre());
            sugar(other.getSugar());
            return this;
        }

        @JsonSetter(value = "carbs", nulls = Nulls.SKIP)
        public Builder carbs(Optional<Double> carbs) {
            this.carbs = carbs;
            return this;
        }

        public Builder carbs(Double carbs) {
            this.carbs = Optional.of(carbs);
            return this;
        }

        @JsonSetter(value = "protein", nulls = Nulls.SKIP)
        public Builder protein(Optional<Double> protein) {
            this.protein = protein;
            return this;
        }

        public Builder protein(Double protein) {
            this.protein = Optional.of(protein);
            return this;
        }

        @JsonSetter(value = "fats", nulls = Nulls.SKIP)
        public Builder fats(Optional<Fats> fats) {
            this.fats = fats;
            return this;
        }

        public Builder fats(Fats fats) {
            this.fats = Optional.of(fats);
            return this;
        }

        @JsonSetter(value = "alcohol", nulls = Nulls.SKIP)
        public Builder alcohol(Optional<Double> alcohol) {
            this.alcohol = alcohol;
            return this;
        }

        public Builder alcohol(Double alcohol) {
            this.alcohol = Optional.of(alcohol);
            return this;
        }

        @JsonSetter(value = "water", nulls = Nulls.SKIP)
        public Builder water(Optional<Double> water) {
            this.water = water;
            return this;
        }

        public Builder water(Double water) {
            this.water = Optional.of(water);
            return this;
        }

        @JsonSetter(value = "fibre", nulls = Nulls.SKIP)
        public Builder fibre(Optional<Double> fibre) {
            this.fibre = fibre;
            return this;
        }

        public Builder fibre(Double fibre) {
            this.fibre = Optional.of(fibre);
            return this;
        }

        @JsonSetter(value = "sugar", nulls = Nulls.SKIP)
        public Builder sugar(Optional<Double> sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder sugar(Double sugar) {
            this.sugar = Optional.of(sugar);
            return this;
        }

        public Macros build() {
            return new Macros(carbs, protein, fats, alcohol, water, fibre, sugar);
        }
    }
}
