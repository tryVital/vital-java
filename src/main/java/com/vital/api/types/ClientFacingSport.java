package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSport.Builder.class)
public final class ClientFacingSport {
    private final int id;

    private final String name;

    private final String slug;

    private ClientFacingSport(int id, String name, String slug) {
        this.id = id;
        this.name = name;
        this.slug = slug;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    /**
     * @return Sport's name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Slug for designated sport
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSport && equalTo((ClientFacingSport) other);
    }

    private boolean equalTo(ClientFacingSport other) {
        return id == other.id && name.equals(other.name) && slug.equals(other.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.slug);
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

        Builder from(ClientFacingSport other);
    }

    public interface NameStage {
        SlugStage name(String name);
    }

    public interface SlugStage {
        _FinalStage slug(String slug);
    }

    public interface _FinalStage {
        ClientFacingSport build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, NameStage, SlugStage, _FinalStage {
        private int id;

        private String name;

        private String slug;

        private Builder() {}

        @Override
        public Builder from(ClientFacingSport other) {
            id(other.getId());
            name(other.getName());
            slug(other.getSlug());
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(int id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Sport's name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public SlugStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Slug for designated sport</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("slug")
        public _FinalStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        @Override
        public ClientFacingSport build() {
            return new ClientFacingSport(id, name, slug);
        }
    }
}
