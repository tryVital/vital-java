package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PhysicianCreateRequestBase.Builder.class)
public final class PhysicianCreateRequestBase {
    private final String firstName;

    private final String lastName;

    private final Optional<String> email;

    private final String npi;

    private final Optional<List<String>> licensedStates;

    private PhysicianCreateRequestBase(
            String firstName,
            String lastName,
            Optional<String> email,
            String npi,
            Optional<List<String>> licensedStates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.npi = npi;
        this.licensedStates = licensedStates;
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
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("npi")
    public String getNpi() {
        return npi;
    }

    @JsonProperty("licensed_states")
    public Optional<List<String>> getLicensedStates() {
        return licensedStates;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhysicianCreateRequestBase && equalTo((PhysicianCreateRequestBase) other);
    }

    private boolean equalTo(PhysicianCreateRequestBase other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && email.equals(other.email)
                && npi.equals(other.npi)
                && licensedStates.equals(other.licensedStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.email, this.npi, this.licensedStates);
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

        Builder from(PhysicianCreateRequestBase other);
    }

    public interface LastNameStage {
        NpiStage lastName(String lastName);
    }

    public interface NpiStage {
        _FinalStage npi(String npi);
    }

    public interface _FinalStage {
        PhysicianCreateRequestBase build();

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);

        _FinalStage licensedStates(Optional<List<String>> licensedStates);

        _FinalStage licensedStates(List<String> licensedStates);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FirstNameStage, LastNameStage, NpiStage, _FinalStage {
        private String firstName;

        private String lastName;

        private String npi;

        private Optional<List<String>> licensedStates = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PhysicianCreateRequestBase other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            email(other.getEmail());
            npi(other.getNpi());
            licensedStates(other.getLicensedStates());
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
        public NpiStage lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        @JsonSetter("npi")
        public _FinalStage npi(String npi) {
            this.npi = npi;
            return this;
        }

        @Override
        public _FinalStage licensedStates(List<String> licensedStates) {
            this.licensedStates = Optional.of(licensedStates);
            return this;
        }

        @Override
        @JsonSetter(value = "licensed_states", nulls = Nulls.SKIP)
        public _FinalStage licensedStates(Optional<List<String>> licensedStates) {
            this.licensedStates = licensedStates;
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
        public PhysicianCreateRequestBase build() {
            return new PhysicianCreateRequestBase(firstName, lastName, email, npi, licensedStates);
        }
    }
}
