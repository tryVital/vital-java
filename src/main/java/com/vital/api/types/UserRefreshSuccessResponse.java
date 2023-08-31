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
@JsonDeserialize(builder = UserRefreshSuccessResponse.Builder.class)
public final class UserRefreshSuccessResponse {
    private final String success;

    private final String userId;

    private final List<String> refreshedSources;

    private final List<String> failedSources;

    private UserRefreshSuccessResponse(
            String success, String userId, List<String> refreshedSources, List<String> failedSources) {
        this.success = success;
        this.userId = userId;
        this.refreshedSources = refreshedSources;
        this.failedSources = failedSources;
    }

    /**
     * @return Whether operation was successful or not
     */
    @JsonProperty("success")
    public String getSuccess() {
        return success;
    }

    /**
     * @return A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("refreshed_sources")
    public List<String> getRefreshedSources() {
        return refreshedSources;
    }

    @JsonProperty("failed_sources")
    public List<String> getFailedSources() {
        return failedSources;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserRefreshSuccessResponse && equalTo((UserRefreshSuccessResponse) other);
    }

    private boolean equalTo(UserRefreshSuccessResponse other) {
        return success.equals(other.success)
                && userId.equals(other.userId)
                && refreshedSources.equals(other.refreshedSources)
                && failedSources.equals(other.failedSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.success, this.userId, this.refreshedSources, this.failedSources);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        UserIdStage success(String success);

        Builder from(UserRefreshSuccessResponse other);
    }

    public interface UserIdStage {
        _FinalStage userId(String userId);
    }

    public interface _FinalStage {
        UserRefreshSuccessResponse build();

        _FinalStage refreshedSources(List<String> refreshedSources);

        _FinalStage addRefreshedSources(String refreshedSources);

        _FinalStage addAllRefreshedSources(List<String> refreshedSources);

        _FinalStage failedSources(List<String> failedSources);

        _FinalStage addFailedSources(String failedSources);

        _FinalStage addAllFailedSources(List<String> failedSources);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, UserIdStage, _FinalStage {
        private String success;

        private String userId;

        private List<String> failedSources = new ArrayList<>();

        private List<String> refreshedSources = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(UserRefreshSuccessResponse other) {
            success(other.getSuccess());
            userId(other.getUserId());
            refreshedSources(other.getRefreshedSources());
            failedSources(other.getFailedSources());
            return this;
        }

        /**
         * <p>Whether operation was successful or not</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("success")
        public UserIdStage success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public _FinalStage addAllFailedSources(List<String> failedSources) {
            this.failedSources.addAll(failedSources);
            return this;
        }

        @Override
        public _FinalStage addFailedSources(String failedSources) {
            this.failedSources.add(failedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "failed_sources", nulls = Nulls.SKIP)
        public _FinalStage failedSources(List<String> failedSources) {
            this.failedSources.clear();
            this.failedSources.addAll(failedSources);
            return this;
        }

        @Override
        public _FinalStage addAllRefreshedSources(List<String> refreshedSources) {
            this.refreshedSources.addAll(refreshedSources);
            return this;
        }

        @Override
        public _FinalStage addRefreshedSources(String refreshedSources) {
            this.refreshedSources.add(refreshedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "refreshed_sources", nulls = Nulls.SKIP)
        public _FinalStage refreshedSources(List<String> refreshedSources) {
            this.refreshedSources.clear();
            this.refreshedSources.addAll(refreshedSources);
            return this;
        }

        @Override
        public UserRefreshSuccessResponse build() {
            return new UserRefreshSuccessResponse(success, userId, refreshedSources, failedSources);
        }
    }
}