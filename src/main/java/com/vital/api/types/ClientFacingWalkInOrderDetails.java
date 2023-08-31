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
@JsonDeserialize(builder = ClientFacingWalkInOrderDetails.Builder.class)
public final class ClientFacingWalkInOrderDetails {
    private final Optional<ClientFacingWalkInTestOrder> data;

    private ClientFacingWalkInOrderDetails(Optional<ClientFacingWalkInTestOrder> data) {
        this.data = data;
    }

    @JsonProperty("data")
    public Optional<ClientFacingWalkInTestOrder> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingWalkInOrderDetails && equalTo((ClientFacingWalkInOrderDetails) other);
    }

    private boolean equalTo(ClientFacingWalkInOrderDetails other) {
        return data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data);
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
        private Optional<ClientFacingWalkInTestOrder> data = Optional.empty();

        private Builder() {}

        public Builder from(ClientFacingWalkInOrderDetails other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<ClientFacingWalkInTestOrder> data) {
            this.data = data;
            return this;
        }

        public Builder data(ClientFacingWalkInTestOrder data) {
            this.data = Optional.of(data);
            return this;
        }

        public ClientFacingWalkInOrderDetails build() {
            return new ClientFacingWalkInOrderDetails(data);
        }
    }
}