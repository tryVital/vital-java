package com.vital.api.resources.labtests.requests;

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
import com.vital.api.types.PatientDetailsCompatible;
import com.vital.api.types.PhysicianCreateRequest;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateOrderRequestCompatible.Builder.class)
public final class CreateOrderRequestCompatible {
    private final String userId;

    private final String labTestId;

    private final Optional<PhysicianCreateRequest> physician;

    private final Optional<HealthInsuranceCreateRequest> healthInsurance;

    private final Optional<Boolean> priority;

    private final Optional<List<Consent>> consents;

    private final PatientDetailsCompatible patientDetails;

    private final PatientAddressCompatible patientAddress;

    private CreateOrderRequestCompatible(
            String userId,
            String labTestId,
            Optional<PhysicianCreateRequest> physician,
            Optional<HealthInsuranceCreateRequest> healthInsurance,
            Optional<Boolean> priority,
            Optional<List<Consent>> consents,
            PatientDetailsCompatible patientDetails,
            PatientAddressCompatible patientAddress) {
        this.userId = userId;
        this.labTestId = labTestId;
        this.physician = physician;
        this.healthInsurance = healthInsurance;
        this.priority = priority;
        this.consents = consents;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("lab_test_id")
    public String getLabTestId() {
        return labTestId;
    }

    @JsonProperty("physician")
    public Optional<PhysicianCreateRequest> getPhysician() {
        return physician;
    }

    @JsonProperty("health_insurance")
    public Optional<HealthInsuranceCreateRequest> getHealthInsurance() {
        return healthInsurance;
    }

    /**
     * @return Defines whether order is priority or not. Only available for Labcorp. For Labcorp, this corresponds to a STAT order.
     */
    @JsonProperty("priority")
    public Optional<Boolean> getPriority() {
        return priority;
    }

    @JsonProperty("consents")
    public Optional<List<Consent>> getConsents() {
        return consents;
    }

    @JsonProperty("patient_details")
    public PatientDetailsCompatible getPatientDetails() {
        return patientDetails;
    }

    @JsonProperty("patient_address")
    public PatientAddressCompatible getPatientAddress() {
        return patientAddress;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateOrderRequestCompatible && equalTo((CreateOrderRequestCompatible) other);
    }

    private boolean equalTo(CreateOrderRequestCompatible other) {
        return userId.equals(other.userId)
                && labTestId.equals(other.labTestId)
                && physician.equals(other.physician)
                && healthInsurance.equals(other.healthInsurance)
                && priority.equals(other.priority)
                && consents.equals(other.consents)
                && patientDetails.equals(other.patientDetails)
                && patientAddress.equals(other.patientAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.labTestId,
                this.physician,
                this.healthInsurance,
                this.priority,
                this.consents,
                this.patientDetails,
                this.patientAddress);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        LabTestIdStage userId(String userId);

        Builder from(CreateOrderRequestCompatible other);
    }

    public interface LabTestIdStage {
        PatientDetailsStage labTestId(String labTestId);
    }

    public interface PatientDetailsStage {
        PatientAddressStage patientDetails(PatientDetailsCompatible patientDetails);
    }

    public interface PatientAddressStage {
        _FinalStage patientAddress(PatientAddressCompatible patientAddress);
    }

    public interface _FinalStage {
        CreateOrderRequestCompatible build();

        _FinalStage physician(Optional<PhysicianCreateRequest> physician);

        _FinalStage physician(PhysicianCreateRequest physician);

        _FinalStage healthInsurance(Optional<HealthInsuranceCreateRequest> healthInsurance);

        _FinalStage healthInsurance(HealthInsuranceCreateRequest healthInsurance);

        _FinalStage priority(Optional<Boolean> priority);

        _FinalStage priority(Boolean priority);

        _FinalStage consents(Optional<List<Consent>> consents);

        _FinalStage consents(List<Consent> consents);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, LabTestIdStage, PatientDetailsStage, PatientAddressStage, _FinalStage {
        private String userId;

        private String labTestId;

        private PatientDetailsCompatible patientDetails;

        private PatientAddressCompatible patientAddress;

        private Optional<List<Consent>> consents = Optional.empty();

        private Optional<Boolean> priority = Optional.empty();

        private Optional<HealthInsuranceCreateRequest> healthInsurance = Optional.empty();

        private Optional<PhysicianCreateRequest> physician = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(CreateOrderRequestCompatible other) {
            userId(other.getUserId());
            labTestId(other.getLabTestId());
            physician(other.getPhysician());
            healthInsurance(other.getHealthInsurance());
            priority(other.getPriority());
            consents(other.getConsents());
            patientDetails(other.getPatientDetails());
            patientAddress(other.getPatientAddress());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public LabTestIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("lab_test_id")
        public PatientDetailsStage labTestId(String labTestId) {
            this.labTestId = labTestId;
            return this;
        }

        @Override
        @JsonSetter("patient_details")
        public PatientAddressStage patientDetails(PatientDetailsCompatible patientDetails) {
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

        /**
         * <p>Defines whether order is priority or not. Only available for Labcorp. For Labcorp, this corresponds to a STAT order.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage priority(Boolean priority) {
            this.priority = Optional.of(priority);
            return this;
        }

        @Override
        @JsonSetter(value = "priority", nulls = Nulls.SKIP)
        public _FinalStage priority(Optional<Boolean> priority) {
            this.priority = priority;
            return this;
        }

        @Override
        public _FinalStage healthInsurance(HealthInsuranceCreateRequest healthInsurance) {
            this.healthInsurance = Optional.of(healthInsurance);
            return this;
        }

        @Override
        @JsonSetter(value = "health_insurance", nulls = Nulls.SKIP)
        public _FinalStage healthInsurance(Optional<HealthInsuranceCreateRequest> healthInsurance) {
            this.healthInsurance = healthInsurance;
            return this;
        }

        @Override
        public _FinalStage physician(PhysicianCreateRequest physician) {
            this.physician = Optional.of(physician);
            return this;
        }

        @Override
        @JsonSetter(value = "physician", nulls = Nulls.SKIP)
        public _FinalStage physician(Optional<PhysicianCreateRequest> physician) {
            this.physician = physician;
            return this;
        }

        @Override
        public CreateOrderRequestCompatible build() {
            return new CreateOrderRequestCompatible(
                    userId, labTestId, physician, healthInsurance, priority, consents, patientDetails, patientAddress);
        }
    }
}