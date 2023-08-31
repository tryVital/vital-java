package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingMealResponse.Builder.class)
public final class ClientFacingMealResponse {
    private final List<MealInDbBaseClientFacingSource> meals;

    private ClientFacingMealResponse(List<MealInDbBaseClientFacingSource> meals) {
        this.meals = meals;
    }

    @JsonProperty("meals")
    public List<MealInDbBaseClientFacingSource> getMeals() {
        return meals;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingMealResponse && equalTo((ClientFacingMealResponse) other);
    }

    private boolean equalTo(ClientFacingMealResponse other) {
        return meals.equals(other.meals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.meals);
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
        private List<MealInDbBaseClientFacingSource> meals = new ArrayList<>();

        private Builder() {}

        public Builder from(ClientFacingMealResponse other) {
            meals(other.getMeals());
            return this;
        }

        @JsonSetter(value = "meals", nulls = Nulls.SKIP)
        public Builder meals(List<MealInDbBaseClientFacingSource> meals) {
            this.meals.clear();
            this.meals.addAll(meals);
            return this;
        }

        public Builder addMeals(MealInDbBaseClientFacingSource meals) {
            this.meals.add(meals);
            return this;
        }

        public Builder addAllMeals(List<MealInDbBaseClientFacingSource> meals) {
            this.meals.addAll(meals);
            return this;
        }

        public ClientFacingMealResponse build() {
            return new ClientFacingMealResponse(meals);
        }
    }
}
