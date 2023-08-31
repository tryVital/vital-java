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
import java.util.Objects;

@JsonDeserialize(using = ClientFacingStreamVelocitySmooth.Deserializer.class)
public final class ClientFacingStreamVelocitySmooth {
    private final Object value;

    private final int type;

    private ClientFacingStreamVelocitySmooth(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((List<Double>) this.value);
        } else if (this.type == 1) {
            return visitor.visit((List<Double>) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingStreamVelocitySmooth && equalTo((ClientFacingStreamVelocitySmooth) other);
    }

    private boolean equalTo(ClientFacingStreamVelocitySmooth other) {
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

    public static ClientFacingStreamVelocitySmooth of(List<Double> value) {
        return new ClientFacingStreamVelocitySmooth(value, 0);
    }

    public static ClientFacingStreamVelocitySmooth of(List<Double> value) {
        return new ClientFacingStreamVelocitySmooth(value, 1);
    }

    public interface Visitor<T> {
        T visit(List<Double> value);

        T visit(List<Double> value);
    }

    static final class Deserializer extends StdDeserializer<ClientFacingStreamVelocitySmooth> {
        Deserializer() {
            super(ClientFacingStreamVelocitySmooth.class);
        }

        @Override
        public ClientFacingStreamVelocitySmooth deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<Double>>() {}));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<Double>>() {}));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
