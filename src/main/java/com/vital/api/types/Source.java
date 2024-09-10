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
@JsonDeserialize(builder = Source.Builder.class)
public final class Source {
    private final String name;

    private final String slug;

    private final String description;

    private final String logo;

    private final Optional<String> group;

    private final Optional<String> oauthUrl;

    private final Optional<SourceAuthType> authType;

    private final Optional<SourceType> sourceType;

    private final Optional<Boolean> isActive;

    private final Optional<Integer> backfillNumDays;

    private final int id;

    private final Map<String, Object> additionalProperties;

    private Source(
            String name,
            String slug,
            String description,
            String logo,
            Optional<String> group,
            Optional<String> oauthUrl,
            Optional<SourceAuthType> authType,
            Optional<SourceType> sourceType,
            Optional<Boolean> isActive,
            Optional<Integer> backfillNumDays,
            int id,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.logo = logo;
        this.group = group;
        this.oauthUrl = oauthUrl;
        this.authType = authType;
        this.sourceType = sourceType;
        this.isActive = isActive;
        this.backfillNumDays = backfillNumDays;
        this.id = id;
        this.additionalProperties = additionalProperties;
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

    @JsonProperty("group")
    public Optional<String> getGroup() {
        return group;
    }

    @JsonProperty("oauth_url")
    public Optional<String> getOauthUrl() {
        return oauthUrl;
    }

    @JsonProperty("auth_type")
    public Optional<SourceAuthType> getAuthType() {
        return authType;
    }

    @JsonProperty("source_type")
    public Optional<SourceType> getSourceType() {
        return sourceType;
    }

    @JsonProperty("is_active")
    public Optional<Boolean> getIsActive() {
        return isActive;
    }

    @JsonProperty("backfill_num_days")
    public Optional<Integer> getBackfillNumDays() {
        return backfillNumDays;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Source && equalTo((Source) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Source other) {
        return name.equals(other.name)
                && slug.equals(other.slug)
                && description.equals(other.description)
                && logo.equals(other.logo)
                && group.equals(other.group)
                && oauthUrl.equals(other.oauthUrl)
                && authType.equals(other.authType)
                && sourceType.equals(other.sourceType)
                && isActive.equals(other.isActive)
                && backfillNumDays.equals(other.backfillNumDays)
                && id == other.id;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.slug,
                this.description,
                this.logo,
                this.group,
                this.oauthUrl,
                this.authType,
                this.sourceType,
                this.isActive,
                this.backfillNumDays,
                this.id);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        SlugStage name(String name);

        Builder from(Source other);
    }

    public interface SlugStage {
        DescriptionStage slug(String slug);
    }

    public interface DescriptionStage {
        LogoStage description(String description);
    }

    public interface LogoStage {
        IdStage logo(String logo);
    }

    public interface IdStage {
        _FinalStage id(int id);
    }

    public interface _FinalStage {
        Source build();

        _FinalStage group(Optional<String> group);

        _FinalStage group(String group);

        _FinalStage oauthUrl(Optional<String> oauthUrl);

        _FinalStage oauthUrl(String oauthUrl);

        _FinalStage authType(Optional<SourceAuthType> authType);

        _FinalStage authType(SourceAuthType authType);

        _FinalStage sourceType(Optional<SourceType> sourceType);

        _FinalStage sourceType(SourceType sourceType);

        _FinalStage isActive(Optional<Boolean> isActive);

        _FinalStage isActive(Boolean isActive);

        _FinalStage backfillNumDays(Optional<Integer> backfillNumDays);

        _FinalStage backfillNumDays(Integer backfillNumDays);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements NameStage, SlugStage, DescriptionStage, LogoStage, IdStage, _FinalStage {
        private String name;

        private String slug;

        private String description;

        private String logo;

        private int id;

        private Optional<Integer> backfillNumDays = Optional.empty();

        private Optional<Boolean> isActive = Optional.empty();

        private Optional<SourceType> sourceType = Optional.empty();

        private Optional<SourceAuthType> authType = Optional.empty();

        private Optional<String> oauthUrl = Optional.empty();

        private Optional<String> group = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Source other) {
            name(other.getName());
            slug(other.getSlug());
            description(other.getDescription());
            logo(other.getLogo());
            group(other.getGroup());
            oauthUrl(other.getOauthUrl());
            authType(other.getAuthType());
            sourceType(other.getSourceType());
            isActive(other.getIsActive());
            backfillNumDays(other.getBackfillNumDays());
            id(other.getId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public SlugStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("slug")
        public DescriptionStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        @java.lang.Override
        @JsonSetter("description")
        public LogoStage description(String description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        @JsonSetter("logo")
        public IdStage logo(String logo) {
            this.logo = logo;
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(int id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public _FinalStage backfillNumDays(Integer backfillNumDays) {
            this.backfillNumDays = Optional.of(backfillNumDays);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "backfill_num_days", nulls = Nulls.SKIP)
        public _FinalStage backfillNumDays(Optional<Integer> backfillNumDays) {
            this.backfillNumDays = backfillNumDays;
            return this;
        }

        @java.lang.Override
        public _FinalStage isActive(Boolean isActive) {
            this.isActive = Optional.of(isActive);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "is_active", nulls = Nulls.SKIP)
        public _FinalStage isActive(Optional<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }

        @java.lang.Override
        public _FinalStage sourceType(SourceType sourceType) {
            this.sourceType = Optional.of(sourceType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "source_type", nulls = Nulls.SKIP)
        public _FinalStage sourceType(Optional<SourceType> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        @java.lang.Override
        public _FinalStage authType(SourceAuthType authType) {
            this.authType = Optional.of(authType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "auth_type", nulls = Nulls.SKIP)
        public _FinalStage authType(Optional<SourceAuthType> authType) {
            this.authType = authType;
            return this;
        }

        @java.lang.Override
        public _FinalStage oauthUrl(String oauthUrl) {
            this.oauthUrl = Optional.of(oauthUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "oauth_url", nulls = Nulls.SKIP)
        public _FinalStage oauthUrl(Optional<String> oauthUrl) {
            this.oauthUrl = oauthUrl;
            return this;
        }

        @java.lang.Override
        public _FinalStage group(String group) {
            this.group = Optional.of(group);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "group", nulls = Nulls.SKIP)
        public _FinalStage group(Optional<String> group) {
            this.group = group;
            return this;
        }

        @java.lang.Override
        public Source build() {
            return new Source(
                    name,
                    slug,
                    description,
                    logo,
                    group,
                    oauthUrl,
                    authType,
                    sourceType,
                    isActive,
                    backfillNumDays,
                    id,
                    additionalProperties);
        }
    }
}
