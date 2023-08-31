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
@JsonDeserialize(builder = ClientFacingTestKitOrderDetails.Builder.class)
public final class ClientFacingTestKitOrderDetails {
    private final Optional<ClientFacingTestkitOrder> data;

    private ClientFacingTestKitOrderDetails(Optional<ClientFacingTestkitOrder> data) {
        this.data = data;
    }

    @JsonProperty("data")
    public Optional<ClientFacingTestkitOrder> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingTestKitOrderDetails && equalTo((ClientFacingTestKitOrderDetails) other);
    }

    private boolean equalTo(ClientFacingTestKitOrderDetails other) {
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
        private Optional<ClientFacingTestkitOrder> data = Optional.empty();

        private Builder() {}

        public Builder from(ClientFacingTestKitOrderDetails other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<ClientFacingTestkitOrder> data) {
            this.data = data;
            return this;
        }

        public Builder data(ClientFacingTestkitOrder data) {
            this.data = Optional.of(data);
            return this;
        }

        public ClientFacingTestKitOrderDetails build() {
            return new ClientFacingTestKitOrderDetails(data);
        }
    }
}
