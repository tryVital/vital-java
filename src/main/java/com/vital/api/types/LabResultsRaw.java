package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabResultsRaw.Builder.class)
public final class LabResultsRaw {
    private final LabResultsMetadata metadata;

    private final LabResultsRawResults results;

    private LabResultsRaw(LabResultsMetadata metadata, LabResultsRawResults results) {
        this.metadata = metadata;
        this.results = results;
    }

    @JsonProperty("metadata")
    public LabResultsMetadata getMetadata() {
        return metadata;
    }

    @JsonProperty("results")
    public LabResultsRawResults getResults() {
        return results;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabResultsRaw && equalTo((LabResultsRaw) other);
    }

    private boolean equalTo(LabResultsRaw other) {
        return metadata.equals(other.metadata) && results.equals(other.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.metadata, this.results);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MetadataStage builder() {
        return new Builder();
    }

    public interface MetadataStage {
        ResultsStage metadata(LabResultsMetadata metadata);

        Builder from(LabResultsRaw other);
    }

    public interface ResultsStage {
        _FinalStage results(LabResultsRawResults results);
    }

    public interface _FinalStage {
        LabResultsRaw build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MetadataStage, ResultsStage, _FinalStage {
        private LabResultsMetadata metadata;

        private LabResultsRawResults results;

        private Builder() {}

        @Override
        public Builder from(LabResultsRaw other) {
            metadata(other.getMetadata());
            results(other.getResults());
            return this;
        }

        @Override
        @JsonSetter("metadata")
        public ResultsStage metadata(LabResultsMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        @JsonSetter("results")
        public _FinalStage results(LabResultsRawResults results) {
            this.results = results;
            return this;
        }

        @Override
        public LabResultsRaw build() {
            return new LabResultsRaw(metadata, results);
        }
    }
}
