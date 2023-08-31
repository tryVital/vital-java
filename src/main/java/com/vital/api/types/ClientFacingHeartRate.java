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
@JsonDeserialize(builder = ClientFacingHeartRate.Builder.class)
public final class ClientFacingHeartRate {
    private final Optional<Double> avgBpm;

    private final Optional<Double> minBpm;

    private final Optional<Double> maxBpm;

    private final Optional<Double> restingBpm;

    private ClientFacingHeartRate(
            Optional<Double> avgBpm, Optional<Double> minBpm, Optional<Double> maxBpm, Optional<Double> restingBpm) {
        this.avgBpm = avgBpm;
        this.minBpm = minBpm;
        this.maxBpm = maxBpm;
        this.restingBpm = restingBpm;
    }

    /**
     * @return Average heart rate::bpm
     */
    @JsonProperty("avg_bpm")
    public Optional<Double> getAvgBpm() {
        return avgBpm;
    }

    /**
     * @return Minimum heart rate::bpm
     */
    @JsonProperty("min_bpm")
    public Optional<Double> getMinBpm() {
        return minBpm;
    }

    /**
     * @return Maximum heart rate::bpm
     */
    @JsonProperty("max_bpm")
    public Optional<Double> getMaxBpm() {
        return maxBpm;
    }

    /**
     * @return Resting heart rate::bpm
     */
    @JsonProperty("resting_bpm")
    public Optional<Double> getRestingBpm() {
        return restingBpm;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingHeartRate && equalTo((ClientFacingHeartRate) other);
    }

    private boolean equalTo(ClientFacingHeartRate other) {
        return avgBpm.equals(other.avgBpm)
                && minBpm.equals(other.minBpm)
                && maxBpm.equals(other.maxBpm)
                && restingBpm.equals(other.restingBpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.avgBpm, this.minBpm, this.maxBpm, this.restingBpm);
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
        private Optional<Double> avgBpm = Optional.empty();

        private Optional<Double> minBpm = Optional.empty();

        private Optional<Double> maxBpm = Optional.empty();

        private Optional<Double> restingBpm = Optional.empty();

        private Builder() {}

        public Builder from(ClientFacingHeartRate other) {
            avgBpm(other.getAvgBpm());
            minBpm(other.getMinBpm());
            maxBpm(other.getMaxBpm());
            restingBpm(other.getRestingBpm());
            return this;
        }

        @JsonSetter(value = "avg_bpm", nulls = Nulls.SKIP)
        public Builder avgBpm(Optional<Double> avgBpm) {
            this.avgBpm = avgBpm;
            return this;
        }

        public Builder avgBpm(Double avgBpm) {
            this.avgBpm = Optional.of(avgBpm);
            return this;
        }

        @JsonSetter(value = "min_bpm", nulls = Nulls.SKIP)
        public Builder minBpm(Optional<Double> minBpm) {
            this.minBpm = minBpm;
            return this;
        }

        public Builder minBpm(Double minBpm) {
            this.minBpm = Optional.of(minBpm);
            return this;
        }

        @JsonSetter(value = "max_bpm", nulls = Nulls.SKIP)
        public Builder maxBpm(Optional<Double> maxBpm) {
            this.maxBpm = maxBpm;
            return this;
        }

        public Builder maxBpm(Double maxBpm) {
            this.maxBpm = Optional.of(maxBpm);
            return this;
        }

        @JsonSetter(value = "resting_bpm", nulls = Nulls.SKIP)
        public Builder restingBpm(Optional<Double> restingBpm) {
            this.restingBpm = restingBpm;
            return this;
        }

        public Builder restingBpm(Double restingBpm) {
            this.restingBpm = Optional.of(restingBpm);
            return this;
        }

        public ClientFacingHeartRate build() {
            return new ClientFacingHeartRate(avgBpm, minBpm, maxBpm, restingBpm);
        }
    }
}
