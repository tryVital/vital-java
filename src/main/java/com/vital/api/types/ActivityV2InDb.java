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
@JsonDeserialize(builder = ActivityV2InDb.Builder.class)
public final class ActivityV2InDb {
    private final OffsetDateTime timestamp;

    private final Optional<String> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final int priorityId;

    private final String id;

    private final ClientFacingSource source;

    private ActivityV2InDb(
            OffsetDateTime timestamp,
            Optional<String> data,
            String providerId,
            String userId,
            int sourceId,
            int priorityId,
            String id,
            ClientFacingSource source) {
        this.timestamp = timestamp;
        this.data = data;
        this.providerId = providerId;
        this.userId = userId;
        this.sourceId = sourceId;
        this.priorityId = priorityId;
        this.id = id;
        this.source = source;
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
    public int getPriorityId() {
        return priorityId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActivityV2InDb && equalTo((ActivityV2InDb) other);
    }

    private boolean equalTo(ActivityV2InDb other) {
        return timestamp.equals(other.timestamp)
                && data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId == other.priorityId
                && id.equals(other.id)
                && source.equals(other.source);
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
                this.source);
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
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ActivityV2InDb build();

        _FinalStage data(Optional<String> data);

        _FinalStage data(String data);
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

        private ClientFacingSource source;

        private Optional<String> data = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ActivityV2InDb other) {
            timestamp(other.getTimestamp());
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            id(other.getId());
            source(other.getSource());
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
        public PriorityIdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @Override
        @JsonSetter("priority_id")
        public IdStage priorityId(int priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public SourceStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
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
        public ActivityV2InDb build() {
            return new ActivityV2InDb(timestamp, data, providerId, userId, sourceId, priorityId, id, source);
        }
    }
}
