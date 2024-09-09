/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.vital.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = QueryInstructionPartitionBy.Deserializer.class)
public final class QueryInstructionPartitionBy {
    private final Object value;

    private final int type;

    private QueryInstructionPartitionBy(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((Period) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Placeholder) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof QueryInstructionPartitionBy && equalTo((QueryInstructionPartitionBy) other);
    }

    private boolean equalTo(QueryInstructionPartitionBy other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static QueryInstructionPartitionBy of(Period value) {
        return new QueryInstructionPartitionBy(value, 0);
    }

    public static QueryInstructionPartitionBy of(Placeholder value) {
        return new QueryInstructionPartitionBy(value, 1);
    }

    public interface Visitor<T> {
        T visit(Period value);

        T visit(Placeholder value);
    }

    static final class Deserializer extends StdDeserializer<QueryInstructionPartitionBy> {
        Deserializer() {
            super(QueryInstructionPartitionBy.class);
        }

        @Override
        public QueryInstructionPartitionBy deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Period.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Placeholder.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
