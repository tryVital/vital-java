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
@JsonDeserialize(builder = ClientWorkoutResponse.Builder.class)
public final class ClientWorkoutResponse {
    private final List<ClientFacingWorkout> workouts;

    private ClientWorkoutResponse(List<ClientFacingWorkout> workouts) {
        this.workouts = workouts;
    }

    @JsonProperty("workouts")
    public List<ClientFacingWorkout> getWorkouts() {
        return workouts;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientWorkoutResponse && equalTo((ClientWorkoutResponse) other);
    }

    private boolean equalTo(ClientWorkoutResponse other) {
        return workouts.equals(other.workouts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.workouts);
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
        private List<ClientFacingWorkout> workouts = new ArrayList<>();

        private Builder() {}

        public Builder from(ClientWorkoutResponse other) {
            workouts(other.getWorkouts());
            return this;
        }

        @JsonSetter(value = "workouts", nulls = Nulls.SKIP)
        public Builder workouts(List<ClientFacingWorkout> workouts) {
            this.workouts.clear();
            this.workouts.addAll(workouts);
            return this;
        }

        public Builder addWorkouts(ClientFacingWorkout workouts) {
            this.workouts.add(workouts);
            return this;
        }

        public Builder addAllWorkouts(List<ClientFacingWorkout> workouts) {
            this.workouts.addAll(workouts);
            return this;
        }

        public ClientWorkoutResponse build() {
            return new ClientWorkoutResponse(workouts);
        }
    }
}