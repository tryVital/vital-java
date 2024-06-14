/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.vitals.requests;

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
@JsonDeserialize(builder = VitalsHeartrateGroupedRequest.Builder.class)
public final class VitalsHeartrateGroupedRequest {
    private final Optional<String> cursor;

    private final Optional<String> nextCursor;

    private final Optional<String> provider;

    private final String startDate;

    private final Optional<String> endDate;

    private final Map<String, Object> additionalProperties;

    private VitalsHeartrateGroupedRequest(
            Optional<String> cursor,
            Optional<String> nextCursor,
            Optional<String> provider,
            String startDate,
            Optional<String> endDate,
            Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.nextCursor = nextCursor;
        this.provider = provider;
        this.startDate = startDate;
        this.endDate = endDate;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The cursor for fetching the next page, or <code>null</code> to fetch the first page.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return The cursor for fetching the next page, or <code>null</code> to fetch the first page.
     */
    @JsonProperty("next_cursor")
    public Optional<String> getNextCursor() {
        return nextCursor;
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
        return other instanceof VitalsHeartrateGroupedRequest && equalTo((VitalsHeartrateGroupedRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VitalsHeartrateGroupedRequest other) {
        return cursor.equals(other.cursor)
                && nextCursor.equals(other.nextCursor)
                && provider.equals(other.provider)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cursor, this.nextCursor, this.provider, this.startDate, this.endDate);
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

        Builder from(VitalsHeartrateGroupedRequest other);
    }

    public interface _FinalStage {
        VitalsHeartrateGroupedRequest build();

        _FinalStage cursor(Optional<String> cursor);

        _FinalStage cursor(String cursor);

        _FinalStage nextCursor(Optional<String> nextCursor);

        _FinalStage nextCursor(String nextCursor);

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

        private Optional<String> nextCursor = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(VitalsHeartrateGroupedRequest other) {
            cursor(other.getCursor());
            nextCursor(other.getNextCursor());
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

        /**
         * <p>The cursor for fetching the next page, or <code>null</code> to fetch the first page.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage nextCursor(String nextCursor) {
            this.nextCursor = Optional.of(nextCursor);
            return this;
        }

        @Override
        @JsonSetter(value = "next_cursor", nulls = Nulls.SKIP)
        public _FinalStage nextCursor(Optional<String> nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The cursor for fetching the next page, or <code>null</code> to fetch the first page.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @Override
        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public _FinalStage cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        @Override
        public VitalsHeartrateGroupedRequest build() {
            return new VitalsHeartrateGroupedRequest(
                    cursor, nextCursor, provider, startDate, endDate, additionalProperties);
        }
    }
}
