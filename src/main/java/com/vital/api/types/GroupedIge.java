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
@JsonDeserialize(builder = GroupedIge.Builder.class)
public final class GroupedIge {
    private final ClientFacingSource source;

    private final List<ClientFacingIgeTimeseries> data;

    private final Map<String, Object> additionalProperties;

    private GroupedIge(
            ClientFacingSource source, List<ClientFacingIgeTimeseries> data, Map<String, Object> additionalProperties) {
        this.source = source;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("data")
    public List<ClientFacingIgeTimeseries> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupedIge && equalTo((GroupedIge) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupedIge other) {
        return source.equals(other.source) && data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.source, this.data);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourceStage builder() {
        return new Builder();
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);

        Builder from(GroupedIge other);
    }

    public interface _FinalStage {
        GroupedIge build();

        _FinalStage data(List<ClientFacingIgeTimeseries> data);

        _FinalStage addData(ClientFacingIgeTimeseries data);

        _FinalStage addAllData(List<ClientFacingIgeTimeseries> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, _FinalStage {
        private ClientFacingSource source;

        private List<ClientFacingIgeTimeseries> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GroupedIge other) {
            source(other.getSource());
            data(other.getData());
            return this;
        }

        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @Override
        public _FinalStage addAllData(List<ClientFacingIgeTimeseries> data) {
            this.data.addAll(data);
            return this;
        }

        @Override
        public _FinalStage addData(ClientFacingIgeTimeseries data) {
            this.data.add(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<ClientFacingIgeTimeseries> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @Override
        public GroupedIge build() {
            return new GroupedIge(source, data, additionalProperties);
        }
    }
}