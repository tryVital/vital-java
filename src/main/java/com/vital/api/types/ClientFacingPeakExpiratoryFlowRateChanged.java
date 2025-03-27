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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingPeakExpiratoryFlowRateChanged.Builder.class)
public final class ClientFacingPeakExpiratoryFlowRateChanged {
    private final ClientFacingPeakExpiratoryFlowRateChangedEventType eventType;

    private final String userId;

    private final String clientUserId;

    private final String teamId;

    private final GroupedPeakExpiratoryFlowRate data;

    private final Map<String, Object> additionalProperties;

    private ClientFacingPeakExpiratoryFlowRateChanged(
            ClientFacingPeakExpiratoryFlowRateChangedEventType eventType,
            String userId,
            String clientUserId,
            String teamId,
            GroupedPeakExpiratoryFlowRate data,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.userId = userId;
        this.clientUserId = clientUserId;
        this.teamId = teamId;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("event_type")
    public ClientFacingPeakExpiratoryFlowRateChangedEventType getEventType() {
        return eventType;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("client_user_id")
    public String getClientUserId() {
        return clientUserId;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("data")
    public GroupedPeakExpiratoryFlowRate getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingPeakExpiratoryFlowRateChanged
                && equalTo((ClientFacingPeakExpiratoryFlowRateChanged) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingPeakExpiratoryFlowRateChanged other) {
        return eventType.equals(other.eventType)
                && userId.equals(other.userId)
                && clientUserId.equals(other.clientUserId)
                && teamId.equals(other.teamId)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.userId, this.clientUserId, this.teamId, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        UserIdStage eventType(ClientFacingPeakExpiratoryFlowRateChangedEventType eventType);

        Builder from(ClientFacingPeakExpiratoryFlowRateChanged other);
    }

    public interface UserIdStage {
        ClientUserIdStage userId(String userId);
    }

    public interface ClientUserIdStage {
        TeamIdStage clientUserId(String clientUserId);
    }

    public interface TeamIdStage {
        DataStage teamId(String teamId);
    }

    public interface DataStage {
        _FinalStage data(GroupedPeakExpiratoryFlowRate data);
    }

    public interface _FinalStage {
        ClientFacingPeakExpiratoryFlowRateChanged build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EventTypeStage, UserIdStage, ClientUserIdStage, TeamIdStage, DataStage, _FinalStage {
        private ClientFacingPeakExpiratoryFlowRateChangedEventType eventType;

        private String userId;

        private String clientUserId;

        private String teamId;

        private GroupedPeakExpiratoryFlowRate data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingPeakExpiratoryFlowRateChanged other) {
            eventType(other.getEventType());
            userId(other.getUserId());
            clientUserId(other.getClientUserId());
            teamId(other.getTeamId());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("event_type")
        public UserIdStage eventType(ClientFacingPeakExpiratoryFlowRateChangedEventType eventType) {
            this.eventType = eventType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public ClientUserIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("client_user_id")
        public TeamIdStage clientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("team_id")
        public DataStage teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public _FinalStage data(GroupedPeakExpiratoryFlowRate data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public ClientFacingPeakExpiratoryFlowRateChanged build() {
            return new ClientFacingPeakExpiratoryFlowRateChanged(
                    eventType, userId, clientUserId, teamId, data, additionalProperties);
        }
    }
}
