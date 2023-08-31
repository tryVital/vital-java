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
@JsonDeserialize(builder = ProfileInDb.Builder.class)
public final class ProfileInDb {
    private final Optional<String> data;

    private final String userId;

    private final int sourceId;

    private final Optional<Integer> priorityId;

    private final String id;

    private final ClientFacingSource source;

    private final Optional<OffsetDateTime> updatedAt;

    private ProfileInDb(
            Optional<String> data,
            String userId,
            int sourceId,
            Optional<Integer> priorityId,
            String id,
            ClientFacingSource source,
            Optional<OffsetDateTime> updatedAt) {
        this.data = data;
        this.userId = userId;
        this.sourceId = sourceId;
        this.priorityId = priorityId;
        this.id = id;
        this.source = source;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("data")
    public Optional<String> getData() {
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProfileInDb && equalTo((ProfileInDb) other);
    }

    private boolean equalTo(ProfileInDb other) {
        return data.equals(other.data)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && priorityId.equals(other.priorityId)
                && id.equals(other.id)
                && source.equals(other.source)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.data, this.userId, this.sourceId, this.priorityId, this.id, this.source, this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        SourceIdStage userId(String userId);

        Builder from(ProfileInDb other);
    }

    public interface SourceIdStage {
        IdStage sourceId(int sourceId);
    }

    public interface IdStage {
        SourceStage id(String id);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ProfileInDb build();

        _FinalStage data(Optional<String> data);

        _FinalStage data(String data);

        _FinalStage priorityId(Optional<Integer> priorityId);

        _FinalStage priorityId(Integer priorityId);

        _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt);

        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, SourceIdStage, IdStage, SourceStage, _FinalStage {
        private String userId;

        private int sourceId;

        private String id;

        private ClientFacingSource source;

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<Integer> priorityId = Optional.empty();

        private Optional<String> data = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ProfileInDb other) {
            data(other.getData());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            priorityId(other.getPriorityId());
            id(other.getId());
            source(other.getSource());
            updatedAt(other.getUpdatedAt());
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
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Optional.of(updatedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "updated_at", nulls = Nulls.SKIP)
        public _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt) {
            this.updatedAt = updatedAt;
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
        public ProfileInDb build() {
            return new ProfileInDb(data, userId, sourceId, priorityId, id, source, updatedAt);
        }
    }
}
