package com.vital.api.resources.team.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest.Builder.class)
public final class UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest {
    private final String teamId;

    private UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest
                && equalTo((UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest) other);
    }

    private boolean equalTo(UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest other) {
        return teamId.equals(other.teamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.teamId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TeamIdStage builder() {
        return new Builder();
    }

    public interface TeamIdStage {
        _FinalStage teamId(String teamId);

        Builder from(UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest other);
    }

    public interface _FinalStage {
        UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TeamIdStage, _FinalStage {
        private String teamId;

        private Builder() {}

        @Override
        public Builder from(UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest other) {
            teamId(other.getTeamId());
            return this;
        }

        @Override
        @JsonSetter("team_id")
        public _FinalStage teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        @Override
        public UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest build() {
            return new UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest(teamId);
        }
    }
}
