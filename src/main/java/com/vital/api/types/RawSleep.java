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
@JsonDeserialize(builder = RawSleep.Builder.class)
public final class RawSleep {
    private final List<SleepV2InDb> sleep;

    private RawSleep(List<SleepV2InDb> sleep) {
        this.sleep = sleep;
    }

    @JsonProperty("sleep")
    public List<SleepV2InDb> getSleep() {
        return sleep;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RawSleep && equalTo((RawSleep) other);
    }

    private boolean equalTo(RawSleep other) {
        return sleep.equals(other.sleep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.sleep);
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
        private List<SleepV2InDb> sleep = new ArrayList<>();

        private Builder() {}

        public Builder from(RawSleep other) {
            sleep(other.getSleep());
            return this;
        }

        @JsonSetter(value = "sleep", nulls = Nulls.SKIP)
        public Builder sleep(List<SleepV2InDb> sleep) {
            this.sleep.clear();
            this.sleep.addAll(sleep);
            return this;
        }

        public Builder addSleep(SleepV2InDb sleep) {
            this.sleep.add(sleep);
            return this;
        }

        public Builder addAllSleep(List<SleepV2InDb> sleep) {
            this.sleep.addAll(sleep);
            return this;
        }

        public RawSleep build() {
            return new RawSleep(sleep);
        }
    }
}
