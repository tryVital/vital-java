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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingLabTest.Builder.class)
public final class ClientFacingLabTest {
    private final String id;

    private final String slug;

    private final String name;

    private final LabTestSampleType sampleType;

    private final LabTestCollectionMethod method;

    private final double price;

    private final boolean isActive;

    private final LabTestStatus status;

    private final Optional<Boolean> fasting;

    private final Optional<ClientFacingLab> lab;

    private final Optional<List<ClientFacingMarker>> markers;

    private final Optional<Boolean> isDelegated;

    private final Map<String, Object> additionalProperties;

    private ClientFacingLabTest(
            String id,
            String slug,
            String name,
            LabTestSampleType sampleType,
            LabTestCollectionMethod method,
            double price,
            boolean isActive,
            LabTestStatus status,
            Optional<Boolean> fasting,
            Optional<ClientFacingLab> lab,
            Optional<List<ClientFacingMarker>> markers,
            Optional<Boolean> isDelegated,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.sampleType = sampleType;
        this.method = method;
        this.price = price;
        this.isActive = isActive;
        this.status = status;
        this.fasting = fasting;
        this.lab = lab;
        this.markers = markers;
        this.isDelegated = isDelegated;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("sample_type")
    public LabTestSampleType getSampleType() {
        return sampleType;
    }

    @JsonProperty("method")
    public LabTestCollectionMethod getMethod() {
        return method;
    }

    @JsonProperty("price")
    public double getPrice() {
        return price;
    }

    /**
     * @return Deprecated. Use status instead.
     */
    @JsonProperty("is_active")
    public boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("status")
    public LabTestStatus getStatus() {
        return status;
    }

    /**
     * @return Defines whether a lab test requires fasting.
     */
    @JsonProperty("fasting")
    public Optional<Boolean> getFasting() {
        return fasting;
    }

    @JsonProperty("lab")
    public Optional<ClientFacingLab> getLab() {
        return lab;
    }

    @JsonProperty("markers")
    public Optional<List<ClientFacingMarker>> getMarkers() {
        return markers;
    }

    /**
     * @return Denotes whether a lab test requires using non-Vital physician networks. If it does then it's delegated - no otherwise.
     */
    @JsonProperty("is_delegated")
    public Optional<Boolean> getIsDelegated() {
        return isDelegated;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingLabTest && equalTo((ClientFacingLabTest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingLabTest other) {
        return id.equals(other.id)
                && slug.equals(other.slug)
                && name.equals(other.name)
                && sampleType.equals(other.sampleType)
                && method.equals(other.method)
                && price == other.price
                && isActive == other.isActive
                && status.equals(other.status)
                && fasting.equals(other.fasting)
                && lab.equals(other.lab)
                && markers.equals(other.markers)
                && isDelegated.equals(other.isDelegated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.slug,
                this.name,
                this.sampleType,
                this.method,
                this.price,
                this.isActive,
                this.status,
                this.fasting,
                this.lab,
                this.markers,
                this.isDelegated);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SlugStage id(String id);

        Builder from(ClientFacingLabTest other);
    }

    public interface SlugStage {
        NameStage slug(String slug);
    }

    public interface NameStage {
        SampleTypeStage name(String name);
    }

    public interface SampleTypeStage {
        MethodStage sampleType(LabTestSampleType sampleType);
    }

    public interface MethodStage {
        PriceStage method(LabTestCollectionMethod method);
    }

    public interface PriceStage {
        IsActiveStage price(double price);
    }

    public interface IsActiveStage {
        StatusStage isActive(boolean isActive);
    }

    public interface StatusStage {
        _FinalStage status(LabTestStatus status);
    }

    public interface _FinalStage {
        ClientFacingLabTest build();

        _FinalStage fasting(Optional<Boolean> fasting);

        _FinalStage fasting(Boolean fasting);

        _FinalStage lab(Optional<ClientFacingLab> lab);

        _FinalStage lab(ClientFacingLab lab);

        _FinalStage markers(Optional<List<ClientFacingMarker>> markers);

        _FinalStage markers(List<ClientFacingMarker> markers);

        _FinalStage isDelegated(Optional<Boolean> isDelegated);

        _FinalStage isDelegated(Boolean isDelegated);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    SlugStage,
                    NameStage,
                    SampleTypeStage,
                    MethodStage,
                    PriceStage,
                    IsActiveStage,
                    StatusStage,
                    _FinalStage {
        private String id;

        private String slug;

        private String name;

        private LabTestSampleType sampleType;

        private LabTestCollectionMethod method;

        private double price;

        private boolean isActive;

        private LabTestStatus status;

        private Optional<Boolean> isDelegated = Optional.empty();

        private Optional<List<ClientFacingMarker>> markers = Optional.empty();

        private Optional<ClientFacingLab> lab = Optional.empty();

        private Optional<Boolean> fasting = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingLabTest other) {
            id(other.getId());
            slug(other.getSlug());
            name(other.getName());
            sampleType(other.getSampleType());
            method(other.getMethod());
            price(other.getPrice());
            isActive(other.getIsActive());
            status(other.getStatus());
            fasting(other.getFasting());
            lab(other.getLab());
            markers(other.getMarkers());
            isDelegated(other.getIsDelegated());
            return this;
        }

        @Override
        @JsonSetter("id")
        public SlugStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("slug")
        public NameStage slug(String slug) {
            this.slug = slug;
            return this;
        }

        @Override
        @JsonSetter("name")
        public SampleTypeStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("sample_type")
        public MethodStage sampleType(LabTestSampleType sampleType) {
            this.sampleType = sampleType;
            return this;
        }

        @Override
        @JsonSetter("method")
        public PriceStage method(LabTestCollectionMethod method) {
            this.method = method;
            return this;
        }

        @Override
        @JsonSetter("price")
        public IsActiveStage price(double price) {
            this.price = price;
            return this;
        }

        /**
         * <p>Deprecated. Use status instead.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("is_active")
        public StatusStage isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        @Override
        @JsonSetter("status")
        public _FinalStage status(LabTestStatus status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Denotes whether a lab test requires using non-Vital physician networks. If it does then it's delegated - no otherwise.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage isDelegated(Boolean isDelegated) {
            this.isDelegated = Optional.of(isDelegated);
            return this;
        }

        @Override
        @JsonSetter(value = "is_delegated", nulls = Nulls.SKIP)
        public _FinalStage isDelegated(Optional<Boolean> isDelegated) {
            this.isDelegated = isDelegated;
            return this;
        }

        @Override
        public _FinalStage markers(List<ClientFacingMarker> markers) {
            this.markers = Optional.of(markers);
            return this;
        }

        @Override
        @JsonSetter(value = "markers", nulls = Nulls.SKIP)
        public _FinalStage markers(Optional<List<ClientFacingMarker>> markers) {
            this.markers = markers;
            return this;
        }

        @Override
        public _FinalStage lab(ClientFacingLab lab) {
            this.lab = Optional.of(lab);
            return this;
        }

        @Override
        @JsonSetter(value = "lab", nulls = Nulls.SKIP)
        public _FinalStage lab(Optional<ClientFacingLab> lab) {
            this.lab = lab;
            return this;
        }

        /**
         * <p>Defines whether a lab test requires fasting.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fasting(Boolean fasting) {
            this.fasting = Optional.of(fasting);
            return this;
        }

        @Override
        @JsonSetter(value = "fasting", nulls = Nulls.SKIP)
        public _FinalStage fasting(Optional<Boolean> fasting) {
            this.fasting = fasting;
            return this;
        }

        @Override
        public ClientFacingLabTest build() {
            return new ClientFacingLabTest(
                    id,
                    slug,
                    name,
                    sampleType,
                    method,
                    price,
                    isActive,
                    status,
                    fasting,
                    lab,
                    markers,
                    isDelegated,
                    additionalProperties);
        }
    }
}
