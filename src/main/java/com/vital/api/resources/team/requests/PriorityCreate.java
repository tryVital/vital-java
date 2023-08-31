package com.vital.api.resources.team.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PriorityCreate.Builder.class)
public final class PriorityCreate {
    private final Optional<Integer> id;

    private final int priority;

    private final String priorityCreateTeamId;

    private final int sourceId;

    private final Optional<String> dataType;

    private PriorityCreate(
            Optional<Integer> id, int priority, String priorityCreateTeamId, int sourceId, Optional<String> dataType) {
        this.id = id;
        this.priority = priority;
        this.priorityCreateTeamId = priorityCreateTeamId;
        this.sourceId = sourceId;
        this.dataType = dataType;
    }

    @JsonProperty("id")
    public Optional<Integer> getId() {
        return id;
    }

    @JsonProperty("priority")
    public int getPriority() {
        return priority;
    }

    @JsonProperty("team_id")
    public String getPriorityCreateTeamId() {
        return priorityCreateTeamId;
    }

    @JsonProperty("source_id")
    public int getSourceId() {
        return sourceId;
    }

    @JsonProperty("data_type")
    public Optional<String> getDataType() {
        return dataType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PriorityCreate && equalTo((PriorityCreate) other);
    }

    private boolean equalTo(PriorityCreate other) {
        return id.equals(other.id)
                && priority == other.priority
                && priorityCreateTeamId.equals(other.priorityCreateTeamId)
                && sourceId == other.sourceId
                && dataType.equals(other.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.priority, this.priorityCreateTeamId, this.sourceId, this.dataType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PriorityStage builder() {
        return new Builder();
    }

    public interface PriorityStage {
        PriorityCreateTeamIdStage priority(int priority);

        Builder from(PriorityCreate other);
    }

    public interface PriorityCreateTeamIdStage {
        SourceIdStage priorityCreateTeamId(String priorityCreateTeamId);
    }

    public interface SourceIdStage {
        _FinalStage sourceId(int sourceId);
    }

    public interface _FinalStage {
        PriorityCreate build();

        _FinalStage id(Optional<Integer> id);

        _FinalStage id(Integer id);

        _FinalStage dataType(Optional<String> dataType);

        _FinalStage dataType(String dataType);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PriorityStage, PriorityCreateTeamIdStage, SourceIdStage, _FinalStage {
        private int priority;

        private String priorityCreateTeamId;

        private int sourceId;

        private Optional<String> dataType = Optional.empty();

        private Optional<Integer> id = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PriorityCreate other) {
            id(other.getId());
            priority(other.getPriority());
            priorityCreateTeamId(other.getPriorityCreateTeamId());
            sourceId(other.getSourceId());
            dataType(other.getDataType());
            return this;
        }

        @Override
        @JsonSetter("priority")
        public PriorityCreateTeamIdStage priority(int priority) {
            this.priority = priority;
            return this;
        }

        @Override
        @JsonSetter("team_id")
        public SourceIdStage priorityCreateTeamId(String priorityCreateTeamId) {
            this.priorityCreateTeamId = priorityCreateTeamId;
            return this;
        }

        @Override
        @JsonSetter("source_id")
        public _FinalStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public _FinalStage dataType(String dataType) {
            this.dataType = Optional.of(dataType);
            return this;
        }

        @Override
        @JsonSetter(value = "data_type", nulls = Nulls.SKIP)
        public _FinalStage dataType(Optional<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        @Override
        public _FinalStage id(Integer id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<Integer> id) {
            this.id = id;
            return this;
        }

        @Override
        public PriorityCreate build() {
            return new PriorityCreate(id, priority, priorityCreateTeamId, sourceId, dataType);
        }
    }
}
