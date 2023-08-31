package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VitalTokenExchangeResponse.Builder.class)
public final class VitalTokenExchangeResponse {
    private final String apiKey;

    private final Region region;

    private final String environment;

    private final String userId;

    private final VitalTokenExchangeTeamResponse team;

    private VitalTokenExchangeResponse(
            String apiKey, Region region, String environment, String userId, VitalTokenExchangeTeamResponse team) {
        this.apiKey = apiKey;
        this.region = region;
        this.environment = environment;
        this.userId = userId;
        this.team = team;
    }

    @JsonProperty("api_key")
    public String getApiKey() {
        return apiKey;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("team")
    public VitalTokenExchangeTeamResponse getTeam() {
        return team;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalTokenExchangeResponse && equalTo((VitalTokenExchangeResponse) other);
    }

    private boolean equalTo(VitalTokenExchangeResponse other) {
        return apiKey.equals(other.apiKey)
                && region.equals(other.region)
                && environment.equals(other.environment)
                && userId.equals(other.userId)
                && team.equals(other.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.region, this.environment, this.userId, this.team);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ApiKeyStage builder() {
        return new Builder();
    }

    public interface ApiKeyStage {
        RegionStage apiKey(String apiKey);

        Builder from(VitalTokenExchangeResponse other);
    }

    public interface RegionStage {
        EnvironmentStage region(Region region);
    }

    public interface EnvironmentStage {
        UserIdStage environment(String environment);
    }

    public interface UserIdStage {
        TeamStage userId(String userId);
    }

    public interface TeamStage {
        _FinalStage team(VitalTokenExchangeTeamResponse team);
    }

    public interface _FinalStage {
        VitalTokenExchangeResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ApiKeyStage, RegionStage, EnvironmentStage, UserIdStage, TeamStage, _FinalStage {
        private String apiKey;

        private Region region;

        private String environment;

        private String userId;

        private VitalTokenExchangeTeamResponse team;

        private Builder() {}

        @Override
        public Builder from(VitalTokenExchangeResponse other) {
            apiKey(other.getApiKey());
            region(other.getRegion());
            environment(other.getEnvironment());
            userId(other.getUserId());
            team(other.getTeam());
            return this;
        }

        @Override
        @JsonSetter("api_key")
        public RegionStage apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        @Override
        @JsonSetter("region")
        public EnvironmentStage region(Region region) {
            this.region = region;
            return this;
        }

        @Override
        @JsonSetter("environment")
        public UserIdStage environment(String environment) {
            this.environment = environment;
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public TeamStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("team")
        public _FinalStage team(VitalTokenExchangeTeamResponse team) {
            this.team = team;
            return this;
        }

        @Override
        public VitalTokenExchangeResponse build() {
            return new VitalTokenExchangeResponse(apiKey, region, environment, userId, team);
        }
    }
}
