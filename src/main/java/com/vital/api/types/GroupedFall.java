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
@JsonDeserialize(builder = GroupedFall.Builder.class)
public final class GroupedFall {
    private final ClientFacingSource source;

    private final List<ClientFacingFallSample> data;

    private final Map<String, Object> additionalProperties;

    private GroupedFall(
            ClientFacingSource source, List<ClientFacingFallSample> data, Map<String, Object> additionalProperties) {
        this.source = source;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("data")
    public List<ClientFacingFallSample> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupedFall && equalTo((GroupedFall) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupedFall other) {
        return source.equals(other.source) && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.source, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourceStage builder() {
        return new Builder();
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);

        Builder from(GroupedFall other);
    }

    public interface _FinalStage {
        GroupedFall build();

        _FinalStage data(List<ClientFacingFallSample> data);

        _FinalStage addData(ClientFacingFallSample data);

        _FinalStage addAllData(List<ClientFacingFallSample> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, _FinalStage {
        private ClientFacingSource source;

        private List<ClientFacingFallSample> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GroupedFall other) {
            source(other.getSource());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllData(List<ClientFacingFallSample> data) {
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public _FinalStage addData(ClientFacingFallSample data) {
            this.data.add(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<ClientFacingFallSample> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public GroupedFall build() {
            return new GroupedFall(source, data, additionalProperties);
        }
    }
}
