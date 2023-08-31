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
@JsonDeserialize(builder = PatientAddressCompatible.Builder.class)
public final class PatientAddressCompatible {
    private final Optional<String> receiverName;

    private final String street;

    private final Optional<String> streetNumber;

    private final String city;

    private final String state;

    private final String zip;

    private final String country;

    private final Optional<String> phoneNumber;

    private PatientAddressCompatible(
            Optional<String> receiverName,
            String street,
            Optional<String> streetNumber,
            String city,
            String state,
            String zip,
            String country,
            Optional<String> phoneNumber) {
        this.receiverName = receiverName;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("receiver_name")
    public Optional<String> getReceiverName() {
        return receiverName;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street_number")
    public Optional<String> getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("phone_number")
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PatientAddressCompatible && equalTo((PatientAddressCompatible) other);
    }

    private boolean equalTo(PatientAddressCompatible other) {
        return receiverName.equals(other.receiverName)
                && street.equals(other.street)
                && streetNumber.equals(other.streetNumber)
                && city.equals(other.city)
                && state.equals(other.state)
                && zip.equals(other.zip)
                && country.equals(other.country)
                && phoneNumber.equals(other.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.receiverName,
                this.street,
                this.streetNumber,
                this.city,
                this.state,
                this.zip,
                this.country,
                this.phoneNumber);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StreetStage builder() {
        return new Builder();
    }

    public interface StreetStage {
        CityStage street(String street);

        Builder from(PatientAddressCompatible other);
    }

    public interface CityStage {
        StateStage city(String city);
    }

    public interface StateStage {
        ZipStage state(String state);
    }

    public interface ZipStage {
        CountryStage zip(String zip);
    }

    public interface CountryStage {
        _FinalStage country(String country);
    }

    public interface _FinalStage {
        PatientAddressCompatible build();

        _FinalStage receiverName(Optional<String> receiverName);

        _FinalStage receiverName(String receiverName);

        _FinalStage streetNumber(Optional<String> streetNumber);

        _FinalStage streetNumber(String streetNumber);

        _FinalStage phoneNumber(Optional<String> phoneNumber);

        _FinalStage phoneNumber(String phoneNumber);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements StreetStage, CityStage, StateStage, ZipStage, CountryStage, _FinalStage {
        private String street;

        private String city;

        private String state;

        private String zip;

        private String country;

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> streetNumber = Optional.empty();

        private Optional<String> receiverName = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PatientAddressCompatible other) {
            receiverName(other.getReceiverName());
            street(other.getStreet());
            streetNumber(other.getStreetNumber());
            city(other.getCity());
            state(other.getState());
            zip(other.getZip());
            country(other.getCountry());
            phoneNumber(other.getPhoneNumber());
            return this;
        }

        @Override
        @JsonSetter("street")
        public CityStage street(String street) {
            this.street = street;
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
        public ZipStage state(String state) {
            this.state = state;
            return this;
        }

        @Override
        @JsonSetter("zip")
        public CountryStage zip(String zip) {
            this.zip = zip;
            return this;
        }

        @Override
        @JsonSetter("country")
        public _FinalStage country(String country) {
            this.country = country;
            return this;
        }

        @Override
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = Optional.of(phoneNumber);
            return this;
        }

        @Override
        @JsonSetter(value = "phone_number", nulls = Nulls.SKIP)
        public _FinalStage phoneNumber(Optional<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public _FinalStage streetNumber(String streetNumber) {
            this.streetNumber = Optional.of(streetNumber);
            return this;
        }

        @Override
        @JsonSetter(value = "street_number", nulls = Nulls.SKIP)
        public _FinalStage streetNumber(Optional<String> streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        @Override
        public _FinalStage receiverName(String receiverName) {
            this.receiverName = Optional.of(receiverName);
            return this;
        }

        @Override
        @JsonSetter(value = "receiver_name", nulls = Nulls.SKIP)
        public _FinalStage receiverName(Optional<String> receiverName) {
            this.receiverName = receiverName;
            return this;
        }

        @Override
        public PatientAddressCompatible build() {
            return new PatientAddressCompatible(
                    receiverName, street, streetNumber, city, state, zip, country, phoneNumber);
        }
    }
}
