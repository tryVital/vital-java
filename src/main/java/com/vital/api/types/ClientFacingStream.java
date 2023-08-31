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
    private final Optional<ClientFacingStreamCadence> cadence;

    private final Optional<List<Integer>> time;

    private final Optional<ClientFacingStreamAltitude> altitude;

    private final Optional<ClientFacingStreamVelocitySmooth> velocitySmooth;

    private final Optional<ClientFacingStreamHeartrate> heartrate;

    private final Optional<ClientFacingStreamLat> lat;

    private final Optional<ClientFacingStreamLng> lng;

    private final Optional<ClientFacingStreamDistance> distance;

    private final Optional<ClientFacingStreamPower> power;

    private final Optional<ClientFacingStreamResistance> resistance;

    private ClientFacingStream(
            Optional<ClientFacingStreamCadence> cadence,
            Optional<List<Integer>> time,
            Optional<ClientFacingStreamAltitude> altitude,
            Optional<ClientFacingStreamVelocitySmooth> velocitySmooth,
            Optional<ClientFacingStreamHeartrate> heartrate,
            Optional<ClientFacingStreamLat> lat,
            Optional<ClientFacingStreamLng> lng,
            Optional<ClientFacingStreamDistance> distance,
            Optional<ClientFacingStreamPower> power,
            Optional<ClientFacingStreamResistance> resistance) {
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

    /**
     * @return RPM for cycling, Steps per minute for running
     */
    @JsonProperty("cadence")
    public Optional<ClientFacingStreamCadence> getCadence() {
        return cadence;
    }

    /**
     * @return Corresponding time stamp in unix time for datapoint
     */
    @JsonProperty("time")
    public Optional<List<Integer>> getTime() {
        return time;
    }

    /**
     * @return Data points for altitude
     */
    @JsonProperty("altitude")
    public Optional<ClientFacingStreamAltitude> getAltitude() {
        return altitude;
    }

    /**
     * @return Velocity in m/s
     */
    @JsonProperty("velocity_smooth")
    public Optional<ClientFacingStreamVelocitySmooth> getVelocitySmooth() {
        return velocitySmooth;
    }

    /**
     * @return Heart rate in bpm
     */
    @JsonProperty("heartrate")
    public Optional<ClientFacingStreamHeartrate> getHeartrate() {
        return heartrate;
    }

    /**
     * @return Latitude for data point
     */
    @JsonProperty("lat")
    public Optional<ClientFacingStreamLat> getLat() {
        return lat;
    }

    /**
     * @return Longitude for data point
     */
    @JsonProperty("lng")
    public Optional<ClientFacingStreamLng> getLng() {
        return lng;
    }

    /**
     * @return Cumulated distance for exercise
     */
    @JsonProperty("distance")
    public Optional<ClientFacingStreamDistance> getDistance() {
        return distance;
    }

    /**
     * @return Power in watts
     */
    @JsonProperty("power")
    public Optional<ClientFacingStreamPower> getPower() {
        return power;
    }

    /**
     * @return Resistance on bike
     */
    @JsonProperty("resistance")
    public Optional<ClientFacingStreamResistance> getResistance() {
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
        private Optional<ClientFacingStreamCadence> cadence = Optional.empty();

        private Optional<List<Integer>> time = Optional.empty();

        private Optional<ClientFacingStreamAltitude> altitude = Optional.empty();

        private Optional<ClientFacingStreamVelocitySmooth> velocitySmooth = Optional.empty();

        private Optional<ClientFacingStreamHeartrate> heartrate = Optional.empty();

        private Optional<ClientFacingStreamLat> lat = Optional.empty();

        private Optional<ClientFacingStreamLng> lng = Optional.empty();

        private Optional<ClientFacingStreamDistance> distance = Optional.empty();

        private Optional<ClientFacingStreamPower> power = Optional.empty();

        private Optional<ClientFacingStreamResistance> resistance = Optional.empty();

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
        public Builder cadence(Optional<ClientFacingStreamCadence> cadence) {
            this.cadence = cadence;
            return this;
        }

        public Builder cadence(ClientFacingStreamCadence cadence) {
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
        public Builder altitude(Optional<ClientFacingStreamAltitude> altitude) {
            this.altitude = altitude;
            return this;
        }

        public Builder altitude(ClientFacingStreamAltitude altitude) {
            this.altitude = Optional.of(altitude);
            return this;
        }

        @JsonSetter(value = "velocity_smooth", nulls = Nulls.SKIP)
        public Builder velocitySmooth(Optional<ClientFacingStreamVelocitySmooth> velocitySmooth) {
            this.velocitySmooth = velocitySmooth;
            return this;
        }

        public Builder velocitySmooth(ClientFacingStreamVelocitySmooth velocitySmooth) {
            this.velocitySmooth = Optional.of(velocitySmooth);
            return this;
        }

        @JsonSetter(value = "heartrate", nulls = Nulls.SKIP)
        public Builder heartrate(Optional<ClientFacingStreamHeartrate> heartrate) {
            this.heartrate = heartrate;
            return this;
        }

        public Builder heartrate(ClientFacingStreamHeartrate heartrate) {
            this.heartrate = Optional.of(heartrate);
            return this;
        }

        @JsonSetter(value = "lat", nulls = Nulls.SKIP)
        public Builder lat(Optional<ClientFacingStreamLat> lat) {
            this.lat = lat;
            return this;
        }

        public Builder lat(ClientFacingStreamLat lat) {
            this.lat = Optional.of(lat);
            return this;
        }

        @JsonSetter(value = "lng", nulls = Nulls.SKIP)
        public Builder lng(Optional<ClientFacingStreamLng> lng) {
            this.lng = lng;
            return this;
        }

        public Builder lng(ClientFacingStreamLng lng) {
            this.lng = Optional.of(lng);
            return this;
        }

        @JsonSetter(value = "distance", nulls = Nulls.SKIP)
        public Builder distance(Optional<ClientFacingStreamDistance> distance) {
            this.distance = distance;
            return this;
        }

        public Builder distance(ClientFacingStreamDistance distance) {
            this.distance = Optional.of(distance);
            return this;
        }

        @JsonSetter(value = "power", nulls = Nulls.SKIP)
        public Builder power(Optional<ClientFacingStreamPower> power) {
            this.power = power;
            return this;
        }

        public Builder power(ClientFacingStreamPower power) {
            this.power = Optional.of(power);
            return this;
        }

        @JsonSetter(value = "resistance", nulls = Nulls.SKIP)
        public Builder resistance(Optional<ClientFacingStreamResistance> resistance) {
            this.resistance = resistance;
            return this;
        }

        public Builder resistance(ClientFacingStreamResistance resistance) {
            this.resistance = Optional.of(resistance);
            return this;
        }

        public ClientFacingStream build() {
            return new ClientFacingStream(
                    cadence, time, altitude, velocitySmooth, heartrate, lat, lng, distance, power, resistance);
        }
    }
}
