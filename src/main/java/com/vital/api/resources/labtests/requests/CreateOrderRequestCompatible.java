/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.AoEAnswer;
import com.vital.api.types.Consent;
import com.vital.api.types.HealthInsuranceCreateRequest;
import com.vital.api.types.PatientAddressCompatibleInput;
import com.vital.api.types.PatientDetails;
import com.vital.api.types.PhysicianCreateRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    private final Optional<String> activateBy;

    private final Optional<List<AoEAnswer>> aoeAnswers;

    private final PatientDetails patientDetails;

    private final PatientAddressCompatibleInput patientAddress;

    private final Map<String, Object> additionalProperties;

    private CreateOrderRequestCompatible(
            String userId,
            String labTestId,
            Optional<PhysicianCreateRequest> physician,
            Optional<HealthInsuranceCreateRequest> healthInsurance,
            Optional<Boolean> priority,
            Optional<List<Consent>> consents,
            Optional<String> activateBy,
            Optional<List<AoEAnswer>> aoeAnswers,
            PatientDetails patientDetails,
            PatientAddressCompatibleInput patientAddress,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.labTestId = labTestId;
        this.physician = physician;
        this.healthInsurance = healthInsurance;
        this.priority = priority;
        this.consents = consents;
        this.activateBy = activateBy;
        this.aoeAnswers = aoeAnswers;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
        this.additionalProperties = additionalProperties;
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
     * @return Defines whether order is priority or not. For some labs, this refers to a STAT order.
     */
    @JsonProperty("priority")
    public Optional<Boolean> getPriority() {
        return priority;
    }

    @JsonProperty("consents")
    public Optional<List<Consent>> getConsents() {
        return consents;
    }

    @JsonProperty("activate_by")
    public Optional<String> getActivateBy() {
        return activateBy;
    }

    @JsonProperty("aoe_answers")
    public Optional<List<AoEAnswer>> getAoeAnswers() {
        return aoeAnswers;
    }

    @JsonProperty("patient_details")
    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    @JsonProperty("patient_address")
    public PatientAddressCompatibleInput getPatientAddress() {
        return patientAddress;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateOrderRequestCompatible && equalTo((CreateOrderRequestCompatible) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateOrderRequestCompatible other) {
        return userId.equals(other.userId)
                && labTestId.equals(other.labTestId)
                && physician.equals(other.physician)
                && healthInsurance.equals(other.healthInsurance)
                && priority.equals(other.priority)
                && consents.equals(other.consents)
                && activateBy.equals(other.activateBy)
                && aoeAnswers.equals(other.aoeAnswers)
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
                this.activateBy,
                this.aoeAnswers,
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
        PatientAddressStage patientDetails(PatientDetails patientDetails);
    }

    public interface PatientAddressStage {
        _FinalStage patientAddress(PatientAddressCompatibleInput patientAddress);
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

        _FinalStage activateBy(Optional<String> activateBy);

        _FinalStage activateBy(String activateBy);

        _FinalStage aoeAnswers(Optional<List<AoEAnswer>> aoeAnswers);

        _FinalStage aoeAnswers(List<AoEAnswer> aoeAnswers);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, LabTestIdStage, PatientDetailsStage, PatientAddressStage, _FinalStage {
        private String userId;

        private String labTestId;

        private PatientDetails patientDetails;

        private PatientAddressCompatibleInput patientAddress;

        private Optional<List<AoEAnswer>> aoeAnswers = Optional.empty();

        private Optional<String> activateBy = Optional.empty();

        private Optional<List<Consent>> consents = Optional.empty();

        private Optional<Boolean> priority = Optional.empty();

        private Optional<HealthInsuranceCreateRequest> healthInsurance = Optional.empty();

        private Optional<PhysicianCreateRequest> physician = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CreateOrderRequestCompatible other) {
            userId(other.getUserId());
            labTestId(other.getLabTestId());
            physician(other.getPhysician());
            healthInsurance(other.getHealthInsurance());
            priority(other.getPriority());
            consents(other.getConsents());
            activateBy(other.getActivateBy());
            aoeAnswers(other.getAoeAnswers());
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
        public PatientAddressStage patientDetails(PatientDetails patientDetails) {
            this.patientDetails = patientDetails;
            return this;
        }

        @Override
        @JsonSetter("patient_address")
        public _FinalStage patientAddress(PatientAddressCompatibleInput patientAddress) {
            this.patientAddress = patientAddress;
            return this;
        }

        @Override
        public _FinalStage aoeAnswers(List<AoEAnswer> aoeAnswers) {
            this.aoeAnswers = Optional.of(aoeAnswers);
            return this;
        }

        @Override
        @JsonSetter(value = "aoe_answers", nulls = Nulls.SKIP)
        public _FinalStage aoeAnswers(Optional<List<AoEAnswer>> aoeAnswers) {
            this.aoeAnswers = aoeAnswers;
            return this;
        }

        @Override
        public _FinalStage activateBy(String activateBy) {
            this.activateBy = Optional.of(activateBy);
            return this;
        }

        @Override
        @JsonSetter(value = "activate_by", nulls = Nulls.SKIP)
        public _FinalStage activateBy(Optional<String> activateBy) {
            this.activateBy = activateBy;
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
         * <p>Defines whether order is priority or not. For some labs, this refers to a STAT order.</p>
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
                    userId,
                    labTestId,
                    physician,
                    healthInsurance,
                    priority,
                    consents,
                    activateBy,
                    aoeAnswers,
                    patientDetails,
                    patientAddress,
                    additionalProperties);
        }
    }
}
