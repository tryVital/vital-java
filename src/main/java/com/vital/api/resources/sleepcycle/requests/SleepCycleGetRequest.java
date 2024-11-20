/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.sleepcycle.requests;

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
@JsonDeserialize(builder = SleepCycleGetRequest.Builder.class)
public final class SleepCycleGetRequest {
    private final String startDate;

    private final Optional<String> endDate;

    private final Optional<String> provider;

    private final Map<String, Object> additionalProperties;

    private SleepCycleGetRequest(
            String startDate,
            Optional<String> endDate,
            Optional<String> provider,
            Map<String, Object> additionalProperties) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.provider = provider;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("end_date")
    public Optional<String> getEndDate() {
        return endDate;
    }

    /**
     * @return Provider oura/strava etc
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SleepCycleGetRequest && equalTo((SleepCycleGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SleepCycleGetRequest other) {
        return startDate.equals(other.startDate) && endDate.equals(other.endDate) && provider.equals(other.provider);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.startDate, this.endDate, this.provider);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StartDateStage builder() {
        return new Builder();
    }

    public interface StartDateStage {
        _FinalStage startDate(String startDate);

        Builder from(SleepCycleGetRequest other);
    }

    public interface _FinalStage {
        SleepCycleGetRequest build();

        _FinalStage endDate(Optional<String> endDate);

        _FinalStage endDate(String endDate);

        _FinalStage provider(Optional<String> provider);

        _FinalStage provider(String provider);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StartDateStage, _FinalStage {
        private String startDate;

        private Optional<String> provider = Optional.empty();

        private Optional<String> endDate = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SleepCycleGetRequest other) {
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            provider(other.getProvider());
            return this;
        }

        @java.lang.Override
        @JsonSetter("start_date")
        public _FinalStage startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Provider oura/strava etc</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage provider(String provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        public _FinalStage endDate(String endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
        public _FinalStage endDate(Optional<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        @java.lang.Override
        public SleepCycleGetRequest build() {
            return new SleepCycleGetRequest(startDate, endDate, provider, additionalProperties);
        }
    }
}