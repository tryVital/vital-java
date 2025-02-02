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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserRefreshErrorResponse.Builder.class)
public final class UserRefreshErrorResponse {
    private final boolean success;

    private final String userId;

    private final String error;

    private final Optional<List<String>> failedSources;

    private final Map<String, Object> additionalProperties;

    private UserRefreshErrorResponse(
            boolean success,
            String userId,
            String error,
            Optional<List<String>> failedSources,
            Map<String, Object> additionalProperties) {
        this.success = success;
        this.userId = userId;
        this.error = error;
        this.failedSources = failedSources;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Whether operation was successful or not
     */
    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    /**
     * @return A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("failed_sources")
    public Optional<List<String>> getFailedSources() {
        return failedSources;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserRefreshErrorResponse && equalTo((UserRefreshErrorResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserRefreshErrorResponse other) {
        return success == other.success
                && userId.equals(other.userId)
                && error.equals(other.error)
                && failedSources.equals(other.failedSources);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.success, this.userId, this.error, this.failedSources);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        UserIdStage success(boolean success);

        Builder from(UserRefreshErrorResponse other);
    }

    public interface UserIdStage {
        ErrorStage userId(String userId);
    }

    public interface ErrorStage {
        _FinalStage error(String error);
    }

    public interface _FinalStage {
        UserRefreshErrorResponse build();

        _FinalStage failedSources(Optional<List<String>> failedSources);

        _FinalStage failedSources(List<String> failedSources);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, UserIdStage, ErrorStage, _FinalStage {
        private boolean success;

        private String userId;

        private String error;

        private Optional<List<String>> failedSources = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserRefreshErrorResponse other) {
            success(other.getSuccess());
            userId(other.getUserId());
            error(other.getError());
            failedSources(other.getFailedSources());
            return this;
        }

        /**
         * <p>Whether operation was successful or not</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("success")
        public UserIdStage success(boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("user_id")
        public ErrorStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public _FinalStage error(String error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public _FinalStage failedSources(List<String> failedSources) {
            this.failedSources = Optional.of(failedSources);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "failed_sources", nulls = Nulls.SKIP)
        public _FinalStage failedSources(Optional<List<String>> failedSources) {
            this.failedSources = failedSources;
            return this;
        }

        @java.lang.Override
        public UserRefreshErrorResponse build() {
            return new UserRefreshErrorResponse(success, userId, error, failedSources, additionalProperties);
        }
    }
}
