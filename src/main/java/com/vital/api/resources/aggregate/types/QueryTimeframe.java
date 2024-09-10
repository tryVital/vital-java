/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.aggregate.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.Placeholder;
import com.vital.api.types.RelativeTimeframe;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = QueryTimeframe.Deserializer.class)
public final class QueryTimeframe {
    private final Object value;

    private final int type;

    private QueryTimeframe(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((RelativeTimeframe) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Placeholder) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof QueryTimeframe && equalTo((QueryTimeframe) other);
    }

    private boolean equalTo(QueryTimeframe other) {
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

    public static QueryTimeframe of(RelativeTimeframe value) {
        return new QueryTimeframe(value, 0);
    }

    public static QueryTimeframe of(Placeholder value) {
        return new QueryTimeframe(value, 1);
    }

    public interface Visitor<T> {
        T visit(RelativeTimeframe value);

        T visit(Placeholder value);
    }

    static final class Deserializer extends StdDeserializer<QueryTimeframe> {
        Deserializer() {
            super(QueryTimeframe.class);
        }

        @java.lang.Override
        public QueryTimeframe deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, RelativeTimeframe.class));
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
