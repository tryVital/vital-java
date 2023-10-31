/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ValidationError.Builder.class)
public final class ValidationError {
    private final List<ValidationErrorLocItem> loc;

    private final String msg;

    private final String type;

    private final Map<String, Object> additionalProperties;

    private ValidationError(
            List<ValidationErrorLocItem> loc, String msg, String type, Map<String, Object> additionalProperties) {
        this.loc = loc;
        this.msg = msg;
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("loc")
    public List<ValidationErrorLocItem> getLoc() {
        return loc;
    }

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ValidationError && equalTo((ValidationError) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ValidationError other) {
        return loc.equals(other.loc) && msg.equals(other.msg) && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.loc, this.msg, this.type);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MsgStage builder() {
        return new Builder();
    }

    public interface MsgStage {
        TypeStage msg(String msg);

        Builder from(ValidationError other);
    }

    public interface TypeStage {
        _FinalStage type(String type);
    }

    public interface _FinalStage {
        ValidationError build();

        _FinalStage loc(List<ValidationErrorLocItem> loc);

        _FinalStage addLoc(ValidationErrorLocItem loc);

        _FinalStage addAllLoc(List<ValidationErrorLocItem> loc);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MsgStage, TypeStage, _FinalStage {
        private String msg;

        private String type;

        private List<ValidationErrorLocItem> loc = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ValidationError other) {
            loc(other.getLoc());
            msg(other.getMsg());
            type(other.getType());
            return this;
        }

        @Override
        @JsonSetter("msg")
        public TypeStage msg(String msg) {
            this.msg = msg;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(String type) {
            this.type = type;
            return this;
        }

        @Override
        public _FinalStage addAllLoc(List<ValidationErrorLocItem> loc) {
            this.loc.addAll(loc);
            return this;
        }

        @Override
        public _FinalStage addLoc(ValidationErrorLocItem loc) {
            this.loc.add(loc);
            return this;
        }

        @Override
        @JsonSetter(value = "loc", nulls = Nulls.SKIP)
        public _FinalStage loc(List<ValidationErrorLocItem> loc) {
            this.loc.clear();
            this.loc.addAll(loc);
            return this;
        }

        @Override
        public ValidationError build() {
            return new ValidationError(loc, msg, type, additionalProperties);
        }
    }
}
