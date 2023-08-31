package com.vital.api.resources.user.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserPatchBody.Builder.class)
public final class UserPatchBody {
    private final Optional<String> fallbackTimeZone;

    private UserPatchBody(Optional<String> fallbackTimeZone) {
        this.fallbackTimeZone = fallbackTimeZone;
    }

    /**
     * @return Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
     * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
     */
    @JsonProperty("fallback_time_zone")
    public Optional<String> getFallbackTimeZone() {
        return fallbackTimeZone;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserPatchBody && equalTo((UserPatchBody) other);
    }

    private boolean equalTo(UserPatchBody other) {
        return fallbackTimeZone.equals(other.fallbackTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fallbackTimeZone);
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

        private Builder() {}

        public Builder from(UserPatchBody other) {
            fallbackTimeZone(other.getFallbackTimeZone());
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

        public UserPatchBody build() {
            return new UserPatchBody(fallbackTimeZone);
        }
    }
}
