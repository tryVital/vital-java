package com.vital.api.resources.athomephlebotomy.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AppointmentRescheduleRequest.Builder.class)
public final class AppointmentRescheduleRequest {
    private final String bookingKey;

    private AppointmentRescheduleRequest(String bookingKey) {
        this.bookingKey = bookingKey;
    }

    @JsonProperty("booking_key")
    public String getBookingKey() {
        return bookingKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppointmentRescheduleRequest && equalTo((AppointmentRescheduleRequest) other);
    }

    private boolean equalTo(AppointmentRescheduleRequest other) {
        return bookingKey.equals(other.bookingKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bookingKey);
    }

    @Override
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

        private Builder() {}

        @Override
        public Builder from(AppointmentRescheduleRequest other) {
            bookingKey(other.getBookingKey());
            return this;
        }

        @Override
        @JsonSetter("booking_key")
        public _FinalStage bookingKey(String bookingKey) {
            this.bookingKey = bookingKey;
            return this;
        }

        @Override
        public AppointmentRescheduleRequest build() {
            return new AppointmentRescheduleRequest(bookingKey);
        }
    }
}
