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
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserResourcesResponse.Builder.class)
public final class UserResourcesResponse {
    private final List<SingleUserResourceResponse> data;

    private final Optional<String> next;

    private final Map<String, Object> additionalProperties;

    private UserResourcesResponse(
            List<SingleUserResourceResponse> data, Optional<String> next, Map<String, Object> additionalProperties) {
        this.data = data;
        this.next = next;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public List<SingleUserResourceResponse> getData() {
        return data;
    }

    @JsonProperty("next")
    public Optional<String> getNext() {
        return next;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserResourcesResponse && equalTo((UserResourcesResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserResourcesResponse other) {
        return data.equals(other.data) && next.equals(other.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data, this.next);
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
        private List<SingleUserResourceResponse> data = new ArrayList<>();

        private Optional<String> next = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UserResourcesResponse other) {
            data(other.getData());
            next(other.getNext());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(List<SingleUserResourceResponse> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        public Builder addData(SingleUserResourceResponse data) {
            this.data.add(data);
            return this;
        }

        public Builder addAllData(List<SingleUserResourceResponse> data) {
            this.data.addAll(data);
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

        public UserResourcesResponse build() {
            return new UserResourcesResponse(data, next, additionalProperties);
        }
    }
}
