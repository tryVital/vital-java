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
@JsonDeserialize(builder = PersonDetails.Builder.class)
public final class PersonDetails {
    private final String firstName;

    private final String lastName;

    private final Address address;

    private final String phoneNumber;

    private final Optional<String> phoneType;

    private PersonDetails(
            String firstName, String lastName, Address address, String phoneNumber, Optional<String> phoneType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_type")
    public Optional<String> getPhoneType() {
        return phoneType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PersonDetails && equalTo((PersonDetails) other);
    }

    private boolean equalTo(PersonDetails other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && address.equals(other.address)
                && phoneNumber.equals(other.phoneNumber)
                && phoneType.equals(other.phoneType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.address, this.phoneNumber, this.phoneType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FirstNameStage builder() {
        return new Builder();
    }

    public interface FirstNameStage {
        LastNameStage firstName(String firstName);

        Builder from(PersonDetails other);
    }

    public interface LastNameStage {
        AddressStage lastName(String lastName);
    }

    public interface AddressStage {
        PhoneNumberStage address(Address address);
    }

    public interface PhoneNumberStage {
        _FinalStage phoneNumber(String phoneNumber);
    }

    public interface _FinalStage {
        PersonDetails build();

        _FinalStage phoneType(Optional<String> phoneType);

        _FinalStage phoneType(String phoneType);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FirstNameStage, LastNameStage, AddressStage, PhoneNumberStage, _FinalStage {
        private String firstName;

        private String lastName;

        private Address address;

        private String phoneNumber;

        private Optional<String> phoneType = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PersonDetails other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            address(other.getAddress());
            phoneNumber(other.getPhoneNumber());
            phoneType(other.getPhoneType());
            return this;
        }

        @Override
        @JsonSetter("first_name")
        public LastNameStage firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        @JsonSetter("last_name")
        public AddressStage lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        @JsonSetter("address")
        public PhoneNumberStage address(Address address) {
            this.address = address;
            return this;
        }

        @Override
        @JsonSetter("phone_number")
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public _FinalStage phoneType(String phoneType) {
            this.phoneType = Optional.of(phoneType);
            return this;
        }

        @Override
        @JsonSetter(value = "phone_type", nulls = Nulls.SKIP)
        public _FinalStage phoneType(Optional<String> phoneType) {
            this.phoneType = phoneType;
            return this;
        }

        @Override
        public PersonDetails build() {
            return new PersonDetails(firstName, lastName, address, phoneNumber, phoneType);
        }
    }
}
