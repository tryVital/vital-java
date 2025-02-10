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
@JsonDeserialize(builder = GroupKeyColumnExpr.Builder.class)
public final class GroupKeyColumnExpr {
    private final GroupKeyColumnExprGroupKey groupKey;

    private final Map<String, Object> additionalProperties;

    private GroupKeyColumnExpr(GroupKeyColumnExprGroupKey groupKey, Map<String, Object> additionalProperties) {
        this.groupKey = groupKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("group_key")
    public GroupKeyColumnExprGroupKey getGroupKey() {
        return groupKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupKeyColumnExpr && equalTo((GroupKeyColumnExpr) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupKeyColumnExpr other) {
        return groupKey.equals(other.groupKey);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.groupKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static GroupKeyStage builder() {
        return new Builder();
    }

    public interface GroupKeyStage {
        _FinalStage groupKey(GroupKeyColumnExprGroupKey groupKey);

        Builder from(GroupKeyColumnExpr other);
    }

    public interface _FinalStage {
        GroupKeyColumnExpr build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements GroupKeyStage, _FinalStage {
        private GroupKeyColumnExprGroupKey groupKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GroupKeyColumnExpr other) {
            groupKey(other.getGroupKey());
            return this;
        }

        @java.lang.Override
        @JsonSetter("group_key")
        public _FinalStage groupKey(GroupKeyColumnExprGroupKey groupKey) {
            this.groupKey = groupKey;
            return this;
        }

        @java.lang.Override
        public GroupKeyColumnExpr build() {
            return new GroupKeyColumnExpr(groupKey, additionalProperties);
        }
    }
}
