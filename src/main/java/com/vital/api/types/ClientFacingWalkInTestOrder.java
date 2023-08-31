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
@JsonDeserialize(builder = ClientFacingWalkInTestOrder.Builder.class)
public final class ClientFacingWalkInTestOrder {
    private final String id;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private ClientFacingWalkInTestOrder(String id, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The Vital walk-in test Order ID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
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
        return other instanceof ClientFacingWalkInTestOrder && equalTo((ClientFacingWalkInTestOrder) other);
    }

    private boolean equalTo(ClientFacingWalkInTestOrder other) {
        return id.equals(other.id) && createdAt.equals(other.createdAt) && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.createdAt, this.updatedAt);
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

        Builder from(ClientFacingWalkInTestOrder other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ClientFacingWalkInTestOrder build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Builder() {}

        @Override
        public Builder from(ClientFacingWalkInTestOrder other) {
            id(other.getId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>The Vital walk-in test Order ID</p>
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
        public ClientFacingWalkInTestOrder build() {
            return new ClientFacingWalkInTestOrder(id, createdAt, updatedAt);
        }
    }
}
