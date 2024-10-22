/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.OrderSetRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LabTestsGetMarkersForOrderSetRequest.Builder.class)
public final class LabTestsGetMarkersForOrderSetRequest {
    private final Optional<Integer> page;

    private final Optional<Integer> size;

    private final OrderSetRequest body;

    private final Map<String, Object> additionalProperties;

    private LabTestsGetMarkersForOrderSetRequest(
            Optional<Integer> page,
            Optional<Integer> size,
            OrderSetRequest body,
            Map<String, Object> additionalProperties) {
        this.page = page;
        this.size = size;
        this.body = body;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("page")
    public Optional<Integer> getPage() {
        return page;
    }

    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    @JsonProperty("body")
    public OrderSetRequest getBody() {
        return body;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabTestsGetMarkersForOrderSetRequest
                && equalTo((LabTestsGetMarkersForOrderSetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LabTestsGetMarkersForOrderSetRequest other) {
        return page.equals(other.page) && size.equals(other.size) && body.equals(other.body);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.page, this.size, this.body);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BodyStage builder() {
        return new Builder();
    }

    public interface BodyStage {
        _FinalStage body(OrderSetRequest body);

        Builder from(LabTestsGetMarkersForOrderSetRequest other);
    }

    public interface _FinalStage {
        LabTestsGetMarkersForOrderSetRequest build();

        _FinalStage page(Optional<Integer> page);

        _FinalStage page(Integer page);

        _FinalStage size(Optional<Integer> size);

        _FinalStage size(Integer size);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BodyStage, _FinalStage {
        private OrderSetRequest body;

        private Optional<Integer> size = Optional.empty();

        private Optional<Integer> page = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LabTestsGetMarkersForOrderSetRequest other) {
            page(other.getPage());
            size(other.getSize());
            body(other.getBody());
            return this;
        }

        @java.lang.Override
        @JsonSetter("body")
        public _FinalStage body(OrderSetRequest body) {
            this.body = body;
            return this;
        }

        @java.lang.Override
        public _FinalStage size(Integer size) {
            this.size = Optional.of(size);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public _FinalStage size(Optional<Integer> size) {
            this.size = size;
            return this;
        }

        @java.lang.Override
        public _FinalStage page(Integer page) {
            this.page = Optional.of(page);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "page", nulls = Nulls.SKIP)
        public _FinalStage page(Optional<Integer> page) {
            this.page = page;
            return this;
        }

        @java.lang.Override
        public LabTestsGetMarkersForOrderSetRequest build() {
            return new LabTestsGetMarkersForOrderSetRequest(page, size, body, additionalProperties);
        }
    }
}