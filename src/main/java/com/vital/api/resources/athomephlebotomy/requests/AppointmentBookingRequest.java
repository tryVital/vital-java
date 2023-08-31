package com.vital.api.resources.athomephlebotomy.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AppointmentBookingRequest.Builder.class)
public final class AppointmentBookingRequest {
    private final String bookingKey;

    private AppointmentBookingRequest(String bookingKey) {
        this.bookingKey = bookingKey;
    }

    @JsonProperty("booking_key")
    public String getBookingKey() {
        return bookingKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppointmentBookingRequest && equalTo((AppointmentBookingRequest) other);
    }

    private boolean equalTo(AppointmentBookingRequest other) {
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

        Builder from(AppointmentBookingRequest other);
    }

    public interface _FinalStage {
        AppointmentBookingRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BookingKeyStage, _FinalStage {
        private String bookingKey;

        private Builder() {}

        @Override
        public Builder from(AppointmentBookingRequest other) {
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
        public AppointmentBookingRequest build() {
            return new AppointmentBookingRequest(bookingKey);
        }
    }
}
