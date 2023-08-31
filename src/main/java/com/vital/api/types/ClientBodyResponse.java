package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientBodyResponse.Builder.class)
public final class ClientBodyResponse {
    private final List<ClientFacingBody> body;

    private ClientBodyResponse(List<ClientFacingBody> body) {
        this.body = body;
    }

    @JsonProperty("body")
    public List<ClientFacingBody> getBody() {
        return body;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientBodyResponse && equalTo((ClientBodyResponse) other);
    }

    private boolean equalTo(ClientBodyResponse other) {
        return body.equals(other.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.body);
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
        private List<ClientFacingBody> body = new ArrayList<>();

        private Builder() {}

        public Builder from(ClientBodyResponse other) {
            body(other.getBody());
            return this;
        }

        @JsonSetter(value = "body", nulls = Nulls.SKIP)
        public Builder body(List<ClientFacingBody> body) {
            this.body.clear();
            this.body.addAll(body);
            return this;
        }

        public Builder addBody(ClientFacingBody body) {
            this.body.add(body);
            return this;
        }

        public Builder addAllBody(List<ClientFacingBody> body) {
            this.body.addAll(body);
            return this;
        }

        public ClientBodyResponse build() {
            return new ClientBodyResponse(body);
        }
    }
}
