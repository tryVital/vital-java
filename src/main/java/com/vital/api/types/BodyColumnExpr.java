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
@JsonDeserialize(builder = BodyColumnExpr.Builder.class)
public final class BodyColumnExpr {
    private final BodyColumnExprBody body;

    private final Map<String, Object> additionalProperties;

    private BodyColumnExpr(BodyColumnExprBody body, Map<String, Object> additionalProperties) {
        this.body = body;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ℹ️ This enum is non-exhaustive.
     */
    @JsonProperty("body")
    public BodyColumnExprBody getBody() {
        return body;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BodyColumnExpr && equalTo((BodyColumnExpr) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BodyColumnExpr other) {
        return body.equals(other.body);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.body);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BodyStage builder() {
        return new Builder();
    }

    public interface BodyStage {
        _FinalStage body(BodyColumnExprBody body);

        Builder from(BodyColumnExpr other);
    }

    public interface _FinalStage {
        BodyColumnExpr build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BodyStage, _FinalStage {
        private BodyColumnExprBody body;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BodyColumnExpr other) {
            body(other.getBody());
            return this;
        }

        /**
         * <p>ℹ️ This enum is non-exhaustive.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("body")
        public _FinalStage body(BodyColumnExprBody body) {
            this.body = body;
            return this;
        }

        @java.lang.Override
        public BodyColumnExpr build() {
            return new BodyColumnExpr(body, additionalProperties);
        }
    }
}
