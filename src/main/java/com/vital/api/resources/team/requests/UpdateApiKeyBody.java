package com.vital.api.resources.team.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UpdateApiKeyBody.Builder.class)
public final class UpdateApiKeyBody {
    private final String label;

    private UpdateApiKeyBody(String label) {
        this.label = label;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateApiKeyBody && equalTo((UpdateApiKeyBody) other);
    }

    private boolean equalTo(UpdateApiKeyBody other) {
        return label.equals(other.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.label);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LabelStage builder() {
        return new Builder();
    }

    public interface LabelStage {
        _FinalStage label(String label);

        Builder from(UpdateApiKeyBody other);
    }

    public interface _FinalStage {
        UpdateApiKeyBody build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LabelStage, _FinalStage {
        private String label;

        private Builder() {}

        @Override
        public Builder from(UpdateApiKeyBody other) {
            label(other.getLabel());
            return this;
        }

        @Override
        @JsonSetter("label")
        public _FinalStage label(String label) {
            this.label = label;
            return this;
        }

        @Override
        public UpdateApiKeyBody build() {
            return new UpdateApiKeyBody(label);
        }
    }
}
