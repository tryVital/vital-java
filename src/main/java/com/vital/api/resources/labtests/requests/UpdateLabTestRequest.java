/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UpdateLabTestRequest.Builder.class)
public final class UpdateLabTestRequest {
    private final Optional<String> name;

    private final Optional<Boolean> active;

    private final Map<String, Object> additionalProperties;

    private UpdateLabTestRequest(
            Optional<String> name, Optional<Boolean> active, Map<String, Object> additionalProperties) {
        this.name = name;
        this.active = active;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("active")
    public Optional<Boolean> getActive() {
        return active;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateLabTestRequest && equalTo((UpdateLabTestRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateLabTestRequest other) {
        return name.equals(other.name) && active.equals(other.active);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.active);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<Boolean> active = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateLabTestRequest other) {
            name(other.getName());
            active(other.getActive());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "active", nulls = Nulls.SKIP)
        public Builder active(Optional<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = Optional.of(active);
            return this;
        }

        public UpdateLabTestRequest build() {
            return new UpdateLabTestRequest(name, active, additionalProperties);
        }
    }
}
