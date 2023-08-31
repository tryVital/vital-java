package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabTestsSearchDiagnosisRequest.Builder.class)
public final class LabTestsSearchDiagnosisRequest {
    private final String diagnosisQuery;

    private LabTestsSearchDiagnosisRequest(String diagnosisQuery) {
        this.diagnosisQuery = diagnosisQuery;
    }

    @JsonProperty("diagnosis_query")
    public String getDiagnosisQuery() {
        return diagnosisQuery;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabTestsSearchDiagnosisRequest && equalTo((LabTestsSearchDiagnosisRequest) other);
    }

    private boolean equalTo(LabTestsSearchDiagnosisRequest other) {
        return diagnosisQuery.equals(other.diagnosisQuery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.diagnosisQuery);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DiagnosisQueryStage builder() {
        return new Builder();
    }

    public interface DiagnosisQueryStage {
        _FinalStage diagnosisQuery(String diagnosisQuery);

        Builder from(LabTestsSearchDiagnosisRequest other);
    }

    public interface _FinalStage {
        LabTestsSearchDiagnosisRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DiagnosisQueryStage, _FinalStage {
        private String diagnosisQuery;

        private Builder() {}

        @Override
        public Builder from(LabTestsSearchDiagnosisRequest other) {
            diagnosisQuery(other.getDiagnosisQuery());
            return this;
        }

        @Override
        @JsonSetter("diagnosis_query")
        public _FinalStage diagnosisQuery(String diagnosisQuery) {
            this.diagnosisQuery = diagnosisQuery;
            return this;
        }

        @Override
        public LabTestsSearchDiagnosisRequest build() {
            return new LabTestsSearchDiagnosisRequest(diagnosisQuery);
        }
    }
}
