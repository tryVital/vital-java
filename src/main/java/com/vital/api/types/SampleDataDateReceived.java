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

@JsonDeserialize(using = SampleDataDateReceived.Deserializer.class)
public final class SampleDataDateReceived {
    private final Object value;

    private final int type;

    private SampleDataDateReceived(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((UtcTimestampWithTimezoneOffset) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SampleDataDateReceived && equalTo((SampleDataDateReceived) other);
    }

    private boolean equalTo(SampleDataDateReceived other) {
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

    public static SampleDataDateReceived of(UtcTimestampWithTimezoneOffset value) {
        return new SampleDataDateReceived(value, 0);
    }

    public static SampleDataDateReceived of(String value) {
        return new SampleDataDateReceived(value, 1);
    }

    public interface Visitor<T> {
        T visit(UtcTimestampWithTimezoneOffset value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<SampleDataDateReceived> {
        Deserializer() {
            super(SampleDataDateReceived.class);
        }

        @java.lang.Override
        public SampleDataDateReceived deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, UtcTimestampWithTimezoneOffset.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
