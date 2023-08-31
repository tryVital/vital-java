package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingLab.Builder.class)
public final class ClientFacingLab {
    private final int id;

    private final String slug;

    private final String name;

    private final String firstLineAddress;

    private final String city;

    private final String zipcode;

    private final List<LabTestCollectionMethod> collectionMethods;

    private final List<LabTestSampleType> sampleTypes;

    private ClientFacingLab(
            int id,
            String slug,
            String name,
            String firstLineAddress,
            String city,
            String zipcode,
            List<LabTestCollectionMethod> collectionMethods,
            List<LabTestSampleType> sampleTypes) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.firstLineAddress = firstLineAddress;
        this.city = city;
        this.zipcode = zipcode;
        this.collectionMethods = collectionMethods;
        this.sampleTypes = sampleTypes;
    }

    @JsonProperty("id")
    public int getId() {
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

    @JsonProperty("first_line_address")
    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("collection_methods")
    public List<LabTestCollectionMethod> getCollectionMethods() {
        return collectionMethods;
    }

    @JsonProperty("sample_types")
    public List<LabTestSampleType> getSampleTypes() {
        return sampleTypes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingLab && equalTo((ClientFacingLab) other);
    }

    private boolean equalTo(ClientFacingLab other) {
        return id == other.id
                && slug.equals(other.slug)
                && name.equals(other.name)
                && firstLineAddress.equals(other.firstLineAddress)
                && city.equals(other.city)
                && zipcode.equals(other.zipcode)
                && collectionMethods.equals(other.collectionMethods)
                && sampleTypes.equals(other.sampleTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.slug,
                this.name,
                this.firstLineAddress,
                this.city,
                this.zipcode,
                this.collectionMethods,
                this.sampleTypes);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SlugStage id(int id);

        Builder from(ClientFacingLab other);
    }

    public interface SlugStage {
        NameStage slug(String slug);
    }

    public interface NameStage {
        FirstLineAddressStage name(String name);
    }

    public interface FirstLineAddressStage {
        CityStage firstLineAddress(String firstLineAddress);
    }

    public interface CityStage {
        ZipcodeStage city(String city);
    }

    public interface ZipcodeStage {
        _FinalStage zipcode(String zipcode);
    }

    public interface _FinalStage {
        ClientFacingLab build();

        _FinalStage collectionMethods(List<LabTestCollectionMethod> collectionMethods);

        _FinalStage addCollectionMethods(LabTestCollectionMethod collectionMethods);

        _FinalStage addAllCollectionMethods(List<LabTestCollectionMethod> collectionMethods);

        _FinalStage sampleTypes(List<LabTestSampleType> sampleTypes);

        _FinalStage addSampleTypes(LabTestSampleType sampleTypes);

        _FinalStage addAllSampleTypes(List<LabTestSampleType> sampleTypes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, SlugStage, NameStage, FirstLineAddressStage, CityStage, ZipcodeStage, _FinalStage {
        private int id;

        private String slug;

        private String name;

        private String firstLineAddress;

        private String city;

        private String zipcode;

        private List<LabTestSampleType> sampleTypes = new ArrayList<>();

        private List<LabTestCollectionMethod> collectionMethods = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingLab other) {
            id(other.getId());
            slug(other.getSlug());
            name(other.getName());
            firstLineAddress(other.getFirstLineAddress());
            city(other.getCity());
            zipcode(other.getZipcode());
            collectionMethods(other.getCollectionMethods());
            sampleTypes(other.getSampleTypes());
            return this;
        }

        @Override
        @JsonSetter("id")
        public SlugStage id(int id) {
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
        public FirstLineAddressStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("first_line_address")
        public CityStage firstLineAddress(String firstLineAddress) {
            this.firstLineAddress = firstLineAddress;
            return this;
        }

        @Override
        @JsonSetter("city")
        public ZipcodeStage city(String city) {
            this.city = city;
            return this;
        }

        @Override
        @JsonSetter("zipcode")
        public _FinalStage zipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        @Override
        public _FinalStage addAllSampleTypes(List<LabTestSampleType> sampleTypes) {
            this.sampleTypes.addAll(sampleTypes);
            return this;
        }

        @Override
        public _FinalStage addSampleTypes(LabTestSampleType sampleTypes) {
            this.sampleTypes.add(sampleTypes);
            return this;
        }

        @Override
        @JsonSetter(value = "sample_types", nulls = Nulls.SKIP)
        public _FinalStage sampleTypes(List<LabTestSampleType> sampleTypes) {
            this.sampleTypes.clear();
            this.sampleTypes.addAll(sampleTypes);
            return this;
        }

        @Override
        public _FinalStage addAllCollectionMethods(List<LabTestCollectionMethod> collectionMethods) {
            this.collectionMethods.addAll(collectionMethods);
            return this;
        }

        @Override
        public _FinalStage addCollectionMethods(LabTestCollectionMethod collectionMethods) {
            this.collectionMethods.add(collectionMethods);
            return this;
        }

        @Override
        @JsonSetter(value = "collection_methods", nulls = Nulls.SKIP)
        public _FinalStage collectionMethods(List<LabTestCollectionMethod> collectionMethods) {
            this.collectionMethods.clear();
            this.collectionMethods.addAll(collectionMethods);
            return this;
        }

        @Override
        public ClientFacingLab build() {
            return new ClientFacingLab(id, slug, name, firstLineAddress, city, zipcode, collectionMethods, sampleTypes);
        }
    }
}
