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
@JsonDeserialize(builder = VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest.Builder.class)
public final class VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest {
    private final String cancellationReasonId;

    private final Optional<String> note;

    private final Map<String, Object> additionalProperties;

    private VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest(
            String cancellationReasonId, Optional<String> note, Map<String, Object> additionalProperties) {
        this.cancellationReasonId = cancellationReasonId;
        this.note = note;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("cancellationReasonId")
    public String getCancellationReasonId() {
        return cancellationReasonId;
    }

    @JsonProperty("note")
    public Optional<String> getNote() {
        return note;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest
                && equalTo((VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest other) {
        return cancellationReasonId.equals(other.cancellationReasonId) && note.equals(other.note);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cancellationReasonId, this.note);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CancellationReasonIdStage builder() {
        return new Builder();
    }

    public interface CancellationReasonIdStage {
        _FinalStage cancellationReasonId(String cancellationReasonId);

        Builder from(VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest other);
    }

    public interface _FinalStage {
        VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest build();

        _FinalStage note(Optional<String> note);

        _FinalStage note(String note);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CancellationReasonIdStage, _FinalStage {
        private String cancellationReasonId;

        private Optional<String> note = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest other) {
            cancellationReasonId(other.getCancellationReasonId());
            note(other.getNote());
            return this;
        }

        @java.lang.Override
        @JsonSetter("cancellationReasonId")
        public _FinalStage cancellationReasonId(String cancellationReasonId) {
            this.cancellationReasonId = cancellationReasonId;
            return this;
        }

        @java.lang.Override
        public _FinalStage note(String note) {
            this.note = Optional.of(note);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "note", nulls = Nulls.SKIP)
        public _FinalStage note(Optional<String> note) {
            this.note = note;
            return this;
        }

        @java.lang.Override
        public VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest build() {
            return new VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest(
                    cancellationReasonId, note, additionalProperties);
        }
    }
}
