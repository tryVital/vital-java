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
import com.vital.api.types.LabTestCollectionMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateLabTestRequest.Builder.class)
public final class CreateLabTestRequest {
    private final Optional<List<Integer>> markerIds;

    private final Optional<List<String>> providerIds;

    private final int labId;

    private final String name;

    private final LabTestCollectionMethod method;

    private final String description;

    private final Optional<Boolean> fasting;

    private final Map<String, Object> additionalProperties;

    private CreateLabTestRequest(
            Optional<List<Integer>> markerIds,
            Optional<List<String>> providerIds,
            int labId,
            String name,
            LabTestCollectionMethod method,
            String description,
            Optional<Boolean> fasting,
            Map<String, Object> additionalProperties) {
        this.markerIds = markerIds;
        this.providerIds = providerIds;
        this.labId = labId;
        this.name = name;
        this.method = method;
        this.description = description;
        this.fasting = fasting;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("marker_ids")
    public Optional<List<Integer>> getMarkerIds() {
        return markerIds;
    }

    @JsonProperty("provider_ids")
    public Optional<List<String>> getProviderIds() {
        return providerIds;
    }

    @JsonProperty("lab_id")
    public int getLabId() {
        return labId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("method")
    public LabTestCollectionMethod getMethod() {
        return method;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("fasting")
    public Optional<Boolean> getFasting() {
        return fasting;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateLabTestRequest && equalTo((CreateLabTestRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateLabTestRequest other) {
        return markerIds.equals(other.markerIds)
                && providerIds.equals(other.providerIds)
                && labId == other.labId
                && name.equals(other.name)
                && method.equals(other.method)
                && description.equals(other.description)
                && fasting.equals(other.fasting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.markerIds, this.providerIds, this.labId, this.name, this.method, this.description, this.fasting);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LabIdStage builder() {
        return new Builder();
    }

    public interface LabIdStage {
        NameStage labId(int labId);

        Builder from(CreateLabTestRequest other);
    }

    public interface NameStage {
        MethodStage name(String name);
    }

    public interface MethodStage {
        DescriptionStage method(LabTestCollectionMethod method);
    }

    public interface DescriptionStage {
        _FinalStage description(String description);
    }

    public interface _FinalStage {
        CreateLabTestRequest build();

        _FinalStage markerIds(Optional<List<Integer>> markerIds);

        _FinalStage markerIds(List<Integer> markerIds);

        _FinalStage providerIds(Optional<List<String>> providerIds);

        _FinalStage providerIds(List<String> providerIds);

        _FinalStage fasting(Optional<Boolean> fasting);

        _FinalStage fasting(Boolean fasting);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LabIdStage, NameStage, MethodStage, DescriptionStage, _FinalStage {
        private int labId;

        private String name;

        private LabTestCollectionMethod method;

        private String description;

        private Optional<Boolean> fasting = Optional.empty();

        private Optional<List<String>> providerIds = Optional.empty();

        private Optional<List<Integer>> markerIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CreateLabTestRequest other) {
            markerIds(other.getMarkerIds());
            providerIds(other.getProviderIds());
            labId(other.getLabId());
            name(other.getName());
            method(other.getMethod());
            description(other.getDescription());
            fasting(other.getFasting());
            return this;
        }

        @Override
        @JsonSetter("lab_id")
        public NameStage labId(int labId) {
            this.labId = labId;
            return this;
        }

        @Override
        @JsonSetter("name")
        public MethodStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("method")
        public DescriptionStage method(LabTestCollectionMethod method) {
            this.method = method;
            return this;
        }

        @Override
        @JsonSetter("description")
        public _FinalStage description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public _FinalStage fasting(Boolean fasting) {
            this.fasting = Optional.of(fasting);
            return this;
        }

        @Override
        @JsonSetter(value = "fasting", nulls = Nulls.SKIP)
        public _FinalStage fasting(Optional<Boolean> fasting) {
            this.fasting = fasting;
            return this;
        }

        @Override
        public _FinalStage providerIds(List<String> providerIds) {
            this.providerIds = Optional.of(providerIds);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_ids", nulls = Nulls.SKIP)
        public _FinalStage providerIds(Optional<List<String>> providerIds) {
            this.providerIds = providerIds;
            return this;
        }

        @Override
        public _FinalStage markerIds(List<Integer> markerIds) {
            this.markerIds = Optional.of(markerIds);
            return this;
        }

        @Override
        @JsonSetter(value = "marker_ids", nulls = Nulls.SKIP)
        public _FinalStage markerIds(Optional<List<Integer>> markerIds) {
            this.markerIds = markerIds;
            return this;
        }

        @Override
        public CreateLabTestRequest build() {
            return new CreateLabTestRequest(
                    markerIds, providerIds, labId, name, method, description, fasting, additionalProperties);
        }
    }
}
