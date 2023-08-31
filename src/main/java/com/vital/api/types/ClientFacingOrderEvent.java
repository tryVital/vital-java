package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingOrderEvent.Builder.class)
public final class ClientFacingOrderEvent {
    private final int id;

    private final OffsetDateTime createdAt;

    private final OrderStatus status;

    private ClientFacingOrderEvent(int id, OffsetDateTime createdAt, OrderStatus status) {
        this.id = id;
        this.createdAt = createdAt;
        this.status = status;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("status")
    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingOrderEvent && equalTo((ClientFacingOrderEvent) other);
    }

    private boolean equalTo(ClientFacingOrderEvent other) {
        return id == other.id && createdAt.equals(other.createdAt) && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.createdAt, this.status);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        CreatedAtStage id(int id);

        Builder from(ClientFacingOrderEvent other);
    }

    public interface CreatedAtStage {
        StatusStage createdAt(OffsetDateTime createdAt);
    }

    public interface StatusStage {
        _FinalStage status(OrderStatus status);
    }

    public interface _FinalStage {
        ClientFacingOrderEvent build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, StatusStage, _FinalStage {
        private int id;

        private OffsetDateTime createdAt;

        private OrderStatus status;

        private Builder() {}

        @Override
        public Builder from(ClientFacingOrderEvent other) {
            id(other.getId());
            createdAt(other.getCreatedAt());
            status(other.getStatus());
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(int id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public StatusStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("status")
        public _FinalStage status(OrderStatus status) {
            this.status = status;
            return this;
        }

        @Override
        public ClientFacingOrderEvent build() {
            return new ClientFacingOrderEvent(id, createdAt, status);
        }
    }
}
