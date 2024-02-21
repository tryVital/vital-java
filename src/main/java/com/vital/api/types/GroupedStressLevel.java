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
@JsonDeserialize(builder = GroupedStressLevel.Builder.class)
public final class GroupedStressLevel {
    private final ClientFacingSource source;

    private final List<ClientFacingStressLevelTimeseries> data;

    private final Map<String, Object> additionalProperties;

    private GroupedStressLevel(
            ClientFacingSource source,
            List<ClientFacingStressLevelTimeseries> data,
            Map<String, Object> additionalProperties) {
        this.source = source;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("data")
    public List<ClientFacingStressLevelTimeseries> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupedStressLevel && equalTo((GroupedStressLevel) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupedStressLevel other) {
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

        Builder from(GroupedStressLevel other);
    }

    public interface _FinalStage {
        GroupedStressLevel build();

        _FinalStage data(List<ClientFacingStressLevelTimeseries> data);

        _FinalStage addData(ClientFacingStressLevelTimeseries data);

        _FinalStage addAllData(List<ClientFacingStressLevelTimeseries> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, _FinalStage {
        private ClientFacingSource source;

        private List<ClientFacingStressLevelTimeseries> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GroupedStressLevel other) {
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
        public _FinalStage addAllData(List<ClientFacingStressLevelTimeseries> data) {
            this.data.addAll(data);
            return this;
        }

        @Override
        public _FinalStage addData(ClientFacingStressLevelTimeseries data) {
            this.data.add(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<ClientFacingStressLevelTimeseries> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @Override
        public GroupedStressLevel build() {
            return new GroupedStressLevel(source, data, additionalProperties);
        }
    }
}
