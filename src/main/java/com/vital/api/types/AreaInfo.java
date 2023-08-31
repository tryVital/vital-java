package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AreaInfo.Builder.class)
public final class AreaInfo {
    private final String zipCode;

    private final PhlebotomyAreaInfo phlebotomy;

    private AreaInfo(String zipCode, PhlebotomyAreaInfo phlebotomy) {
        this.zipCode = zipCode;
        this.phlebotomy = phlebotomy;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("phlebotomy")
    public PhlebotomyAreaInfo getPhlebotomy() {
        return phlebotomy;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AreaInfo && equalTo((AreaInfo) other);
    }

    private boolean equalTo(AreaInfo other) {
        return zipCode.equals(other.zipCode) && phlebotomy.equals(other.phlebotomy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.zipCode, this.phlebotomy);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ZipCodeStage builder() {
        return new Builder();
    }

    public interface ZipCodeStage {
        PhlebotomyStage zipCode(String zipCode);

        Builder from(AreaInfo other);
    }

    public interface PhlebotomyStage {
        _FinalStage phlebotomy(PhlebotomyAreaInfo phlebotomy);
    }

    public interface _FinalStage {
        AreaInfo build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ZipCodeStage, PhlebotomyStage, _FinalStage {
        private String zipCode;

        private PhlebotomyAreaInfo phlebotomy;

        private Builder() {}

        @Override
        public Builder from(AreaInfo other) {
            zipCode(other.getZipCode());
            phlebotomy(other.getPhlebotomy());
            return this;
        }

        @Override
        @JsonSetter("zip_code")
        public PhlebotomyStage zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        @Override
        @JsonSetter("phlebotomy")
        public _FinalStage phlebotomy(PhlebotomyAreaInfo phlebotomy) {
            this.phlebotomy = phlebotomy;
            return this;
        }

        @Override
        public AreaInfo build() {
            return new AreaInfo(zipCode, phlebotomy);
        }
    }
}
