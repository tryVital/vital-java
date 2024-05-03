/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ScopeRequirementsStr.Builder.class)
public final class ScopeRequirementsStr {
    private final List<String> required;

    private final List<String> optional;

    private final Map<String, Object> additionalProperties;

    private ScopeRequirementsStr(
            List<String> required, List<String> optional, Map<String, Object> additionalProperties) {
        this.required = required;
        this.optional = optional;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("required")
    public List<String> getRequired() {
        return required;
    }

    @JsonProperty("optional")
    public List<String> getOptional() {
        return optional;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ScopeRequirementsStr && equalTo((ScopeRequirementsStr) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ScopeRequirementsStr other) {
        return required.equals(other.required) && optional.equals(other.optional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.required, this.optional);
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
        private List<String> required = new ArrayList<>();

        private List<String> optional = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ScopeRequirementsStr other) {
            required(other.getRequired());
            optional(other.getOptional());
            return this;
        }

        @JsonSetter(value = "required", nulls = Nulls.SKIP)
        public Builder required(List<String> required) {
            this.required.clear();
            this.required.addAll(required);
            return this;
        }

        public Builder addRequired(String required) {
            this.required.add(required);
            return this;
        }

        public Builder addAllRequired(List<String> required) {
            this.required.addAll(required);
            return this;
        }

        @JsonSetter(value = "optional", nulls = Nulls.SKIP)
        public Builder optional(List<String> optional) {
            this.optional.clear();
            this.optional.addAll(optional);
            return this;
        }

        public Builder addOptional(String optional) {
            this.optional.add(optional);
            return this;
        }

        public Builder addAllOptional(List<String> optional) {
            this.optional.addAll(optional);
            return this;
        }

        public ScopeRequirementsStr build() {
            return new ScopeRequirementsStr(required, optional, additionalProperties);
        }
    }
}
