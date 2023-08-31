package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingMarker.Builder.class)
public final class ClientFacingMarker {
    private final int id;

    private final String name;

    private final String slug;

    private final Optional<String> description;

    private final Optional<Integer> labId;

    private final Optional<String> providerId;

    private final Optional<MarkerType> type;

    private final Optional<String> unit;

    private final Optional<String> price;

    private ClientFacingMarker(
            int id,
            String name,
            String slug,
            Optional<String> description,
            Optional<Integer> labId,
            Optional<String> providerId,
            Optional<MarkerType> type,
            Optional<String> unit,
            Optional<String> price) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.labId = labId;
        this.providerId = providerId;
        this.type = type;
        this.unit = unit;
        this.price = price;
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
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("lab_id")
    public Optional<Integer> getLabId() {
        return labId;
    }

    @JsonProperty("provider_id")
    public Optional<String> getProviderId() {
        return providerId;
    }

    @JsonProperty("type")
    public Optional<MarkerType> getType() {
        return type;
    }

    @JsonProperty("unit")
    public Optional<String> getUnit() {
        return unit;
    }

    @JsonProperty("price")
    public Optional<String> getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingMarker && equalTo((ClientFacingMarker) other);
    }

    private boolean equalTo(ClientFacingMarker other) {
        return id == other.id
                && name.equals(other.name)
                && slug.equals(other.slug)
                && description.equals(other.description)
                && labId.equals(other.labId)
                && providerId.equals(other.providerId)
                && type.equals(other.type)
                && unit.equals(other.unit)
                && price.equals(other.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.slug,
                this.description,
                this.labId,
                this.providerId,
                this.type,
                this.unit,
                this.price);
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

        Builder from(ClientFacingMarker other);
    }

    public interface NameStage {
        SlugStage name(String name);
    }

    public interface SlugStage {
        _FinalStage slug(String slug);
    }

    public interface _FinalStage {
        ClientFacingMarker build();

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage labId(Optional<Integer> labId);

        _FinalStage labId(Integer labId);

        _FinalStage providerId(Optional<String> providerId);

        _FinalStage providerId(String providerId);

        _FinalStage type(Optional<MarkerType> type);

        _FinalStage type(MarkerType type);

        _FinalStage unit(Optional<String> unit);

        _FinalStage unit(String unit);

        _FinalStage price(Optional<String> price);

        _FinalStage price(String price);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, NameStage, SlugStage, _FinalStage {
        private int id;

        private String name;

        private String slug;

        private Optional<String> price = Optional.empty();

        private Optional<String> unit = Optional.empty();

        private Optional<MarkerType> type = Optional.empty();

        private Optional<String> providerId = Optional.empty();

        private Optional<Integer> labId = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingMarker other) {
            id(other.getId());
            name(other.getName());
            slug(other.getSlug());
            description(other.getDescription());
            labId(other.getLabId());
            providerId(other.getProviderId());
            type(other.getType());
            unit(other.getUnit());
            price(other.getPrice());
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
        public _FinalStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        @Override
        public _FinalStage price(String price) {
            this.price = Optional.of(price);
            return this;
        }

        @Override
        @JsonSetter(value = "price", nulls = Nulls.SKIP)
        public _FinalStage price(Optional<String> price) {
            this.price = price;
            return this;
        }

        @Override
        public _FinalStage unit(String unit) {
            this.unit = Optional.of(unit);
            return this;
        }

        @Override
        @JsonSetter(value = "unit", nulls = Nulls.SKIP)
        public _FinalStage unit(Optional<String> unit) {
            this.unit = unit;
            return this;
        }

        @Override
        public _FinalStage type(MarkerType type) {
            this.type = Optional.of(type);
            return this;
        }

        @Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<MarkerType> type) {
            this.type = type;
            return this;
        }

        @Override
        public _FinalStage providerId(String providerId) {
            this.providerId = Optional.of(providerId);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_id", nulls = Nulls.SKIP)
        public _FinalStage providerId(Optional<String> providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        public _FinalStage labId(Integer labId) {
            this.labId = Optional.of(labId);
            return this;
        }

        @Override
        @JsonSetter(value = "lab_id", nulls = Nulls.SKIP)
        public _FinalStage labId(Optional<Integer> labId) {
            this.labId = labId;
            return this;
        }

        @Override
        public _FinalStage description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @Override
        public ClientFacingMarker build() {
            return new ClientFacingMarker(id, name, slug, description, labId, providerId, type, unit, price);
        }
    }
}
