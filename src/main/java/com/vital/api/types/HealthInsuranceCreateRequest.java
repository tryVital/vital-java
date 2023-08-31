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
@JsonDeserialize(builder = HealthInsuranceCreateRequest.Builder.class)
public final class HealthInsuranceCreateRequest {
    private final Optional<HealthInsuranceCreateRequestFrontImage> frontImage;

    private final Optional<HealthInsuranceCreateRequestBackImage> backImage;

    private final Optional<HealthInsuranceCreateRequestPatientSignatureImage> patientSignatureImage;

    private final Optional<String> subjective;

    private final Optional<String> assessmentPlan;

    private final Optional<String> payorCode;

    private final Optional<String> insuranceId;

    private final Optional<ResponsibleRelationship> responsibleRelationship;

    private final Optional<PersonDetails> responsibleDetails;

    private final Optional<List<String>> diagnosisCodes;

    private HealthInsuranceCreateRequest(
            Optional<HealthInsuranceCreateRequestFrontImage> frontImage,
            Optional<HealthInsuranceCreateRequestBackImage> backImage,
            Optional<HealthInsuranceCreateRequestPatientSignatureImage> patientSignatureImage,
            Optional<String> subjective,
            Optional<String> assessmentPlan,
            Optional<String> payorCode,
            Optional<String> insuranceId,
            Optional<ResponsibleRelationship> responsibleRelationship,
            Optional<PersonDetails> responsibleDetails,
            Optional<List<String>> diagnosisCodes) {
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.patientSignatureImage = patientSignatureImage;
        this.subjective = subjective;
        this.assessmentPlan = assessmentPlan;
        this.payorCode = payorCode;
        this.insuranceId = insuranceId;
        this.responsibleRelationship = responsibleRelationship;
        this.responsibleDetails = responsibleDetails;
        this.diagnosisCodes = diagnosisCodes;
    }

    /**
     * @return An image of the front of the patient insurance card.
     */
    @JsonProperty("front_image")
    public Optional<HealthInsuranceCreateRequestFrontImage> getFrontImage() {
        return frontImage;
    }

    /**
     * @return An image of the back of the patient insurance card.
     */
    @JsonProperty("back_image")
    public Optional<HealthInsuranceCreateRequestBackImage> getBackImage() {
        return backImage;
    }

    /**
     * @return An image of the patient signature for health insurance billing.
     */
    @JsonProperty("patient_signature_image")
    public Optional<HealthInsuranceCreateRequestPatientSignatureImage> getPatientSignatureImage() {
        return patientSignatureImage;
    }

    /**
     * @return Textual description of what are the patient symptoms and attempted treatments.
     */
    @JsonProperty("subjective")
    public Optional<String> getSubjective() {
        return subjective;
    }

    /**
     * @return Textual description of what are the physician assessments and testing plans.
     */
    @JsonProperty("assessment_plan")
    public Optional<String> getAssessmentPlan() {
        return assessmentPlan;
    }

    /**
     * @return Unique identifier representing a specific Health Insurance.
     */
    @JsonProperty("payor_code")
    public Optional<String> getPayorCode() {
        return payorCode;
    }

    /**
     * @return Insurance unique number assigned to a patient, usually present on the insurance card.
     */
    @JsonProperty("insurance_id")
    public Optional<String> getInsuranceId() {
        return insuranceId;
    }

    /**
     * @return Relationship between the patient and the insurance contractor. Values can be (Self, Spouse, Other Relationship).
     */
    @JsonProperty("responsible_relationship")
    public Optional<ResponsibleRelationship> getResponsibleRelationship() {
        return responsibleRelationship;
    }

    /**
     * @return Responsible details when the value of responsible_relationship is not 'Self'.
     */
    @JsonProperty("responsible_details")
    public Optional<PersonDetails> getResponsibleDetails() {
        return responsibleDetails;
    }

    /**
     * @return Diagnosis codes for insurance billing.
     */
    @JsonProperty("diagnosis_codes")
    public Optional<List<String>> getDiagnosisCodes() {
        return diagnosisCodes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthInsuranceCreateRequest && equalTo((HealthInsuranceCreateRequest) other);
    }

    private boolean equalTo(HealthInsuranceCreateRequest other) {
        return frontImage.equals(other.frontImage)
                && backImage.equals(other.backImage)
                && patientSignatureImage.equals(other.patientSignatureImage)
                && subjective.equals(other.subjective)
                && assessmentPlan.equals(other.assessmentPlan)
                && payorCode.equals(other.payorCode)
                && insuranceId.equals(other.insuranceId)
                && responsibleRelationship.equals(other.responsibleRelationship)
                && responsibleDetails.equals(other.responsibleDetails)
                && diagnosisCodes.equals(other.diagnosisCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.frontImage,
                this.backImage,
                this.patientSignatureImage,
                this.subjective,
                this.assessmentPlan,
                this.payorCode,
                this.insuranceId,
                this.responsibleRelationship,
                this.responsibleDetails,
                this.diagnosisCodes);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<HealthInsuranceCreateRequestFrontImage> frontImage = Optional.empty();

        private Optional<HealthInsuranceCreateRequestBackImage> backImage = Optional.empty();

        private Optional<HealthInsuranceCreateRequestPatientSignatureImage> patientSignatureImage = Optional.empty();

        private Optional<String> subjective = Optional.empty();

        private Optional<String> assessmentPlan = Optional.empty();

        private Optional<String> payorCode = Optional.empty();

        private Optional<String> insuranceId = Optional.empty();

        private Optional<ResponsibleRelationship> responsibleRelationship = Optional.empty();

        private Optional<PersonDetails> responsibleDetails = Optional.empty();

        private Optional<List<String>> diagnosisCodes = Optional.empty();

        private Builder() {}

        public Builder from(HealthInsuranceCreateRequest other) {
            frontImage(other.getFrontImage());
            backImage(other.getBackImage());
            patientSignatureImage(other.getPatientSignatureImage());
            subjective(other.getSubjective());
            assessmentPlan(other.getAssessmentPlan());
            payorCode(other.getPayorCode());
            insuranceId(other.getInsuranceId());
            responsibleRelationship(other.getResponsibleRelationship());
            responsibleDetails(other.getResponsibleDetails());
            diagnosisCodes(other.getDiagnosisCodes());
            return this;
        }

        @JsonSetter(value = "front_image", nulls = Nulls.SKIP)
        public Builder frontImage(Optional<HealthInsuranceCreateRequestFrontImage> frontImage) {
            this.frontImage = frontImage;
            return this;
        }

        public Builder frontImage(HealthInsuranceCreateRequestFrontImage frontImage) {
            this.frontImage = Optional.of(frontImage);
            return this;
        }

        @JsonSetter(value = "back_image", nulls = Nulls.SKIP)
        public Builder backImage(Optional<HealthInsuranceCreateRequestBackImage> backImage) {
            this.backImage = backImage;
            return this;
        }

        public Builder backImage(HealthInsuranceCreateRequestBackImage backImage) {
            this.backImage = Optional.of(backImage);
            return this;
        }

        @JsonSetter(value = "patient_signature_image", nulls = Nulls.SKIP)
        public Builder patientSignatureImage(
                Optional<HealthInsuranceCreateRequestPatientSignatureImage> patientSignatureImage) {
            this.patientSignatureImage = patientSignatureImage;
            return this;
        }

        public Builder patientSignatureImage(HealthInsuranceCreateRequestPatientSignatureImage patientSignatureImage) {
            this.patientSignatureImage = Optional.of(patientSignatureImage);
            return this;
        }

        @JsonSetter(value = "subjective", nulls = Nulls.SKIP)
        public Builder subjective(Optional<String> subjective) {
            this.subjective = subjective;
            return this;
        }

        public Builder subjective(String subjective) {
            this.subjective = Optional.of(subjective);
            return this;
        }

        @JsonSetter(value = "assessment_plan", nulls = Nulls.SKIP)
        public Builder assessmentPlan(Optional<String> assessmentPlan) {
            this.assessmentPlan = assessmentPlan;
            return this;
        }

        public Builder assessmentPlan(String assessmentPlan) {
            this.assessmentPlan = Optional.of(assessmentPlan);
            return this;
        }

        @JsonSetter(value = "payor_code", nulls = Nulls.SKIP)
        public Builder payorCode(Optional<String> payorCode) {
            this.payorCode = payorCode;
            return this;
        }

        public Builder payorCode(String payorCode) {
            this.payorCode = Optional.of(payorCode);
            return this;
        }

        @JsonSetter(value = "insurance_id", nulls = Nulls.SKIP)
        public Builder insuranceId(Optional<String> insuranceId) {
            this.insuranceId = insuranceId;
            return this;
        }

        public Builder insuranceId(String insuranceId) {
            this.insuranceId = Optional.of(insuranceId);
            return this;
        }

        @JsonSetter(value = "responsible_relationship", nulls = Nulls.SKIP)
        public Builder responsibleRelationship(Optional<ResponsibleRelationship> responsibleRelationship) {
            this.responsibleRelationship = responsibleRelationship;
            return this;
        }

        public Builder responsibleRelationship(ResponsibleRelationship responsibleRelationship) {
            this.responsibleRelationship = Optional.of(responsibleRelationship);
            return this;
        }

        @JsonSetter(value = "responsible_details", nulls = Nulls.SKIP)
        public Builder responsibleDetails(Optional<PersonDetails> responsibleDetails) {
            this.responsibleDetails = responsibleDetails;
            return this;
        }

        public Builder responsibleDetails(PersonDetails responsibleDetails) {
            this.responsibleDetails = Optional.of(responsibleDetails);
            return this;
        }

        @JsonSetter(value = "diagnosis_codes", nulls = Nulls.SKIP)
        public Builder diagnosisCodes(Optional<List<String>> diagnosisCodes) {
            this.diagnosisCodes = diagnosisCodes;
            return this;
        }

        public Builder diagnosisCodes(List<String> diagnosisCodes) {
            this.diagnosisCodes = Optional.of(diagnosisCodes);
            return this;
        }

        public HealthInsuranceCreateRequest build() {
            return new HealthInsuranceCreateRequest(
                    frontImage,
                    backImage,
                    patientSignatureImage,
                    subjective,
                    assessmentPlan,
                    payorCode,
                    insuranceId,
                    responsibleRelationship,
                    responsibleDetails,
                    diagnosisCodes);
        }
    }
}