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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EventDestinationPreferences.Builder.class)
public final class EventDestinationPreferences {
    private final EventDestinationPreferencesPreferred preferred;

    private final List<EventDestinationPreferencesEnabledItem> enabled;

    private final Map<String, Object> additionalProperties;

    private EventDestinationPreferences(
            EventDestinationPreferencesPreferred preferred,
            List<EventDestinationPreferencesEnabledItem> enabled,
            Map<String, Object> additionalProperties) {
        this.preferred = preferred;
        this.enabled = enabled;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("preferred")
    public EventDestinationPreferencesPreferred getPreferred() {
        return preferred;
    }

    @JsonProperty("enabled")
    public List<EventDestinationPreferencesEnabledItem> getEnabled() {
        return enabled;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventDestinationPreferences && equalTo((EventDestinationPreferences) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EventDestinationPreferences other) {
        return preferred.equals(other.preferred) && enabled.equals(other.enabled);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.preferred, this.enabled);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PreferredStage builder() {
        return new Builder();
    }

    public interface PreferredStage {
        _FinalStage preferred(EventDestinationPreferencesPreferred preferred);

        Builder from(EventDestinationPreferences other);
    }

    public interface _FinalStage {
        EventDestinationPreferences build();

        _FinalStage enabled(List<EventDestinationPreferencesEnabledItem> enabled);

        _FinalStage addEnabled(EventDestinationPreferencesEnabledItem enabled);

        _FinalStage addAllEnabled(List<EventDestinationPreferencesEnabledItem> enabled);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PreferredStage, _FinalStage {
        private EventDestinationPreferencesPreferred preferred;

        private List<EventDestinationPreferencesEnabledItem> enabled = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EventDestinationPreferences other) {
            preferred(other.getPreferred());
            enabled(other.getEnabled());
            return this;
        }

        @java.lang.Override
        @JsonSetter("preferred")
        public _FinalStage preferred(EventDestinationPreferencesPreferred preferred) {
            this.preferred = preferred;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllEnabled(List<EventDestinationPreferencesEnabledItem> enabled) {
            this.enabled.addAll(enabled);
            return this;
        }

        @java.lang.Override
        public _FinalStage addEnabled(EventDestinationPreferencesEnabledItem enabled) {
            this.enabled.add(enabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "enabled", nulls = Nulls.SKIP)
        public _FinalStage enabled(List<EventDestinationPreferencesEnabledItem> enabled) {
            this.enabled.clear();
            this.enabled.addAll(enabled);
            return this;
        }

        @java.lang.Override
        public EventDestinationPreferences build() {
            return new EventDestinationPreferences(preferred, enabled, additionalProperties);
        }
    }
}
