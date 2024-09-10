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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GroupedWaterResponse.Builder.class)
public final class GroupedWaterResponse {
    private final Map<String, List<GroupedWater>> groups;

    private final Optional<String> next;

    private final Optional<String> nextCursor;

    private final Map<String, Object> additionalProperties;

    private GroupedWaterResponse(
            Map<String, List<GroupedWater>> groups,
            Optional<String> next,
            Optional<String> nextCursor,
            Map<String, Object> additionalProperties) {
        this.groups = groups;
        this.next = next;
        this.nextCursor = nextCursor;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return For each matching provider or lab, a list of grouped timeseries values.
     */
    @JsonProperty("groups")
    public Map<String, List<GroupedWater>> getGroups() {
        return groups;
    }

    /**
     * @return The cursor for fetching the next page, or <code>null</code> if there is no more data.
     */
    @JsonProperty("next")
    public Optional<String> getNext() {
        return next;
    }

    /**
     * @return The cursor for fetching the next page, or <code>null</code> if there is no more data.
     */
    @JsonProperty("next_cursor")
    public Optional<String> getNextCursor() {
        return nextCursor;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupedWaterResponse && equalTo((GroupedWaterResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupedWaterResponse other) {
        return groups.equals(other.groups) && next.equals(other.next) && nextCursor.equals(other.nextCursor);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.groups, this.next, this.nextCursor);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Map<String, List<GroupedWater>> groups = new LinkedHashMap<>();

        private Optional<String> next = Optional.empty();

        private Optional<String> nextCursor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GroupedWaterResponse other) {
            groups(other.getGroups());
            next(other.getNext());
            nextCursor(other.getNextCursor());
            return this;
        }

        @JsonSetter(value = "groups", nulls = Nulls.SKIP)
        public Builder groups(Map<String, List<GroupedWater>> groups) {
            this.groups.clear();
            this.groups.putAll(groups);
            return this;
        }

        public Builder putAllGroups(Map<String, List<GroupedWater>> groups) {
            this.groups.putAll(groups);
            return this;
        }

        public Builder groups(String key, List<GroupedWater> value) {
            this.groups.put(key, value);
            return this;
        }

        @JsonSetter(value = "next", nulls = Nulls.SKIP)
        public Builder next(Optional<String> next) {
            this.next = next;
            return this;
        }

        public Builder next(String next) {
            this.next = Optional.of(next);
            return this;
        }

        @JsonSetter(value = "next_cursor", nulls = Nulls.SKIP)
        public Builder nextCursor(Optional<String> nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        public Builder nextCursor(String nextCursor) {
            this.nextCursor = Optional.of(nextCursor);
            return this;
        }

        public GroupedWaterResponse build() {
            return new GroupedWaterResponse(groups, next, nextCursor, additionalProperties);
        }
    }
}
