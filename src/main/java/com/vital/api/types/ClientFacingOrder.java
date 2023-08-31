package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingOrder.Builder.class)
public final class ClientFacingOrder {
    private final String userId;

    private final String id;

    private final String teamId;

    private final Optional<ClientFacingPatientDetailsCompatible> patientDetails;

    private final Optional<PatientAddressCompatible> patientAddress;

    private final ClientFacingLabTest labTest;

    private final ClientFacingOrderDetails details;

    private final Optional<String> sampleId;

    private final Optional<String> notes;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final List<ClientFacingOrderEvent> events;

    private final Optional<OrderTopLevelStatus> status;

    private final Optional<PhysicianClientFacing> physician;

    private final Optional<String> healthInsuranceId;

    private final Optional<String> requisitionFormUrl;

    private final Optional<Boolean> priority;

    private final Optional<ShippingAddress> shippingDetails;

    private ClientFacingOrder(
            String userId,
            String id,
            String teamId,
            Optional<ClientFacingPatientDetailsCompatible> patientDetails,
            Optional<PatientAddressCompatible> patientAddress,
            ClientFacingLabTest labTest,
            ClientFacingOrderDetails details,
            Optional<String> sampleId,
            Optional<String> notes,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            List<ClientFacingOrderEvent> events,
            Optional<OrderTopLevelStatus> status,
            Optional<PhysicianClientFacing> physician,
            Optional<String> healthInsuranceId,
            Optional<String> requisitionFormUrl,
            Optional<Boolean> priority,
            Optional<ShippingAddress> shippingDetails) {
        this.userId = userId;
        this.id = id;
        this.teamId = teamId;
        this.patientDetails = patientDetails;
        this.patientAddress = patientAddress;
        this.labTest = labTest;
        this.details = details;
        this.sampleId = sampleId;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.events = events;
        this.status = status;
        this.physician = physician;
        this.healthInsuranceId = healthInsuranceId;
        this.requisitionFormUrl = requisitionFormUrl;
        this.priority = priority;
        this.shippingDetails = shippingDetails;
    }

    /**
     * @return User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * @return The Vital Order ID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Your team id.
     */
    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    /**
     * @return Patient Details
     */
    @JsonProperty("patient_details")
    public Optional<ClientFacingPatientDetailsCompatible> getPatientDetails() {
        return patientDetails;
    }

    /**
     * @return Patient Address
     */
    @JsonProperty("patient_address")
    public Optional<PatientAddressCompatible> getPatientAddress() {
        return patientAddress;
    }

    /**
     * @return The Vital Test associated with the order
     */
    @JsonProperty("lab_test")
    public ClientFacingLabTest getLabTest() {
        return labTest;
    }

    @JsonProperty("details")
    public ClientFacingOrderDetails getDetails() {
        return details;
    }

    /**
     * @return Sample ID
     */
    @JsonProperty("sample_id")
    public Optional<String> getSampleId() {
        return sampleId;
    }

    /**
     * @return Notes associated with the order
     */
    @JsonProperty("notes")
    public Optional<String> getNotes() {
        return notes;
    }

    /**
     * @return When your order was created
     */
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return When your order was last updated
     */
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("events")
    public List<ClientFacingOrderEvent> getEvents() {
        return events;
    }

    @JsonProperty("status")
    public Optional<OrderTopLevelStatus> getStatus() {
        return status;
    }

    @JsonProperty("physician")
    public Optional<PhysicianClientFacing> getPhysician() {
        return physician;
    }

    /**
     * @return Vital ID of the health insurance.
     */
    @JsonProperty("health_insurance_id")
    public Optional<String> getHealthInsuranceId() {
        return healthInsuranceId;
    }

    /**
     * @return DEPRECATED. Requistion form url.
     */
    @JsonProperty("requisition_form_url")
    public Optional<String> getRequisitionFormUrl() {
        return requisitionFormUrl;
    }

    /**
     * @return Defines whether order is priority or not. Only available for Labcorp. For Labcorp, this corresponds to a STAT order.
     */
    @JsonProperty("priority")
    public Optional<Boolean> getPriority() {
        return priority;
    }

    /**
     * @return Shipping Details. For unregistered testkit orders.
     */
    @JsonProperty("shipping_details")
    public Optional<ShippingAddress> getShippingDetails() {
        return shippingDetails;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingOrder && equalTo((ClientFacingOrder) other);
    }

    private boolean equalTo(ClientFacingOrder other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && teamId.equals(other.teamId)
                && patientDetails.equals(other.patientDetails)
                && patientAddress.equals(other.patientAddress)
                && labTest.equals(other.labTest)
                && details.equals(other.details)
                && sampleId.equals(other.sampleId)
                && notes.equals(other.notes)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && events.equals(other.events)
                && status.equals(other.status)
                && physician.equals(other.physician)
                && healthInsuranceId.equals(other.healthInsuranceId)
                && requisitionFormUrl.equals(other.requisitionFormUrl)
                && priority.equals(other.priority)
                && shippingDetails.equals(other.shippingDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.id,
                this.teamId,
                this.patientDetails,
                this.patientAddress,
                this.labTest,
                this.details,
                this.sampleId,
                this.notes,
                this.createdAt,
                this.updatedAt,
                this.events,
                this.status,
                this.physician,
                this.healthInsuranceId,
                this.requisitionFormUrl,
                this.priority,
                this.shippingDetails);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        IdStage userId(String userId);

        Builder from(ClientFacingOrder other);
    }

    public interface IdStage {
        TeamIdStage id(String id);
    }

    public interface TeamIdStage {
        LabTestStage teamId(String teamId);
    }

    public interface LabTestStage {
        DetailsStage labTest(ClientFacingLabTest labTest);
    }

    public interface DetailsStage {
        CreatedAtStage details(ClientFacingOrderDetails details);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ClientFacingOrder build();

        _FinalStage patientDetails(Optional<ClientFacingPatientDetailsCompatible> patientDetails);

        _FinalStage patientDetails(ClientFacingPatientDetailsCompatible patientDetails);

        _FinalStage patientAddress(Optional<PatientAddressCompatible> patientAddress);

        _FinalStage patientAddress(PatientAddressCompatible patientAddress);

        _FinalStage sampleId(Optional<String> sampleId);

        _FinalStage sampleId(String sampleId);

        _FinalStage notes(Optional<String> notes);

        _FinalStage notes(String notes);

        _FinalStage events(List<ClientFacingOrderEvent> events);

        _FinalStage addEvents(ClientFacingOrderEvent events);

        _FinalStage addAllEvents(List<ClientFacingOrderEvent> events);

        _FinalStage status(Optional<OrderTopLevelStatus> status);

        _FinalStage status(OrderTopLevelStatus status);

        _FinalStage physician(Optional<PhysicianClientFacing> physician);

        _FinalStage physician(PhysicianClientFacing physician);

        _FinalStage healthInsuranceId(Optional<String> healthInsuranceId);

        _FinalStage healthInsuranceId(String healthInsuranceId);

        _FinalStage requisitionFormUrl(Optional<String> requisitionFormUrl);

        _FinalStage requisitionFormUrl(String requisitionFormUrl);

        _FinalStage priority(Optional<Boolean> priority);

        _FinalStage priority(Boolean priority);

        _FinalStage shippingDetails(Optional<ShippingAddress> shippingDetails);

        _FinalStage shippingDetails(ShippingAddress shippingDetails);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage,
                    IdStage,
                    TeamIdStage,
                    LabTestStage,
                    DetailsStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String userId;

        private String id;

        private String teamId;

        private ClientFacingLabTest labTest;

        private ClientFacingOrderDetails details;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<ShippingAddress> shippingDetails = Optional.empty();

        private Optional<Boolean> priority = Optional.empty();

        private Optional<String> requisitionFormUrl = Optional.empty();

        private Optional<String> healthInsuranceId = Optional.empty();

        private Optional<PhysicianClientFacing> physician = Optional.empty();

        private Optional<OrderTopLevelStatus> status = Optional.empty();

        private List<ClientFacingOrderEvent> events = new ArrayList<>();

        private Optional<String> notes = Optional.empty();

        private Optional<String> sampleId = Optional.empty();

        private Optional<PatientAddressCompatible> patientAddress = Optional.empty();

        private Optional<ClientFacingPatientDetailsCompatible> patientDetails = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingOrder other) {
            userId(other.getUserId());
            id(other.getId());
            teamId(other.getTeamId());
            patientDetails(other.getPatientDetails());
            patientAddress(other.getPatientAddress());
            labTest(other.getLabTest());
            details(other.getDetails());
            sampleId(other.getSampleId());
            notes(other.getNotes());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            events(other.getEvents());
            status(other.getStatus());
            physician(other.getPhysician());
            healthInsuranceId(other.getHealthInsuranceId());
            requisitionFormUrl(other.getRequisitionFormUrl());
            priority(other.getPriority());
            shippingDetails(other.getShippingDetails());
            return this;
        }

        /**
         * <p>User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_id")
        public IdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The Vital Order ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public TeamIdStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Your team id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("team_id")
        public LabTestStage teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        /**
         * <p>The Vital Test associated with the order</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("lab_test")
        public DetailsStage labTest(ClientFacingLabTest labTest) {
            this.labTest = labTest;
            return this;
        }

        @Override
        @JsonSetter("details")
        public CreatedAtStage details(ClientFacingOrderDetails details) {
            this.details = details;
            return this;
        }

        /**
         * <p>When your order was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("created_at")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>When your order was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updated_at")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Shipping Details. For unregistered testkit orders.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage shippingDetails(ShippingAddress shippingDetails) {
            this.shippingDetails = Optional.of(shippingDetails);
            return this;
        }

        @Override
        @JsonSetter(value = "shipping_details", nulls = Nulls.SKIP)
        public _FinalStage shippingDetails(Optional<ShippingAddress> shippingDetails) {
            this.shippingDetails = shippingDetails;
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

        /**
         * <p>DEPRECATED. Requistion form url.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage requisitionFormUrl(String requisitionFormUrl) {
            this.requisitionFormUrl = Optional.of(requisitionFormUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "requisition_form_url", nulls = Nulls.SKIP)
        public _FinalStage requisitionFormUrl(Optional<String> requisitionFormUrl) {
            this.requisitionFormUrl = requisitionFormUrl;
            return this;
        }

        /**
         * <p>Vital ID of the health insurance.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage healthInsuranceId(String healthInsuranceId) {
            this.healthInsuranceId = Optional.of(healthInsuranceId);
            return this;
        }

        @Override
        @JsonSetter(value = "health_insurance_id", nulls = Nulls.SKIP)
        public _FinalStage healthInsuranceId(Optional<String> healthInsuranceId) {
            this.healthInsuranceId = healthInsuranceId;
            return this;
        }

        @Override
        public _FinalStage physician(PhysicianClientFacing physician) {
            this.physician = Optional.of(physician);
            return this;
        }

        @Override
        @JsonSetter(value = "physician", nulls = Nulls.SKIP)
        public _FinalStage physician(Optional<PhysicianClientFacing> physician) {
            this.physician = physician;
            return this;
        }

        @Override
        public _FinalStage status(OrderTopLevelStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @Override
        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public _FinalStage status(Optional<OrderTopLevelStatus> status) {
            this.status = status;
            return this;
        }

        @Override
        public _FinalStage addAllEvents(List<ClientFacingOrderEvent> events) {
            this.events.addAll(events);
            return this;
        }

        @Override
        public _FinalStage addEvents(ClientFacingOrderEvent events) {
            this.events.add(events);
            return this;
        }

        @Override
        @JsonSetter(value = "events", nulls = Nulls.SKIP)
        public _FinalStage events(List<ClientFacingOrderEvent> events) {
            this.events.clear();
            this.events.addAll(events);
            return this;
        }

        /**
         * <p>Notes associated with the order</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage notes(String notes) {
            this.notes = Optional.of(notes);
            return this;
        }

        @Override
        @JsonSetter(value = "notes", nulls = Nulls.SKIP)
        public _FinalStage notes(Optional<String> notes) {
            this.notes = notes;
            return this;
        }

        /**
         * <p>Sample ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage sampleId(String sampleId) {
            this.sampleId = Optional.of(sampleId);
            return this;
        }

        @Override
        @JsonSetter(value = "sample_id", nulls = Nulls.SKIP)
        public _FinalStage sampleId(Optional<String> sampleId) {
            this.sampleId = sampleId;
            return this;
        }

        /**
         * <p>Patient Address</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage patientAddress(PatientAddressCompatible patientAddress) {
            this.patientAddress = Optional.of(patientAddress);
            return this;
        }

        @Override
        @JsonSetter(value = "patient_address", nulls = Nulls.SKIP)
        public _FinalStage patientAddress(Optional<PatientAddressCompatible> patientAddress) {
            this.patientAddress = patientAddress;
            return this;
        }

        /**
         * <p>Patient Details</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage patientDetails(ClientFacingPatientDetailsCompatible patientDetails) {
            this.patientDetails = Optional.of(patientDetails);
            return this;
        }

        @Override
        @JsonSetter(value = "patient_details", nulls = Nulls.SKIP)
        public _FinalStage patientDetails(Optional<ClientFacingPatientDetailsCompatible> patientDetails) {
            this.patientDetails = patientDetails;
            return this;
        }

        @Override
        public ClientFacingOrder build() {
            return new ClientFacingOrder(
                    userId,
                    id,
                    teamId,
                    patientDetails,
                    patientAddress,
                    labTest,
                    details,
                    sampleId,
                    notes,
                    createdAt,
                    updatedAt,
                    events,
                    status,
                    physician,
                    healthInsuranceId,
                    requisitionFormUrl,
                    priority,
                    shippingDetails);
        }
    }
}
