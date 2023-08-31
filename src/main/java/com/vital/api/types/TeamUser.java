package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TeamUser.Builder.class)
public final class TeamUser {
    private final String id;

    private final String teamId;

    private final String clientUserId;

    private final OffsetDateTime createdOn;

    private final List<ConnectedSourceClientFacing> connectedSources;

    private final Optional<FallbackTimeZone> fallbackTimeZone;

    private TeamUser(
            String id,
            String teamId,
            String clientUserId,
            OffsetDateTime createdOn,
            List<ConnectedSourceClientFacing> connectedSources,
            Optional<FallbackTimeZone> fallbackTimeZone) {
        this.id = id;
        this.teamId = teamId;
        this.clientUserId = clientUserId;
        this.createdOn = createdOn;
        this.connectedSources = connectedSources;
        this.fallbackTimeZone = fallbackTimeZone;
    }

    /**
     * @return Alias id to a specific field.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Your team id.
     */
    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    /**
     * @return A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
     */
    @JsonProperty("client_user_id")
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * @return When your item is created
     */
    @JsonProperty("created_on")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * @return A list of the users connected sources.
     */
    @JsonProperty("connected_sources")
    public List<ConnectedSourceClientFacing> getConnectedSources() {
        return connectedSources;
    }

    /**
     * @return Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
     * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
     */
    @JsonProperty("fallback_time_zone")
    public Optional<FallbackTimeZone> getFallbackTimeZone() {
        return fallbackTimeZone;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamUser && equalTo((TeamUser) other);
    }

    private boolean equalTo(TeamUser other) {
        return id.equals(other.id)
                && teamId.equals(other.teamId)
                && clientUserId.equals(other.clientUserId)
                && createdOn.equals(other.createdOn)
                && connectedSources.equals(other.connectedSources)
                && fallbackTimeZone.equals(other.fallbackTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.teamId, this.clientUserId, this.createdOn, this.connectedSources, this.fallbackTimeZone);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TeamIdStage id(String id);

        Builder from(TeamUser other);
    }

    public interface TeamIdStage {
        ClientUserIdStage teamId(String teamId);
    }

    public interface ClientUserIdStage {
        CreatedOnStage clientUserId(String clientUserId);
    }

    public interface CreatedOnStage {
        _FinalStage createdOn(OffsetDateTime createdOn);
    }

    public interface _FinalStage {
        TeamUser build();

        _FinalStage connectedSources(List<ConnectedSourceClientFacing> connectedSources);

        _FinalStage addConnectedSources(ConnectedSourceClientFacing connectedSources);

        _FinalStage addAllConnectedSources(List<ConnectedSourceClientFacing> connectedSources);

        _FinalStage fallbackTimeZone(Optional<FallbackTimeZone> fallbackTimeZone);

        _FinalStage fallbackTimeZone(FallbackTimeZone fallbackTimeZone);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, TeamIdStage, ClientUserIdStage, CreatedOnStage, _FinalStage {
        private String id;

        private String teamId;

        private String clientUserId;

        private OffsetDateTime createdOn;

        private Optional<FallbackTimeZone> fallbackTimeZone = Optional.empty();

        private List<ConnectedSourceClientFacing> connectedSources = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(TeamUser other) {
            id(other.getId());
            teamId(other.getTeamId());
            clientUserId(other.getClientUserId());
            createdOn(other.getCreatedOn());
            connectedSources(other.getConnectedSources());
            fallbackTimeZone(other.getFallbackTimeZone());
            return this;
        }

        /**
         * <p>Alias id to a specific field.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public TeamIdStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Your team id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("team_id")
        public ClientUserIdStage teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        /**
         * <p>A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("client_user_id")
        public CreatedOnStage clientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
            return this;
        }

        /**
         * <p>When your item is created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("created_on")
        public _FinalStage createdOn(OffsetDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * <p>Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
         * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fallbackTimeZone(FallbackTimeZone fallbackTimeZone) {
            this.fallbackTimeZone = Optional.of(fallbackTimeZone);
            return this;
        }

        @Override
        @JsonSetter(value = "fallback_time_zone", nulls = Nulls.SKIP)
        public _FinalStage fallbackTimeZone(Optional<FallbackTimeZone> fallbackTimeZone) {
            this.fallbackTimeZone = fallbackTimeZone;
            return this;
        }

        /**
         * <p>A list of the users connected sources.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addAllConnectedSources(List<ConnectedSourceClientFacing> connectedSources) {
            this.connectedSources.addAll(connectedSources);
            return this;
        }

        /**
         * <p>A list of the users connected sources.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addConnectedSources(ConnectedSourceClientFacing connectedSources) {
            this.connectedSources.add(connectedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "connected_sources", nulls = Nulls.SKIP)
        public _FinalStage connectedSources(List<ConnectedSourceClientFacing> connectedSources) {
            this.connectedSources.clear();
            this.connectedSources.addAll(connectedSources);
            return this;
        }

        @Override
        public TeamUser build() {
            return new TeamUser(id, teamId, clientUserId, createdOn, connectedSources, fallbackTimeZone);
        }
    }
}
