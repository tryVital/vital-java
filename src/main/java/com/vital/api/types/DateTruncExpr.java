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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DateTruncExpr.Builder.class)
public final class DateTruncExpr {
    private final Period dateTrunc;

    private final DateTruncExprArg arg;

    private final Map<String, Object> additionalProperties;

    private DateTruncExpr(Period dateTrunc, DateTruncExprArg arg, Map<String, Object> additionalProperties) {
        this.dateTrunc = dateTrunc;
        this.arg = arg;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("date_trunc")
    public Period getDateTrunc() {
        return dateTrunc;
    }

    @JsonProperty("arg")
    public DateTruncExprArg getArg() {
        return arg;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DateTruncExpr && equalTo((DateTruncExpr) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DateTruncExpr other) {
        return dateTrunc.equals(other.dateTrunc) && arg.equals(other.arg);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.dateTrunc, this.arg);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateTruncStage builder() {
        return new Builder();
    }

    public interface DateTruncStage {
        ArgStage dateTrunc(Period dateTrunc);

        Builder from(DateTruncExpr other);
    }

    public interface ArgStage {
        _FinalStage arg(DateTruncExprArg arg);
    }

    public interface _FinalStage {
        DateTruncExpr build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateTruncStage, ArgStage, _FinalStage {
        private Period dateTrunc;

        private DateTruncExprArg arg;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DateTruncExpr other) {
            dateTrunc(other.getDateTrunc());
            arg(other.getArg());
            return this;
        }

        @java.lang.Override
        @JsonSetter("date_trunc")
        public ArgStage dateTrunc(Period dateTrunc) {
            this.dateTrunc = dateTrunc;
            return this;
        }

        @java.lang.Override
        @JsonSetter("arg")
        public _FinalStage arg(DateTruncExprArg arg) {
            this.arg = arg;
            return this;
        }

        @java.lang.Override
        public DateTruncExpr build() {
            return new DateTruncExpr(dateTrunc, arg, additionalProperties);
        }
    }
}
