package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.ShippingAddress;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateRegistrableTestkitOrderRequest.Builder.class)
public final class CreateRegistrableTestkitOrderRequest {
    private final String userId;

    private final String labTestId;

    private final ShippingAddress shippingDetails;

    private CreateRegistrableTestkitOrderRequest(String userId, String labTestId, ShippingAddress shippingDetails) {
        this.userId = userId;
        this.labTestId = labTestId;
        this.shippingDetails = shippingDetails;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("lab_test_id")
    public String getLabTestId() {
        return labTestId;
    }

    @JsonProperty("shipping_details")
    public ShippingAddress getShippingDetails() {
        return shippingDetails;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateRegistrableTestkitOrderRequest
                && equalTo((CreateRegistrableTestkitOrderRequest) other);
    }

    private boolean equalTo(CreateRegistrableTestkitOrderRequest other) {
        return userId.equals(other.userId)
                && labTestId.equals(other.labTestId)
                && shippingDetails.equals(other.shippingDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.labTestId, this.shippingDetails);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        LabTestIdStage userId(String userId);

        Builder from(CreateRegistrableTestkitOrderRequest other);
    }

    public interface LabTestIdStage {
        ShippingDetailsStage labTestId(String labTestId);
    }

    public interface ShippingDetailsStage {
        _FinalStage shippingDetails(ShippingAddress shippingDetails);
    }

    public interface _FinalStage {
        CreateRegistrableTestkitOrderRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, LabTestIdStage, ShippingDetailsStage, _FinalStage {
        private String userId;

        private String labTestId;

        private ShippingAddress shippingDetails;

        private Builder() {}

        @Override
        public Builder from(CreateRegistrableTestkitOrderRequest other) {
            userId(other.getUserId());
            labTestId(other.getLabTestId());
            shippingDetails(other.getShippingDetails());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public LabTestIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("lab_test_id")
        public ShippingDetailsStage labTestId(String labTestId) {
            this.labTestId = labTestId;
            return this;
        }

        @Override
        @JsonSetter("shipping_details")
        public _FinalStage shippingDetails(ShippingAddress shippingDetails) {
            this.shippingDetails = shippingDetails;
            return this;
        }

        @Override
        public CreateRegistrableTestkitOrderRequest build() {
            return new CreateRegistrableTestkitOrderRequest(userId, labTestId, shippingDetails);
        }
    }
}
