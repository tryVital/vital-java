/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.aggregate.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.resources.aggregate.types.QueryTimeframe;
import com.vital.api.types.QueryConfig;
import com.vital.api.types.QueryInstruction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Query.Builder.class)
public final class Query {
    private final QueryTimeframe timeframe;

    private final List<QueryInstruction> instructions;

    private final Optional<QueryConfig> config;

    private final Map<String, Object> additionalProperties;

    private Query(
            QueryTimeframe timeframe,
            List<QueryInstruction> instructions,
            Optional<QueryConfig> config,
            Map<String, Object> additionalProperties) {
        this.timeframe = timeframe;
        this.instructions = instructions;
        this.config = config;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("accept")
    public String getAccept() {
        return "*/*";
    }

    @JsonProperty("timeframe")
    public QueryTimeframe getTimeframe() {
        return timeframe;
    }

    @JsonProperty("instructions")
    public List<QueryInstruction> getInstructions() {
        return instructions;
    }

    @JsonProperty("config")
    public Optional<QueryConfig> getConfig() {
        return config;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Query && equalTo((Query) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Query other) {
        return timeframe.equals(other.timeframe)
                && instructions.equals(other.instructions)
                && config.equals(other.config);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.timeframe, this.instructions, this.config);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimeframeStage builder() {
        return new Builder();
    }

    public interface TimeframeStage {
        _FinalStage timeframe(QueryTimeframe timeframe);

        Builder from(Query other);
    }

    public interface _FinalStage {
        Query build();

        _FinalStage instructions(List<QueryInstruction> instructions);

        _FinalStage addInstructions(QueryInstruction instructions);

        _FinalStage addAllInstructions(List<QueryInstruction> instructions);

        _FinalStage config(Optional<QueryConfig> config);

        _FinalStage config(QueryConfig config);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimeframeStage, _FinalStage {
        private QueryTimeframe timeframe;

        private Optional<QueryConfig> config = Optional.empty();

        private List<QueryInstruction> instructions = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Query other) {
            timeframe(other.getTimeframe());
            instructions(other.getInstructions());
            config(other.getConfig());
            return this;
        }

        @java.lang.Override
        @JsonSetter("timeframe")
        public _FinalStage timeframe(QueryTimeframe timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        @java.lang.Override
        public _FinalStage config(QueryConfig config) {
            this.config = Optional.of(config);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public _FinalStage config(Optional<QueryConfig> config) {
            this.config = config;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllInstructions(List<QueryInstruction> instructions) {
            this.instructions.addAll(instructions);
            return this;
        }

        @java.lang.Override
        public _FinalStage addInstructions(QueryInstruction instructions) {
            this.instructions.add(instructions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "instructions", nulls = Nulls.SKIP)
        public _FinalStage instructions(List<QueryInstruction> instructions) {
            this.instructions.clear();
            this.instructions.addAll(instructions);
            return this;
        }

        @java.lang.Override
        public Query build() {
            return new Query(timeframe, instructions, config, additionalProperties);
        }
    }
}
