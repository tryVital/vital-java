package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LngLat.Builder.class)
public final class LngLat {
    private final double lng;

    private final double lat;

    private LngLat(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    @JsonProperty("lng")
    public double getLng() {
        return lng;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LngLat && equalTo((LngLat) other);
    }

    private boolean equalTo(LngLat other) {
        return lng == other.lng && lat == other.lat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lng, this.lat);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LngStage builder() {
        return new Builder();
    }

    public interface LngStage {
        LatStage lng(double lng);

        Builder from(LngLat other);
    }

    public interface LatStage {
        _FinalStage lat(double lat);
    }

    public interface _FinalStage {
        LngLat build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LngStage, LatStage, _FinalStage {
        private double lng;

        private double lat;

        private Builder() {}

        @Override
        public Builder from(LngLat other) {
            lng(other.getLng());
            lat(other.getLat());
            return this;
        }

        @Override
        @JsonSetter("lng")
        public LatStage lng(double lng) {
            this.lng = lng;
            return this;
        }

        @Override
        @JsonSetter("lat")
        public _FinalStage lat(double lat) {
            this.lat = lat;
            return this;
        }

        @Override
        public LngLat build() {
            return new LngLat(lng, lat);
        }
    }
}
