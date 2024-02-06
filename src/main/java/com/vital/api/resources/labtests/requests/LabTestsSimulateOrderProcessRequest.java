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
import com.vital.api.types.OrderStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabTestsSimulateOrderProcessRequest.Builder.class)
public final class LabTestsSimulateOrderProcessRequest {
    private final Optional<OrderStatus> finalStatus;

    private final Optional<Integer> delay;

    private final Map<String, Object> additionalProperties;

    private LabTestsSimulateOrderProcessRequest(
            Optional<OrderStatus> finalStatus, Optional<Integer> delay, Map<String, Object> additionalProperties) {
        this.finalStatus = finalStatus;
        this.delay = delay;
        this.additionalProperties = additionalProperties;
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
        return other instanceof LabTestsSimulateOrderProcessRequest
                && equalTo((LabTestsSimulateOrderProcessRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LabTestsSimulateOrderProcessRequest other) {
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LabTestsSimulateOrderProcessRequest other) {
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

        public LabTestsSimulateOrderProcessRequest build() {
            return new LabTestsSimulateOrderProcessRequest(finalStatus, delay, additionalProperties);
        }
    }
}