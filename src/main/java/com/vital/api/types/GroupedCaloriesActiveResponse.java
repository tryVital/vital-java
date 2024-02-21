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
@JsonDeserialize(builder = GroupedCaloriesActiveResponse.Builder.class)
public final class GroupedCaloriesActiveResponse {
    private final Map<String, List<GroupedCaloriesActive>> groups;

    private final Optional<String> next;

    private final Map<String, Object> additionalProperties;

    private GroupedCaloriesActiveResponse(
            Map<String, List<GroupedCaloriesActive>> groups,
            Optional<String> next,
            Map<String, Object> additionalProperties) {
        this.groups = groups;
        this.next = next;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return For each matching provider or lab, a list of grouped timeseries values.
     */
    @JsonProperty("groups")
    public Map<String, List<GroupedCaloriesActive>> getGroups() {
        return groups;
    }

    /**
     * @return The cursor for fetching the next page, or <code>null</code> if there is no more data.
     */
    @JsonProperty("next")
    public Optional<String> getNext() {
        return next;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupedCaloriesActiveResponse && equalTo((GroupedCaloriesActiveResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupedCaloriesActiveResponse other) {
        return groups.equals(other.groups) && next.equals(other.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.groups, this.next);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Map<String, List<GroupedCaloriesActive>> groups = new LinkedHashMap<>();

        private Optional<String> next = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GroupedCaloriesActiveResponse other) {
            groups(other.getGroups());
            next(other.getNext());
            return this;
        }

        @JsonSetter(value = "groups", nulls = Nulls.SKIP)
        public Builder groups(Map<String, List<GroupedCaloriesActive>> groups) {
            this.groups.clear();
            this.groups.putAll(groups);
            return this;
        }

        public Builder putAllGroups(Map<String, List<GroupedCaloriesActive>> groups) {
            this.groups.putAll(groups);
            return this;
        }

        public Builder groups(String key, List<GroupedCaloriesActive> value) {
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

        public GroupedCaloriesActiveResponse build() {
            return new GroupedCaloriesActiveResponse(groups, next, additionalProperties);
        }
    }
}
