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
@JsonDeserialize(builder = ShippingAddress.Builder.class)
public final class ShippingAddress {
    private final String receiverName;

    private final String firstLine;

    private final Optional<String> secondLine;

    private final String city;

    private final String state;

    private final String zip;

    private final String country;

    private final String phoneNumber;

    private ShippingAddress(
            String receiverName,
            String firstLine,
            Optional<String> secondLine,
            String city,
            String state,
            String zip,
            String country,
            String phoneNumber) {
        this.receiverName = receiverName;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("receiver_name")
    public String getReceiverName() {
        return receiverName;
    }

    @JsonProperty("first_line")
    public String getFirstLine() {
        return firstLine;
    }

    @JsonProperty("second_line")
    public Optional<String> getSecondLine() {
        return secondLine;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ShippingAddress && equalTo((ShippingAddress) other);
    }

    private boolean equalTo(ShippingAddress other) {
        return receiverName.equals(other.receiverName)
                && firstLine.equals(other.firstLine)
                && secondLine.equals(other.secondLine)
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
                this.firstLine,
                this.secondLine,
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

    public static ReceiverNameStage builder() {
        return new Builder();
    }

    public interface ReceiverNameStage {
        FirstLineStage receiverName(String receiverName);

        Builder from(ShippingAddress other);
    }

    public interface FirstLineStage {
        CityStage firstLine(String firstLine);
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
        PhoneNumberStage country(String country);
    }

    public interface PhoneNumberStage {
        _FinalStage phoneNumber(String phoneNumber);
    }

    public interface _FinalStage {
        ShippingAddress build();

        _FinalStage secondLine(Optional<String> secondLine);

        _FinalStage secondLine(String secondLine);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ReceiverNameStage,
                    FirstLineStage,
                    CityStage,
                    StateStage,
                    ZipStage,
                    CountryStage,
                    PhoneNumberStage,
                    _FinalStage {
        private String receiverName;

        private String firstLine;

        private String city;

        private String state;

        private String zip;

        private String country;

        private String phoneNumber;

        private Optional<String> secondLine = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ShippingAddress other) {
            receiverName(other.getReceiverName());
            firstLine(other.getFirstLine());
            secondLine(other.getSecondLine());
            city(other.getCity());
            state(other.getState());
            zip(other.getZip());
            country(other.getCountry());
            phoneNumber(other.getPhoneNumber());
            return this;
        }

        @Override
        @JsonSetter("receiver_name")
        public FirstLineStage receiverName(String receiverName) {
            this.receiverName = receiverName;
            return this;
        }

        @Override
        @JsonSetter("first_line")
        public CityStage firstLine(String firstLine) {
            this.firstLine = firstLine;
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
        public PhoneNumberStage country(String country) {
            this.country = country;
            return this;
        }

        @Override
        @JsonSetter("phone_number")
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
        public ShippingAddress build() {
            return new ShippingAddress(receiverName, firstLine, secondLine, city, state, zip, country, phoneNumber);
        }
    }
}
