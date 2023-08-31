package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Providers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkTokenExchange.Builder.class)
public final class LinkTokenExchange {
    private final String userKey;

    private final Optional<Providers> provider;

    private final Optional<String> redirectUrl;

    private final Optional<List<Providers>> filterOnProviders;

    private LinkTokenExchange(
            String userKey,
            Optional<Providers> provider,
            Optional<String> redirectUrl,
            Optional<List<Providers>> filterOnProviders) {
        this.userKey = userKey;
        this.provider = provider;
        this.redirectUrl = redirectUrl;
        this.filterOnProviders = filterOnProviders;
    }

    /**
     * @return User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
     */
    @JsonProperty("user_key")
    public String getUserKey() {
        return userKey;
    }

    @JsonProperty("provider")
    public Optional<Providers> getProvider() {
        return provider;
    }

    @JsonProperty("redirect_url")
    public Optional<String> getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("filter_on_providers")
    public Optional<List<Providers>> getFilterOnProviders() {
        return filterOnProviders;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkTokenExchange && equalTo((LinkTokenExchange) other);
    }

    private boolean equalTo(LinkTokenExchange other) {
        return userKey.equals(other.userKey)
                && provider.equals(other.provider)
                && redirectUrl.equals(other.redirectUrl)
                && filterOnProviders.equals(other.filterOnProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userKey, this.provider, this.redirectUrl, this.filterOnProviders);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserKeyStage builder() {
        return new Builder();
    }

    public interface UserKeyStage {
        _FinalStage userKey(String userKey);

        Builder from(LinkTokenExchange other);
    }

    public interface _FinalStage {
        LinkTokenExchange build();

        _FinalStage provider(Optional<Providers> provider);

        _FinalStage provider(Providers provider);

        _FinalStage redirectUrl(Optional<String> redirectUrl);

        _FinalStage redirectUrl(String redirectUrl);

        _FinalStage filterOnProviders(Optional<List<Providers>> filterOnProviders);

        _FinalStage filterOnProviders(List<Providers> filterOnProviders);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserKeyStage, _FinalStage {
        private String userKey;

        private Optional<List<Providers>> filterOnProviders = Optional.empty();

        private Optional<String> redirectUrl = Optional.empty();

        private Optional<Providers> provider = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LinkTokenExchange other) {
            userKey(other.getUserKey());
            provider(other.getProvider());
            redirectUrl(other.getRedirectUrl());
            filterOnProviders(other.getFilterOnProviders());
            return this;
        }

        /**
         * <p>User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_key")
        public _FinalStage userKey(String userKey) {
            this.userKey = userKey;
            return this;
        }

        @Override
        public _FinalStage filterOnProviders(List<Providers> filterOnProviders) {
            this.filterOnProviders = Optional.of(filterOnProviders);
            return this;
        }

        @Override
        @JsonSetter(value = "filter_on_providers", nulls = Nulls.SKIP)
        public _FinalStage filterOnProviders(Optional<List<Providers>> filterOnProviders) {
            this.filterOnProviders = filterOnProviders;
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
        public _FinalStage provider(Providers provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<Providers> provider) {
            this.provider = provider;
            return this;
        }

        @Override
        public LinkTokenExchange build() {
            return new LinkTokenExchange(userKey, provider, redirectUrl, filterOnProviders);
        }
    }
}
