package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSourceDetailed.Builder.class)
public final class ClientFacingSourceDetailed {
    private final String name;

    private final String slug;

    private final String description;

    private final Optional<String> logo;

    private final Optional<SourceAuthType> authType;

    private final Optional<List<ClientFacingResource>> supportedResources;

    private ClientFacingSourceDetailed(
            String name,
            String slug,
            String description,
            Optional<String> logo,
            Optional<SourceAuthType> authType,
            Optional<List<ClientFacingResource>> supportedResources) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.logo = logo;
        this.authType = authType;
        this.supportedResources = supportedResources;
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
     * @return Description of source of information
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @return URL for source logo
     */
    @JsonProperty("logo")
    public Optional<String> getLogo() {
        return logo;
    }

    @JsonProperty("auth_type")
    public Optional<SourceAuthType> getAuthType() {
        return authType;
    }

    @JsonProperty("supported_resources")
    public Optional<List<ClientFacingResource>> getSupportedResources() {
        return supportedResources;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSourceDetailed && equalTo((ClientFacingSourceDetailed) other);
    }

    private boolean equalTo(ClientFacingSourceDetailed other) {
        return name.equals(other.name)
                && slug.equals(other.slug)
                && description.equals(other.description)
                && logo.equals(other.logo)
                && authType.equals(other.authType)
                && supportedResources.equals(other.supportedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.slug, this.description, this.logo, this.authType, this.supportedResources);
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

        Builder from(ClientFacingSourceDetailed other);
    }

    public interface SlugStage {
        DescriptionStage slug(String slug);
    }

    public interface DescriptionStage {
        _FinalStage description(String description);
    }

    public interface _FinalStage {
        ClientFacingSourceDetailed build();

        _FinalStage logo(Optional<String> logo);

        _FinalStage logo(String logo);

        _FinalStage authType(Optional<SourceAuthType> authType);

        _FinalStage authType(SourceAuthType authType);

        _FinalStage supportedResources(Optional<List<ClientFacingResource>> supportedResources);

        _FinalStage supportedResources(List<ClientFacingResource> supportedResources);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SlugStage, DescriptionStage, _FinalStage {
        private String name;

        private String slug;

        private String description;

        private Optional<List<ClientFacingResource>> supportedResources = Optional.empty();

        private Optional<SourceAuthType> authType = Optional.empty();

        private Optional<String> logo = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingSourceDetailed other) {
            name(other.getName());
            slug(other.getSlug());
            description(other.getDescription());
            logo(other.getLogo());
            authType(other.getAuthType());
            supportedResources(other.getSupportedResources());
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
        public DescriptionStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>Description of source of information</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("description")
        public _FinalStage description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public _FinalStage supportedResources(List<ClientFacingResource> supportedResources) {
            this.supportedResources = Optional.of(supportedResources);
            return this;
        }

        @Override
        @JsonSetter(value = "supported_resources", nulls = Nulls.SKIP)
        public _FinalStage supportedResources(Optional<List<ClientFacingResource>> supportedResources) {
            this.supportedResources = supportedResources;
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

        /**
         * <p>URL for source logo</p>
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

        @Override
        public ClientFacingSourceDetailed build() {
            return new ClientFacingSourceDetailed(name, slug, description, logo, authType, supportedResources);
        }
    }
}
