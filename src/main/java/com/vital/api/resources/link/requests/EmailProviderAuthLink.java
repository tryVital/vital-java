package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Providers;
import com.vital.api.types.Region;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmailProviderAuthLink.Builder.class)
public final class EmailProviderAuthLink {
    private final String email;

    private final Optional<Providers> emailProviderAuthLinkProvider;

    private final Optional<Region> region;

    private EmailProviderAuthLink(
            String email, Optional<Providers> emailProviderAuthLinkProvider, Optional<Region> region) {
        this.email = email;
        this.emailProviderAuthLinkProvider = emailProviderAuthLinkProvider;
        this.region = region;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("provider")
    public Optional<Providers> getEmailProviderAuthLinkProvider() {
        return emailProviderAuthLinkProvider;
    }

    @JsonProperty("region")
    public Optional<Region> getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailProviderAuthLink && equalTo((EmailProviderAuthLink) other);
    }

    private boolean equalTo(EmailProviderAuthLink other) {
        return email.equals(other.email)
                && emailProviderAuthLinkProvider.equals(other.emailProviderAuthLinkProvider)
                && region.equals(other.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.emailProviderAuthLinkProvider, this.region);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        _FinalStage email(String email);

        Builder from(EmailProviderAuthLink other);
    }

    public interface _FinalStage {
        EmailProviderAuthLink build();

        _FinalStage emailProviderAuthLinkProvider(Optional<Providers> emailProviderAuthLinkProvider);

        _FinalStage emailProviderAuthLinkProvider(Providers emailProviderAuthLinkProvider);

        _FinalStage region(Optional<Region> region);

        _FinalStage region(Region region);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, _FinalStage {
        private String email;

        private Optional<Region> region = Optional.empty();

        private Optional<Providers> emailProviderAuthLinkProvider = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(EmailProviderAuthLink other) {
            email(other.getEmail());
            emailProviderAuthLinkProvider(other.getEmailProviderAuthLinkProvider());
            region(other.getRegion());
            return this;
        }

        @Override
        @JsonSetter("email")
        public _FinalStage email(String email) {
            this.email = email;
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
        public _FinalStage emailProviderAuthLinkProvider(Providers emailProviderAuthLinkProvider) {
            this.emailProviderAuthLinkProvider = Optional.of(emailProviderAuthLinkProvider);
            return this;
        }

        @Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage emailProviderAuthLinkProvider(Optional<Providers> emailProviderAuthLinkProvider) {
            this.emailProviderAuthLinkProvider = emailProviderAuthLinkProvider;
            return this;
        }

        @Override
        public EmailProviderAuthLink build() {
            return new EmailProviderAuthLink(email, emailProviderAuthLinkProvider, region);
        }
    }
}