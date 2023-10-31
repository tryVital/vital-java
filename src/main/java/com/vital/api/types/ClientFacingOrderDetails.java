/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class ClientFacingOrderDetails {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ClientFacingOrderDetails(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ClientFacingOrderDetails walkInTest(ClientFacingWalkInOrderDetails value) {
        return new ClientFacingOrderDetails(new WalkInTestValue(value));
    }

    public static ClientFacingOrderDetails testkit(ClientFacingTestKitOrderDetails value) {
        return new ClientFacingOrderDetails(new TestkitValue(value));
    }

    public static ClientFacingOrderDetails atHomePhlebotomy(ClientFacingAtHomePhlebotomyOrderDetails value) {
        return new ClientFacingOrderDetails(new AtHomePhlebotomyValue(value));
    }

    public boolean isWalkInTest() {
        return value instanceof WalkInTestValue;
    }

    public boolean isTestkit() {
        return value instanceof TestkitValue;
    }

    public boolean isAtHomePhlebotomy() {
        return value instanceof AtHomePhlebotomyValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ClientFacingWalkInOrderDetails> getWalkInTest() {
        if (isWalkInTest()) {
            return Optional.of(((WalkInTestValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientFacingTestKitOrderDetails> getTestkit() {
        if (isTestkit()) {
            return Optional.of(((TestkitValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientFacingAtHomePhlebotomyOrderDetails> getAtHomePhlebotomy() {
        if (isAtHomePhlebotomy()) {
            return Optional.of(((AtHomePhlebotomyValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitWalkInTest(ClientFacingWalkInOrderDetails walkInTest);

        T visitTestkit(ClientFacingTestKitOrderDetails testkit);

        T visitAtHomePhlebotomy(ClientFacingAtHomePhlebotomyOrderDetails atHomePhlebotomy);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(WalkInTestValue.class),
        @JsonSubTypes.Type(TestkitValue.class),
        @JsonSubTypes.Type(AtHomePhlebotomyValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("walk_in_test")
    private static final class WalkInTestValue implements Value {
        @JsonUnwrapped
        private ClientFacingWalkInOrderDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WalkInTestValue() {}

        private WalkInTestValue(ClientFacingWalkInOrderDetails value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWalkInTest(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WalkInTestValue && equalTo((WalkInTestValue) other);
        }

        private boolean equalTo(WalkInTestValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ClientFacingOrderDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("testkit")
    private static final class TestkitValue implements Value {
        @JsonUnwrapped
        private ClientFacingTestKitOrderDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TestkitValue() {}

        private TestkitValue(ClientFacingTestKitOrderDetails value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTestkit(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TestkitValue && equalTo((TestkitValue) other);
        }

        private boolean equalTo(TestkitValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ClientFacingOrderDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("at_home_phlebotomy")
    private static final class AtHomePhlebotomyValue implements Value {
        @JsonUnwrapped
        private ClientFacingAtHomePhlebotomyOrderDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AtHomePhlebotomyValue() {}

        private AtHomePhlebotomyValue(ClientFacingAtHomePhlebotomyOrderDetails value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAtHomePhlebotomy(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AtHomePhlebotomyValue && equalTo((AtHomePhlebotomyValue) other);
        }

        private boolean equalTo(AtHomePhlebotomyValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ClientFacingOrderDetails{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @Override
        public String toString() {
            return "ClientFacingOrderDetails{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
