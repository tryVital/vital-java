package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Providers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BeginLinkTokenRequest.Builder.class)
public final class BeginLinkTokenRequest {
    private final String linkToken;

    private final Providers provider;

    private BeginLinkTokenRequest(String linkToken, Providers provider) {
        this.linkToken = linkToken;
        this.provider = provider;
    }

    @JsonProperty("link_token")
    public String getLinkToken() {
        return linkToken;
    }

    @JsonProperty("provider")
    public Providers getProvider() {
        return provider;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BeginLinkTokenRequest && equalTo((BeginLinkTokenRequest) other);
    }

    private boolean equalTo(BeginLinkTokenRequest other) {
        return linkToken.equals(other.linkToken) && provider.equals(other.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.linkToken, this.provider);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LinkTokenStage builder() {
        return new Builder();
    }

    public interface LinkTokenStage {
        ProviderStage linkToken(String linkToken);

        Builder from(BeginLinkTokenRequest other);
    }

    public interface ProviderStage {
        _FinalStage provider(Providers provider);
    }

    public interface _FinalStage {
        BeginLinkTokenRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LinkTokenStage, ProviderStage, _FinalStage {
        private String linkToken;

        private Providers provider;

        private Builder() {}

        @Override
        public Builder from(BeginLinkTokenRequest other) {
            linkToken(other.getLinkToken());
            provider(other.getProvider());
            return this;
        }

        @Override
        @JsonSetter("link_token")
        public ProviderStage linkToken(String linkToken) {
            this.linkToken = linkToken;
            return this;
        }

        @Override
        @JsonSetter("provider")
        public _FinalStage provider(Providers provider) {
            this.provider = provider;
            return this;
        }

        @Override
        public BeginLinkTokenRequest build() {
            return new BeginLinkTokenRequest(linkToken, provider);
        }
    }
}
