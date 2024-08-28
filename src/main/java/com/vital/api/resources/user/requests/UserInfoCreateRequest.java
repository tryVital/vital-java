/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.user.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserInfoCreateRequest.Builder.class)
public final class UserInfoCreateRequest {
    private final String firstName;

    private final String lastName;

    private final String email;

    private final String phoneNumber;

    private final String gender;

    private final String dob;

    private final Address address;

    private final Map<String, Object> additionalProperties;

    private UserInfoCreateRequest(
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String gender,
            String dob,
            Address address,
            Map<String, Object> additionalProperties) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserInfoCreateRequest && equalTo((UserInfoCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserInfoCreateRequest other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && email.equals(other.email)
                && phoneNumber.equals(other.phoneNumber)
                && gender.equals(other.gender)
                && dob.equals(other.dob)
                && address.equals(other.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.firstName, this.lastName, this.email, this.phoneNumber, this.gender, this.dob, this.address);
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

        Builder from(UserInfoCreateRequest other);
    }

    public interface LastNameStage {
        EmailStage lastName(String lastName);
    }

    public interface EmailStage {
        PhoneNumberStage email(String email);
    }

    public interface PhoneNumberStage {
        GenderStage phoneNumber(String phoneNumber);
    }

    public interface GenderStage {
        DobStage gender(String gender);
    }

    public interface DobStage {
        AddressStage dob(String dob);
    }

    public interface AddressStage {
        _FinalStage address(Address address);
    }

    public interface _FinalStage {
        UserInfoCreateRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FirstNameStage,
                    LastNameStage,
                    EmailStage,
                    PhoneNumberStage,
                    GenderStage,
                    DobStage,
                    AddressStage,
                    _FinalStage {
        private String firstName;

        private String lastName;

        private String email;

        private String phoneNumber;

        private String gender;

        private String dob;

        private Address address;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserInfoCreateRequest other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            email(other.getEmail());
            phoneNumber(other.getPhoneNumber());
            gender(other.getGender());
            dob(other.getDob());
            address(other.getAddress());
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
        public EmailStage lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        @JsonSetter("email")
        public PhoneNumberStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("phone_number")
        public GenderStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        @JsonSetter("gender")
        public DobStage gender(String gender) {
            this.gender = gender;
            return this;
        }

        @Override
        @JsonSetter("dob")
        public AddressStage dob(String dob) {
            this.dob = dob;
            return this;
        }

        @Override
        @JsonSetter("address")
        public _FinalStage address(Address address) {
            this.address = address;
            return this;
        }

        @Override
        public UserInfoCreateRequest build() {
            return new UserInfoCreateRequest(
                    firstName, lastName, email, phoneNumber, gender, dob, address, additionalProperties);
        }
    }
}