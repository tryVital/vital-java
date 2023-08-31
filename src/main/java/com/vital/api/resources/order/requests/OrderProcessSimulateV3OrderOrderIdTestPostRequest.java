package com.vital.api.resources.order.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.OrderStatus;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OrderProcessSimulateV3OrderOrderIdTestPostRequest.Builder.class)
public final class OrderProcessSimulateV3OrderOrderIdTestPostRequest {
    private final Optional<OrderStatus> finalStatus;

    private final Optional<Integer> delay;

    private OrderProcessSimulateV3OrderOrderIdTestPostRequest(
            Optional<OrderStatus> finalStatus, Optional<Integer> delay) {
        this.finalStatus = finalStatus;
        this.delay = delay;
    }

    @JsonProperty("final_status")
    public Optional<OrderStatus> getFinalStatus() {
        return finalStatus;
    }

    @JsonProperty("delay")
    public Optional<Integer> getDelay() {
        return delay;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OrderProcessSimulateV3OrderOrderIdTestPostRequest
                && equalTo((OrderProcessSimulateV3OrderOrderIdTestPostRequest) other);
    }

    private boolean equalTo(OrderProcessSimulateV3OrderOrderIdTestPostRequest other) {
        return finalStatus.equals(other.finalStatus) && delay.equals(other.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.finalStatus, this.delay);
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
        private Optional<OrderStatus> finalStatus = Optional.empty();

        private Optional<Integer> delay = Optional.empty();

        private Builder() {}

        public Builder from(OrderProcessSimulateV3OrderOrderIdTestPostRequest other) {
            finalStatus(other.getFinalStatus());
            delay(other.getDelay());
            return this;
        }

        @JsonSetter(value = "final_status", nulls = Nulls.SKIP)
        public Builder finalStatus(Optional<OrderStatus> finalStatus) {
            this.finalStatus = finalStatus;
            return this;
        }

        public Builder finalStatus(OrderStatus finalStatus) {
            this.finalStatus = Optional.of(finalStatus);
            return this;
        }

        @JsonSetter(value = "delay", nulls = Nulls.SKIP)
        public Builder delay(Optional<Integer> delay) {
            this.delay = delay;
            return this;
        }

        public Builder delay(Integer delay) {
            this.delay = Optional.of(delay);
            return this;
        }

        public OrderProcessSimulateV3OrderOrderIdTestPostRequest build() {
            return new OrderProcessSimulateV3OrderOrderIdTestPostRequest(finalStatus, delay);
        }
    }
}
