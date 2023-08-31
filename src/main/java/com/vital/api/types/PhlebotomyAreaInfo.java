package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PhlebotomyAreaInfo.Builder.class)
public final class PhlebotomyAreaInfo {
    private final boolean isServed;

    private PhlebotomyAreaInfo(boolean isServed) {
        this.isServed = isServed;
    }

    @JsonProperty("is_served")
    public boolean getIsServed() {
        return isServed;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhlebotomyAreaInfo && equalTo((PhlebotomyAreaInfo) other);
    }

    private boolean equalTo(PhlebotomyAreaInfo other) {
        return isServed == other.isServed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.isServed);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IsServedStage builder() {
        return new Builder();
    }

    public interface IsServedStage {
        _FinalStage isServed(boolean isServed);

        Builder from(PhlebotomyAreaInfo other);
    }

    public interface _FinalStage {
        PhlebotomyAreaInfo build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IsServedStage, _FinalStage {
        private boolean isServed;

        private Builder() {}

        @Override
        public Builder from(PhlebotomyAreaInfo other) {
            isServed(other.getIsServed());
            return this;
        }

        @Override
        @JsonSetter("is_served")
        public _FinalStage isServed(boolean isServed) {
            this.isServed = isServed;
            return this;
        }

        @Override
        public PhlebotomyAreaInfo build() {
            return new PhlebotomyAreaInfo(isServed);
        }
    }
}
