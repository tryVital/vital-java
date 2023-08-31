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
@JsonDeserialize(builder = PatientDetails.Builder.class)
public final class PatientDetails {
    private final String firstName;

    private final String lastName;

    private final OffsetDateTime dob;

    private final Gender gender;

    private final String phoneNumber;

    private final Optional<String> email;

    private PatientDetails(
            String firstName,
            String lastName,
            OffsetDateTime dob,
            Gender gender,
            String phoneNumber,
            Optional<String> email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>non-empty</code>&lt;/span&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>non-empty</code>&lt;/span&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
     */
    @JsonProperty("last_name")
    public String getLastName() {
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PatientDetails && equalTo((PatientDetails) other);
    }

    private boolean equalTo(PatientDetails other) {
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

    public static FirstNameStage builder() {
        return new Builder();
    }

    public interface FirstNameStage {
        LastNameStage firstName(String firstName);

        Builder from(PatientDetails other);
    }

    public interface LastNameStage {
        DobStage lastName(String lastName);
    }

    public interface DobStage {
        GenderStage dob(OffsetDateTime dob);
    }

    public interface GenderStage {
        PhoneNumberStage gender(Gender gender);
    }

    public interface PhoneNumberStage {
        _FinalStage phoneNumber(String phoneNumber);
    }

    public interface _FinalStage {
        PatientDetails build();

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FirstNameStage, LastNameStage, DobStage, GenderStage, PhoneNumberStage, _FinalStage {
        private String firstName;

        private String lastName;

        private OffsetDateTime dob;

        private Gender gender;

        private String phoneNumber;

        private Optional<String> email = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PatientDetails other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            dob(other.getDob());
            gender(other.getGender());
            phoneNumber(other.getPhoneNumber());
            email(other.getEmail());
            return this;
        }

        /**
         * <p>&lt;span style=&quot;white-space: nowrap&quot;&gt;<code>non-empty</code>&lt;/span&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("first_name")
        public LastNameStage firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * <p>&lt;span style=&quot;white-space: nowrap&quot;&gt;<code>non-empty</code>&lt;/span&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("last_name")
        public DobStage lastName(String lastName) {
            this.lastName = lastName;
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
        public PhoneNumberStage gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        @Override
        @JsonSetter("phone_number")
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
        public PatientDetails build() {
            return new PatientDetails(firstName, lastName, dob, gender, phoneNumber, email);
        }
    }
}
