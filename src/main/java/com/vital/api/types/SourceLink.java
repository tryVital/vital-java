package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SourceLink.Builder.class)
public final class SourceLink {
    private final int id;

    private final String name;

    private final String slug;

    private final String description;

    private final String logo;

    private final Optional<String> oauthUrl;

    private final Optional<SourceAuthType> authType;

    private final Optional<Map<String, Object>> formComponents;

    private SourceLink(
            int id,
            String name,
            String slug,
            String description,
            String logo,
            Optional<String> oauthUrl,
            Optional<SourceAuthType> authType,
            Optional<Map<String, Object>> formComponents) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.logo = logo;
        this.oauthUrl = oauthUrl;
        this.authType = authType;
        this.formComponents = formComponents;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("oauth_url")
    public Optional<String> getOauthUrl() {
        return oauthUrl;
    }

    @JsonProperty("auth_type")
    public Optional<SourceAuthType> getAuthType() {
        return authType;
    }

    @JsonProperty("form_components")
    public Optional<Map<String, Object>> getFormComponents() {
        return formComponents;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SourceLink && equalTo((SourceLink) other);
    }

    private boolean equalTo(SourceLink other) {
        return id == other.id
                && name.equals(other.name)
                && slug.equals(other.slug)
                && description.equals(other.description)
                && logo.equals(other.logo)
                && oauthUrl.equals(other.oauthUrl)
                && authType.equals(other.authType)
                && formComponents.equals(other.formComponents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.slug,
                this.description,
                this.logo,
                this.oauthUrl,
                this.authType,
                this.formComponents);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(int id);

        Builder from(SourceLink other);
    }

    public interface NameStage {
        SlugStage name(String name);
    }

    public interface SlugStage {
        DescriptionStage slug(String slug);
    }

    public interface DescriptionStage {
        LogoStage description(String description);
    }

    public interface LogoStage {
        _FinalStage logo(String logo);
    }

    public interface _FinalStage {
        SourceLink build();

        _FinalStage oauthUrl(Optional<String> oauthUrl);

        _FinalStage oauthUrl(String oauthUrl);

        _FinalStage authType(Optional<SourceAuthType> authType);

        _FinalStage authType(SourceAuthType authType);

        _FinalStage formComponents(Optional<Map<String, Object>> formComponents);

        _FinalStage formComponents(Map<String, Object> formComponents);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, NameStage, SlugStage, DescriptionStage, LogoStage, _FinalStage {
        private int id;

        private String name;

        private String slug;

        private String description;

        private String logo;

        private Optional<Map<String, Object>> formComponents = Optional.empty();

        private Optional<SourceAuthType> authType = Optional.empty();

        private Optional<String> oauthUrl = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(SourceLink other) {
            id(other.getId());
            name(other.getName());
            slug(other.getSlug());
            description(other.getDescription());
            logo(other.getLogo());
            oauthUrl(other.getOauthUrl());
            authType(other.getAuthType());
            formComponents(other.getFormComponents());
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(int id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("name")
        public SlugStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("slug")
        public DescriptionStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        @Override
        @JsonSetter("description")
        public LogoStage description(String description) {
            this.description = description;
            return this;
        }

        @Override
        @JsonSetter("logo")
        public _FinalStage logo(String logo) {
            this.logo = logo;
            return this;
        }

        @Override
        public _FinalStage formComponents(Map<String, Object> formComponents) {
            this.formComponents = Optional.of(formComponents);
            return this;
        }

        @Override
        @JsonSetter(value = "form_components", nulls = Nulls.SKIP)
        public _FinalStage formComponents(Optional<Map<String, Object>> formComponents) {
            this.formComponents = formComponents;
            return this;
        }

        @Override
        public _FinalStage authType(SourceAuthType authType) {
            this.authType = Optional.of(authType);
            return this;
        }

        @Override
        @JsonSetter(value = "auth_type", nulls = Nulls.SKIP)
        public _FinalStage authType(Optional<SourceAuthType> authType) {
            this.authType = authType;
            return this;
        }

        @Override
        public _FinalStage oauthUrl(String oauthUrl) {
            this.oauthUrl = Optional.of(oauthUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "oauth_url", nulls = Nulls.SKIP)
        public _FinalStage oauthUrl(Optional<String> oauthUrl) {
            this.oauthUrl = oauthUrl;
            return this;
        }

        @Override
        public SourceLink build() {
            return new SourceLink(id, name, slug, description, logo, oauthUrl, authType, formComponents);
        }
    }
}