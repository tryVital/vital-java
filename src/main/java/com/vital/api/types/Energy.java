package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Energy.Builder.class)
public final class Energy {
    private final double value;

    private Energy(double value) {
        this.value = value;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return "kcal";
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Energy && equalTo((Energy) other);
    }

    private boolean equalTo(Energy other) {
        return value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValueStage builder() {
        return new Builder();
    }

    public interface ValueStage {
        _FinalStage value(double value);

        Builder from(Energy other);
    }

    public interface _FinalStage {
        Energy build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValueStage, _FinalStage {
        private double value;

        private Builder() {}

        @Override
        public Builder from(Energy other) {
            value(other.getValue());
            return this;
        }

        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        public Energy build() {
            return new Energy(value);
        }
    }
}
