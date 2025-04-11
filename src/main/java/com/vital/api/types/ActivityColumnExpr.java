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
@JsonDeserialize(builder = ActivityColumnExpr.Builder.class)
public final class ActivityColumnExpr {
    private final ActivityColumnExprActivity activity;

    private final Map<String, Object> additionalProperties;

    private ActivityColumnExpr(ActivityColumnExprActivity activity, Map<String, Object> additionalProperties) {
        this.activity = activity;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ℹ️ This enum is non-exhaustive.
     */
    @JsonProperty("activity")
    public ActivityColumnExprActivity getActivity() {
        return activity;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActivityColumnExpr && equalTo((ActivityColumnExpr) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActivityColumnExpr other) {
        return activity.equals(other.activity);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.activity);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActivityStage builder() {
        return new Builder();
    }

    public interface ActivityStage {
        _FinalStage activity(ActivityColumnExprActivity activity);

        Builder from(ActivityColumnExpr other);
    }

    public interface _FinalStage {
        ActivityColumnExpr build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActivityStage, _FinalStage {
        private ActivityColumnExprActivity activity;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActivityColumnExpr other) {
            activity(other.getActivity());
            return this;
        }

        /**
         * <p>ℹ️ This enum is non-exhaustive.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("activity")
        public _FinalStage activity(ActivityColumnExprActivity activity) {
            this.activity = activity;
            return this;
        }

        @java.lang.Override
        public ActivityColumnExpr build() {
            return new ActivityColumnExpr(activity, additionalProperties);
        }
    }
}
