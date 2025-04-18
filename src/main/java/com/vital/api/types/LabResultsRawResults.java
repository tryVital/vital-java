/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.vital.api.core.ObjectMappers;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonDeserialize(using = LabResultsRawResults.Deserializer.class)
public final class LabResultsRawResults {
    private final Object value;

    private final int type;

    private LabResultsRawResults(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((List<BiomarkerResult>) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Map<String, Object>) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabResultsRawResults && equalTo((LabResultsRawResults) other);
    }

    private boolean equalTo(LabResultsRawResults other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static LabResultsRawResults of(List<BiomarkerResult> value) {
        return new LabResultsRawResults(value, 0);
    }

    public static LabResultsRawResults of(Map<String, Object> value) {
        return new LabResultsRawResults(value, 1);
    }

    public interface Visitor<T> {
        T visit(List<BiomarkerResult> value);

        T visit(Map<String, Object> value);
    }

    static final class Deserializer extends StdDeserializer<LabResultsRawResults> {
        Deserializer() {
            super(LabResultsRawResults.class);
        }

        @java.lang.Override
        public LabResultsRawResults deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<BiomarkerResult>>() {}));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<Map<String, Object>>() {}));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
