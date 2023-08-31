package com.vital.api.resources.athomephlebotomy.requests;

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
@JsonDeserialize(builder = AppointmentCancelRequest.Builder.class)
public final class AppointmentCancelRequest {
    private final String cancellationReasonId;

    private final Optional<String> notes;

    private AppointmentCancelRequest(String cancellationReasonId, Optional<String> notes) {
        this.cancellationReasonId = cancellationReasonId;
        this.notes = notes;
    }

    @JsonProperty("cancellation_reason_id")
    public String getCancellationReasonId() {
        return cancellationReasonId;
    }

    @JsonProperty("notes")
    public Optional<String> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppointmentCancelRequest && equalTo((AppointmentCancelRequest) other);
    }

    private boolean equalTo(AppointmentCancelRequest other) {
        return cancellationReasonId.equals(other.cancellationReasonId) && notes.equals(other.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cancellationReasonId, this.notes);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CancellationReasonIdStage builder() {
        return new Builder();
    }

    public interface CancellationReasonIdStage {
        _FinalStage cancellationReasonId(String cancellationReasonId);

        Builder from(AppointmentCancelRequest other);
    }

    public interface _FinalStage {
        AppointmentCancelRequest build();

        _FinalStage notes(Optional<String> notes);

        _FinalStage notes(String notes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CancellationReasonIdStage, _FinalStage {
        private String cancellationReasonId;

        private Optional<String> notes = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AppointmentCancelRequest other) {
            cancellationReasonId(other.getCancellationReasonId());
            notes(other.getNotes());
            return this;
        }

        @Override
        @JsonSetter("cancellation_reason_id")
        public _FinalStage cancellationReasonId(String cancellationReasonId) {
            this.cancellationReasonId = cancellationReasonId;
            return this;
        }

        @Override
        public _FinalStage notes(String notes) {
            this.notes = Optional.of(notes);
            return this;
        }

        @Override
        @JsonSetter(value = "notes", nulls = Nulls.SKIP)
        public _FinalStage notes(Optional<String> notes) {
            this.notes = notes;
            return this;
        }

        @Override
        public AppointmentCancelRequest build() {
            return new AppointmentCancelRequest(cancellationReasonId, notes);
        }
    }
}
