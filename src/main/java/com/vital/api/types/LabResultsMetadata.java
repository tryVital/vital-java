package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabResultsMetadata.Builder.class)
public final class LabResultsMetadata {
    private final String age;

    private final String dob;

    private final Optional<String> clia;

    private final String patient;

    private final Optional<String> provider;

    private final Optional<String> laboratory;

    private final String dateReported;

    private final Optional<String> dateCollected;

    private final String specimenNumber;

    private final Optional<String> dateReceived;

    private LabResultsMetadata(
            String age,
            String dob,
            Optional<String> clia,
            String patient,
            Optional<String> provider,
            Optional<String> laboratory,
            String dateReported,
            Optional<String> dateCollected,
            String specimenNumber,
            Optional<String> dateReceived) {
        this.age = age;
        this.dob = dob;
        this.clia = clia;
        this.patient = patient;
        this.provider = provider;
        this.laboratory = laboratory;
        this.dateReported = dateReported;
        this.dateCollected = dateCollected;
        this.specimenNumber = specimenNumber;
        this.dateReceived = dateReceived;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("clia_#")
    public Optional<String> getClia() {
        return clia;
    }

    @JsonProperty("patient")
    public String getPatient() {
        return patient;
    }

    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    @JsonProperty("laboratory")
    public Optional<String> getLaboratory() {
        return laboratory;
    }

    @JsonProperty("date_reported")
    public String getDateReported() {
        return dateReported;
    }

    @JsonProperty("date_collected")
    public Optional<String> getDateCollected() {
        return dateCollected;
    }

    @JsonProperty("specimen_number")
    public String getSpecimenNumber() {
        return specimenNumber;
    }

    @JsonProperty("date_received")
    public Optional<String> getDateReceived() {
        return dateReceived;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabResultsMetadata && equalTo((LabResultsMetadata) other);
    }

    private boolean equalTo(LabResultsMetadata other) {
        return age.equals(other.age)
                && dob.equals(other.dob)
                && clia.equals(other.clia)
                && patient.equals(other.patient)
                && provider.equals(other.provider)
                && laboratory.equals(other.laboratory)
                && dateReported.equals(other.dateReported)
                && dateCollected.equals(other.dateCollected)
                && specimenNumber.equals(other.specimenNumber)
                && dateReceived.equals(other.dateReceived);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.age,
                this.dob,
                this.clia,
                this.patient,
                this.provider,
                this.laboratory,
                this.dateReported,
                this.dateCollected,
                this.specimenNumber,
                this.dateReceived);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AgeStage builder() {
        return new Builder();
    }

    public interface AgeStage {
        DobStage age(String age);

        Builder from(LabResultsMetadata other);
    }

    public interface DobStage {
        PatientStage dob(String dob);
    }

    public interface PatientStage {
        DateReportedStage patient(String patient);
    }

    public interface DateReportedStage {
        SpecimenNumberStage dateReported(String dateReported);
    }

    public interface SpecimenNumberStage {
        _FinalStage specimenNumber(String specimenNumber);
    }

    public interface _FinalStage {
        LabResultsMetadata build();

        _FinalStage clia(Optional<String> clia);

        _FinalStage clia(String clia);

        _FinalStage provider(Optional<String> provider);

        _FinalStage provider(String provider);

        _FinalStage laboratory(Optional<String> laboratory);

        _FinalStage laboratory(String laboratory);

        _FinalStage dateCollected(Optional<String> dateCollected);

        _FinalStage dateCollected(String dateCollected);

        _FinalStage dateReceived(Optional<String> dateReceived);

        _FinalStage dateReceived(String dateReceived);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AgeStage, DobStage, PatientStage, DateReportedStage, SpecimenNumberStage, _FinalStage {
        private String age;

        private String dob;

        private String patient;

        private String dateReported;

        private String specimenNumber;

        private Optional<String> dateReceived = Optional.empty();

        private Optional<String> dateCollected = Optional.empty();

        private Optional<String> laboratory = Optional.empty();

        private Optional<String> provider = Optional.empty();

        private Optional<String> clia = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LabResultsMetadata other) {
            age(other.getAge());
            dob(other.getDob());
            clia(other.getClia());
            patient(other.getPatient());
            provider(other.getProvider());
            laboratory(other.getLaboratory());
            dateReported(other.getDateReported());
            dateCollected(other.getDateCollected());
            specimenNumber(other.getSpecimenNumber());
            dateReceived(other.getDateReceived());
            return this;
        }

        @Override
        @JsonSetter("age")
        public DobStage age(String age) {
            this.age = age;
            return this;
        }

        @Override
        @JsonSetter("dob")
        public PatientStage dob(String dob) {
            this.dob = dob;
            return this;
        }

        @Override
        @JsonSetter("patient")
        public DateReportedStage patient(String patient) {
            this.patient = patient;
            return this;
        }

        @Override
        @JsonSetter("date_reported")
        public SpecimenNumberStage dateReported(String dateReported) {
            this.dateReported = dateReported;
            return this;
        }

        @Override
        @JsonSetter("specimen_number")
        public _FinalStage specimenNumber(String specimenNumber) {
            this.specimenNumber = specimenNumber;
            return this;
        }

        @Override
        public _FinalStage dateReceived(String dateReceived) {
            this.dateReceived = Optional.of(dateReceived);
            return this;
        }

        @Override
        @JsonSetter(value = "date_received", nulls = Nulls.SKIP)
        public _FinalStage dateReceived(Optional<String> dateReceived) {
            this.dateReceived = dateReceived;
            return this;
        }

        @Override
        public _FinalStage dateCollected(String dateCollected) {
            this.dateCollected = Optional.of(dateCollected);
            return this;
        }

        @Override
        @JsonSetter(value = "date_collected", nulls = Nulls.SKIP)
        public _FinalStage dateCollected(Optional<String> dateCollected) {
            this.dateCollected = dateCollected;
            return this;
        }

        @Override
        public _FinalStage laboratory(String laboratory) {
            this.laboratory = Optional.of(laboratory);
            return this;
        }

        @Override
        @JsonSetter(value = "laboratory", nulls = Nulls.SKIP)
        public _FinalStage laboratory(Optional<String> laboratory) {
            this.laboratory = laboratory;
            return this;
        }

        @Override
        public _FinalStage provider(String provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        @Override
        public _FinalStage clia(String clia) {
            this.clia = Optional.of(clia);
            return this;
        }

        @Override
        @JsonSetter(value = "clia_#", nulls = Nulls.SKIP)
        public _FinalStage clia(Optional<String> clia) {
            this.clia = clia;
            return this;
        }

        @Override
        public LabResultsMetadata build() {
            return new LabResultsMetadata(
                    age,
                    dob,
                    clia,
                    patient,
                    provider,
                    laboratory,
                    dateReported,
                    dateCollected,
                    specimenNumber,
                    dateReceived);
        }
    }
}
