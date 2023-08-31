package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingStream.Builder.class)
public final class ClientFacingStream {
    private final Optional<List<Double>> cadence;

    private final Optional<List<Integer>> time;

    private final Optional<List<Double>> altitude;

    private final Optional<List<Double>> velocitySmooth;

    private final Optional<List<Integer>> heartrate;

    private final Optional<List<Double>> lat;

    private final Optional<List<Double>> lng;

    private final Optional<List<Double>> distance;

    private final Optional<List<Double>> power;

    private final Optional<List<Double>> resistance;

    private ClientFacingStream(
            Optional<List<Double>> cadence,
            Optional<List<Integer>> time,
            Optional<List<Double>> altitude,
            Optional<List<Double>> velocitySmooth,
            Optional<List<Integer>> heartrate,
            Optional<List<Double>> lat,
            Optional<List<Double>> lng,
            Optional<List<Double>> distance,
            Optional<List<Double>> power,
            Optional<List<Double>> resistance) {
        this.cadence = cadence;
        this.time = time;
        this.altitude = altitude;
        this.velocitySmooth = velocitySmooth;
        this.heartrate = heartrate;
        this.lat = lat;
        this.lng = lng;
        this.distance = distance;
        this.power = power;
        this.resistance = resistance;
    }

    @JsonProperty("cadence")
    public Optional<List<Double>> getCadence() {
        return cadence;
    }

    /**
     * @return Corresponding time stamp in unix time for datapoint
     */
    @JsonProperty("time")
    public Optional<List<Integer>> getTime() {
        return time;
    }

    @JsonProperty("altitude")
    public Optional<List<Double>> getAltitude() {
        return altitude;
    }

    @JsonProperty("velocity_smooth")
    public Optional<List<Double>> getVelocitySmooth() {
        return velocitySmooth;
    }

    @JsonProperty("heartrate")
    public Optional<List<Integer>> getHeartrate() {
        return heartrate;
    }

    @JsonProperty("lat")
    public Optional<List<Double>> getLat() {
        return lat;
    }

    @JsonProperty("lng")
    public Optional<List<Double>> getLng() {
        return lng;
    }

    @JsonProperty("distance")
    public Optional<List<Double>> getDistance() {
        return distance;
    }

    @JsonProperty("power")
    public Optional<List<Double>> getPower() {
        return power;
    }

    @JsonProperty("resistance")
    public Optional<List<Double>> getResistance() {
        return resistance;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingStream && equalTo((ClientFacingStream) other);
    }

    private boolean equalTo(ClientFacingStream other) {
        return cadence.equals(other.cadence)
                && time.equals(other.time)
                && altitude.equals(other.altitude)
                && velocitySmooth.equals(other.velocitySmooth)
                && heartrate.equals(other.heartrate)
                && lat.equals(other.lat)
                && lng.equals(other.lng)
                && distance.equals(other.distance)
                && power.equals(other.power)
                && resistance.equals(other.resistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.cadence,
                this.time,
                this.altitude,
                this.velocitySmooth,
                this.heartrate,
                this.lat,
                this.lng,
                this.distance,
                this.power,
                this.resistance);
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
        private Optional<List<Double>> cadence = Optional.empty();

        private Optional<List<Integer>> time = Optional.empty();

        private Optional<List<Double>> altitude = Optional.empty();

        private Optional<List<Double>> velocitySmooth = Optional.empty();

        private Optional<List<Integer>> heartrate = Optional.empty();

        private Optional<List<Double>> lat = Optional.empty();

        private Optional<List<Double>> lng = Optional.empty();

        private Optional<List<Double>> distance = Optional.empty();

        private Optional<List<Double>> power = Optional.empty();

        private Optional<List<Double>> resistance = Optional.empty();

        private Builder() {}

        public Builder from(ClientFacingStream other) {
            cadence(other.getCadence());
            time(other.getTime());
            altitude(other.getAltitude());
            velocitySmooth(other.getVelocitySmooth());
            heartrate(other.getHeartrate());
            lat(other.getLat());
            lng(other.getLng());
            distance(other.getDistance());
            power(other.getPower());
            resistance(other.getResistance());
            return this;
        }

        @JsonSetter(value = "cadence", nulls = Nulls.SKIP)
        public Builder cadence(Optional<List<Double>> cadence) {
            this.cadence = cadence;
            return this;
        }

        public Builder cadence(List<Double> cadence) {
            this.cadence = Optional.of(cadence);
            return this;
        }

        @JsonSetter(value = "time", nulls = Nulls.SKIP)
        public Builder time(Optional<List<Integer>> time) {
            this.time = time;
            return this;
        }

        public Builder time(List<Integer> time) {
            this.time = Optional.of(time);
            return this;
        }

        @JsonSetter(value = "altitude", nulls = Nulls.SKIP)
        public Builder altitude(Optional<List<Double>> altitude) {
            this.altitude = altitude;
            return this;
        }

        public Builder altitude(List<Double> altitude) {
            this.altitude = Optional.of(altitude);
            return this;
        }

        @JsonSetter(value = "velocity_smooth", nulls = Nulls.SKIP)
        public Builder velocitySmooth(Optional<List<Double>> velocitySmooth) {
            this.velocitySmooth = velocitySmooth;
            return this;
        }

        public Builder velocitySmooth(List<Double> velocitySmooth) {
            this.velocitySmooth = Optional.of(velocitySmooth);
            return this;
        }

        @JsonSetter(value = "heartrate", nulls = Nulls.SKIP)
        public Builder heartrate(Optional<List<Integer>> heartrate) {
            this.heartrate = heartrate;
            return this;
        }

        public Builder heartrate(List<Integer> heartrate) {
            this.heartrate = Optional.of(heartrate);
            return this;
        }

        @JsonSetter(value = "lat", nulls = Nulls.SKIP)
        public Builder lat(Optional<List<Double>> lat) {
            this.lat = lat;
            return this;
        }

        public Builder lat(List<Double> lat) {
            this.lat = Optional.of(lat);
            return this;
        }

        @JsonSetter(value = "lng", nulls = Nulls.SKIP)
        public Builder lng(Optional<List<Double>> lng) {
            this.lng = lng;
            return this;
        }

        public Builder lng(List<Double> lng) {
            this.lng = Optional.of(lng);
            return this;
        }

        @JsonSetter(value = "distance", nulls = Nulls.SKIP)
        public Builder distance(Optional<List<Double>> distance) {
            this.distance = distance;
            return this;
        }

        public Builder distance(List<Double> distance) {
            this.distance = Optional.of(distance);
            return this;
        }

        @JsonSetter(value = "power", nulls = Nulls.SKIP)
        public Builder power(Optional<List<Double>> power) {
            this.power = power;
            return this;
        }

        public Builder power(List<Double> power) {
            this.power = Optional.of(power);
            return this;
        }

        @JsonSetter(value = "resistance", nulls = Nulls.SKIP)
        public Builder resistance(Optional<List<Double>> resistance) {
            this.resistance = resistance;
            return this;
        }

        public Builder resistance(List<Double> resistance) {
            this.resistance = Optional.of(resistance);
            return this;
        }

        public ClientFacingStream build() {
            return new ClientFacingStream(
                    cadence, time, altitude, velocitySmooth, heartrate, lat, lng, distance, power, resistance);
        }
    }
}
