/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.AuthType;
import com.vital.api.types.Providers;
import com.vital.api.types.Region;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmailAuthLink.Builder.class)
public final class EmailAuthLink {
    private final Optional<String> vitalLinkToken;

    private final String email;

    private final Providers provider;

    private final AuthType authType;

    private final Optional<Region> region;

    private final Map<String, Object> additionalProperties;

    private EmailAuthLink(
            Optional<String> vitalLinkToken,
            String email,
            Providers provider,
            AuthType authType,
            Optional<Region> region,
            Map<String, Object> additionalProperties) {
        this.vitalLinkToken = vitalLinkToken;
        this.email = email;
        this.provider = provider;
        this.authType = authType;
        this.region = region;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("x-vital-link-token")
    public Optional<String> getVitalLinkToken() {
        return vitalLinkToken;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("provider")
    public Providers getProvider() {
        return provider;
    }

    @JsonProperty("auth_type")
    public AuthType getAuthType() {
        return authType;
    }

    @JsonProperty("region")
    public Optional<Region> getRegion() {
        return region;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailAuthLink && equalTo((EmailAuthLink) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailAuthLink other) {
        return vitalLinkToken.equals(other.vitalLinkToken)
                && email.equals(other.email)
                && provider.equals(other.provider)
                && authType.equals(other.authType)
                && region.equals(other.region);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.vitalLinkToken, this.email, this.provider, this.authType, this.region);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        ProviderStage email(String email);

        Builder from(EmailAuthLink other);
    }

    public interface ProviderStage {
        AuthTypeStage provider(Providers provider);
    }

    public interface AuthTypeStage {
        _FinalStage authType(AuthType authType);
    }

    public interface _FinalStage {
        EmailAuthLink build();

        _FinalStage vitalLinkToken(Optional<String> vitalLinkToken);

        _FinalStage vitalLinkToken(String vitalLinkToken);

        _FinalStage region(Optional<Region> region);

        _FinalStage region(Region region);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, ProviderStage, AuthTypeStage, _FinalStage {
        private String email;

        private Providers provider;

        private AuthType authType;

        private Optional<Region> region = Optional.empty();

        private Optional<String> vitalLinkToken = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailAuthLink other) {
            vitalLinkToken(other.getVitalLinkToken());
            email(other.getEmail());
            provider(other.getProvider());
            authType(other.getAuthType());
            region(other.getRegion());
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public ProviderStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        @JsonSetter("provider")
        public AuthTypeStage provider(Providers provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        @JsonSetter("auth_type")
        public _FinalStage authType(AuthType authType) {
            this.authType = authType;
            return this;
        }

        @java.lang.Override
        public _FinalStage region(Region region) {
            this.region = Optional.of(region);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "region", nulls = Nulls.SKIP)
        public _FinalStage region(Optional<Region> region) {
            this.region = region;
            return this;
        }

        @java.lang.Override
        public _FinalStage vitalLinkToken(String vitalLinkToken) {
            this.vitalLinkToken = Optional.of(vitalLinkToken);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "x-vital-link-token", nulls = Nulls.SKIP)
        public _FinalStage vitalLinkToken(Optional<String> vitalLinkToken) {
            this.vitalLinkToken = vitalLinkToken;
            return this;
        }

        @java.lang.Override
        public EmailAuthLink build() {
            return new EmailAuthLink(vitalLinkToken, email, provider, authType, region, additionalProperties);
        }
    }
}
