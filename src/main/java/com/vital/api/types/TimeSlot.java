package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimeSlot.Builder.class)
public final class TimeSlot {
    private final Optional<String> bookingKey;

    private final OffsetDateTime start;

    private final OffsetDateTime end;

    private final Optional<OffsetDateTime> expiresAt;

    private final double price;

    private final boolean isPriority;

    private final int numAppointmentsAvailable;

    private TimeSlot(
            Optional<String> bookingKey,
            OffsetDateTime start,
            OffsetDateTime end,
            Optional<OffsetDateTime> expiresAt,
            double price,
            boolean isPriority,
            int numAppointmentsAvailable) {
        this.bookingKey = bookingKey;
        this.start = start;
        this.end = end;
        this.expiresAt = expiresAt;
        this.price = price;
        this.isPriority = isPriority;
        this.numAppointmentsAvailable = numAppointmentsAvailable;
    }

    @JsonProperty("booking_key")
    public Optional<String> getBookingKey() {
        return bookingKey;
    }

    @JsonProperty("start")
    public OffsetDateTime getStart() {
        return start;
    }

    @JsonProperty("end")
    public OffsetDateTime getEnd() {
        return end;
    }

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("price")
    public double getPrice() {
        return price;
    }

    @JsonProperty("is_priority")
    public boolean getIsPriority() {
        return isPriority;
    }

    @JsonProperty("num_appointments_available")
    public int getNumAppointmentsAvailable() {
        return numAppointmentsAvailable;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimeSlot && equalTo((TimeSlot) other);
    }

    private boolean equalTo(TimeSlot other) {
        return bookingKey.equals(other.bookingKey)
                && start.equals(other.start)
                && end.equals(other.end)
                && expiresAt.equals(other.expiresAt)
                && price == other.price
                && isPriority == other.isPriority
                && numAppointmentsAvailable == other.numAppointmentsAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.bookingKey,
                this.start,
                this.end,
                this.expiresAt,
                this.price,
                this.isPriority,
                this.numAppointmentsAvailable);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StartStage builder() {
        return new Builder();
    }

    public interface StartStage {
        EndStage start(OffsetDateTime start);

        Builder from(TimeSlot other);
    }

    public interface EndStage {
        PriceStage end(OffsetDateTime end);
    }

    public interface PriceStage {
        IsPriorityStage price(double price);
    }

    public interface IsPriorityStage {
        NumAppointmentsAvailableStage isPriority(boolean isPriority);
    }

    public interface NumAppointmentsAvailableStage {
        _FinalStage numAppointmentsAvailable(int numAppointmentsAvailable);
    }

    public interface _FinalStage {
        TimeSlot build();

        _FinalStage bookingKey(Optional<String> bookingKey);

        _FinalStage bookingKey(String bookingKey);

        _FinalStage expiresAt(Optional<OffsetDateTime> expiresAt);

        _FinalStage expiresAt(OffsetDateTime expiresAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements StartStage, EndStage, PriceStage, IsPriorityStage, NumAppointmentsAvailableStage, _FinalStage {
        private OffsetDateTime start;

        private OffsetDateTime end;

        private double price;

        private boolean isPriority;

        private int numAppointmentsAvailable;

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Optional<String> bookingKey = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(TimeSlot other) {
            bookingKey(other.getBookingKey());
            start(other.getStart());
            end(other.getEnd());
            expiresAt(other.getExpiresAt());
            price(other.getPrice());
            isPriority(other.getIsPriority());
            numAppointmentsAvailable(other.getNumAppointmentsAvailable());
            return this;
        }

        @Override
        @JsonSetter("start")
        public EndStage start(OffsetDateTime start) {
            this.start = start;
            return this;
        }

        @Override
        @JsonSetter("end")
        public PriceStage end(OffsetDateTime end) {
            this.end = end;
            return this;
        }

        @Override
        @JsonSetter("price")
        public IsPriorityStage price(double price) {
            this.price = price;
            return this;
        }

        @Override
        @JsonSetter("is_priority")
        public NumAppointmentsAvailableStage isPriority(boolean isPriority) {
            this.isPriority = isPriority;
            return this;
        }

        @Override
        @JsonSetter("num_appointments_available")
        public _FinalStage numAppointmentsAvailable(int numAppointmentsAvailable) {
            this.numAppointmentsAvailable = numAppointmentsAvailable;
            return this;
        }

        @Override
        public _FinalStage expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.of(expiresAt);
            return this;
        }

        @Override
        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public _FinalStage expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        @Override
        public _FinalStage bookingKey(String bookingKey) {
            this.bookingKey = Optional.of(bookingKey);
            return this;
        }

        @Override
        @JsonSetter(value = "booking_key", nulls = Nulls.SKIP)
        public _FinalStage bookingKey(Optional<String> bookingKey) {
            this.bookingKey = bookingKey;
            return this;
        }

        @Override
        public TimeSlot build() {
            return new TimeSlot(bookingKey, start, end, expiresAt, price, isPriority, numAppointmentsAvailable);
        }
    }
}