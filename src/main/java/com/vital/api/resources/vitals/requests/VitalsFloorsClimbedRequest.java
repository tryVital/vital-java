package com.vital.api.resources.vitals.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.TimeseriesResource;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VitalsFloorsClimbedRequest.Builder.class)
public final class VitalsFloorsClimbedRequest {
    private final TimeseriesResource resource;

    private final Optional<String> provider;

    private final String startDate;

    private final Optional<String> endDate;

    private VitalsFloorsClimbedRequest(
            TimeseriesResource resource, Optional<String> provider, String startDate, Optional<String> endDate) {
        this.resource = resource;
        this.provider = provider;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @JsonProperty("resource")
    public TimeseriesResource getResource() {
        return resource;
    }

    /**
     * @return Provider oura/strava etc
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    /**
     * @return Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
     */
    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    /**
     * @return Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
     */
    @JsonProperty("end_date")
    public Optional<String> getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalsFloorsClimbedRequest && equalTo((VitalsFloorsClimbedRequest) other);
    }

    private boolean equalTo(VitalsFloorsClimbedRequest other) {
        return resource.equals(other.resource)
                && provider.equals(other.provider)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.resource, this.provider, this.startDate, this.endDate);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ResourceStage builder() {
        return new Builder();
    }

    public interface ResourceStage {
        StartDateStage resource(TimeseriesResource resource);

        Builder from(VitalsFloorsClimbedRequest other);
    }

    public interface StartDateStage {
        _FinalStage startDate(String startDate);
    }

    public interface _FinalStage {
        VitalsFloorsClimbedRequest build();

        _FinalStage provider(Optional<String> provider);

        _FinalStage provider(String provider);

        _FinalStage endDate(Optional<String> endDate);

        _FinalStage endDate(String endDate);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ResourceStage, StartDateStage, _FinalStage {
        private TimeseriesResource resource;

        private String startDate;

        private Optional<String> endDate = Optional.empty();

        private Optional<String> provider = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(VitalsFloorsClimbedRequest other) {
            resource(other.getResource());
            provider(other.getProvider());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            return this;
        }

        @Override
        @JsonSetter("resource")
        public StartDateStage resource(TimeseriesResource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("start_date")
        public _FinalStage startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage endDate(String endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @Override
        @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
        public _FinalStage endDate(Optional<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Provider oura/strava etc</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage provider(String provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        @Override
        public VitalsFloorsClimbedRequest build() {
            return new VitalsFloorsClimbedRequest(resource, provider, startDate, endDate);
        }
    }
}
