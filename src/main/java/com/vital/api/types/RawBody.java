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
@JsonDeserialize(builder = RawBody.Builder.class)
public final class RawBody {
    private final List<BodyV2InDb> body;

    private final Map<String, Object> additionalProperties;

    private RawBody(List<BodyV2InDb> body, Map<String, Object> additionalProperties) {
        this.body = body;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("body")
    public List<BodyV2InDb> getBody() {
        return body;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RawBody && equalTo((RawBody) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RawBody other) {
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

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<BodyV2InDb> body = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(RawBody other) {
            body(other.getBody());
            return this;
        }

        @JsonSetter(value = "body", nulls = Nulls.SKIP)
        public Builder body(List<BodyV2InDb> body) {
            this.body.clear();
            this.body.addAll(body);
            return this;
        }

        public Builder addBody(BodyV2InDb body) {
            this.body.add(body);
            return this;
        }

        public Builder addAllBody(List<BodyV2InDb> body) {
            this.body.addAll(body);
            return this;
        }

        public RawBody build() {
            return new RawBody(body, additionalProperties);
        }
    }
}
