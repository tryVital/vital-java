/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.testkit.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Consent;
import com.vital.api.types.HealthInsuranceCreateRequest;
import com.vital.api.types.PatientAddressCompatible;
import com.vital.api.types.PatientDetails;
import com.vital.api.types.PhysicianCreateRequestBase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RegisterTestkitRequest.Builder.class)
public final class RegisterTestkitRequest {
    private final Optional<String> userId;

    private final String sampleId;

    private final PatientDetails patientDetails;

    private final PatientAddressCompatible patientAddress;

    private final Optional<PhysicianCreateRequestBase> physician;

    private final Optional<HealthInsuranceCreateRequest> healthInsurance;

    private final Optional<List<Consent>> consents;

    private final Map<String, Object> additionalProperties;

    private RegisterTestkitRequest(
            Optional<String> userId,
            String sampleId,
            PatientDetails patientDetails,
            PatientAddressCompatible patientAddress,
            Optional<PhysicianCreateRequestBase> physician,
            Optional<HealthInsuranceCreateRequest> healthInsurance,
            Optional<List<Consent>> consents,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.sampleId = sampleId;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
        this.physician = physician;
        this.healthInsurance = healthInsurance;
        this.consents = consents;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The user ID of the patient.
     */
    @JsonProperty("user_id")
    public Optional<String> getUserId() {
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

    @JsonProperty("health_insurance")
    public Optional<HealthInsuranceCreateRequest> getHealthInsurance() {
        return healthInsurance;
    }

    @JsonProperty("consents")
    public Optional<List<Consent>> getConsents() {
        return consents;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RegisterTestkitRequest && equalTo((RegisterTestkitRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RegisterTestkitRequest other) {
        return userId.equals(other.userId)
                && sampleId.equals(other.sampleId)
                && patientDetails.equals(other.patientDetails)
                && patientAddress.equals(other.patientAddress)
                && physician.equals(other.physician)
                && healthInsurance.equals(other.healthInsurance)
                && consents.equals(other.consents);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.sampleId,
                this.patientDetails,
                this.patientAddress,
                this.physician,
                this.healthInsurance,
                this.consents);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SampleIdStage builder() {
        return new Builder();
    }

    public interface SampleIdStage {
        PatientDetailsStage sampleId(String sampleId);

        Builder from(RegisterTestkitRequest other);
    }

    public interface PatientDetailsStage {
        PatientAddressStage patientDetails(PatientDetails patientDetails);
    }

    public interface PatientAddressStage {
        _FinalStage patientAddress(PatientAddressCompatible patientAddress);
    }

    public interface _FinalStage {
        RegisterTestkitRequest build();

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage physician(Optional<PhysicianCreateRequestBase> physician);

        _FinalStage physician(PhysicianCreateRequestBase physician);

        _FinalStage healthInsurance(Optional<HealthInsuranceCreateRequest> healthInsurance);

        _FinalStage healthInsurance(HealthInsuranceCreateRequest healthInsurance);

        _FinalStage consents(Optional<List<Consent>> consents);

        _FinalStage consents(List<Consent> consents);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SampleIdStage, PatientDetailsStage, PatientAddressStage, _FinalStage {
        private String sampleId;

        private PatientDetails patientDetails;

        private PatientAddressCompatible patientAddress;

        private Optional<List<Consent>> consents = Optional.empty();

        private Optional<HealthInsuranceCreateRequest> healthInsurance = Optional.empty();

        private Optional<PhysicianCreateRequestBase> physician = Optional.empty();

        private Optional<String> userId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RegisterTestkitRequest other) {
            userId(other.getUserId());
            sampleId(other.getSampleId());
            patientDetails(other.getPatientDetails());
            patientAddress(other.getPatientAddress());
            physician(other.getPhysician());
            healthInsurance(other.getHealthInsurance());
            consents(other.getConsents());
            return this;
        }

        @java.lang.Override
        @JsonSetter("sample_id")
        public PatientDetailsStage sampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("patient_details")
        public PatientAddressStage patientDetails(PatientDetails patientDetails) {
            this.patientDetails = patientDetails;
            return this;
        }

        @java.lang.Override
        @JsonSetter("patient_address")
        public _FinalStage patientAddress(PatientAddressCompatible patientAddress) {
            this.patientAddress = patientAddress;
            return this;
        }

        @java.lang.Override
        public _FinalStage consents(List<Consent> consents) {
            this.consents = Optional.of(consents);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "consents", nulls = Nulls.SKIP)
        public _FinalStage consents(Optional<List<Consent>> consents) {
            this.consents = consents;
            return this;
        }

        @java.lang.Override
        public _FinalStage healthInsurance(HealthInsuranceCreateRequest healthInsurance) {
            this.healthInsurance = Optional.of(healthInsurance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "health_insurance", nulls = Nulls.SKIP)
        public _FinalStage healthInsurance(Optional<HealthInsuranceCreateRequest> healthInsurance) {
            this.healthInsurance = healthInsurance;
            return this;
        }

        @java.lang.Override
        public _FinalStage physician(PhysicianCreateRequestBase physician) {
            this.physician = Optional.of(physician);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "physician", nulls = Nulls.SKIP)
        public _FinalStage physician(Optional<PhysicianCreateRequestBase> physician) {
            this.physician = physician;
            return this;
        }

        /**
         * <p>The user ID of the patient.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userId(String userId) {
            this.userId = Optional.of(userId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user_id", nulls = Nulls.SKIP)
        public _FinalStage userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public RegisterTestkitRequest build() {
            return new RegisterTestkitRequest(
                    userId,
                    sampleId,
                    patientDetails,
                    patientAddress,
                    physician,
                    healthInsurance,
                    consents,
                    additionalProperties);
        }
    }
}
