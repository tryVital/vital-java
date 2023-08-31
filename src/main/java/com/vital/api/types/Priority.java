package com.vital.api.types;

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
@JsonDeserialize(builder = Priority.Builder.class)
public final class Priority {
    private final int id;

    private final int priority;

    private final String teamId;

    private final int sourceId;

    private final Optional<String> dataType;

    private Priority(int id, int priority, String teamId, int sourceId, Optional<String> dataType) {
        this.id = id;
        this.priority = priority;
        this.teamId = teamId;
        this.sourceId = sourceId;
        this.dataType = dataType;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("priority")
    public int getPriority() {
        return priority;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
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
        return other instanceof Priority && equalTo((Priority) other);
    }

    private boolean equalTo(Priority other) {
        return id == other.id
                && priority == other.priority
                && teamId.equals(other.teamId)
                && sourceId == other.sourceId
                && dataType.equals(other.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.priority, this.teamId, this.sourceId, this.dataType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        PriorityStage id(int id);

        Builder from(Priority other);
    }

    public interface PriorityStage {
        TeamIdStage priority(int priority);
    }

    public interface TeamIdStage {
        SourceIdStage teamId(String teamId);
    }

    public interface SourceIdStage {
        _FinalStage sourceId(int sourceId);
    }

    public interface _FinalStage {
        Priority build();

        _FinalStage dataType(Optional<String> dataType);

        _FinalStage dataType(String dataType);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, PriorityStage, TeamIdStage, SourceIdStage, _FinalStage {
        private int id;

        private int priority;

        private String teamId;

        private int sourceId;

        private Optional<String> dataType = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Priority other) {
            id(other.getId());
            priority(other.getPriority());
            teamId(other.getTeamId());
            sourceId(other.getSourceId());
            dataType(other.getDataType());
            return this;
        }

        @Override
        @JsonSetter("id")
        public PriorityStage id(int id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("priority")
        public TeamIdStage priority(int priority) {
            this.priority = priority;
            return this;
        }

        @Override
        @JsonSetter("team_id")
        public SourceIdStage teamId(String teamId) {
            this.teamId = teamId;
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
        public Priority build() {
            return new Priority(id, priority, teamId, sourceId, dataType);
        }
    }
}
