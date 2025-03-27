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
@JsonDeserialize(builder = ClientFacingWheelchairPushChanged.Builder.class)
public final class ClientFacingWheelchairPushChanged {
    private final ClientFacingWheelchairPushChangedEventType eventType;

    private final String userId;

    private final String clientUserId;

    private final String teamId;

    private final GroupedWheelchairPush data;

    private final Map<String, Object> additionalProperties;

    private ClientFacingWheelchairPushChanged(
            ClientFacingWheelchairPushChangedEventType eventType,
            String userId,
            String clientUserId,
            String teamId,
            GroupedWheelchairPush data,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.userId = userId;
        this.clientUserId = clientUserId;
        this.teamId = teamId;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("event_type")
    public ClientFacingWheelchairPushChangedEventType getEventType() {
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
    public GroupedWheelchairPush getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingWheelchairPushChanged && equalTo((ClientFacingWheelchairPushChanged) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingWheelchairPushChanged other) {
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
        UserIdStage eventType(ClientFacingWheelchairPushChangedEventType eventType);

        Builder from(ClientFacingWheelchairPushChanged other);
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
        _FinalStage data(GroupedWheelchairPush data);
    }

    public interface _FinalStage {
        ClientFacingWheelchairPushChanged build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EventTypeStage, UserIdStage, ClientUserIdStage, TeamIdStage, DataStage, _FinalStage {
        private ClientFacingWheelchairPushChangedEventType eventType;

        private String userId;

        private String clientUserId;

        private String teamId;

        private GroupedWheelchairPush data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingWheelchairPushChanged other) {
            eventType(other.getEventType());
            userId(other.getUserId());
            clientUserId(other.getClientUserId());
            teamId(other.getTeamId());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("event_type")
        public UserIdStage eventType(ClientFacingWheelchairPushChangedEventType eventType) {
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
        public _FinalStage data(GroupedWheelchairPush data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public ClientFacingWheelchairPushChanged build() {
            return new ClientFacingWheelchairPushChanged(
                    eventType, userId, clientUserId, teamId, data, additionalProperties);
        }
    }
}
