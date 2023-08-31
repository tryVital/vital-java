package com.vital.api.resources.order.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Fulfillment;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ShipmentWebhookUpdate.Builder.class)
public final class ShipmentWebhookUpdate {
    private final Fulfillment fulfillment;

    private ShipmentWebhookUpdate(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("webhook_type")
    public String getWebhookType() {
        return "Shipment Update";
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ShipmentWebhookUpdate && equalTo((ShipmentWebhookUpdate) other);
    }

    private boolean equalTo(ShipmentWebhookUpdate other) {
        return fulfillment.equals(other.fulfillment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fulfillment);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FulfillmentStage builder() {
        return new Builder();
    }

    public interface FulfillmentStage {
        _FinalStage fulfillment(Fulfillment fulfillment);

        Builder from(ShipmentWebhookUpdate other);
    }

    public interface _FinalStage {
        ShipmentWebhookUpdate build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FulfillmentStage, _FinalStage {
        private Fulfillment fulfillment;

        private Builder() {}

        @Override
        public Builder from(ShipmentWebhookUpdate other) {
            fulfillment(other.getFulfillment());
            return this;
        }

        @Override
        @JsonSetter("fulfillment")
        public _FinalStage fulfillment(Fulfillment fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }

        @Override
        public ShipmentWebhookUpdate build() {
            return new ShipmentWebhookUpdate(fulfillment);
        }
    }
}
