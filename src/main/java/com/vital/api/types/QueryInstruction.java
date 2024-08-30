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
@JsonDeserialize(builder = QueryInstruction.Builder.class)
public final class QueryInstruction {
    private final QueryInstructionSelect select;

    private final QueryInstructionPartitionBy partitionBy;

    private final QueryInstructionSwizzleBy swizzleBy;

    private final List<Reducer> reduceBy;

    private final Optional<List<String>> prioritizeBy;

    private final Optional<Boolean> splitBySource;

    private final Map<String, Object> additionalProperties;

    private QueryInstruction(
            QueryInstructionSelect select,
            QueryInstructionPartitionBy partitionBy,
            QueryInstructionSwizzleBy swizzleBy,
            List<Reducer> reduceBy,
            Optional<List<String>> prioritizeBy,
            Optional<Boolean> splitBySource,
            Map<String, Object> additionalProperties) {
        this.select = select;
        this.partitionBy = partitionBy;
        this.swizzleBy = swizzleBy;
        this.reduceBy = reduceBy;
        this.prioritizeBy = prioritizeBy;
        this.splitBySource = splitBySource;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("select")
    public QueryInstructionSelect getSelect() {
        return select;
    }

    @JsonProperty("partition_by")
    public QueryInstructionPartitionBy getPartitionBy() {
        return partitionBy;
    }

    @JsonProperty("swizzle_by")
    public QueryInstructionSwizzleBy getSwizzleBy() {
        return swizzleBy;
    }

    @JsonProperty("reduce_by")
    public List<Reducer> getReduceBy() {
        return reduceBy;
    }

    @JsonProperty("prioritize_by")
    public Optional<List<String>> getPrioritizeBy() {
        return prioritizeBy;
    }

    @JsonProperty("split_by_source")
    public Optional<Boolean> getSplitBySource() {
        return splitBySource;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof QueryInstruction && equalTo((QueryInstruction) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(QueryInstruction other) {
        return select.equals(other.select)
                && partitionBy.equals(other.partitionBy)
                && swizzleBy.equals(other.swizzleBy)
                && reduceBy.equals(other.reduceBy)
                && prioritizeBy.equals(other.prioritizeBy)
                && splitBySource.equals(other.splitBySource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.select, this.partitionBy, this.swizzleBy, this.reduceBy, this.prioritizeBy, this.splitBySource);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SelectStage builder() {
        return new Builder();
    }

    public interface SelectStage {
        PartitionByStage select(QueryInstructionSelect select);

        Builder from(QueryInstruction other);
    }

    public interface PartitionByStage {
        SwizzleByStage partitionBy(QueryInstructionPartitionBy partitionBy);
    }

    public interface SwizzleByStage {
        _FinalStage swizzleBy(QueryInstructionSwizzleBy swizzleBy);
    }

    public interface _FinalStage {
        QueryInstruction build();

        _FinalStage reduceBy(List<Reducer> reduceBy);

        _FinalStage addReduceBy(Reducer reduceBy);

        _FinalStage addAllReduceBy(List<Reducer> reduceBy);

        _FinalStage prioritizeBy(Optional<List<String>> prioritizeBy);

        _FinalStage prioritizeBy(List<String> prioritizeBy);

        _FinalStage splitBySource(Optional<Boolean> splitBySource);

        _FinalStage splitBySource(Boolean splitBySource);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SelectStage, PartitionByStage, SwizzleByStage, _FinalStage {
        private QueryInstructionSelect select;

        private QueryInstructionPartitionBy partitionBy;

        private QueryInstructionSwizzleBy swizzleBy;

        private Optional<Boolean> splitBySource = Optional.empty();

        private Optional<List<String>> prioritizeBy = Optional.empty();

        private List<Reducer> reduceBy = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(QueryInstruction other) {
            select(other.getSelect());
            partitionBy(other.getPartitionBy());
            swizzleBy(other.getSwizzleBy());
            reduceBy(other.getReduceBy());
            prioritizeBy(other.getPrioritizeBy());
            splitBySource(other.getSplitBySource());
            return this;
        }

        @Override
        @JsonSetter("select")
        public PartitionByStage select(QueryInstructionSelect select) {
            this.select = select;
            return this;
        }

        @Override
        @JsonSetter("partition_by")
        public SwizzleByStage partitionBy(QueryInstructionPartitionBy partitionBy) {
            this.partitionBy = partitionBy;
            return this;
        }

        @Override
        @JsonSetter("swizzle_by")
        public _FinalStage swizzleBy(QueryInstructionSwizzleBy swizzleBy) {
            this.swizzleBy = swizzleBy;
            return this;
        }

        @Override
        public _FinalStage splitBySource(Boolean splitBySource) {
            this.splitBySource = Optional.of(splitBySource);
            return this;
        }

        @Override
        @JsonSetter(value = "split_by_source", nulls = Nulls.SKIP)
        public _FinalStage splitBySource(Optional<Boolean> splitBySource) {
            this.splitBySource = splitBySource;
            return this;
        }

        @Override
        public _FinalStage prioritizeBy(List<String> prioritizeBy) {
            this.prioritizeBy = Optional.of(prioritizeBy);
            return this;
        }

        @Override
        @JsonSetter(value = "prioritize_by", nulls = Nulls.SKIP)
        public _FinalStage prioritizeBy(Optional<List<String>> prioritizeBy) {
            this.prioritizeBy = prioritizeBy;
            return this;
        }

        @Override
        public _FinalStage addAllReduceBy(List<Reducer> reduceBy) {
            this.reduceBy.addAll(reduceBy);
            return this;
        }

        @Override
        public _FinalStage addReduceBy(Reducer reduceBy) {
            this.reduceBy.add(reduceBy);
            return this;
        }

        @Override
        @JsonSetter(value = "reduce_by", nulls = Nulls.SKIP)
        public _FinalStage reduceBy(List<Reducer> reduceBy) {
            this.reduceBy.clear();
            this.reduceBy.addAll(reduceBy);
            return this;
        }

        @Override
        public QueryInstruction build() {
            return new QueryInstruction(
                    select, partitionBy, swizzleBy, reduceBy, prioritizeBy, splitBySource, additionalProperties);
        }
    }
}
