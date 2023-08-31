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
@JsonDeserialize(builder = ClientFacingTestkitOrder.Builder.class)
public final class ClientFacingTestkitOrder {
    private final String id;

    private final Optional<ClientFacingShipment> shipment;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private ClientFacingTestkitOrder(
            String id, Optional<ClientFacingShipment> shipment, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.shipment = shipment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The Vital TestKit Order ID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Shipment object
     */
    @JsonProperty("shipment")
    public Optional<ClientFacingShipment> getShipment() {
        return shipment;
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
        return other instanceof ClientFacingTestkitOrder && equalTo((ClientFacingTestkitOrder) other);
    }

    private boolean equalTo(ClientFacingTestkitOrder other) {
        return id.equals(other.id)
                && shipment.equals(other.shipment)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.shipment, this.createdAt, this.updatedAt);
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

        Builder from(ClientFacingTestkitOrder other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ClientFacingTestkitOrder build();

        _FinalStage shipment(Optional<ClientFacingShipment> shipment);

        _FinalStage shipment(ClientFacingShipment shipment);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<ClientFacingShipment> shipment = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingTestkitOrder other) {
            id(other.getId());
            shipment(other.getShipment());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>The Vital TestKit Order ID</p>
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

        /**
         * <p>Shipment object</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage shipment(ClientFacingShipment shipment) {
            this.shipment = Optional.of(shipment);
            return this;
        }

        @Override
        @JsonSetter(value = "shipment", nulls = Nulls.SKIP)
        public _FinalStage shipment(Optional<ClientFacingShipment> shipment) {
            this.shipment = shipment;
            return this;
        }

        @Override
        public ClientFacingTestkitOrder build() {
            return new ClientFacingTestkitOrder(id, shipment, createdAt, updatedAt);
        }
    }
}