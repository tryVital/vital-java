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

@JsonDeserialize(using = ValidationErrorLocItem.Deserializer.class)
public final class ValidationErrorLocItem {
    private final Object value;

    private final int type;

    private ValidationErrorLocItem(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((String) this.value);
        } else if (this.type == 1) {
            return visitor.visit((int) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ValidationErrorLocItem && equalTo((ValidationErrorLocItem) other);
    }

    private boolean equalTo(ValidationErrorLocItem other) {
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

    public static ValidationErrorLocItem of(String value) {
        return new ValidationErrorLocItem(value, 0);
    }

    public static ValidationErrorLocItem of(int value) {
        return new ValidationErrorLocItem(value, 1);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(int value);
    }

    static final class Deserializer extends StdDeserializer<ValidationErrorLocItem> {
        Deserializer() {
            super(ValidationErrorLocItem.class);
        }

        @Override
        public ValidationErrorLocItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            if (value instanceof Integer) {
                return of((Integer) value);
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
