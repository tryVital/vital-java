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
@JsonDeserialize(builder = ClientFacingConnectionErrorDetails.Builder.class)
public final class ClientFacingConnectionErrorDetails {
    private final ClientFacingConnectionErrorDetailsErrorType errorType;

    private final String errorMessage;

    private final String erroredAt;

    private final Map<String, Object> additionalProperties;

    private ClientFacingConnectionErrorDetails(
            ClientFacingConnectionErrorDetailsErrorType errorType,
            String errorMessage,
            String erroredAt,
            Map<String, Object> additionalProperties) {
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.erroredAt = erroredAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("error_type")
    public ClientFacingConnectionErrorDetailsErrorType getErrorType() {
        return errorType;
    }

    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("errored_at")
    public String getErroredAt() {
        return erroredAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingConnectionErrorDetails
                && equalTo((ClientFacingConnectionErrorDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingConnectionErrorDetails other) {
        return errorType.equals(other.errorType)
                && errorMessage.equals(other.errorMessage)
                && erroredAt.equals(other.erroredAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.errorType, this.errorMessage, this.erroredAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ErrorTypeStage builder() {
        return new Builder();
    }

    public interface ErrorTypeStage {
        ErrorMessageStage errorType(ClientFacingConnectionErrorDetailsErrorType errorType);

        Builder from(ClientFacingConnectionErrorDetails other);
    }

    public interface ErrorMessageStage {
        ErroredAtStage errorMessage(String errorMessage);
    }

    public interface ErroredAtStage {
        _FinalStage erroredAt(String erroredAt);
    }

    public interface _FinalStage {
        ClientFacingConnectionErrorDetails build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ErrorTypeStage, ErrorMessageStage, ErroredAtStage, _FinalStage {
        private ClientFacingConnectionErrorDetailsErrorType errorType;

        private String errorMessage;

        private String erroredAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingConnectionErrorDetails other) {
            errorType(other.getErrorType());
            errorMessage(other.getErrorMessage());
            erroredAt(other.getErroredAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("error_type")
        public ErrorMessageStage errorType(ClientFacingConnectionErrorDetailsErrorType errorType) {
            this.errorType = errorType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error_message")
        public ErroredAtStage errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        @java.lang.Override
        @JsonSetter("errored_at")
        public _FinalStage erroredAt(String erroredAt) {
            this.erroredAt = erroredAt;
            return this;
        }

        @java.lang.Override
        public ClientFacingConnectionErrorDetails build() {
            return new ClientFacingConnectionErrorDetails(errorType, errorMessage, erroredAt, additionalProperties);
        }
    }
}
