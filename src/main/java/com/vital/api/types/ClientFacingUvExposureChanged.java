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
@JsonDeserialize(builder = ClientFacingUvExposureChanged.Builder.class)
public final class ClientFacingUvExposureChanged {
    private final ClientFacingUvExposureChangedEventType eventType;

    private final String userId;

    private final String clientUserId;

    private final String teamId;

    private final GroupedUvExposure data;

    private final Map<String, Object> additionalProperties;

    private ClientFacingUvExposureChanged(
            ClientFacingUvExposureChangedEventType eventType,
            String userId,
            String clientUserId,
            String teamId,
            GroupedUvExposure data,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.userId = userId;
        this.clientUserId = clientUserId;
        this.teamId = teamId;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("event_type")
    public ClientFacingUvExposureChangedEventType getEventType() {
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
    public GroupedUvExposure getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingUvExposureChanged && equalTo((ClientFacingUvExposureChanged) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingUvExposureChanged other) {
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
        UserIdStage eventType(ClientFacingUvExposureChangedEventType eventType);

        Builder from(ClientFacingUvExposureChanged other);
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
        _FinalStage data(GroupedUvExposure data);
    }

    public interface _FinalStage {
        ClientFacingUvExposureChanged build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EventTypeStage, UserIdStage, ClientUserIdStage, TeamIdStage, DataStage, _FinalStage {
        private ClientFacingUvExposureChangedEventType eventType;

        private String userId;

        private String clientUserId;

        private String teamId;

        private GroupedUvExposure data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingUvExposureChanged other) {
            eventType(other.getEventType());
            userId(other.getUserId());
            clientUserId(other.getClientUserId());
            teamId(other.getTeamId());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("event_type")
        public UserIdStage eventType(ClientFacingUvExposureChangedEventType eventType) {
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
        public _FinalStage data(GroupedUvExposure data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public ClientFacingUvExposureChanged build() {
            return new ClientFacingUvExposureChanged(
                    eventType, userId, clientUserId, teamId, data, additionalProperties);
        }
    }
}
