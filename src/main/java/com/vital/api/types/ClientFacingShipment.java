package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingShipment.Builder.class)
public final class ClientFacingShipment {
    private final String id;

    private final Optional<String> outboundTrackingNumber;

    private final Optional<String> outboundTrackingUrl;

    private final Optional<String> inboundTrackingNumber;

    private final Optional<String> inboundTrackingUrl;

    private final Optional<String> outboundCourier;

    private final Optional<String> inboundCourier;

    private final Optional<String> notes;

    private ClientFacingShipment(
            String id,
            Optional<String> outboundTrackingNumber,
            Optional<String> outboundTrackingUrl,
            Optional<String> inboundTrackingNumber,
            Optional<String> inboundTrackingUrl,
            Optional<String> outboundCourier,
            Optional<String> inboundCourier,
            Optional<String> notes) {
        this.id = id;
        this.outboundTrackingNumber = outboundTrackingNumber;
        this.outboundTrackingUrl = outboundTrackingUrl;
        this.inboundTrackingNumber = inboundTrackingNumber;
        this.inboundTrackingUrl = inboundTrackingUrl;
        this.outboundCourier = outboundCourier;
        this.inboundCourier = inboundCourier;
        this.notes = notes;
    }

    /**
     * @return The Vital Shipment ID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Tracking number for delivery to customer
     */
    @JsonProperty("outbound_tracking_number")
    public Optional<String> getOutboundTrackingNumber() {
        return outboundTrackingNumber;
    }

    /**
     * @return Tracking url for delivery to customer
     */
    @JsonProperty("outbound_tracking_url")
    public Optional<String> getOutboundTrackingUrl() {
        return outboundTrackingUrl;
    }

    /**
     * @return Tracking number for delivery to lab
     */
    @JsonProperty("inbound_tracking_number")
    public Optional<String> getInboundTrackingNumber() {
        return inboundTrackingNumber;
    }

    /**
     * @return Tracking url for delivery to lab
     */
    @JsonProperty("inbound_tracking_url")
    public Optional<String> getInboundTrackingUrl() {
        return inboundTrackingUrl;
    }

    /**
     * @return Courier used for delivery to customer
     */
    @JsonProperty("outbound_courier")
    public Optional<String> getOutboundCourier() {
        return outboundCourier;
    }

    /**
     * @return Courier used for delivery to lab
     */
    @JsonProperty("inbound_courier")
    public Optional<String> getInboundCourier() {
        return inboundCourier;
    }

    /**
     * @return Notes associated to the Vital shipment
     */
    @JsonProperty("notes")
    public Optional<String> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingShipment && equalTo((ClientFacingShipment) other);
    }

    private boolean equalTo(ClientFacingShipment other) {
        return id.equals(other.id)
                && outboundTrackingNumber.equals(other.outboundTrackingNumber)
                && outboundTrackingUrl.equals(other.outboundTrackingUrl)
                && inboundTrackingNumber.equals(other.inboundTrackingNumber)
                && inboundTrackingUrl.equals(other.inboundTrackingUrl)
                && outboundCourier.equals(other.outboundCourier)
                && inboundCourier.equals(other.inboundCourier)
                && notes.equals(other.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.outboundTrackingNumber,
                this.outboundTrackingUrl,
                this.inboundTrackingNumber,
                this.inboundTrackingUrl,
                this.outboundCourier,
                this.inboundCourier,
                this.notes);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(String id);

        Builder from(ClientFacingShipment other);
    }

    public interface _FinalStage {
        ClientFacingShipment build();

        _FinalStage outboundTrackingNumber(Optional<String> outboundTrackingNumber);

        _FinalStage outboundTrackingNumber(String outboundTrackingNumber);

        _FinalStage outboundTrackingUrl(Optional<String> outboundTrackingUrl);

        _FinalStage outboundTrackingUrl(String outboundTrackingUrl);

        _FinalStage inboundTrackingNumber(Optional<String> inboundTrackingNumber);

        _FinalStage inboundTrackingNumber(String inboundTrackingNumber);

        _FinalStage inboundTrackingUrl(Optional<String> inboundTrackingUrl);

        _FinalStage inboundTrackingUrl(String inboundTrackingUrl);

        _FinalStage outboundCourier(Optional<String> outboundCourier);

        _FinalStage outboundCourier(String outboundCourier);

        _FinalStage inboundCourier(Optional<String> inboundCourier);

        _FinalStage inboundCourier(String inboundCourier);

        _FinalStage notes(Optional<String> notes);

        _FinalStage notes(String notes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private String id;

        private Optional<String> notes = Optional.empty();

        private Optional<String> inboundCourier = Optional.empty();

        private Optional<String> outboundCourier = Optional.empty();

        private Optional<String> inboundTrackingUrl = Optional.empty();

        private Optional<String> inboundTrackingNumber = Optional.empty();

        private Optional<String> outboundTrackingUrl = Optional.empty();

        private Optional<String> outboundTrackingNumber = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingShipment other) {
            id(other.getId());
            outboundTrackingNumber(other.getOutboundTrackingNumber());
            outboundTrackingUrl(other.getOutboundTrackingUrl());
            inboundTrackingNumber(other.getInboundTrackingNumber());
            inboundTrackingUrl(other.getInboundTrackingUrl());
            outboundCourier(other.getOutboundCourier());
            inboundCourier(other.getInboundCourier());
            notes(other.getNotes());
            return this;
        }

        /**
         * <p>The Vital Shipment ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Notes associated to the Vital shipment</p>
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
         * <p>Courier used for delivery to lab</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage inboundCourier(String inboundCourier) {
            this.inboundCourier = Optional.of(inboundCourier);
            return this;
        }

        @Override
        @JsonSetter(value = "inbound_courier", nulls = Nulls.SKIP)
        public _FinalStage inboundCourier(Optional<String> inboundCourier) {
            this.inboundCourier = inboundCourier;
            return this;
        }

        /**
         * <p>Courier used for delivery to customer</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage outboundCourier(String outboundCourier) {
            this.outboundCourier = Optional.of(outboundCourier);
            return this;
        }

        @Override
        @JsonSetter(value = "outbound_courier", nulls = Nulls.SKIP)
        public _FinalStage outboundCourier(Optional<String> outboundCourier) {
            this.outboundCourier = outboundCourier;
            return this;
        }

        /**
         * <p>Tracking url for delivery to lab</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage inboundTrackingUrl(String inboundTrackingUrl) {
            this.inboundTrackingUrl = Optional.of(inboundTrackingUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "inbound_tracking_url", nulls = Nulls.SKIP)
        public _FinalStage inboundTrackingUrl(Optional<String> inboundTrackingUrl) {
            this.inboundTrackingUrl = inboundTrackingUrl;
            return this;
        }

        /**
         * <p>Tracking number for delivery to lab</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage inboundTrackingNumber(String inboundTrackingNumber) {
            this.inboundTrackingNumber = Optional.of(inboundTrackingNumber);
            return this;
        }

        @Override
        @JsonSetter(value = "inbound_tracking_number", nulls = Nulls.SKIP)
        public _FinalStage inboundTrackingNumber(Optional<String> inboundTrackingNumber) {
            this.inboundTrackingNumber = inboundTrackingNumber;
            return this;
        }

        /**
         * <p>Tracking url for delivery to customer</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage outboundTrackingUrl(String outboundTrackingUrl) {
            this.outboundTrackingUrl = Optional.of(outboundTrackingUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "outbound_tracking_url", nulls = Nulls.SKIP)
        public _FinalStage outboundTrackingUrl(Optional<String> outboundTrackingUrl) {
            this.outboundTrackingUrl = outboundTrackingUrl;
            return this;
        }

        /**
         * <p>Tracking number for delivery to customer</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage outboundTrackingNumber(String outboundTrackingNumber) {
            this.outboundTrackingNumber = Optional.of(outboundTrackingNumber);
            return this;
        }

        @Override
        @JsonSetter(value = "outbound_tracking_number", nulls = Nulls.SKIP)
        public _FinalStage outboundTrackingNumber(Optional<String> outboundTrackingNumber) {
            this.outboundTrackingNumber = outboundTrackingNumber;
            return this;
        }

        @Override
        public ClientFacingShipment build() {
            return new ClientFacingShipment(
                    id,
                    outboundTrackingNumber,
                    outboundTrackingUrl,
                    inboundTrackingNumber,
                    inboundTrackingUrl,
                    outboundCourier,
                    inboundCourier,
                    notes);
        }
    }
}