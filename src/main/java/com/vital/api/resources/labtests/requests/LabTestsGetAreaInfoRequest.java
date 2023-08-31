package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabTestsGetAreaInfoRequest.Builder.class)
public final class LabTestsGetAreaInfoRequest {
    private final String zipCode;

    private LabTestsGetAreaInfoRequest(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return Zip code of the area to check
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabTestsGetAreaInfoRequest && equalTo((LabTestsGetAreaInfoRequest) other);
    }

    private boolean equalTo(LabTestsGetAreaInfoRequest other) {
        return zipCode.equals(other.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.zipCode);
    }

    @Override
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
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ZipCodeStage, _FinalStage {
        private String zipCode;

        private Builder() {}

        @Override
        public Builder from(LabTestsGetAreaInfoRequest other) {
            zipCode(other.getZipCode());
            return this;
        }

        /**
         * <p>Zip code of the area to check</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("zip_code")
        public _FinalStage zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        @Override
        public LabTestsGetAreaInfoRequest build() {
            return new LabTestsGetAreaInfoRequest(zipCode);
        }
    }
}
