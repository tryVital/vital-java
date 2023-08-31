package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSourceWithStatus.Builder.class)
public final class ClientFacingSourceWithStatus {
    private final String name;

    private final String slug;

    private final String logo;

    private final String status;

    private ClientFacingSourceWithStatus(String name, String slug, String logo, String status) {
        this.name = name;
        this.slug = slug;
        this.logo = logo;
        this.status = status;
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

    /**
     * @return Status of source, either error or connected
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSourceWithStatus && equalTo((ClientFacingSourceWithStatus) other);
    }

    private boolean equalTo(ClientFacingSourceWithStatus other) {
        return name.equals(other.name)
                && slug.equals(other.slug)
                && logo.equals(other.logo)
                && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.slug, this.logo, this.status);
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

        Builder from(ClientFacingSourceWithStatus other);
    }

    public interface SlugStage {
        LogoStage slug(String slug);
    }

    public interface LogoStage {
        StatusStage logo(String logo);
    }

    public interface StatusStage {
        _FinalStage status(String status);
    }

    public interface _FinalStage {
        ClientFacingSourceWithStatus build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SlugStage, LogoStage, StatusStage, _FinalStage {
        private String name;

        private String slug;

        private String logo;

        private String status;

        private Builder() {}

        @Override
        public Builder from(ClientFacingSourceWithStatus other) {
            name(other.getName());
            slug(other.getSlug());
            logo(other.getLogo());
            status(other.getStatus());
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
        public StatusStage logo(String logo) {
            this.logo = logo;
            return this;
        }

        /**
         * <p>Status of source, either error or connected</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("status")
        public _FinalStage status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public ClientFacingSourceWithStatus build() {
            return new ClientFacingSourceWithStatus(name, slug, logo, status);
        }
    }
}
