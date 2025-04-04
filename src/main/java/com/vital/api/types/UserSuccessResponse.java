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
@JsonDeserialize(builder = UserSuccessResponse.Builder.class)
public final class UserSuccessResponse {
    private final boolean success;

    private final Map<String, Object> additionalProperties;

    private UserSuccessResponse(boolean success, Map<String, Object> additionalProperties) {
        this.success = success;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Whether operation was successful or not
     */
    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserSuccessResponse && equalTo((UserSuccessResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserSuccessResponse other) {
        return success == other.success;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.success);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        _FinalStage success(boolean success);

        Builder from(UserSuccessResponse other);
    }

    public interface _FinalStage {
        UserSuccessResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, _FinalStage {
        private boolean success;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserSuccessResponse other) {
            success(other.getSuccess());
            return this;
        }

        /**
         * <p>Whether operation was successful or not</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("success")
        public _FinalStage success(boolean success) {
            this.success = success;
            return this;
        }

        @java.lang.Override
        public UserSuccessResponse build() {
            return new UserSuccessResponse(success, additionalProperties);
        }
    }
}
