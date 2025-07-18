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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WorkoutV2InDb.Builder.class)
public final class WorkoutV2InDb {
    private final OffsetDateTime timestamp;

    private final Map<String, Object> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final Optional<Integer> priorityId;

    private final String id;

    private final int sportId;

    private final ClientFacingProvider source;

    private final ClientFacingSport sport;

    private final Optional<String> sourceDeviceId;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> updatedAt;

    private final Map<String, Object> additionalProperties;

    private WorkoutV2InDb(
            OffsetDateTime timestamp,
            Map<String, Object> data,
            String providerId,
            String userId,
            int sourceId,
            Optional<Integer> priorityId,
            String id,
            int sportId,
            ClientFacingProvider source,
            ClientFacingSport sport,
            Optional<String> sourceDeviceId,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> updatedAt,
            Map<String, Object> additionalProperties) {
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
        this.sourceDeviceId = sourceDeviceId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty("data")
    public Map<String, Object> getData() {
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
    public ClientFacingProvider getSource() {
        return source;
    }

    @JsonProperty("sport")
    public ClientFacingSport getSport() {
        return sport;
    }

    @JsonProperty("source_device_id")
    public Optional<String> getSourceDeviceId() {
        return sourceDeviceId;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkoutV2InDb && equalTo((WorkoutV2InDb) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
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
                && sport.equals(other.sport)
                && sourceDeviceId.equals(other.sourceDeviceId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
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
                this.sport,
                this.sourceDeviceId,
                this.createdAt,
                this.updatedAt);
    }

    @java.lang.Override
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
        SportStage source(ClientFacingProvider source);
    }

    public interface SportStage {
        _FinalStage sport(ClientFacingSport sport);
    }

    public interface _FinalStage {
        WorkoutV2InDb build();

        _FinalStage data(Map<String, Object> data);

        _FinalStage putAllData(Map<String, Object> data);

        _FinalStage data(String key, Object value);

        _FinalStage priorityId(Optional<Integer> priorityId);

        _FinalStage priorityId(Integer priorityId);

        _FinalStage sourceDeviceId(Optional<String> sourceDeviceId);

        _FinalStage sourceDeviceId(String sourceDeviceId);

        _FinalStage createdAt(Optional<OffsetDateTime> createdAt);

        _FinalStage createdAt(OffsetDateTime createdAt);

        _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt);

        _FinalStage updatedAt(OffsetDateTime updatedAt);
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

        private ClientFacingProvider source;

        private ClientFacingSport sport;

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> sourceDeviceId = Optional.empty();

        private Optional<Integer> priorityId = Optional.empty();

        private Map<String, Object> data = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
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
            sourceDeviceId(other.getSourceDeviceId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("timestamp")
        public ProviderIdStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @java.lang.Override
        @JsonSetter("provider_id")
        public UserIdStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public SourceIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source_id")
        public IdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public SportIdStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("sport_id")
        public SourceStage sportId(int sportId) {
            this.sportId = sportId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public SportStage source(ClientFacingProvider source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        @JsonSetter("sport")
        public _FinalStage sport(ClientFacingSport sport) {
            this.sport = sport;
            return this;
        }

        @java.lang.Override
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Optional.of(updatedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "updated_at", nulls = Nulls.SKIP)
        public _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public _FinalStage createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage sourceDeviceId(String sourceDeviceId) {
            this.sourceDeviceId = Optional.of(sourceDeviceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "source_device_id", nulls = Nulls.SKIP)
        public _FinalStage sourceDeviceId(Optional<String> sourceDeviceId) {
            this.sourceDeviceId = sourceDeviceId;
            return this;
        }

        @java.lang.Override
        public _FinalStage priorityId(Integer priorityId) {
            this.priorityId = Optional.of(priorityId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "priority_id", nulls = Nulls.SKIP)
        public _FinalStage priorityId(Optional<Integer> priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        @java.lang.Override
        public _FinalStage data(String key, Object value) {
            this.data.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllData(Map<String, Object> data) {
            this.data.putAll(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Map<String, Object> data) {
            this.data.clear();
            this.data.putAll(data);
            return this;
        }

        @java.lang.Override
        public WorkoutV2InDb build() {
            return new WorkoutV2InDb(
                    timestamp,
                    data,
                    providerId,
                    userId,
                    sourceId,
                    priorityId,
                    id,
                    sportId,
                    source,
                    sport,
                    sourceDeviceId,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
