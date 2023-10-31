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
@JsonDeserialize(builder = ClientFacingProvider.Builder.class)
public final class ClientFacingProvider {
    private final String name;

    private final String slug;

    private final String logo;

    private final Map<String, Object> additionalProperties;

    private ClientFacingProvider(String name, String slug, String logo, Map<String, Object> additionalProperties) {
        this.name = name;
        this.slug = slug;
        this.logo = logo;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Name of source of information
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Slug for designated source
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * @return URL for source logo
     */
    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingProvider && equalTo((ClientFacingProvider) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingProvider other) {
        return name.equals(other.name) && slug.equals(other.slug) && logo.equals(other.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.slug, this.logo);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        SlugStage name(String name);

        Builder from(ClientFacingProvider other);
    }

    public interface SlugStage {
        LogoStage slug(String slug);
    }

    public interface LogoStage {
        _FinalStage logo(String logo);
    }

    public interface _FinalStage {
        ClientFacingProvider build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SlugStage, LogoStage, _FinalStage {
        private String name;

        private String slug;

        private String logo;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingProvider other) {
            name(other.getName());
            slug(other.getSlug());
            logo(other.getLogo());
            return this;
        }

        /**
         * <p>Name of source of information</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public SlugStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Slug for designated source</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("slug")
        public LogoStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>URL for source logo</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("logo")
        public _FinalStage logo(String logo) {
            this.logo = logo;
            return this;
        }

        @Override
        public ClientFacingProvider build() {
            return new ClientFacingProvider(name, slug, logo, additionalProperties);
        }
    }
}