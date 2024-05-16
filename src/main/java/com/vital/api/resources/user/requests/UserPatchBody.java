/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.user.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserPatchBody.Builder.class)
public final class UserPatchBody {
    private final Optional<String> fallbackTimeZone;

    private final Optional<String> fallbackBirthDate;

    private final Optional<String> ingestionStart;

    private final Optional<String> ingestionEnd;

    private final Map<String, Object> additionalProperties;

    private UserPatchBody(
            Optional<String> fallbackTimeZone,
            Optional<String> fallbackBirthDate,
            Optional<String> ingestionStart,
            Optional<String> ingestionEnd,
            Map<String, Object> additionalProperties) {
        this.fallbackTimeZone = fallbackTimeZone;
        this.fallbackBirthDate = fallbackBirthDate;
        this.ingestionStart = ingestionStart;
        this.ingestionEnd = ingestionEnd;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
     * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
     */
    @JsonProperty("fallback_time_zone")
    public Optional<String> getFallbackTimeZone() {
        return fallbackTimeZone;
    }

    /**
     * @return Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.
     */
    @JsonProperty("fallback_birth_date")
    public Optional<String> getFallbackBirthDate() {
        return fallbackBirthDate;
    }

    /**
     * @return Starting bound for user data ingestion. Data older than this date will not be ingested.
     */
    @JsonProperty("ingestion_start")
    public Optional<String> getIngestionStart() {
        return ingestionStart;
    }

    /**
     * @return Ending bound for user data ingestion. Data from this date or later will not be ingested and the connection will be deregistered.
     */
    @JsonProperty("ingestion_end")
    public Optional<String> getIngestionEnd() {
        return ingestionEnd;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserPatchBody && equalTo((UserPatchBody) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserPatchBody other) {
        return fallbackTimeZone.equals(other.fallbackTimeZone)
                && fallbackBirthDate.equals(other.fallbackBirthDate)
                && ingestionStart.equals(other.ingestionStart)
                && ingestionEnd.equals(other.ingestionEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fallbackTimeZone, this.fallbackBirthDate, this.ingestionStart, this.ingestionEnd);
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
        private Optional<String> fallbackTimeZone = Optional.empty();

        private Optional<String> fallbackBirthDate = Optional.empty();

        private Optional<String> ingestionStart = Optional.empty();

        private Optional<String> ingestionEnd = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UserPatchBody other) {
            fallbackTimeZone(other.getFallbackTimeZone());
            fallbackBirthDate(other.getFallbackBirthDate());
            ingestionStart(other.getIngestionStart());
            ingestionEnd(other.getIngestionEnd());
            return this;
        }

        @JsonSetter(value = "fallback_time_zone", nulls = Nulls.SKIP)
        public Builder fallbackTimeZone(Optional<String> fallbackTimeZone) {
            this.fallbackTimeZone = fallbackTimeZone;
            return this;
        }

        public Builder fallbackTimeZone(String fallbackTimeZone) {
            this.fallbackTimeZone = Optional.of(fallbackTimeZone);
            return this;
        }

        @JsonSetter(value = "fallback_birth_date", nulls = Nulls.SKIP)
        public Builder fallbackBirthDate(Optional<String> fallbackBirthDate) {
            this.fallbackBirthDate = fallbackBirthDate;
            return this;
        }

        public Builder fallbackBirthDate(String fallbackBirthDate) {
            this.fallbackBirthDate = Optional.of(fallbackBirthDate);
            return this;
        }

        @JsonSetter(value = "ingestion_start", nulls = Nulls.SKIP)
        public Builder ingestionStart(Optional<String> ingestionStart) {
            this.ingestionStart = ingestionStart;
            return this;
        }

        public Builder ingestionStart(String ingestionStart) {
            this.ingestionStart = Optional.of(ingestionStart);
            return this;
        }

        @JsonSetter(value = "ingestion_end", nulls = Nulls.SKIP)
        public Builder ingestionEnd(Optional<String> ingestionEnd) {
            this.ingestionEnd = ingestionEnd;
            return this;
        }

        public Builder ingestionEnd(String ingestionEnd) {
            this.ingestionEnd = Optional.of(ingestionEnd);
            return this;
        }

        public UserPatchBody build() {
            return new UserPatchBody(
                    fallbackTimeZone, fallbackBirthDate, ingestionStart, ingestionEnd, additionalProperties);
        }
    }
}
