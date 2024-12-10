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
import com.vital.api.types.Billing;
import com.vital.api.types.Consent;
import com.vital.api.types.HealthInsuranceCreateRequest;
import com.vital.api.types.LabTestCollectionMethod;
import com.vital.api.types.OrderSetRequest;
import com.vital.api.types.PatientAddressCompatible;
import com.vital.api.types.PatientDetailsWithValidation;
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

    private final Optional<String> labTestId;

    private final Optional<OrderSetRequest> orderSet;

    private final Optional<LabTestCollectionMethod> collectionMethod;

    private final Optional<PhysicianCreateRequest> physician;

    private final Optional<HealthInsuranceCreateRequest> healthInsurance;

    private final Optional<Boolean> priority;

    private final Optional<Billing> billingType;

    private final Optional<List<String>> icdCodes;

    private final Optional<List<Consent>> consents;

    private final Optional<String> activateBy;

    private final Optional<List<AoEAnswer>> aoeAnswers;

    private final Optional<String> passthrough;

    private final PatientDetailsWithValidation patientDetails;

    private final PatientAddressCompatible patientAddress;

    private final Map<String, Object> additionalProperties;

    private CreateOrderRequestCompatible(
            String userId,
            Optional<String> labTestId,
            Optional<OrderSetRequest> orderSet,
            Optional<LabTestCollectionMethod> collectionMethod,
            Optional<PhysicianCreateRequest> physician,
            Optional<HealthInsuranceCreateRequest> healthInsurance,
            Optional<Boolean> priority,
            Optional<Billing> billingType,
            Optional<List<String>> icdCodes,
            Optional<List<Consent>> consents,
            Optional<String> activateBy,
            Optional<List<AoEAnswer>> aoeAnswers,
            Optional<String> passthrough,
            PatientDetailsWithValidation patientDetails,
            PatientAddressCompatible patientAddress,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.labTestId = labTestId;
        this.orderSet = orderSet;
        this.collectionMethod = collectionMethod;
        this.physician = physician;
        this.healthInsurance = healthInsurance;
        this.priority = priority;
        this.billingType = billingType;
        this.icdCodes = icdCodes;
        this.consents = consents;
        this.activateBy = activateBy;
        this.aoeAnswers = aoeAnswers;
        this.passthrough = passthrough;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("lab_test_id")
    public Optional<String> getLabTestId() {
        return labTestId;
    }

    @JsonProperty("order_set")
    public Optional<OrderSetRequest> getOrderSet() {
        return orderSet;
    }

    @JsonProperty("collection_method")
    public Optional<LabTestCollectionMethod> getCollectionMethod() {
        return collectionMethod;
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

    @JsonProperty("billing_type")
    public Optional<Billing> getBillingType() {
        return billingType;
    }

    @JsonProperty("icd_codes")
    public Optional<List<String>> getIcdCodes() {
        return icdCodes;
    }

    @JsonProperty("consents")
    public Optional<List<Consent>> getConsents() {
        return consents;
    }

    /**
     * @return Schedule an Order to be processed in a future date.
     */
    @JsonProperty("activate_by")
    public Optional<String> getActivateBy() {
        return activateBy;
    }

    @JsonProperty("aoe_answers")
    public Optional<List<AoEAnswer>> getAoeAnswers() {
        return aoeAnswers;
    }

    @JsonProperty("passthrough")
    public Optional<String> getPassthrough() {
        return passthrough;
    }

    @JsonProperty("patient_details")
    public PatientDetailsWithValidation getPatientDetails() {
        return patientDetails;
    }

    @JsonProperty("patient_address")
    public PatientAddressCompatible getPatientAddress() {
        return patientAddress;
    }

    @java.lang.Override
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
                && orderSet.equals(other.orderSet)
                && collectionMethod.equals(other.collectionMethod)
                && physician.equals(other.physician)
                && healthInsurance.equals(other.healthInsurance)
                && priority.equals(other.priority)
                && billingType.equals(other.billingType)
                && icdCodes.equals(other.icdCodes)
                && consents.equals(other.consents)
                && activateBy.equals(other.activateBy)
                && aoeAnswers.equals(other.aoeAnswers)
                && passthrough.equals(other.passthrough)
                && patientDetails.equals(other.patientDetails)
                && patientAddress.equals(other.patientAddress);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.labTestId,
                this.orderSet,
                this.collectionMethod,
                this.physician,
                this.healthInsurance,
                this.priority,
                this.billingType,
                this.icdCodes,
                this.consents,
                this.activateBy,
                this.aoeAnswers,
                this.passthrough,
                this.patientDetails,
                this.patientAddress);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        PatientDetailsStage userId(String userId);

        Builder from(CreateOrderRequestCompatible other);
    }

    public interface PatientDetailsStage {
        PatientAddressStage patientDetails(PatientDetailsWithValidation patientDetails);
    }

    public interface PatientAddressStage {
        _FinalStage patientAddress(PatientAddressCompatible patientAddress);
    }

    public interface _FinalStage {
        CreateOrderRequestCompatible build();

        _FinalStage labTestId(Optional<String> labTestId);

        _FinalStage labTestId(String labTestId);

        _FinalStage orderSet(Optional<OrderSetRequest> orderSet);

        _FinalStage orderSet(OrderSetRequest orderSet);

        _FinalStage collectionMethod(Optional<LabTestCollectionMethod> collectionMethod);

        _FinalStage collectionMethod(LabTestCollectionMethod collectionMethod);

        _FinalStage physician(Optional<PhysicianCreateRequest> physician);

        _FinalStage physician(PhysicianCreateRequest physician);

        _FinalStage healthInsurance(Optional<HealthInsuranceCreateRequest> healthInsurance);

        _FinalStage healthInsurance(HealthInsuranceCreateRequest healthInsurance);

        _FinalStage priority(Optional<Boolean> priority);

        _FinalStage priority(Boolean priority);

        _FinalStage billingType(Optional<Billing> billingType);

        _FinalStage billingType(Billing billingType);

        _FinalStage icdCodes(Optional<List<String>> icdCodes);

        _FinalStage icdCodes(List<String> icdCodes);

        _FinalStage consents(Optional<List<Consent>> consents);

        _FinalStage consents(List<Consent> consents);

        _FinalStage activateBy(Optional<String> activateBy);

        _FinalStage activateBy(String activateBy);

        _FinalStage aoeAnswers(Optional<List<AoEAnswer>> aoeAnswers);

        _FinalStage aoeAnswers(List<AoEAnswer> aoeAnswers);

        _FinalStage passthrough(Optional<String> passthrough);

        _FinalStage passthrough(String passthrough);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, PatientDetailsStage, PatientAddressStage, _FinalStage {
        private String userId;

        private PatientDetailsWithValidation patientDetails;

        private PatientAddressCompatible patientAddress;

        private Optional<String> passthrough = Optional.empty();

        private Optional<List<AoEAnswer>> aoeAnswers = Optional.empty();

        private Optional<String> activateBy = Optional.empty();

        private Optional<List<Consent>> consents = Optional.empty();

        private Optional<List<String>> icdCodes = Optional.empty();

        private Optional<Billing> billingType = Optional.empty();

        private Optional<Boolean> priority = Optional.empty();

        private Optional<HealthInsuranceCreateRequest> healthInsurance = Optional.empty();

        private Optional<PhysicianCreateRequest> physician = Optional.empty();

        private Optional<LabTestCollectionMethod> collectionMethod = Optional.empty();

        private Optional<OrderSetRequest> orderSet = Optional.empty();

        private Optional<String> labTestId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateOrderRequestCompatible other) {
            userId(other.getUserId());
            labTestId(other.getLabTestId());
            orderSet(other.getOrderSet());
            collectionMethod(other.getCollectionMethod());
            physician(other.getPhysician());
            healthInsurance(other.getHealthInsurance());
            priority(other.getPriority());
            billingType(other.getBillingType());
            icdCodes(other.getIcdCodes());
            consents(other.getConsents());
            activateBy(other.getActivateBy());
            aoeAnswers(other.getAoeAnswers());
            passthrough(other.getPassthrough());
            patientDetails(other.getPatientDetails());
            patientAddress(other.getPatientAddress());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public PatientDetailsStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("patient_details")
        public PatientAddressStage patientDetails(PatientDetailsWithValidation patientDetails) {
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
        public _FinalStage passthrough(String passthrough) {
            this.passthrough = Optional.of(passthrough);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "passthrough", nulls = Nulls.SKIP)
        public _FinalStage passthrough(Optional<String> passthrough) {
            this.passthrough = passthrough;
            return this;
        }

        @java.lang.Override
        public _FinalStage aoeAnswers(List<AoEAnswer> aoeAnswers) {
            this.aoeAnswers = Optional.of(aoeAnswers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "aoe_answers", nulls = Nulls.SKIP)
        public _FinalStage aoeAnswers(Optional<List<AoEAnswer>> aoeAnswers) {
            this.aoeAnswers = aoeAnswers;
            return this;
        }

        /**
         * <p>Schedule an Order to be processed in a future date.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage activateBy(String activateBy) {
            this.activateBy = Optional.of(activateBy);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "activate_by", nulls = Nulls.SKIP)
        public _FinalStage activateBy(Optional<String> activateBy) {
            this.activateBy = activateBy;
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
        public _FinalStage icdCodes(List<String> icdCodes) {
            this.icdCodes = Optional.of(icdCodes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "icd_codes", nulls = Nulls.SKIP)
        public _FinalStage icdCodes(Optional<List<String>> icdCodes) {
            this.icdCodes = icdCodes;
            return this;
        }

        @java.lang.Override
        public _FinalStage billingType(Billing billingType) {
            this.billingType = Optional.of(billingType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "billing_type", nulls = Nulls.SKIP)
        public _FinalStage billingType(Optional<Billing> billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * <p>Defines whether order is priority or not. For some labs, this refers to a STAT order.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage priority(Boolean priority) {
            this.priority = Optional.of(priority);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "priority", nulls = Nulls.SKIP)
        public _FinalStage priority(Optional<Boolean> priority) {
            this.priority = priority;
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
        public _FinalStage physician(PhysicianCreateRequest physician) {
            this.physician = Optional.of(physician);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "physician", nulls = Nulls.SKIP)
        public _FinalStage physician(Optional<PhysicianCreateRequest> physician) {
            this.physician = physician;
            return this;
        }

        @java.lang.Override
        public _FinalStage collectionMethod(LabTestCollectionMethod collectionMethod) {
            this.collectionMethod = Optional.of(collectionMethod);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "collection_method", nulls = Nulls.SKIP)
        public _FinalStage collectionMethod(Optional<LabTestCollectionMethod> collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
        }

        @java.lang.Override
        public _FinalStage orderSet(OrderSetRequest orderSet) {
            this.orderSet = Optional.of(orderSet);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "order_set", nulls = Nulls.SKIP)
        public _FinalStage orderSet(Optional<OrderSetRequest> orderSet) {
            this.orderSet = orderSet;
            return this;
        }

        @java.lang.Override
        public _FinalStage labTestId(String labTestId) {
            this.labTestId = Optional.of(labTestId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lab_test_id", nulls = Nulls.SKIP)
        public _FinalStage labTestId(Optional<String> labTestId) {
            this.labTestId = labTestId;
            return this;
        }

        @java.lang.Override
        public CreateOrderRequestCompatible build() {
            return new CreateOrderRequestCompatible(
                    userId,
                    labTestId,
                    orderSet,
                    collectionMethod,
                    physician,
                    healthInsurance,
                    priority,
                    billingType,
                    icdCodes,
                    consents,
                    activateBy,
                    aoeAnswers,
                    passthrough,
                    patientDetails,
                    patientAddress,
                    additionalProperties);
        }
    }
}
