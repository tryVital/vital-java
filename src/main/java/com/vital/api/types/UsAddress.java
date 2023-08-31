package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UsAddress.Builder.class)
public final class UsAddress {
    private final String firstLine;

    private final Optional<String> secondLine;

    private final String city;

    private final String state;

    private final String zipCode;

    private final Optional<String> unit;

    private UsAddress(
            String firstLine,
            Optional<String> secondLine,
            String city,
            String state,
            String zipCode,
            Optional<String> unit) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.unit = unit;
    }

    @JsonProperty("first_line")
    public String getFirstLine() {
        return firstLine;
    }

    @JsonProperty("second_line")
    public Optional<String> getSecondLine() {
        return secondLine;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("unit")
    public Optional<String> getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UsAddress && equalTo((UsAddress) other);
    }

    private boolean equalTo(UsAddress other) {
        return firstLine.equals(other.firstLine)
                && secondLine.equals(other.secondLine)
                && city.equals(other.city)
                && state.equals(other.state)
                && zipCode.equals(other.zipCode)
                && unit.equals(other.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstLine, this.secondLine, this.city, this.state, this.zipCode, this.unit);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FirstLineStage builder() {
        return new Builder();
    }

    public interface FirstLineStage {
        CityStage firstLine(String firstLine);

        Builder from(UsAddress other);
    }

    public interface CityStage {
        StateStage city(String city);
    }

    public interface StateStage {
        ZipCodeStage state(String state);
    }

    public interface ZipCodeStage {
        _FinalStage zipCode(String zipCode);
    }

    public interface _FinalStage {
        UsAddress build();

        _FinalStage secondLine(Optional<String> secondLine);

        _FinalStage secondLine(String secondLine);

        _FinalStage unit(Optional<String> unit);

        _FinalStage unit(String unit);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FirstLineStage, CityStage, StateStage, ZipCodeStage, _FinalStage {
        private String firstLine;

        private String city;

        private String state;

        private String zipCode;

        private Optional<String> unit = Optional.empty();

        private Optional<String> secondLine = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(UsAddress other) {
            firstLine(other.getFirstLine());
            secondLine(other.getSecondLine());
            city(other.getCity());
            state(other.getState());
            zipCode(other.getZipCode());
            unit(other.getUnit());
            return this;
        }

        @Override
        @JsonSetter("first_line")
        public CityStage firstLine(String firstLine) {
            this.firstLine = firstLine;
            return this;
        }

        @Override
        @JsonSetter("city")
        public StateStage city(String city) {
            this.city = city;
            return this;
        }

        @Override
        @JsonSetter("state")
        public ZipCodeStage state(String state) {
            this.state = state;
            return this;
        }

        @Override
        @JsonSetter("zip_code")
        public _FinalStage zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        @Override
        public _FinalStage unit(String unit) {
            this.unit = Optional.of(unit);
            return this;
        }

        @Override
        @JsonSetter(value = "unit", nulls = Nulls.SKIP)
        public _FinalStage unit(Optional<String> unit) {
            this.unit = unit;
            return this;
        }

        @Override
        public _FinalStage secondLine(String secondLine) {
            this.secondLine = Optional.of(secondLine);
            return this;
        }

        @Override
        @JsonSetter(value = "second_line", nulls = Nulls.SKIP)
        public _FinalStage secondLine(Optional<String> secondLine) {
            this.secondLine = secondLine;
            return this;
        }

        @Override
        public UsAddress build() {
            return new UsAddress(firstLine, secondLine, city, state, zipCode, unit);
        }
    }
}