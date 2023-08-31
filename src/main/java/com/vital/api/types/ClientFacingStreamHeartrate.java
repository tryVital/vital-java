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

@JsonDeserialize(using = ClientFacingStreamHeartrate.Deserializer.class)
public final class ClientFacingStreamHeartrate {
    private final Object value;

    private final int type;

    private ClientFacingStreamHeartrate(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((List<Integer>) this.value);
        } else if (this.type == 1) {
            return visitor.visit((List<Integer>) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingStreamHeartrate && equalTo((ClientFacingStreamHeartrate) other);
    }

    private boolean equalTo(ClientFacingStreamHeartrate other) {
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

    public static ClientFacingStreamHeartrate of(List<Integer> value) {
        return new ClientFacingStreamHeartrate(value, 0);
    }

    public static ClientFacingStreamHeartrate of(List<Integer> value) {
        return new ClientFacingStreamHeartrate(value, 1);
    }

    public interface Visitor<T> {
        T visit(List<Integer> value);

        T visit(List<Integer> value);
    }

    static final class Deserializer extends StdDeserializer<ClientFacingStreamHeartrate> {
        Deserializer() {
            super(ClientFacingStreamHeartrate.class);
        }

        @Override
        public ClientFacingStreamHeartrate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<Integer>>() {}));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<Integer>>() {}));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
