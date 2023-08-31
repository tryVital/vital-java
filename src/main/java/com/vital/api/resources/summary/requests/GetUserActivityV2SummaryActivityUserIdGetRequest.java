package com.vital.api.resources.summary.requests;

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
@JsonDeserialize(builder = GetUserActivityV2SummaryActivityUserIdGetRequest.Builder.class)
public final class GetUserActivityV2SummaryActivityUserIdGetRequest {
    private final Optional<String> provider;

    private final String startDate;

    private final Optional<String> endDate;

    private GetUserActivityV2SummaryActivityUserIdGetRequest(
            Optional<String> provider, String startDate, Optional<String> endDate) {
        this.provider = provider;
        this.startDate = startDate;
        this.endDate = endDate;
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
        return other instanceof GetUserActivityV2SummaryActivityUserIdGetRequest
                && equalTo((GetUserActivityV2SummaryActivityUserIdGetRequest) other);
    }

    private boolean equalTo(GetUserActivityV2SummaryActivityUserIdGetRequest other) {
        return provider.equals(other.provider) && startDate.equals(other.startDate) && endDate.equals(other.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.provider, this.startDate, this.endDate);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StartDateStage builder() {
        return new Builder();
    }

    public interface StartDateStage {
        _FinalStage startDate(String startDate);

        Builder from(GetUserActivityV2SummaryActivityUserIdGetRequest other);
    }

    public interface _FinalStage {
        GetUserActivityV2SummaryActivityUserIdGetRequest build();

        _FinalStage provider(Optional<String> provider);

        _FinalStage provider(String provider);

        _FinalStage endDate(Optional<String> endDate);

        _FinalStage endDate(String endDate);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StartDateStage, _FinalStage {
        private String startDate;

        private Optional<String> endDate = Optional.empty();

        private Optional<String> provider = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(GetUserActivityV2SummaryActivityUserIdGetRequest other) {
            provider(other.getProvider());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
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
        public GetUserActivityV2SummaryActivityUserIdGetRequest build() {
            return new GetUserActivityV2SummaryActivityUserIdGetRequest(provider, startDate, endDate);
        }
    }
}
