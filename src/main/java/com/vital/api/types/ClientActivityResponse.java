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
@JsonDeserialize(builder = ClientActivityResponse.Builder.class)
public final class ClientActivityResponse {
    private final List<ClientFacingActivity> activity;

    private ClientActivityResponse(List<ClientFacingActivity> activity) {
        this.activity = activity;
    }

    @JsonProperty("activity")
    public List<ClientFacingActivity> getActivity() {
        return activity;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientActivityResponse && equalTo((ClientActivityResponse) other);
    }

    private boolean equalTo(ClientActivityResponse other) {
        return activity.equals(other.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.activity);
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
        private List<ClientFacingActivity> activity = new ArrayList<>();

        private Builder() {}

        public Builder from(ClientActivityResponse other) {
            activity(other.getActivity());
            return this;
        }

        @JsonSetter(value = "activity", nulls = Nulls.SKIP)
        public Builder activity(List<ClientFacingActivity> activity) {
            this.activity.clear();
            this.activity.addAll(activity);
            return this;
        }

        public Builder addActivity(ClientFacingActivity activity) {
            this.activity.add(activity);
            return this;
        }

        public Builder addAllActivity(List<ClientFacingActivity> activity) {
            this.activity.addAll(activity);
            return this;
        }

        public ClientActivityResponse build() {
            return new ClientActivityResponse(activity);
        }
    }
}
