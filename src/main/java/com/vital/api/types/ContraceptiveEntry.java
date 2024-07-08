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
@JsonDeserialize(builder = ContraceptiveEntry.Builder.class)
public final class ContraceptiveEntry {
    private final String date;

    private final ContraceptiveEntryType type;

    private final Map<String, Object> additionalProperties;

    private ContraceptiveEntry(String date, ContraceptiveEntryType type, Map<String, Object> additionalProperties) {
        this.date = date;
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("type")
    public ContraceptiveEntryType getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContraceptiveEntry && equalTo((ContraceptiveEntry) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContraceptiveEntry other) {
        return date.equals(other.date) && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.date, this.type);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        TypeStage date(String date);

        Builder from(ContraceptiveEntry other);
    }

    public interface TypeStage {
        _FinalStage type(ContraceptiveEntryType type);
    }

    public interface _FinalStage {
        ContraceptiveEntry build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateStage, TypeStage, _FinalStage {
        private String date;

        private ContraceptiveEntryType type;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ContraceptiveEntry other) {
            date(other.getDate());
            type(other.getType());
            return this;
        }

        @Override
        @JsonSetter("date")
        public TypeStage date(String date) {
            this.date = date;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(ContraceptiveEntryType type) {
            this.type = type;
            return this;
        }

        @Override
        public ContraceptiveEntry build() {
            return new ContraceptiveEntry(date, type, additionalProperties);
        }
    }
}
