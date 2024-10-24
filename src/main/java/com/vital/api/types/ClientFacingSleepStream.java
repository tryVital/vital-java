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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSleepStream.Builder.class)
public final class ClientFacingSleepStream {
    private final Optional<List<ClientFacingHrvTimeseries>> hrv;

    private final Optional<List<ClientFacingHeartRateTimeseries>> heartrate;

    private final Optional<List<ClientFacingHypnogramTimeseries>> hypnogram;

    private final Optional<List<ClientFacingRespiratoryRateTimeseries>> respiratoryRate;

    private final Map<String, Object> additionalProperties;

    private ClientFacingSleepStream(
            Optional<List<ClientFacingHrvTimeseries>> hrv,
            Optional<List<ClientFacingHeartRateTimeseries>> heartrate,
            Optional<List<ClientFacingHypnogramTimeseries>> hypnogram,
            Optional<List<ClientFacingRespiratoryRateTimeseries>> respiratoryRate,
            Map<String, Object> additionalProperties) {
        this.hrv = hrv;
        this.heartrate = heartrate;
        this.hypnogram = hypnogram;
        this.respiratoryRate = respiratoryRate;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("hrv")
    public Optional<List<ClientFacingHrvTimeseries>> getHrv() {
        return hrv;
    }

    @JsonProperty("heartrate")
    public Optional<List<ClientFacingHeartRateTimeseries>> getHeartrate() {
        return heartrate;
    }

    @JsonProperty("hypnogram")
    public Optional<List<ClientFacingHypnogramTimeseries>> getHypnogram() {
        return hypnogram;
    }

    @JsonProperty("respiratory_rate")
    public Optional<List<ClientFacingRespiratoryRateTimeseries>> getRespiratoryRate() {
        return respiratoryRate;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSleepStream && equalTo((ClientFacingSleepStream) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingSleepStream other) {
        return hrv.equals(other.hrv)
                && heartrate.equals(other.heartrate)
                && hypnogram.equals(other.hypnogram)
                && respiratoryRate.equals(other.respiratoryRate);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.hrv, this.heartrate, this.hypnogram, this.respiratoryRate);
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
        private Optional<List<ClientFacingHrvTimeseries>> hrv = Optional.empty();

        private Optional<List<ClientFacingHeartRateTimeseries>> heartrate = Optional.empty();

        private Optional<List<ClientFacingHypnogramTimeseries>> hypnogram = Optional.empty();

        private Optional<List<ClientFacingRespiratoryRateTimeseries>> respiratoryRate = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientFacingSleepStream other) {
            hrv(other.getHrv());
            heartrate(other.getHeartrate());
            hypnogram(other.getHypnogram());
            respiratoryRate(other.getRespiratoryRate());
            return this;
        }

        @JsonSetter(value = "hrv", nulls = Nulls.SKIP)
        public Builder hrv(Optional<List<ClientFacingHrvTimeseries>> hrv) {
            this.hrv = hrv;
            return this;
        }

        public Builder hrv(List<ClientFacingHrvTimeseries> hrv) {
            this.hrv = Optional.of(hrv);
            return this;
        }

        @JsonSetter(value = "heartrate", nulls = Nulls.SKIP)
        public Builder heartrate(Optional<List<ClientFacingHeartRateTimeseries>> heartrate) {
            this.heartrate = heartrate;
            return this;
        }

        public Builder heartrate(List<ClientFacingHeartRateTimeseries> heartrate) {
            this.heartrate = Optional.of(heartrate);
            return this;
        }

        @JsonSetter(value = "hypnogram", nulls = Nulls.SKIP)
        public Builder hypnogram(Optional<List<ClientFacingHypnogramTimeseries>> hypnogram) {
            this.hypnogram = hypnogram;
            return this;
        }

        public Builder hypnogram(List<ClientFacingHypnogramTimeseries> hypnogram) {
            this.hypnogram = Optional.of(hypnogram);
            return this;
        }

        @JsonSetter(value = "respiratory_rate", nulls = Nulls.SKIP)
        public Builder respiratoryRate(Optional<List<ClientFacingRespiratoryRateTimeseries>> respiratoryRate) {
            this.respiratoryRate = respiratoryRate;
            return this;
        }

        public Builder respiratoryRate(List<ClientFacingRespiratoryRateTimeseries> respiratoryRate) {
            this.respiratoryRate = Optional.of(respiratoryRate);
            return this;
        }

        public ClientFacingSleepStream build() {
            return new ClientFacingSleepStream(hrv, heartrate, hypnogram, respiratoryRate, additionalProperties);
        }
    }
}
