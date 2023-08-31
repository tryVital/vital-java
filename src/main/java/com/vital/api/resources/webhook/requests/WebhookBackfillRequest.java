package com.vital.api.resources.webhook.requests;

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
@JsonDeserialize(builder = WebhookBackfillRequest.Builder.class)
public final class WebhookBackfillRequest {
    private final String provider;

    private final String startDate;

    private final Optional<String> endDate;

    private WebhookBackfillRequest(String provider, String startDate, Optional<String> endDate) {
        this.provider = provider;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @JsonProperty("provider")
    public String getProvider() {
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
        return other instanceof WebhookBackfillRequest && equalTo((WebhookBackfillRequest) other);
    }

    private boolean equalTo(WebhookBackfillRequest other) {
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

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        StartDateStage provider(String provider);

        Builder from(WebhookBackfillRequest other);
    }

    public interface StartDateStage {
        _FinalStage startDate(String startDate);
    }

    public interface _FinalStage {
        WebhookBackfillRequest build();

        _FinalStage endDate(Optional<String> endDate);

        _FinalStage endDate(String endDate);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, StartDateStage, _FinalStage {
        private String provider;

        private String startDate;

        private Optional<String> endDate = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(WebhookBackfillRequest other) {
            provider(other.getProvider());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            return this;
        }

        @Override
        @JsonSetter("provider")
        public StartDateStage provider(String provider) {
            this.provider = provider;
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

        @Override
        public WebhookBackfillRequest build() {
            return new WebhookBackfillRequest(provider, startDate, endDate);
        }
    }
}
