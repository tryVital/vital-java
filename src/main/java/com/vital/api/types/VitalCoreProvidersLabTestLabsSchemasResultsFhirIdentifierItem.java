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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem.Builder.class)
public final class VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem {
    private final String value;

    private final Map<String, Object> additionalProperties;

    private VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem(
            String value, Map<String, Object> additionalProperties) {
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem
                && equalTo((VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValueStage builder() {
        return new Builder();
    }

    public interface ValueStage {
        _FinalStage value(String value);

        Builder from(VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem other);
    }

    public interface _FinalStage {
        VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValueStage, _FinalStage {
        private String value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem other) {
            value(other.getValue());
            return this;
        }

        @Override
        @JsonSetter("value")
        public _FinalStage value(String value) {
            this.value = value;
            return this;
        }

        @Override
        public VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem build() {
            return new VitalCoreProvidersLabTestLabsSchemasResultsFhirIdentifierItem(value, additionalProperties);
        }
    }
}
