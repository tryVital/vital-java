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
@JsonDeserialize(builder = ClientFacingAtHomePhlebotomyOrderDetails.Builder.class)
public final class ClientFacingAtHomePhlebotomyOrderDetails {
    private final Optional<ClientFacingAtHomePhlebotomyOrder> data;

    private ClientFacingAtHomePhlebotomyOrderDetails(Optional<ClientFacingAtHomePhlebotomyOrder> data) {
        this.data = data;
    }

    @JsonProperty("data")
    public Optional<ClientFacingAtHomePhlebotomyOrder> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingAtHomePhlebotomyOrderDetails
                && equalTo((ClientFacingAtHomePhlebotomyOrderDetails) other);
    }

    private boolean equalTo(ClientFacingAtHomePhlebotomyOrderDetails other) {
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
        private Optional<ClientFacingAtHomePhlebotomyOrder> data = Optional.empty();

        private Builder() {}

        public Builder from(ClientFacingAtHomePhlebotomyOrderDetails other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<ClientFacingAtHomePhlebotomyOrder> data) {
            this.data = data;
            return this;
        }

        public Builder data(ClientFacingAtHomePhlebotomyOrder data) {
            this.data = Optional.of(data);
            return this;
        }

        public ClientFacingAtHomePhlebotomyOrderDetails build() {
            return new ClientFacingAtHomePhlebotomyOrderDetails(data);
        }
    }
}
