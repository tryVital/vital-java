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
@JsonDeserialize(builder = ActivityV2InDb.Builder.class)
public final class ActivityV2InDb {
    private final OffsetDateTime timestamp;

    private final Map<String, Object> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final int priorityId;

    private final String id;

    private final ClientFacingProvider source;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> updatedAt;

    private final Map<String, Object> additionalProperties;

    private ActivityV2InDb(
            OffsetDateTime timestamp,
            Map<String, Object> data,
            String providerId,
            String userId,
            int sourceId,
            int priorityId,
            String id,
            ClientFacingProvider source,
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
        this.source = source;
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
    public int getPriorityId() {
        return priorityId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public ClientFacingProvider getSource() {
        return source;
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
        return other instanceof ActivityV2InDb && equalTo((ActivityV2InDb) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActivityV2InDb other) {
        return timestamp.equals(other.timestamp)
                && data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId == other.priorityId
                && id.equals(other.id)
                && source.equals(other.source)
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
                this.source,
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

        Builder from(ActivityV2InDb other);
    }

    public interface ProviderIdStage {
        UserIdStage providerId(String providerId);
    }

    public interface UserIdStage {
        SourceIdStage userId(String userId);
    }

    public interface SourceIdStage {
        PriorityIdStage sourceId(int sourceId);
    }

    public interface PriorityIdStage {
        IdStage priorityId(int priorityId);
    }

    public interface IdStage {
        SourceStage id(String id);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingProvider source);
    }

    public interface _FinalStage {
        ActivityV2InDb build();

        _FinalStage data(Map<String, Object> data);

        _FinalStage putAllData(Map<String, Object> data);

        _FinalStage data(String key, Object value);

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
                    PriorityIdStage,
                    IdStage,
                    SourceStage,
                    _FinalStage {
        private OffsetDateTime timestamp;

        private String providerId;

        private String userId;

        private int sourceId;

        private int priorityId;

        private String id;

        private ClientFacingProvider source;

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Map<String, Object> data = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActivityV2InDb other) {
            timestamp(other.getTimestamp());
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            id(other.getId());
            source(other.getSource());
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
        public PriorityIdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("priority_id")
        public IdStage priorityId(int priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public SourceStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingProvider source) {
            this.source = source;
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
        public ActivityV2InDb build() {
            return new ActivityV2InDb(
                    timestamp,
                    data,
                    providerId,
                    userId,
                    sourceId,
                    priorityId,
                    id,
                    source,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
