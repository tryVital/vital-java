/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AppointmentRescheduleRequest.Builder.class)
public final class AppointmentRescheduleRequest {
    private final String bookingKey;

    private final Map<String, Object> additionalProperties;

    private AppointmentRescheduleRequest(String bookingKey, Map<String, Object> additionalProperties) {
        this.bookingKey = bookingKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("booking_key")
    public String getBookingKey() {
        return bookingKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppointmentRescheduleRequest && equalTo((AppointmentRescheduleRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AppointmentRescheduleRequest other) {
        return bookingKey.equals(other.bookingKey);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.bookingKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BookingKeyStage builder() {
        return new Builder();
    }

    public interface BookingKeyStage {
        _FinalStage bookingKey(String bookingKey);

        Builder from(AppointmentRescheduleRequest other);
    }

    public interface _FinalStage {
        AppointmentRescheduleRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BookingKeyStage, _FinalStage {
        private String bookingKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AppointmentRescheduleRequest other) {
            bookingKey(other.getBookingKey());
            return this;
        }

        @java.lang.Override
        @JsonSetter("booking_key")
        public _FinalStage bookingKey(String bookingKey) {
            this.bookingKey = bookingKey;
            return this;
        }

        @java.lang.Override
        public AppointmentRescheduleRequest build() {
            return new AppointmentRescheduleRequest(bookingKey, additionalProperties);
        }
    }
}
