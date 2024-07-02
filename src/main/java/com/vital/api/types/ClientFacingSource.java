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
@JsonDeserialize(builder = ClientFacingSource.Builder.class)
public final class ClientFacingSource {
    private final String provider;

    private final Optional<String> type;

    private final Optional<String> appId;

    private final Optional<String> name;

    private final Optional<String> slug;

    private final Optional<String> logo;

    private final Map<String, Object> additionalProperties;

    private ClientFacingSource(
            String provider,
            Optional<String> type,
            Optional<String> appId,
            Optional<String> name,
            Optional<String> slug,
            Optional<String> logo,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.type = type;
        this.appId = appId;
        this.name = name;
        this.slug = slug;
        this.logo = logo;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Provider slug. e.g., <code>oura</code>, <code>fitbit</code>, <code>garmin</code>.
     */
    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    /**
     * @return The type of the data source (app or device) by which the summary or the timeseries data were recorded. This defaults to <code>unknown</code> when Vital cannot extract or infer that information
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("app_id")
    public Optional<String> getAppId() {
        return appId;
    }

    /**
     * @return Deprecated. Subject to removal after 1 Jan 2024.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.
     */
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    /**
     * @return Deprecated. Subject to removal after 1 Jan 2024.
     */
    @JsonProperty("logo")
    public Optional<String> getLogo() {
        return logo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSource && equalTo((ClientFacingSource) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingSource other) {
        return provider.equals(other.provider)
                && type.equals(other.type)
                && appId.equals(other.appId)
                && name.equals(other.name)
                && slug.equals(other.slug)
                && logo.equals(other.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.provider, this.type, this.appId, this.name, this.slug, this.logo);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        _FinalStage provider(String provider);

        Builder from(ClientFacingSource other);
    }

    public interface _FinalStage {
        ClientFacingSource build();

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);

        _FinalStage appId(Optional<String> appId);

        _FinalStage appId(String appId);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage slug(Optional<String> slug);

        _FinalStage slug(String slug);

        _FinalStage logo(Optional<String> logo);

        _FinalStage logo(String logo);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, _FinalStage {
        private String provider;

        private Optional<String> logo = Optional.empty();

        private Optional<String> slug = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private Optional<String> type = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingSource other) {
            provider(other.getProvider());
            type(other.getType());
            appId(other.getAppId());
            name(other.getName());
            slug(other.getSlug());
            logo(other.getLogo());
            return this;
        }

        /**
         * <p>Provider slug. e.g., <code>oura</code>, <code>fitbit</code>, <code>garmin</code>.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("provider")
        public _FinalStage provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>Deprecated. Subject to removal after 1 Jan 2024.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage logo(String logo) {
            this.logo = Optional.of(logo);
            return this;
        }

        @Override
        @JsonSetter(value = "logo", nulls = Nulls.SKIP)
        public _FinalStage logo(Optional<String> logo) {
            this.logo = logo;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage slug(String slug) {
            this.slug = Optional.of(slug);
            return this;
        }

        @Override
        @JsonSetter(value = "slug", nulls = Nulls.SKIP)
        public _FinalStage slug(Optional<String> slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>Deprecated. Subject to removal after 1 Jan 2024.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage appId(String appId) {
            this.appId = Optional.of(appId);
            return this;
        }

        @Override
        @JsonSetter(value = "app_id", nulls = Nulls.SKIP)
        public _FinalStage appId(Optional<String> appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The type of the data source (app or device) by which the summary or the timeseries data were recorded. This defaults to <code>unknown</code> when Vital cannot extract or infer that information</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage type(String type) {
            this.type = Optional.of(type);
            return this;
        }

        @Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<String> type) {
            this.type = type;
            return this;
        }

        @Override
        public ClientFacingSource build() {
            return new ClientFacingSource(provider, type, appId, name, slug, logo, additionalProperties);
        }
    }
}
