/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

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
@JsonDeserialize(builder = SleepSelector.Builder.class)
public final class SleepSelector {
    private final SleepSelectorSleep sleep;

    private final Map<String, Object> additionalProperties;

    private SleepSelector(SleepSelectorSleep sleep, Map<String, Object> additionalProperties) {
        this.sleep = sleep;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("sleep")
    public SleepSelectorSleep getSleep() {
        return sleep;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SleepSelector && equalTo((SleepSelector) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SleepSelector other) {
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

    public static SleepStage builder() {
        return new Builder();
    }

    public interface SleepStage {
        _FinalStage sleep(SleepSelectorSleep sleep);

        Builder from(SleepSelector other);
    }

    public interface _FinalStage {
        SleepSelector build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SleepStage, _FinalStage {
        private SleepSelectorSleep sleep;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(SleepSelector other) {
            sleep(other.getSleep());
            return this;
        }

        @Override
        @JsonSetter("sleep")
        public _FinalStage sleep(SleepSelectorSleep sleep) {
            this.sleep = sleep;
            return this;
        }

        @Override
        public SleepSelector build() {
            return new SleepSelector(sleep, additionalProperties);
        }
    }
}
