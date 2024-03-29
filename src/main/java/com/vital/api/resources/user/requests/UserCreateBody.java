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
@JsonDeserialize(builder = UserCreateBody.Builder.class)
public final class UserCreateBody {
    private final String clientUserId;

    private final Optional<String> fallbackTimeZone;

    private final Optional<String> fallbackBirthDate;

    private final Map<String, Object> additionalProperties;

    private UserCreateBody(
            String clientUserId,
            Optional<String> fallbackTimeZone,
            Optional<String> fallbackBirthDate,
            Map<String, Object> additionalProperties) {
        this.clientUserId = clientUserId;
        this.fallbackTimeZone = fallbackTimeZone;
        this.fallbackBirthDate = fallbackBirthDate;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
     */
    @JsonProperty("client_user_id")
    public String getClientUserId() {
        return clientUserId;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserCreateBody && equalTo((UserCreateBody) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserCreateBody other) {
        return clientUserId.equals(other.clientUserId)
                && fallbackTimeZone.equals(other.fallbackTimeZone)
                && fallbackBirthDate.equals(other.fallbackBirthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientUserId, this.fallbackTimeZone, this.fallbackBirthDate);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ClientUserIdStage builder() {
        return new Builder();
    }

    public interface ClientUserIdStage {
        _FinalStage clientUserId(String clientUserId);

        Builder from(UserCreateBody other);
    }

    public interface _FinalStage {
        UserCreateBody build();

        _FinalStage fallbackTimeZone(Optional<String> fallbackTimeZone);

        _FinalStage fallbackTimeZone(String fallbackTimeZone);

        _FinalStage fallbackBirthDate(Optional<String> fallbackBirthDate);

        _FinalStage fallbackBirthDate(String fallbackBirthDate);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClientUserIdStage, _FinalStage {
        private String clientUserId;

        private Optional<String> fallbackBirthDate = Optional.empty();

        private Optional<String> fallbackTimeZone = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserCreateBody other) {
            clientUserId(other.getClientUserId());
            fallbackTimeZone(other.getFallbackTimeZone());
            fallbackBirthDate(other.getFallbackBirthDate());
            return this;
        }

        /**
         * <p>A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("client_user_id")
        public _FinalStage clientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
            return this;
        }

        /**
         * <p>Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fallbackBirthDate(String fallbackBirthDate) {
            this.fallbackBirthDate = Optional.of(fallbackBirthDate);
            return this;
        }

        @Override
        @JsonSetter(value = "fallback_birth_date", nulls = Nulls.SKIP)
        public _FinalStage fallbackBirthDate(Optional<String> fallbackBirthDate) {
            this.fallbackBirthDate = fallbackBirthDate;
            return this;
        }

        /**
         * <p>Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
         * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fallbackTimeZone(String fallbackTimeZone) {
            this.fallbackTimeZone = Optional.of(fallbackTimeZone);
            return this;
        }

        @Override
        @JsonSetter(value = "fallback_time_zone", nulls = Nulls.SKIP)
        public _FinalStage fallbackTimeZone(Optional<String> fallbackTimeZone) {
            this.fallbackTimeZone = fallbackTimeZone;
            return this;
        }

        @Override
        public UserCreateBody build() {
            return new UserCreateBody(clientUserId, fallbackTimeZone, fallbackBirthDate, additionalProperties);
        }
    }
}
