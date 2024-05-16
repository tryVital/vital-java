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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ProviderLinkResponse.Builder.class)
public final class ProviderLinkResponse {
    private final ProviderLinkResponseState state;

    private final Optional<String> redirectUrl;

    private final Optional<String> errorType;

    private final Optional<String> error;

    private final Optional<ProviderMfaRequest> providerMfa;

    private final PasswordProviders provider;

    private final boolean connected;

    private final String providerId;

    private final Map<String, Object> additionalProperties;

    private ProviderLinkResponse(
            ProviderLinkResponseState state,
            Optional<String> redirectUrl,
            Optional<String> errorType,
            Optional<String> error,
            Optional<ProviderMfaRequest> providerMfa,
            PasswordProviders provider,
            boolean connected,
            String providerId,
            Map<String, Object> additionalProperties) {
        this.state = state;
        this.redirectUrl = redirectUrl;
        this.errorType = errorType;
        this.error = error;
        this.providerMfa = providerMfa;
        this.provider = provider;
        this.connected = connected;
        this.providerId = providerId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("state")
    public ProviderLinkResponseState getState() {
        return state;
    }

    @JsonProperty("redirect_url")
    public Optional<String> getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("error_type")
    public Optional<String> getErrorType() {
        return errorType;
    }

    @JsonProperty("error")
    public Optional<String> getError() {
        return error;
    }

    @JsonProperty("provider_mfa")
    public Optional<ProviderMfaRequest> getProviderMfa() {
        return providerMfa;
    }

    @JsonProperty("provider")
    public PasswordProviders getProvider() {
        return provider;
    }

    @JsonProperty("connected")
    public boolean getConnected() {
        return connected;
    }

    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProviderLinkResponse && equalTo((ProviderLinkResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProviderLinkResponse other) {
        return state.equals(other.state)
                && redirectUrl.equals(other.redirectUrl)
                && errorType.equals(other.errorType)
                && error.equals(other.error)
                && providerMfa.equals(other.providerMfa)
                && provider.equals(other.provider)
                && connected == other.connected
                && providerId.equals(other.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.state,
                this.redirectUrl,
                this.errorType,
                this.error,
                this.providerMfa,
                this.provider,
                this.connected,
                this.providerId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StateStage builder() {
        return new Builder();
    }

    public interface StateStage {
        ProviderStage state(ProviderLinkResponseState state);

        Builder from(ProviderLinkResponse other);
    }

    public interface ProviderStage {
        ConnectedStage provider(PasswordProviders provider);
    }

    public interface ConnectedStage {
        ProviderIdStage connected(boolean connected);
    }

    public interface ProviderIdStage {
        _FinalStage providerId(String providerId);
    }

    public interface _FinalStage {
        ProviderLinkResponse build();

        _FinalStage redirectUrl(Optional<String> redirectUrl);

        _FinalStage redirectUrl(String redirectUrl);

        _FinalStage errorType(Optional<String> errorType);

        _FinalStage errorType(String errorType);

        _FinalStage error(Optional<String> error);

        _FinalStage error(String error);

        _FinalStage providerMfa(Optional<ProviderMfaRequest> providerMfa);

        _FinalStage providerMfa(ProviderMfaRequest providerMfa);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements StateStage, ProviderStage, ConnectedStage, ProviderIdStage, _FinalStage {
        private ProviderLinkResponseState state;

        private PasswordProviders provider;

        private boolean connected;

        private String providerId;

        private Optional<ProviderMfaRequest> providerMfa = Optional.empty();

        private Optional<String> error = Optional.empty();

        private Optional<String> errorType = Optional.empty();

        private Optional<String> redirectUrl = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ProviderLinkResponse other) {
            state(other.getState());
            redirectUrl(other.getRedirectUrl());
            errorType(other.getErrorType());
            error(other.getError());
            providerMfa(other.getProviderMfa());
            provider(other.getProvider());
            connected(other.getConnected());
            providerId(other.getProviderId());
            return this;
        }

        @Override
        @JsonSetter("state")
        public ProviderStage state(ProviderLinkResponseState state) {
            this.state = state;
            return this;
        }

        @Override
        @JsonSetter("provider")
        public ConnectedStage provider(PasswordProviders provider) {
            this.provider = provider;
            return this;
        }

        @Override
        @JsonSetter("connected")
        public ProviderIdStage connected(boolean connected) {
            this.connected = connected;
            return this;
        }

        @Override
        @JsonSetter("provider_id")
        public _FinalStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        public _FinalStage providerMfa(ProviderMfaRequest providerMfa) {
            this.providerMfa = Optional.of(providerMfa);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_mfa", nulls = Nulls.SKIP)
        public _FinalStage providerMfa(Optional<ProviderMfaRequest> providerMfa) {
            this.providerMfa = providerMfa;
            return this;
        }

        @Override
        public _FinalStage error(String error) {
            this.error = Optional.of(error);
            return this;
        }

        @Override
        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public _FinalStage error(Optional<String> error) {
            this.error = error;
            return this;
        }

        @Override
        public _FinalStage errorType(String errorType) {
            this.errorType = Optional.of(errorType);
            return this;
        }

        @Override
        @JsonSetter(value = "error_type", nulls = Nulls.SKIP)
        public _FinalStage errorType(Optional<String> errorType) {
            this.errorType = errorType;
            return this;
        }

        @Override
        public _FinalStage redirectUrl(String redirectUrl) {
            this.redirectUrl = Optional.of(redirectUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "redirect_url", nulls = Nulls.SKIP)
        public _FinalStage redirectUrl(Optional<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        @Override
        public ProviderLinkResponse build() {
            return new ProviderLinkResponse(
                    state,
                    redirectUrl,
                    errorType,
                    error,
                    providerMfa,
                    provider,
                    connected,
                    providerId,
                    additionalProperties);
        }
    }
}
