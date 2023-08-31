package com.vital.api.types;

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
@JsonDeserialize(builder = ProviderLinkResponse.Builder.class)
public final class ProviderLinkResponse {
    private final PasswordProviders provider;

    private final boolean connected;

    private final Optional<String> providerId;

    private ProviderLinkResponse(PasswordProviders provider, boolean connected, Optional<String> providerId) {
        this.provider = provider;
        this.connected = connected;
        this.providerId = providerId;
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
    public Optional<String> getProviderId() {
        return providerId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProviderLinkResponse && equalTo((ProviderLinkResponse) other);
    }

    private boolean equalTo(ProviderLinkResponse other) {
        return provider.equals(other.provider) && connected == other.connected && providerId.equals(other.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.provider, this.connected, this.providerId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        ConnectedStage provider(PasswordProviders provider);

        Builder from(ProviderLinkResponse other);
    }

    public interface ConnectedStage {
        _FinalStage connected(boolean connected);
    }

    public interface _FinalStage {
        ProviderLinkResponse build();

        _FinalStage providerId(Optional<String> providerId);

        _FinalStage providerId(String providerId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, ConnectedStage, _FinalStage {
        private PasswordProviders provider;

        private boolean connected;

        private Optional<String> providerId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ProviderLinkResponse other) {
            provider(other.getProvider());
            connected(other.getConnected());
            providerId(other.getProviderId());
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
        public _FinalStage connected(boolean connected) {
            this.connected = connected;
            return this;
        }

        @Override
        public _FinalStage providerId(String providerId) {
            this.providerId = Optional.of(providerId);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_id", nulls = Nulls.SKIP)
        public _FinalStage providerId(Optional<String> providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        public ProviderLinkResponse build() {
            return new ProviderLinkResponse(provider, connected, providerId);
        }
    }
}
