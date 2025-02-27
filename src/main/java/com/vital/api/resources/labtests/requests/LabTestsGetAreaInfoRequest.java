/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.AllowedRadius;
import com.vital.api.types.ClientFacingLabs;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabTestsGetAreaInfoRequest.Builder.class)
public final class LabTestsGetAreaInfoRequest {
    private final String zipCode;

    private final Optional<AllowedRadius> radius;

    private final Optional<ClientFacingLabs> lab;

    private final Map<String, Object> additionalProperties;

    private LabTestsGetAreaInfoRequest(
            String zipCode,
            Optional<AllowedRadius> radius,
            Optional<ClientFacingLabs> lab,
            Map<String, Object> additionalProperties) {
        this.zipCode = zipCode;
        this.radius = radius;
        this.lab = lab;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Zip code of the area to check
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @return Radius in which to search in miles
     */
    @JsonProperty("radius")
    public Optional<AllowedRadius> getRadius() {
        return radius;
    }

    /**
     * @return Lab to check for PSCs
     */
    @JsonProperty("lab")
    public Optional<ClientFacingLabs> getLab() {
        return lab;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabTestsGetAreaInfoRequest && equalTo((LabTestsGetAreaInfoRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LabTestsGetAreaInfoRequest other) {
        return zipCode.equals(other.zipCode) && radius.equals(other.radius) && lab.equals(other.lab);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.zipCode, this.radius, this.lab);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ZipCodeStage builder() {
        return new Builder();
    }

    public interface ZipCodeStage {
        _FinalStage zipCode(String zipCode);

        Builder from(LabTestsGetAreaInfoRequest other);
    }

    public interface _FinalStage {
        LabTestsGetAreaInfoRequest build();

        _FinalStage radius(Optional<AllowedRadius> radius);

        _FinalStage radius(AllowedRadius radius);

        _FinalStage lab(Optional<ClientFacingLabs> lab);

        _FinalStage lab(ClientFacingLabs lab);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ZipCodeStage, _FinalStage {
        private String zipCode;

        private Optional<ClientFacingLabs> lab = Optional.empty();

        private Optional<AllowedRadius> radius = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LabTestsGetAreaInfoRequest other) {
            zipCode(other.getZipCode());
            radius(other.getRadius());
            lab(other.getLab());
            return this;
        }

        /**
         * <p>Zip code of the area to check</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("zip_code")
        public _FinalStage zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * <p>Lab to check for PSCs</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lab(ClientFacingLabs lab) {
            this.lab = Optional.of(lab);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lab", nulls = Nulls.SKIP)
        public _FinalStage lab(Optional<ClientFacingLabs> lab) {
            this.lab = lab;
            return this;
        }

        /**
         * <p>Radius in which to search in miles</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage radius(AllowedRadius radius) {
            this.radius = Optional.of(radius);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "radius", nulls = Nulls.SKIP)
        public _FinalStage radius(Optional<AllowedRadius> radius) {
            this.radius = radius;
            return this;
        }

        @java.lang.Override
        public LabTestsGetAreaInfoRequest build() {
            return new LabTestsGetAreaInfoRequest(zipCode, radius, lab, additionalProperties);
        }
    }
}
