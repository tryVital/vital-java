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

@JsonDeserialize(using = HealthInsuranceCreateRequestPatientSignatureImage.Deserializer.class)
public final class HealthInsuranceCreateRequestPatientSignatureImage {
    private final Object value;

    private final int type;

    private HealthInsuranceCreateRequestPatientSignatureImage(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((Jpeg) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Png) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthInsuranceCreateRequestPatientSignatureImage
                && equalTo((HealthInsuranceCreateRequestPatientSignatureImage) other);
    }

    private boolean equalTo(HealthInsuranceCreateRequestPatientSignatureImage other) {
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

    public static HealthInsuranceCreateRequestPatientSignatureImage of(Jpeg value) {
        return new HealthInsuranceCreateRequestPatientSignatureImage(value, 0);
    }

    public static HealthInsuranceCreateRequestPatientSignatureImage of(Png value) {
        return new HealthInsuranceCreateRequestPatientSignatureImage(value, 1);
    }

    public interface Visitor<T> {
        T visit(Jpeg value);

        T visit(Png value);
    }

    static final class Deserializer extends StdDeserializer<HealthInsuranceCreateRequestPatientSignatureImage> {
        Deserializer() {
            super(HealthInsuranceCreateRequestPatientSignatureImage.class);
        }

        @Override
        public HealthInsuranceCreateRequestPatientSignatureImage deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Jpeg.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Png.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
