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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ProfileInDb.Builder.class)
public final class ProfileInDb {
    private final String id;

    private final Object data;

    private final String userId;

    private final int sourceId;

    private final Optional<Integer> priorityId;

    private final ClientFacingProvider source;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> updatedAt;

    private final Map<String, Object> additionalProperties;

    private ProfileInDb(
            String id,
            Object data,
            String userId,
            int sourceId,
            Optional<Integer> priorityId,
            ClientFacingProvider source,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.data = data;
        this.userId = userId;
        this.sourceId = sourceId;
        this.priorityId = priorityId;
        this.source = source;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("data")
    public Object getData() {
        return data;
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
        return other instanceof ProfileInDb && equalTo((ProfileInDb) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProfileInDb other) {
        return id.equals(other.id)
                && data.equals(other.data)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId.equals(other.priorityId)
                && source.equals(other.source)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.data,
                this.userId,
                this.sourceId,
                this.priorityId,
                this.source,
                this.createdAt,
                this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        DataStage id(String id);

        Builder from(ProfileInDb other);
    }

    public interface DataStage {
        UserIdStage data(Object data);
    }

    public interface UserIdStage {
        SourceIdStage userId(String userId);
    }

    public interface SourceIdStage {
        SourceStage sourceId(int sourceId);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingProvider source);
    }

    public interface _FinalStage {
        ProfileInDb build();

        _FinalStage priorityId(Optional<Integer> priorityId);

        _FinalStage priorityId(Integer priorityId);

        _FinalStage createdAt(Optional<OffsetDateTime> createdAt);

        _FinalStage createdAt(OffsetDateTime createdAt);

        _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt);

        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, DataStage, UserIdStage, SourceIdStage, SourceStage, _FinalStage {
        private String id;

        private Object data;

        private String userId;

        private int sourceId;

        private ClientFacingProvider source;

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<Integer> priorityId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ProfileInDb other) {
            id(other.getId());
            data(other.getData());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            source(other.getSource());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public DataStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public UserIdStage data(Object data) {
            this.data = data;
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
        public SourceStage sourceId(int sourceId) {
            this.sourceId = sourceId;
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
        public ProfileInDb build() {
            return new ProfileInDb(
                    id, data, userId, sourceId, priorityId, source, createdAt, updatedAt, additionalProperties);
        }
    }
}
