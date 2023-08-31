package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PostOrderResponse.Builder.class)
public final class PostOrderResponse {
    private final ClientFacingOrder order;

    private final String status;

    private final String message;

    private PostOrderResponse(ClientFacingOrder order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    @JsonProperty("order")
    public ClientFacingOrder getOrder() {
        return order;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PostOrderResponse && equalTo((PostOrderResponse) other);
    }

    private boolean equalTo(PostOrderResponse other) {
        return order.equals(other.order) && status.equals(other.status) && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.order, this.status, this.message);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OrderStage builder() {
        return new Builder();
    }

    public interface OrderStage {
        StatusStage order(ClientFacingOrder order);

        Builder from(PostOrderResponse other);
    }

    public interface StatusStage {
        MessageStage status(String status);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        PostOrderResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OrderStage, StatusStage, MessageStage, _FinalStage {
        private ClientFacingOrder order;

        private String status;

        private String message;

        private Builder() {}

        @Override
        public Builder from(PostOrderResponse other) {
            order(other.getOrder());
            status(other.getStatus());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("order")
        public StatusStage order(ClientFacingOrder order) {
            this.order = order;
            return this;
        }

        @Override
        @JsonSetter("status")
        public MessageStage status(String status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public PostOrderResponse build() {
            return new PostOrderResponse(order, status, message);
        }
    }
}
