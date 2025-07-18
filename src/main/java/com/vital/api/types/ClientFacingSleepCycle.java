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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingSleepCycle.Builder.class)
public final class ClientFacingSleepCycle {
    private final String id;

    private final String sleepId;

    private final OffsetDateTime sessionStart;

    private final OffsetDateTime sessionEnd;

    private final List<Integer> stageStartOffsetSecond;

    private final List<Integer> stageEndOffsetSecond;

    private final List<Integer> stageType;

    private final Optional<String> timeZone;

    private final ClientFacingSleepCycleSourceProvider sourceProvider;

    private final ClientFacingSleepCycleSourceType sourceType;

    private final Optional<String> sourceAppId;

    private final Optional<String> sourceDeviceId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final String userId;

    private final ClientFacingSource source;

    private final Map<String, Object> additionalProperties;

    private ClientFacingSleepCycle(
            String id,
            String sleepId,
            OffsetDateTime sessionStart,
            OffsetDateTime sessionEnd,
            List<Integer> stageStartOffsetSecond,
            List<Integer> stageEndOffsetSecond,
            List<Integer> stageType,
            Optional<String> timeZone,
            ClientFacingSleepCycleSourceProvider sourceProvider,
            ClientFacingSleepCycleSourceType sourceType,
            Optional<String> sourceAppId,
            Optional<String> sourceDeviceId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String userId,
            ClientFacingSource source,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.sleepId = sleepId;
        this.sessionStart = sessionStart;
        this.sessionEnd = sessionEnd;
        this.stageStartOffsetSecond = stageStartOffsetSecond;
        this.stageEndOffsetSecond = stageEndOffsetSecond;
        this.stageType = stageType;
        this.timeZone = timeZone;
        this.sourceProvider = sourceProvider;
        this.sourceType = sourceType;
        this.sourceAppId = sourceAppId;
        this.sourceDeviceId = sourceDeviceId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.source = source;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("sleep_id")
    public String getSleepId() {
        return sleepId;
    }

    @JsonProperty("session_start")
    public OffsetDateTime getSessionStart() {
        return sessionStart;
    }

    @JsonProperty("session_end")
    public OffsetDateTime getSessionEnd() {
        return sessionEnd;
    }

    @JsonProperty("stage_start_offset_second")
    public List<Integer> getStageStartOffsetSecond() {
        return stageStartOffsetSecond;
    }

    @JsonProperty("stage_end_offset_second")
    public List<Integer> getStageEndOffsetSecond() {
        return stageEndOffsetSecond;
    }

    /**
     * @return Sleep stage classification:
     * <code>-1</code>: Unknown or unclassified sleep stage;
     * <code>1</code>: Deep sleep;
     * <code>2</code>: Light/non-REM sleep;
     * <code>3</code>: Rapid Eye Movement sleep;
     * <code>4</code>: Awake period;
     * <code>5</code>: Manually classified stage.
     */
    @JsonProperty("stage_type")
    public List<Integer> getStageType() {
        return stageType;
    }

    @JsonProperty("time_zone")
    public Optional<String> getTimeZone() {
        return timeZone;
    }

    @JsonProperty("source_provider")
    public ClientFacingSleepCycleSourceProvider getSourceProvider() {
        return sourceProvider;
    }

    /**
     * @return ℹ️ This enum is non-exhaustive.
     */
    @JsonProperty("source_type")
    public ClientFacingSleepCycleSourceType getSourceType() {
        return sourceType;
    }

    @JsonProperty("source_app_id")
    public Optional<String> getSourceAppId() {
        return sourceAppId;
    }

    @JsonProperty("source_device_id")
    public Optional<String> getSourceDeviceId() {
        return sourceDeviceId;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSleepCycle && equalTo((ClientFacingSleepCycle) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingSleepCycle other) {
        return id.equals(other.id)
                && sleepId.equals(other.sleepId)
                && sessionStart.equals(other.sessionStart)
                && sessionEnd.equals(other.sessionEnd)
                && stageStartOffsetSecond.equals(other.stageStartOffsetSecond)
                && stageEndOffsetSecond.equals(other.stageEndOffsetSecond)
                && stageType.equals(other.stageType)
                && timeZone.equals(other.timeZone)
                && sourceProvider.equals(other.sourceProvider)
                && sourceType.equals(other.sourceType)
                && sourceAppId.equals(other.sourceAppId)
                && sourceDeviceId.equals(other.sourceDeviceId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && userId.equals(other.userId)
                && source.equals(other.source);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.sleepId,
                this.sessionStart,
                this.sessionEnd,
                this.stageStartOffsetSecond,
                this.stageEndOffsetSecond,
                this.stageType,
                this.timeZone,
                this.sourceProvider,
                this.sourceType,
                this.sourceAppId,
                this.sourceDeviceId,
                this.createdAt,
                this.updatedAt,
                this.userId,
                this.source);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SleepIdStage id(String id);

        Builder from(ClientFacingSleepCycle other);
    }

    public interface SleepIdStage {
        SessionStartStage sleepId(String sleepId);
    }

    public interface SessionStartStage {
        SessionEndStage sessionStart(OffsetDateTime sessionStart);
    }

    public interface SessionEndStage {
        SourceProviderStage sessionEnd(OffsetDateTime sessionEnd);
    }

    public interface SourceProviderStage {
        SourceTypeStage sourceProvider(ClientFacingSleepCycleSourceProvider sourceProvider);
    }

    public interface SourceTypeStage {
        CreatedAtStage sourceType(ClientFacingSleepCycleSourceType sourceType);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        UserIdStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface UserIdStage {
        SourceStage userId(String userId);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ClientFacingSleepCycle build();

        _FinalStage stageStartOffsetSecond(List<Integer> stageStartOffsetSecond);

        _FinalStage addStageStartOffsetSecond(Integer stageStartOffsetSecond);

        _FinalStage addAllStageStartOffsetSecond(List<Integer> stageStartOffsetSecond);

        _FinalStage stageEndOffsetSecond(List<Integer> stageEndOffsetSecond);

        _FinalStage addStageEndOffsetSecond(Integer stageEndOffsetSecond);

        _FinalStage addAllStageEndOffsetSecond(List<Integer> stageEndOffsetSecond);

        _FinalStage stageType(List<Integer> stageType);

        _FinalStage addStageType(Integer stageType);

        _FinalStage addAllStageType(List<Integer> stageType);

        _FinalStage timeZone(Optional<String> timeZone);

        _FinalStage timeZone(String timeZone);

        _FinalStage sourceAppId(Optional<String> sourceAppId);

        _FinalStage sourceAppId(String sourceAppId);

        _FinalStage sourceDeviceId(Optional<String> sourceDeviceId);

        _FinalStage sourceDeviceId(String sourceDeviceId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    SleepIdStage,
                    SessionStartStage,
                    SessionEndStage,
                    SourceProviderStage,
                    SourceTypeStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    UserIdStage,
                    SourceStage,
                    _FinalStage {
        private String id;

        private String sleepId;

        private OffsetDateTime sessionStart;

        private OffsetDateTime sessionEnd;

        private ClientFacingSleepCycleSourceProvider sourceProvider;

        private ClientFacingSleepCycleSourceType sourceType;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String userId;

        private ClientFacingSource source;

        private Optional<String> sourceDeviceId = Optional.empty();

        private Optional<String> sourceAppId = Optional.empty();

        private Optional<String> timeZone = Optional.empty();

        private List<Integer> stageType = new ArrayList<>();

        private List<Integer> stageEndOffsetSecond = new ArrayList<>();

        private List<Integer> stageStartOffsetSecond = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingSleepCycle other) {
            id(other.getId());
            sleepId(other.getSleepId());
            sessionStart(other.getSessionStart());
            sessionEnd(other.getSessionEnd());
            stageStartOffsetSecond(other.getStageStartOffsetSecond());
            stageEndOffsetSecond(other.getStageEndOffsetSecond());
            stageType(other.getStageType());
            timeZone(other.getTimeZone());
            sourceProvider(other.getSourceProvider());
            sourceType(other.getSourceType());
            sourceAppId(other.getSourceAppId());
            sourceDeviceId(other.getSourceDeviceId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            userId(other.getUserId());
            source(other.getSource());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public SleepIdStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("sleep_id")
        public SessionStartStage sleepId(String sleepId) {
            this.sleepId = sleepId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("session_start")
        public SessionEndStage sessionStart(OffsetDateTime sessionStart) {
            this.sessionStart = sessionStart;
            return this;
        }

        @java.lang.Override
        @JsonSetter("session_end")
        public SourceProviderStage sessionEnd(OffsetDateTime sessionEnd) {
            this.sessionEnd = sessionEnd;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source_provider")
        public SourceTypeStage sourceProvider(ClientFacingSleepCycleSourceProvider sourceProvider) {
            this.sourceProvider = sourceProvider;
            return this;
        }

        /**
         * <p>ℹ️ This enum is non-exhaustive.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source_type")
        public CreatedAtStage sourceType(ClientFacingSleepCycleSourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("created_at")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updated_at")
        public UserIdStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public SourceStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
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
        public _FinalStage sourceAppId(String sourceAppId) {
            this.sourceAppId = Optional.of(sourceAppId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "source_app_id", nulls = Nulls.SKIP)
        public _FinalStage sourceAppId(Optional<String> sourceAppId) {
            this.sourceAppId = sourceAppId;
            return this;
        }

        @java.lang.Override
        public _FinalStage timeZone(String timeZone) {
            this.timeZone = Optional.of(timeZone);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "time_zone", nulls = Nulls.SKIP)
        public _FinalStage timeZone(Optional<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>Sleep stage classification:
         * <code>-1</code>: Unknown or unclassified sleep stage;
         * <code>1</code>: Deep sleep;
         * <code>2</code>: Light/non-REM sleep;
         * <code>3</code>: Rapid Eye Movement sleep;
         * <code>4</code>: Awake period;
         * <code>5</code>: Manually classified stage.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllStageType(List<Integer> stageType) {
            this.stageType.addAll(stageType);
            return this;
        }

        /**
         * <p>Sleep stage classification:
         * <code>-1</code>: Unknown or unclassified sleep stage;
         * <code>1</code>: Deep sleep;
         * <code>2</code>: Light/non-REM sleep;
         * <code>3</code>: Rapid Eye Movement sleep;
         * <code>4</code>: Awake period;
         * <code>5</code>: Manually classified stage.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addStageType(Integer stageType) {
            this.stageType.add(stageType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "stage_type", nulls = Nulls.SKIP)
        public _FinalStage stageType(List<Integer> stageType) {
            this.stageType.clear();
            this.stageType.addAll(stageType);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllStageEndOffsetSecond(List<Integer> stageEndOffsetSecond) {
            this.stageEndOffsetSecond.addAll(stageEndOffsetSecond);
            return this;
        }

        @java.lang.Override
        public _FinalStage addStageEndOffsetSecond(Integer stageEndOffsetSecond) {
            this.stageEndOffsetSecond.add(stageEndOffsetSecond);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "stage_end_offset_second", nulls = Nulls.SKIP)
        public _FinalStage stageEndOffsetSecond(List<Integer> stageEndOffsetSecond) {
            this.stageEndOffsetSecond.clear();
            this.stageEndOffsetSecond.addAll(stageEndOffsetSecond);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllStageStartOffsetSecond(List<Integer> stageStartOffsetSecond) {
            this.stageStartOffsetSecond.addAll(stageStartOffsetSecond);
            return this;
        }

        @java.lang.Override
        public _FinalStage addStageStartOffsetSecond(Integer stageStartOffsetSecond) {
            this.stageStartOffsetSecond.add(stageStartOffsetSecond);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "stage_start_offset_second", nulls = Nulls.SKIP)
        public _FinalStage stageStartOffsetSecond(List<Integer> stageStartOffsetSecond) {
            this.stageStartOffsetSecond.clear();
            this.stageStartOffsetSecond.addAll(stageStartOffsetSecond);
            return this;
        }

        @java.lang.Override
        public ClientFacingSleepCycle build() {
            return new ClientFacingSleepCycle(
                    id,
                    sleepId,
                    sessionStart,
                    sessionEnd,
                    stageStartOffsetSecond,
                    stageEndOffsetSecond,
                    stageType,
                    timeZone,
                    sourceProvider,
                    sourceType,
                    sourceAppId,
                    sourceDeviceId,
                    createdAt,
                    updatedAt,
                    userId,
                    source,
                    additionalProperties);
        }
    }
}
