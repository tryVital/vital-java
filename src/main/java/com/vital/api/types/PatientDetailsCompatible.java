package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PatientDetailsCompatible.Builder.class)
public final class PatientDetailsCompatible {
    private final Optional<String> firstName;

    private final Optional<String> lastName;

    private final OffsetDateTime dob;

    private final Gender gender;

    private final Optional<String> phoneNumber;

    private final Optional<String> email;

    private PatientDetailsCompatible(
            Optional<String> firstName,
            Optional<String> lastName,
            OffsetDateTime dob,
            Gender gender,
            Optional<String> phoneNumber,
            Optional<String> email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @JsonProperty("first_name")
    public Optional<String> getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public Optional<String> getLastName() {
        return lastName;
    }

    @JsonProperty("dob")
    public OffsetDateTime getDob() {
        return dob;
    }

    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("phone_number")
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PatientDetailsCompatible && equalTo((PatientDetailsCompatible) other);
    }

    private boolean equalTo(PatientDetailsCompatible other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && dob.equals(other.dob)
                && gender.equals(other.gender)
                && phoneNumber.equals(other.phoneNumber)
                && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.dob, this.gender, this.phoneNumber, this.email);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DobStage builder() {
        return new Builder();
    }

    public interface DobStage {
        GenderStage dob(OffsetDateTime dob);

        Builder from(PatientDetailsCompatible other);
    }

    public interface GenderStage {
        _FinalStage gender(Gender gender);
    }

    public interface _FinalStage {
        PatientDetailsCompatible build();

        _FinalStage firstName(Optional<String> firstName);

        _FinalStage firstName(String firstName);

        _FinalStage lastName(Optional<String> lastName);

        _FinalStage lastName(String lastName);

        _FinalStage phoneNumber(Optional<String> phoneNumber);

        _FinalStage phoneNumber(String phoneNumber);

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DobStage, GenderStage, _FinalStage {
        private OffsetDateTime dob;

        private Gender gender;

        private Optional<String> email = Optional.empty();

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<String> firstName = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PatientDetailsCompatible other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            dob(other.getDob());
            gender(other.getGender());
            phoneNumber(other.getPhoneNumber());
            email(other.getEmail());
            return this;
        }

        @Override
        @JsonSetter("dob")
        public GenderStage dob(OffsetDateTime dob) {
            this.dob = dob;
            return this;
        }

        @Override
        @JsonSetter("gender")
        public _FinalStage gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        @Override
        public _FinalStage email(String email) {
            this.email = Optional.of(email);
            return this;
        }

        @Override
        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public _FinalStage email(Optional<String> email) {
            this.email = email;
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
        public _FinalStage lastName(String lastName) {
            this.lastName = Optional.of(lastName);
            return this;
        }

        @Override
        @JsonSetter(value = "last_name", nulls = Nulls.SKIP)
        public _FinalStage lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public _FinalStage firstName(String firstName) {
            this.firstName = Optional.of(firstName);
            return this;
        }

        @Override
        @JsonSetter(value = "first_name", nulls = Nulls.SKIP)
        public _FinalStage firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public PatientDetailsCompatible build() {
            return new PatientDetailsCompatible(firstName, lastName, dob, gender, phoneNumber, email);
        }
    }
}
