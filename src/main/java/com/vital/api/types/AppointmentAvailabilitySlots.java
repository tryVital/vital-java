package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AppointmentAvailabilitySlots.Builder.class)
public final class AppointmentAvailabilitySlots {
    private final List<DaySlots> slots;

    private final Optional<String> timezone;

    private AppointmentAvailabilitySlots(List<DaySlots> slots, Optional<String> timezone) {
        this.slots = slots;
        this.timezone = timezone;
    }

    @JsonProperty("slots")
    public List<DaySlots> getSlots() {
        return slots;
    }

    @JsonProperty("timezone")
    public Optional<String> getTimezone() {
        return timezone;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppointmentAvailabilitySlots && equalTo((AppointmentAvailabilitySlots) other);
    }

    private boolean equalTo(AppointmentAvailabilitySlots other) {
        return slots.equals(other.slots) && timezone.equals(other.timezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.slots, this.timezone);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<DaySlots> slots = new ArrayList<>();

        private Optional<String> timezone = Optional.empty();

        private Builder() {}

        public Builder from(AppointmentAvailabilitySlots other) {
            slots(other.getSlots());
            timezone(other.getTimezone());
            return this;
        }

        @JsonSetter(value = "slots", nulls = Nulls.SKIP)
        public Builder slots(List<DaySlots> slots) {
            this.slots.clear();
            this.slots.addAll(slots);
            return this;
        }

        public Builder addSlots(DaySlots slots) {
            this.slots.add(slots);
            return this;
        }

        public Builder addAllSlots(List<DaySlots> slots) {
            this.slots.addAll(slots);
            return this;
        }

        @JsonSetter(value = "timezone", nulls = Nulls.SKIP)
        public Builder timezone(Optional<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder timezone(String timezone) {
            this.timezone = Optional.of(timezone);
            return this;
        }

        public AppointmentAvailabilitySlots build() {
            return new AppointmentAvailabilitySlots(slots, timezone);
        }
    }
}
