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
@JsonDeserialize(builder = ClientFacingAtHomePhlebotomyOrder.Builder.class)
public final class ClientFacingAtHomePhlebotomyOrder {
    private final String id;

    private final Optional<String> appointmentId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private ClientFacingAtHomePhlebotomyOrder(
            String id, Optional<String> appointmentId, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.appointmentId = appointmentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The Vital at-home phlebotomy Order ID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("appointment_id")
    public Optional<String> getAppointmentId() {
        return appointmentId;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingAtHomePhlebotomyOrder && equalTo((ClientFacingAtHomePhlebotomyOrder) other);
    }

    private boolean equalTo(ClientFacingAtHomePhlebotomyOrder other) {
        return id.equals(other.id)
                && appointmentId.equals(other.appointmentId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.appointmentId, this.createdAt, this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        CreatedAtStage id(String id);

        Builder from(ClientFacingAtHomePhlebotomyOrder other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ClientFacingAtHomePhlebotomyOrder build();

        _FinalStage appointmentId(Optional<String> appointmentId);

        _FinalStage appointmentId(String appointmentId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<String> appointmentId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingAtHomePhlebotomyOrder other) {
            id(other.getId());
            appointmentId(other.getAppointmentId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>The Vital at-home phlebotomy Order ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("updated_at")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage appointmentId(String appointmentId) {
            this.appointmentId = Optional.of(appointmentId);
            return this;
        }

        @Override
        @JsonSetter(value = "appointment_id", nulls = Nulls.SKIP)
        public _FinalStage appointmentId(Optional<String> appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        @Override
        public ClientFacingAtHomePhlebotomyOrder build() {
            return new ClientFacingAtHomePhlebotomyOrder(id, appointmentId, createdAt, updatedAt);
        }
    }
}