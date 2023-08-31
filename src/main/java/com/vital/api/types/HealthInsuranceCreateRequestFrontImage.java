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

public final class HealthInsuranceCreateRequestFrontImage {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private HealthInsuranceCreateRequestFrontImage(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static HealthInsuranceCreateRequestFrontImage imageJpeg(Jpeg value) {
        return new HealthInsuranceCreateRequestFrontImage(new ImageJpegValue(value));
    }

    public static HealthInsuranceCreateRequestFrontImage imagePng(Png value) {
        return new HealthInsuranceCreateRequestFrontImage(new ImagePngValue(value));
    }

    public boolean isImageJpeg() {
        return value instanceof ImageJpegValue;
    }

    public boolean isImagePng() {
        return value instanceof ImagePngValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<Jpeg> getImageJpeg() {
        if (isImageJpeg()) {
            return Optional.of(((ImageJpegValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Png> getImagePng() {
        if (isImagePng()) {
            return Optional.of(((ImagePngValue) value).value);
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
        T visitImageJpeg(Jpeg imageJpeg);

        T visitImagePng(Png imagePng);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "content_type",
            visible = true,
            defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(ImageJpegValue.class), @JsonSubTypes.Type(ImagePngValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("image/jpeg")
    private static final class ImageJpegValue implements Value {
        @JsonUnwrapped
        private Jpeg value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ImageJpegValue() {}

        private ImageJpegValue(Jpeg value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitImageJpeg(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ImageJpegValue && equalTo((ImageJpegValue) other);
        }

        private boolean equalTo(ImageJpegValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "HealthInsuranceCreateRequestFrontImage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("image/png")
    private static final class ImagePngValue implements Value {
        @JsonUnwrapped
        private Png value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ImagePngValue() {}

        private ImagePngValue(Png value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitImagePng(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ImagePngValue && equalTo((ImagePngValue) other);
        }

        private boolean equalTo(ImagePngValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "HealthInsuranceCreateRequestFrontImage{" + "value: " + value + "}";
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
            return "HealthInsuranceCreateRequestFrontImage{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
