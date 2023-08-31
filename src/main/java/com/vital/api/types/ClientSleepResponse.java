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
@JsonDeserialize(builder = ClientSleepResponse.Builder.class)
public final class ClientSleepResponse {
    private final List<ClientFacingSleep> sleep;

    private ClientSleepResponse(List<ClientFacingSleep> sleep) {
        this.sleep = sleep;
    }

    @JsonProperty("sleep")
    public List<ClientFacingSleep> getSleep() {
        return sleep;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSleepResponse && equalTo((ClientSleepResponse) other);
    }

    private boolean equalTo(ClientSleepResponse other) {
        return sleep.equals(other.sleep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.sleep);
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
        private List<ClientFacingSleep> sleep = new ArrayList<>();

        private Builder() {}

        public Builder from(ClientSleepResponse other) {
            sleep(other.getSleep());
            return this;
        }

        @JsonSetter(value = "sleep", nulls = Nulls.SKIP)
        public Builder sleep(List<ClientFacingSleep> sleep) {
            this.sleep.clear();
            this.sleep.addAll(sleep);
            return this;
        }

        public Builder addSleep(ClientFacingSleep sleep) {
            this.sleep.add(sleep);
            return this;
        }

        public Builder addAllSleep(List<ClientFacingSleep> sleep) {
            this.sleep.addAll(sleep);
            return this;
        }

        public ClientSleepResponse build() {
            return new ClientSleepResponse(sleep);
        }
    }
}