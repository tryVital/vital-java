package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.LabTestCollectionMethod;
import com.vital.api.types.LabTestSampleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateLabTestRequest.Builder.class)
public final class CreateLabTestRequest {
    private final List<Integer> markerIds;

    private final int labId;

    private final String name;

    private final LabTestCollectionMethod method;

    private final LabTestSampleType sampleType;

    private final String description;

    private final Optional<Boolean> fasting;

    private CreateLabTestRequest(
            List<Integer> markerIds,
            int labId,
            String name,
            LabTestCollectionMethod method,
            LabTestSampleType sampleType,
            String description,
            Optional<Boolean> fasting) {
        this.markerIds = markerIds;
        this.labId = labId;
        this.name = name;
        this.method = method;
        this.sampleType = sampleType;
        this.description = description;
        this.fasting = fasting;
    }

    @JsonProperty("marker_ids")
    public List<Integer> getMarkerIds() {
        return markerIds;
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

    @JsonProperty("sample_type")
    public LabTestSampleType getSampleType() {
        return sampleType;
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

    private boolean equalTo(CreateLabTestRequest other) {
        return markerIds.equals(other.markerIds)
                && labId == other.labId
                && name.equals(other.name)
                && method.equals(other.method)
                && sampleType.equals(other.sampleType)
                && description.equals(other.description)
                && fasting.equals(other.fasting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.markerIds, this.labId, this.name, this.method, this.sampleType, this.description, this.fasting);
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
        SampleTypeStage method(LabTestCollectionMethod method);
    }

    public interface SampleTypeStage {
        DescriptionStage sampleType(LabTestSampleType sampleType);
    }

    public interface DescriptionStage {
        _FinalStage description(String description);
    }

    public interface _FinalStage {
        CreateLabTestRequest build();

        _FinalStage markerIds(List<Integer> markerIds);

        _FinalStage addMarkerIds(Integer markerIds);

        _FinalStage addAllMarkerIds(List<Integer> markerIds);

        _FinalStage fasting(Optional<Boolean> fasting);

        _FinalStage fasting(Boolean fasting);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LabIdStage, NameStage, MethodStage, SampleTypeStage, DescriptionStage, _FinalStage {
        private int labId;

        private String name;

        private LabTestCollectionMethod method;

        private LabTestSampleType sampleType;

        private String description;

        private Optional<Boolean> fasting = Optional.empty();

        private List<Integer> markerIds = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(CreateLabTestRequest other) {
            markerIds(other.getMarkerIds());
            labId(other.getLabId());
            name(other.getName());
            method(other.getMethod());
            sampleType(other.getSampleType());
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
        public SampleTypeStage method(LabTestCollectionMethod method) {
            this.method = method;
            return this;
        }

        @Override
        @JsonSetter("sample_type")
        public DescriptionStage sampleType(LabTestSampleType sampleType) {
            this.sampleType = sampleType;
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
        public _FinalStage addAllMarkerIds(List<Integer> markerIds) {
            this.markerIds.addAll(markerIds);
            return this;
        }

        @Override
        public _FinalStage addMarkerIds(Integer markerIds) {
            this.markerIds.add(markerIds);
            return this;
        }

        @Override
        @JsonSetter(value = "marker_ids", nulls = Nulls.SKIP)
        public _FinalStage markerIds(List<Integer> markerIds) {
            this.markerIds.clear();
            this.markerIds.addAll(markerIds);
            return this;
        }

        @Override
        public CreateLabTestRequest build() {
            return new CreateLabTestRequest(markerIds, labId, name, method, sampleType, description, fasting);
        }
    }
}
