package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingDiagnosisInformation.Builder.class)
public final class ClientFacingDiagnosisInformation {
    private final String diagnosisCode;

    private final String description;

    private ClientFacingDiagnosisInformation(String diagnosisCode, String description) {
        this.diagnosisCode = diagnosisCode;
        this.description = description;
    }

    /**
     * @return Diagnosis code for insurance information required by Labcorp.
     */
    @JsonProperty("diagnosis_code")
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * @return Diagnosis description insurance information required by Labcorp.
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingDiagnosisInformation && equalTo((ClientFacingDiagnosisInformation) other);
    }

    private boolean equalTo(ClientFacingDiagnosisInformation other) {
        return diagnosisCode.equals(other.diagnosisCode) && description.equals(other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.diagnosisCode, this.description);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DiagnosisCodeStage builder() {
        return new Builder();
    }

    public interface DiagnosisCodeStage {
        DescriptionStage diagnosisCode(String diagnosisCode);

        Builder from(ClientFacingDiagnosisInformation other);
    }

    public interface DescriptionStage {
        _FinalStage description(String description);
    }

    public interface _FinalStage {
        ClientFacingDiagnosisInformation build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DiagnosisCodeStage, DescriptionStage, _FinalStage {
        private String diagnosisCode;

        private String description;

        private Builder() {}

        @Override
        public Builder from(ClientFacingDiagnosisInformation other) {
            diagnosisCode(other.getDiagnosisCode());
            description(other.getDescription());
            return this;
        }

        /**
         * <p>Diagnosis code for insurance information required by Labcorp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("diagnosis_code")
        public DescriptionStage diagnosisCode(String diagnosisCode) {
            this.diagnosisCode = diagnosisCode;
            return this;
        }

        /**
         * <p>Diagnosis description insurance information required by Labcorp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("description")
        public _FinalStage description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public ClientFacingDiagnosisInformation build() {
            return new ClientFacingDiagnosisInformation(diagnosisCode, description);
        }
    }
}