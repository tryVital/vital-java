/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingWorkoutMap.Builder.class)
public final class ClientFacingWorkoutMap {
    private final Optional<String> polyline;

    private final Optional<String> summaryPolyline;

    private final Map<String, Object> additionalProperties;

    private ClientFacingWorkoutMap(
            Optional<String> polyline, Optional<String> summaryPolyline, Map<String, Object> additionalProperties) {
        this.polyline = polyline;
        this.summaryPolyline = summaryPolyline;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Polyline of the map
     */
    @JsonProperty("polyline")
    public Optional<String> getPolyline() {
        return polyline;
    }

    /**
     * @return A lower resolution summary of the polyline
     */
    @JsonProperty("summary_polyline")
    public Optional<String> getSummaryPolyline() {
        return summaryPolyline;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingWorkoutMap && equalTo((ClientFacingWorkoutMap) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingWorkoutMap other) {
        return polyline.equals(other.polyline) && summaryPolyline.equals(other.summaryPolyline);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.polyline, this.summaryPolyline);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> polyline = Optional.empty();

        private Optional<String> summaryPolyline = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientFacingWorkoutMap other) {
            polyline(other.getPolyline());
            summaryPolyline(other.getSummaryPolyline());
            return this;
        }

        @JsonSetter(value = "polyline", nulls = Nulls.SKIP)
        public Builder polyline(Optional<String> polyline) {
            this.polyline = polyline;
            return this;
        }

        public Builder polyline(String polyline) {
            this.polyline = Optional.of(polyline);
            return this;
        }

        @JsonSetter(value = "summary_polyline", nulls = Nulls.SKIP)
        public Builder summaryPolyline(Optional<String> summaryPolyline) {
            this.summaryPolyline = summaryPolyline;
            return this;
        }

        public Builder summaryPolyline(String summaryPolyline) {
            this.summaryPolyline = Optional.of(summaryPolyline);
            return this;
        }

        public ClientFacingWorkoutMap build() {
            return new ClientFacingWorkoutMap(polyline, summaryPolyline, additionalProperties);
        }
    }
}