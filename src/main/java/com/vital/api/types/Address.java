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
@JsonDeserialize(builder = Address.Builder.class)
public final class Address {
    private final String firstLine;

    private final Optional<String> secondLine;

    private final String country;

    private final String zip;

    private final String city;

    private final String state;

    private Address(
            String firstLine, Optional<String> secondLine, String country, String zip, String city, String state) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.country = country;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    @JsonProperty("first_line")
    public String getFirstLine() {
        return firstLine;
    }

    @JsonProperty("second_line")
    public Optional<String> getSecondLine() {
        return secondLine;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Address && equalTo((Address) other);
    }

    private boolean equalTo(Address other) {
        return firstLine.equals(other.firstLine)
                && secondLine.equals(other.secondLine)
                && country.equals(other.country)
                && zip.equals(other.zip)
                && city.equals(other.city)
                && state.equals(other.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstLine, this.secondLine, this.country, this.zip, this.city, this.state);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FirstLineStage builder() {
        return new Builder();
    }

    public interface FirstLineStage {
        CountryStage firstLine(String firstLine);

        Builder from(Address other);
    }

    public interface CountryStage {
        ZipStage country(String country);
    }

    public interface ZipStage {
        CityStage zip(String zip);
    }

    public interface CityStage {
        StateStage city(String city);
    }

    public interface StateStage {
        _FinalStage state(String state);
    }

    public interface _FinalStage {
        Address build();

        _FinalStage secondLine(Optional<String> secondLine);

        _FinalStage secondLine(String secondLine);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FirstLineStage, CountryStage, ZipStage, CityStage, StateStage, _FinalStage {
        private String firstLine;

        private String country;

        private String zip;

        private String city;

        private String state;

        private Optional<String> secondLine = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Address other) {
            firstLine(other.getFirstLine());
            secondLine(other.getSecondLine());
            country(other.getCountry());
            zip(other.getZip());
            city(other.getCity());
            state(other.getState());
            return this;
        }

        @Override
        @JsonSetter("first_line")
        public CountryStage firstLine(String firstLine) {
            this.firstLine = firstLine;
            return this;
        }

        @Override
        @JsonSetter("country")
        public ZipStage country(String country) {
            this.country = country;
            return this;
        }

        @Override
        @JsonSetter("zip")
        public CityStage zip(String zip) {
            this.zip = zip;
            return this;
        }

        @Override
        @JsonSetter("city")
        public StateStage city(String city) {
            this.city = city;
            return this;
        }

        @Override
        @JsonSetter("state")
        public _FinalStage state(String state) {
            this.state = state;
            return this;
        }

        @Override
        public _FinalStage secondLine(String secondLine) {
            this.secondLine = Optional.of(secondLine);
            return this;
        }

        @Override
        @JsonSetter(value = "second_line", nulls = Nulls.SKIP)
        public _FinalStage secondLine(Optional<String> secondLine) {
            this.secondLine = secondLine;
            return this;
        }

        @Override
        public Address build() {
            return new Address(firstLine, secondLine, country, zip, city, state);
        }
    }
}