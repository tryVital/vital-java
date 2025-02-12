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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = QueryConfig.Builder.class)
public final class QueryConfig {
    private final Optional<List<QueryConfigProviderPriorityOverridesItem>> providerPriorityOverrides;

    private final Map<String, Object> additionalProperties;

    private QueryConfig(
            Optional<List<QueryConfigProviderPriorityOverridesItem>> providerPriorityOverrides,
            Map<String, Object> additionalProperties) {
        this.providerPriorityOverrides = providerPriorityOverrides;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider_priority_overrides")
    public Optional<List<QueryConfigProviderPriorityOverridesItem>> getProviderPriorityOverrides() {
        return providerPriorityOverrides;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof QueryConfig && equalTo((QueryConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(QueryConfig other) {
        return providerPriorityOverrides.equals(other.providerPriorityOverrides);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.providerPriorityOverrides);
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
        private Optional<List<QueryConfigProviderPriorityOverridesItem>> providerPriorityOverrides = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(QueryConfig other) {
            providerPriorityOverrides(other.getProviderPriorityOverrides());
            return this;
        }

        @JsonSetter(value = "provider_priority_overrides", nulls = Nulls.SKIP)
        public Builder providerPriorityOverrides(
                Optional<List<QueryConfigProviderPriorityOverridesItem>> providerPriorityOverrides) {
            this.providerPriorityOverrides = providerPriorityOverrides;
            return this;
        }

        public Builder providerPriorityOverrides(
                List<QueryConfigProviderPriorityOverridesItem> providerPriorityOverrides) {
            this.providerPriorityOverrides = Optional.of(providerPriorityOverrides);
            return this;
        }

        public QueryConfig build() {
            return new QueryConfig(providerPriorityOverrides, additionalProperties);
        }
    }
}
