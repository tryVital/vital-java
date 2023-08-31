package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Fulfillment.Builder.class)
public final class Fulfillment {
    private final String orderUuid;

    private final String orderNumber;

    private Fulfillment(String orderUuid, String orderNumber) {
        this.orderUuid = orderUuid;
        this.orderNumber = orderNumber;
    }

    @JsonProperty("order_uuid")
    public String getOrderUuid() {
        return orderUuid;
    }

    @JsonProperty("order_number")
    public String getOrderNumber() {
        return orderNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Fulfillment && equalTo((Fulfillment) other);
    }

    private boolean equalTo(Fulfillment other) {
        return orderUuid.equals(other.orderUuid) && orderNumber.equals(other.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.orderUuid, this.orderNumber);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OrderUuidStage builder() {
        return new Builder();
    }

    public interface OrderUuidStage {
        OrderNumberStage orderUuid(String orderUuid);

        Builder from(Fulfillment other);
    }

    public interface OrderNumberStage {
        _FinalStage orderNumber(String orderNumber);
    }

    public interface _FinalStage {
        Fulfillment build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OrderUuidStage, OrderNumberStage, _FinalStage {
        private String orderUuid;

        private String orderNumber;

        private Builder() {}

        @Override
        public Builder from(Fulfillment other) {
            orderUuid(other.getOrderUuid());
            orderNumber(other.getOrderNumber());
            return this;
        }

        @Override
        @JsonSetter("order_uuid")
        public OrderNumberStage orderUuid(String orderUuid) {
            this.orderUuid = orderUuid;
            return this;
        }

        @Override
        @JsonSetter("order_number")
        public _FinalStage orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        @Override
        public Fulfillment build() {
            return new Fulfillment(orderUuid, orderNumber);
        }
    }
}
