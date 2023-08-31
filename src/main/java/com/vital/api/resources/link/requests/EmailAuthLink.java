package com.vital.api.resources.link.requests;

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
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmailAuthLink.Builder.class)
public final class EmailAuthLink {
    private final String email;

    private final Providers provider;

    private final AuthType authType;

    private final Optional<Region> region;

    private EmailAuthLink(String email, Providers provider, AuthType authType, Optional<Region> region) {
        this.email = email;
        this.provider = provider;
        this.authType = authType;
        this.region = region;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailAuthLink && equalTo((EmailAuthLink) other);
    }

    private boolean equalTo(EmailAuthLink other) {
        return email.equals(other.email)
                && provider.equals(other.provider)
                && authType.equals(other.authType)
                && region.equals(other.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.provider, this.authType, this.region);
    }

    @Override
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

        _FinalStage region(Optional<Region> region);

        _FinalStage region(Region region);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, ProviderStage, AuthTypeStage, _FinalStage {
        private String email;

        private Providers provider;

        private AuthType authType;

        private Optional<Region> region = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(EmailAuthLink other) {
            email(other.getEmail());
            provider(other.getProvider());
            authType(other.getAuthType());
            region(other.getRegion());
            return this;
        }

        @Override
        @JsonSetter("email")
        public ProviderStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("provider")
        public AuthTypeStage provider(Providers provider) {
            this.provider = provider;
            return this;
        }

        @Override
        @JsonSetter("auth_type")
        public _FinalStage authType(AuthType authType) {
            this.authType = authType;
            return this;
        }

        @Override
        public _FinalStage region(Region region) {
            this.region = Optional.of(region);
            return this;
        }

        @Override
        @JsonSetter(value = "region", nulls = Nulls.SKIP)
        public _FinalStage region(Optional<Region> region) {
            this.region = region;
            return this;
        }

        @Override
        public EmailAuthLink build() {
            return new EmailAuthLink(email, provider, authType, region);
        }
    }
}