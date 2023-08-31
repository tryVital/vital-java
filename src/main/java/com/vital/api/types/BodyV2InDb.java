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
@JsonDeserialize(builder = BodyV2InDb.Builder.class)
public final class BodyV2InDb {
    private final OffsetDateTime timestamp;

    private final Optional<String> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final Optional<Integer> priorityId;

    private final String id;

    private final Optional<ClientFacingSource> source;

    private final Optional<Integer> priority;

    private BodyV2InDb(
            OffsetDateTime timestamp,
            Optional<String> data,
            String providerId,
            String userId,
            int sourceId,
            Optional<Integer> priorityId,
            String id,
            Optional<ClientFacingSource> source,
            Optional<Integer> priority) {
        this.timestamp = timestamp;
        this.data = data;
        this.providerId = providerId;
        this.userId = userId;
        this.sourceId = sourceId;
        this.priorityId = priorityId;
        this.id = id;
        this.source = source;
        this.priority = priority;
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

    @JsonProperty("source")
    public Optional<ClientFacingSource> getSource() {
        return source;
    }

    @JsonProperty("priority")
    public Optional<Integer> getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BodyV2InDb && equalTo((BodyV2InDb) other);
    }

    private boolean equalTo(BodyV2InDb other) {
        return timestamp.equals(other.timestamp)
                && data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId.equals(other.priorityId)
                && id.equals(other.id)
                && source.equals(other.source)
                && priority.equals(other.priority);
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
                this.source,
                this.priority);
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

        Builder from(BodyV2InDb other);
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
        _FinalStage id(String id);
    }

    public interface _FinalStage {
        BodyV2InDb build();

        _FinalStage data(Optional<String> data);

        _FinalStage data(String data);

        _FinalStage priorityId(Optional<Integer> priorityId);

        _FinalStage priorityId(Integer priorityId);

        _FinalStage source(Optional<ClientFacingSource> source);

        _FinalStage source(ClientFacingSource source);

        _FinalStage priority(Optional<Integer> priority);

        _FinalStage priority(Integer priority);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TimestampStage, ProviderIdStage, UserIdStage, SourceIdStage, IdStage, _FinalStage {
        private OffsetDateTime timestamp;

        private String providerId;

        private String userId;

        private int sourceId;

        private String id;

        private Optional<Integer> priority = Optional.empty();

        private Optional<ClientFacingSource> source = Optional.empty();

        private Optional<Integer> priorityId = Optional.empty();

        private Optional<String> data = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(BodyV2InDb other) {
            timestamp(other.getTimestamp());
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            id(other.getId());
            source(other.getSource());
            priority(other.getPriority());
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
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        public _FinalStage priority(Integer priority) {
            this.priority = Optional.of(priority);
            return this;
        }

        @Override
        @JsonSetter(value = "priority", nulls = Nulls.SKIP)
        public _FinalStage priority(Optional<Integer> priority) {
            this.priority = priority;
            return this;
        }

        @Override
        public _FinalStage source(ClientFacingSource source) {
            this.source = Optional.of(source);
            return this;
        }

        @Override
        @JsonSetter(value = "source", nulls = Nulls.SKIP)
        public _FinalStage source(Optional<ClientFacingSource> source) {
            this.source = source;
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
        public BodyV2InDb build() {
            return new BodyV2InDb(timestamp, data, providerId, userId, sourceId, priorityId, id, source, priority);
        }
    }
}