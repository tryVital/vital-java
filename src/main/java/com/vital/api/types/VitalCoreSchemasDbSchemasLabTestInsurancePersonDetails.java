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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails.Builder.class)
public final class VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails {
    private final String firstName;

    private final String lastName;

    private final Gender gender;

    private final Address address;

    private final String dob;

    private final String email;

    private final String phoneNumber;

    private final Map<String, Object> additionalProperties;

    private VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails(
            String firstName,
            String lastName,
            Gender gender,
            Address address,
            String dob,
            String email,
            String phoneNumber,
            Map<String, Object> additionalProperties) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails
                && equalTo((VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && gender.equals(other.gender)
                && address.equals(other.address)
                && dob.equals(other.dob)
                && email.equals(other.email)
                && phoneNumber.equals(other.phoneNumber);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.firstName, this.lastName, this.gender, this.address, this.dob, this.email, this.phoneNumber);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FirstNameStage builder() {
        return new Builder();
    }

    public interface FirstNameStage {
        LastNameStage firstName(String firstName);

        Builder from(VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails other);
    }

    public interface LastNameStage {
        GenderStage lastName(String lastName);
    }

    public interface GenderStage {
        AddressStage gender(Gender gender);
    }

    public interface AddressStage {
        DobStage address(Address address);
    }

    public interface DobStage {
        EmailStage dob(String dob);
    }

    public interface EmailStage {
        PhoneNumberStage email(String email);
    }

    public interface PhoneNumberStage {
        _FinalStage phoneNumber(String phoneNumber);
    }

    public interface _FinalStage {
        VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FirstNameStage,
                    LastNameStage,
                    GenderStage,
                    AddressStage,
                    DobStage,
                    EmailStage,
                    PhoneNumberStage,
                    _FinalStage {
        private String firstName;

        private String lastName;

        private Gender gender;

        private Address address;

        private String dob;

        private String email;

        private String phoneNumber;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            gender(other.getGender());
            address(other.getAddress());
            dob(other.getDob());
            email(other.getEmail());
            phoneNumber(other.getPhoneNumber());
            return this;
        }

        @java.lang.Override
        @JsonSetter("first_name")
        public LastNameStage firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("last_name")
        public GenderStage lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("gender")
        public AddressStage gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        @java.lang.Override
        @JsonSetter("address")
        public DobStage address(Address address) {
            this.address = address;
            return this;
        }

        @java.lang.Override
        @JsonSetter("dob")
        public EmailStage dob(String dob) {
            this.dob = dob;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public PhoneNumberStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        @JsonSetter("phone_number")
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        public VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails build() {
            return new VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails(
                    firstName, lastName, gender, address, dob, email, phoneNumber, additionalProperties);
        }
    }
}
