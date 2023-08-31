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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DaySlots.Builder.class)
public final class DaySlots {
    private final String date;

    private final List<TimeSlot> slots;

    private DaySlots(String date, List<TimeSlot> slots) {
        this.date = date;
        this.slots = slots;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("slots")
    public List<TimeSlot> getSlots() {
        return slots;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DaySlots && equalTo((DaySlots) other);
    }

    private boolean equalTo(DaySlots other) {
        return date.equals(other.date) && slots.equals(other.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.date, this.slots);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        _FinalStage date(String date);

        Builder from(DaySlots other);
    }

    public interface _FinalStage {
        DaySlots build();

        _FinalStage slots(List<TimeSlot> slots);

        _FinalStage addSlots(TimeSlot slots);

        _FinalStage addAllSlots(List<TimeSlot> slots);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateStage, _FinalStage {
        private String date;

        private List<TimeSlot> slots = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(DaySlots other) {
            date(other.getDate());
            slots(other.getSlots());
            return this;
        }

        @Override
        @JsonSetter("date")
        public _FinalStage date(String date) {
            this.date = date;
            return this;
        }

        @Override
        public _FinalStage addAllSlots(List<TimeSlot> slots) {
            this.slots.addAll(slots);
            return this;
        }

        @Override
        public _FinalStage addSlots(TimeSlot slots) {
            this.slots.add(slots);
            return this;
        }

        @Override
        @JsonSetter(value = "slots", nulls = Nulls.SKIP)
        public _FinalStage slots(List<TimeSlot> slots) {
            this.slots.clear();
            this.slots.addAll(slots);
            return this;
        }

        @Override
        public DaySlots build() {
            return new DaySlots(date, slots);
        }
    }
}
