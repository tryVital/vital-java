package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WorkoutV2InDb.Builder.class)
public final class WorkoutV2InDb {
    private final OffsetDateTime timestamp;

    private final Optional<String> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final Optional<Integer> priorityId;

    private final String id;

    private final int sportId;

    private final ClientFacingSource source;

    private final ClientFacingSport sport;

    private WorkoutV2InDb(
            OffsetDateTime timestamp,
            Optional<String> data,
            String providerId,
            String userId,
            int sourceId,
            Optional<Integer> priorityId,
            String id,
            int sportId,
            ClientFacingSource source,
            ClientFacingSport sport) {
        this.timestamp = timestamp;
        this.data = data;
        this.providerId = providerId;
        this.userId = userId;
        this.sourceId = sourceId;
        this.priorityId = priorityId;
        this.id = id;
        this.sportId = sportId;
        this.source = source;
        this.sport = sport;
    }

    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty("data")
    public Optional<String> getData() {
        return data;
    }

    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("source_id")
    public int getSourceId() {
        return sourceId;
    }

    @JsonProperty("priority_id")
    public Optional<Integer> getPriorityId() {
        return priorityId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("sport_id")
    public int getSportId() {
        return sportId;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("sport")
    public ClientFacingSport getSport() {
        return sport;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkoutV2InDb && equalTo((WorkoutV2InDb) other);
    }

    private boolean equalTo(WorkoutV2InDb other) {
        return timestamp.equals(other.timestamp)
                && data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId.equals(other.priorityId)
                && id.equals(other.id)
                && sportId == other.sportId
                && source.equals(other.source)
                && sport.equals(other.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.timestamp,
                this.data,
                this.providerId,
                this.userId,
                this.sourceId,
                this.priorityId,
                this.id,
                this.sportId,
                this.source,
                this.sport);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        ProviderIdStage timestamp(OffsetDateTime timestamp);

        Builder from(WorkoutV2InDb other);
    }

    public interface ProviderIdStage {
        UserIdStage providerId(String providerId);
    }

    public interface UserIdStage {
        SourceIdStage userId(String userId);
    }

    public interface SourceIdStage {
        IdStage sourceId(int sourceId);
    }

    public interface IdStage {
        SportIdStage id(String id);
    }

    public interface SportIdStage {
        SourceStage sportId(int sportId);
    }

    public interface SourceStage {
        SportStage source(ClientFacingSource source);
    }

    public interface SportStage {
        _FinalStage sport(ClientFacingSport sport);
    }

    public interface _FinalStage {
        WorkoutV2InDb build();

        _FinalStage data(Optional<String> data);

        _FinalStage data(String data);

        _FinalStage priorityId(Optional<Integer> priorityId);

        _FinalStage priorityId(Integer priorityId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TimestampStage,
                    ProviderIdStage,
                    UserIdStage,
                    SourceIdStage,
                    IdStage,
                    SportIdStage,
                    SourceStage,
                    SportStage,
                    _FinalStage {
        private OffsetDateTime timestamp;

        private String providerId;

        private String userId;

        private int sourceId;

        private String id;

        private int sportId;

        private ClientFacingSource source;

        private ClientFacingSport sport;

        private Optional<Integer> priorityId = Optional.empty();

        private Optional<String> data = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(WorkoutV2InDb other) {
            timestamp(other.getTimestamp());
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            id(other.getId());
            sportId(other.getSportId());
            source(other.getSource());
            sport(other.getSport());
            return this;
        }

        @Override
        @JsonSetter("timestamp")
        public ProviderIdStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Override
        @JsonSetter("provider_id")
        public UserIdStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public SourceIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("source_id")
        public IdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public SportIdStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("sport_id")
        public SourceStage sportId(int sportId) {
            this.sportId = sportId;
            return this;
        }

        @Override
        @JsonSetter("source")
        public SportStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @Override
        @JsonSetter("sport")
        public _FinalStage sport(ClientFacingSport sport) {
            this.sport = sport;
            return this;
        }

        @Override
        public _FinalStage priorityId(Integer priorityId) {
            this.priorityId = Optional.of(priorityId);
            return this;
        }

        @Override
        @JsonSetter(value = "priority_id", nulls = Nulls.SKIP)
        public _FinalStage priorityId(Optional<Integer> priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        @Override
        public _FinalStage data(String data) {
            this.data = Optional.of(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<String> data) {
            this.data = data;
            return this;
        }

        @Override
        public WorkoutV2InDb build() {
            return new WorkoutV2InDb(
                    timestamp, data, providerId, userId, sourceId, priorityId, id, sportId, source, sport);
        }
    }
}
