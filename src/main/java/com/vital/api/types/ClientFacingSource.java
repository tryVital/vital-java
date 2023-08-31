package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSource.Builder.class)
public final class ClientFacingSource {
    private final String name;

    private final String slug;

    private final String logo;

    private ClientFacingSource(String name, String slug, String logo) {
        this.name = name;
        this.slug = slug;
        this.logo = logo;
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
        return other instanceof ClientFacingSource && equalTo((ClientFacingSource) other);
    }

    private boolean equalTo(ClientFacingSource other) {
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

        Builder from(ClientFacingSource other);
    }

    public interface SlugStage {
        LogoStage slug(String slug);
    }

    public interface LogoStage {
        _FinalStage logo(String logo);
    }

    public interface _FinalStage {
        ClientFacingSource build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SlugStage, LogoStage, _FinalStage {
        private String name;

        private String slug;

        private String logo;

        private Builder() {}

        @Override
        public Builder from(ClientFacingSource other) {
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
        public ClientFacingSource build() {
            return new ClientFacingSource(name, slug, logo);
        }
    }
}
