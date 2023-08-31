package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PhysicianClientFacing.Builder.class)
public final class PhysicianClientFacing {
    private final String firstName;

    private final String lastName;

    private final String npi;

    private PhysicianClientFacing(String firstName, String lastName, String npi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.npi = npi;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("npi")
    public String getNpi() {
        return npi;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhysicianClientFacing && equalTo((PhysicianClientFacing) other);
    }

    private boolean equalTo(PhysicianClientFacing other) {
        return firstName.equals(other.firstName) && lastName.equals(other.lastName) && npi.equals(other.npi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.npi);
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

        Builder from(PhysicianClientFacing other);
    }

    public interface LastNameStage {
        NpiStage lastName(String lastName);
    }

    public interface NpiStage {
        _FinalStage npi(String npi);
    }

    public interface _FinalStage {
        PhysicianClientFacing build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FirstNameStage, LastNameStage, NpiStage, _FinalStage {
        private String firstName;

        private String lastName;

        private String npi;

        private Builder() {}

        @Override
        public Builder from(PhysicianClientFacing other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            npi(other.getNpi());
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
        public PhysicianClientFacing build() {
            return new PhysicianClientFacing(firstName, lastName, npi);
        }
    }
}
