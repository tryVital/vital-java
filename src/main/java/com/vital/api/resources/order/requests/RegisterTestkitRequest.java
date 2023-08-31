package com.vital.api.resources.order.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Consent;
import com.vital.api.types.PatientAddressCompatible;
import com.vital.api.types.PatientDetails;
import com.vital.api.types.PhysicianCreateRequestBase;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RegisterTestkitRequest.Builder.class)
public final class RegisterTestkitRequest {
    private final String userId;

    private final String sampleId;

    private final PatientDetails patientDetails;

    private final PatientAddressCompatible patientAddress;

    private final Optional<PhysicianCreateRequestBase> physician;

    private final Optional<List<Consent>> consents;

    private RegisterTestkitRequest(
            String userId,
            String sampleId,
            PatientDetails patientDetails,
            PatientAddressCompatible patientAddress,
            Optional<PhysicianCreateRequestBase> physician,
            Optional<List<Consent>> consents) {
        this.userId = userId;
        this.sampleId = sampleId;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
        this.physician = physician;
        this.consents = consents;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("sample_id")
    public String getSampleId() {
        return sampleId;
    }

    @JsonProperty("patient_details")
    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    @JsonProperty("patient_address")
    public PatientAddressCompatible getPatientAddress() {
        return patientAddress;
    }

    @JsonProperty("physician")
    public Optional<PhysicianCreateRequestBase> getPhysician() {
        return physician;
    }

    @JsonProperty("consents")
    public Optional<List<Consent>> getConsents() {
        return consents;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RegisterTestkitRequest && equalTo((RegisterTestkitRequest) other);
    }

    private boolean equalTo(RegisterTestkitRequest other) {
        return userId.equals(other.userId)
                && sampleId.equals(other.sampleId)
                && patientDetails.equals(other.patientDetails)
                && patientAddress.equals(other.patientAddress)
                && physician.equals(other.physician)
                && consents.equals(other.consents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId, this.sampleId, this.patientDetails, this.patientAddress, this.physician, this.consents);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        SampleIdStage userId(String userId);

        Builder from(RegisterTestkitRequest other);
    }

    public interface SampleIdStage {
        PatientDetailsStage sampleId(String sampleId);
    }

    public interface PatientDetailsStage {
        PatientAddressStage patientDetails(PatientDetails patientDetails);
    }

    public interface PatientAddressStage {
        _FinalStage patientAddress(PatientAddressCompatible patientAddress);
    }

    public interface _FinalStage {
        RegisterTestkitRequest build();

        _FinalStage physician(Optional<PhysicianCreateRequestBase> physician);

        _FinalStage physician(PhysicianCreateRequestBase physician);

        _FinalStage consents(Optional<List<Consent>> consents);

        _FinalStage consents(List<Consent> consents);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, SampleIdStage, PatientDetailsStage, PatientAddressStage, _FinalStage {
        private String userId;

        private String sampleId;

        private PatientDetails patientDetails;

        private PatientAddressCompatible patientAddress;

        private Optional<List<Consent>> consents = Optional.empty();

        private Optional<PhysicianCreateRequestBase> physician = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(RegisterTestkitRequest other) {
            userId(other.getUserId());
            sampleId(other.getSampleId());
            patientDetails(other.getPatientDetails());
            patientAddress(other.getPatientAddress());
            physician(other.getPhysician());
            consents(other.getConsents());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public SampleIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("sample_id")
        public PatientDetailsStage sampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }

        @Override
        @JsonSetter("patient_details")
        public PatientAddressStage patientDetails(PatientDetails patientDetails) {
            this.patientDetails = patientDetails;
            return this;
        }

        @Override
        @JsonSetter("patient_address")
        public _FinalStage patientAddress(PatientAddressCompatible patientAddress) {
            this.patientAddress = patientAddress;
            return this;
        }

        @Override
        public _FinalStage consents(List<Consent> consents) {
            this.consents = Optional.of(consents);
            return this;
        }

        @Override
        @JsonSetter(value = "consents", nulls = Nulls.SKIP)
        public _FinalStage consents(Optional<List<Consent>> consents) {
            this.consents = consents;
            return this;
        }

        @Override
        public _FinalStage physician(PhysicianCreateRequestBase physician) {
            this.physician = Optional.of(physician);
            return this;
        }

        @Override
        @JsonSetter(value = "physician", nulls = Nulls.SKIP)
        public _FinalStage physician(Optional<PhysicianCreateRequestBase> physician) {
            this.physician = physician;
            return this;
        }

        @Override
        public RegisterTestkitRequest build() {
            return new RegisterTestkitRequest(userId, sampleId, patientDetails, patientAddress, physician, consents);
        }
    }
}
