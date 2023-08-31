package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MealInDbBaseClientFacingSource.Builder.class)
public final class MealInDbBaseClientFacingSource {
    private final String id;

    private final String userId;

    private final int priorityId;

    private final int sourceId;

    private final String providerId;

    private final OffsetDateTime timestamp;

    private final String name;

    private final Optional<Energy> energy;

    private final Optional<Macros> macros;

    private final Optional<Micros> micros;

    private final Optional<Map<String, MealData>> data;

    private final ClientFacingSource source;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private MealInDbBaseClientFacingSource(
            String id,
            String userId,
            int priorityId,
            int sourceId,
            String providerId,
            OffsetDateTime timestamp,
            String name,
            Optional<Energy> energy,
            Optional<Macros> macros,
            Optional<Micros> micros,
            Optional<Map<String, MealData>> data,
            ClientFacingSource source,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.priorityId = priorityId;
        this.sourceId = sourceId;
        this.providerId = providerId;
        this.timestamp = timestamp;
        this.name = name;
        this.energy = energy;
        this.macros = macros;
        this.micros = micros;
        this.data = data;
        this.source = source;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("priority_id")
    public int getPriorityId() {
        return priorityId;
    }

    @JsonProperty("source_id")
    public int getSourceId() {
        return sourceId;
    }

    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("energy")
    public Optional<Energy> getEnergy() {
        return energy;
    }

    @JsonProperty("macros")
    public Optional<Macros> getMacros() {
        return macros;
    }

    @JsonProperty("micros")
    public Optional<Micros> getMicros() {
        return micros;
    }

    @JsonProperty("data")
    public Optional<Map<String, MealData>> getData() {
        return data;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MealInDbBaseClientFacingSource && equalTo((MealInDbBaseClientFacingSource) other);
    }

    private boolean equalTo(MealInDbBaseClientFacingSource other) {
        return id.equals(other.id)
                && userId.equals(other.userId)
                && priorityId == other.priorityId
                && sourceId == other.sourceId
                && providerId.equals(other.providerId)
                && timestamp.equals(other.timestamp)
                && name.equals(other.name)
                && energy.equals(other.energy)
                && macros.equals(other.macros)
                && micros.equals(other.micros)
                && data.equals(other.data)
                && source.equals(other.source)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.userId,
                this.priorityId,
                this.sourceId,
                this.providerId,
                this.timestamp,
                this.name,
                this.energy,
                this.macros,
                this.micros,
                this.data,
                this.source,
                this.createdAt,
                this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        UserIdStage id(String id);

        Builder from(MealInDbBaseClientFacingSource other);
    }

    public interface UserIdStage {
        PriorityIdStage userId(String userId);
    }

    public interface PriorityIdStage {
        SourceIdStage priorityId(int priorityId);
    }

    public interface SourceIdStage {
        ProviderIdStage sourceId(int sourceId);
    }

    public interface ProviderIdStage {
        TimestampStage providerId(String providerId);
    }

    public interface TimestampStage {
        NameStage timestamp(OffsetDateTime timestamp);
    }

    public interface NameStage {
        SourceStage name(String name);
    }

    public interface SourceStage {
        CreatedAtStage source(ClientFacingSource source);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        MealInDbBaseClientFacingSource build();

        _FinalStage energy(Optional<Energy> energy);

        _FinalStage energy(Energy energy);

        _FinalStage macros(Optional<Macros> macros);

        _FinalStage macros(Macros macros);

        _FinalStage micros(Optional<Micros> micros);

        _FinalStage micros(Micros micros);

        _FinalStage data(Optional<Map<String, MealData>> data);

        _FinalStage data(Map<String, MealData> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    UserIdStage,
                    PriorityIdStage,
                    SourceIdStage,
                    ProviderIdStage,
                    TimestampStage,
                    NameStage,
                    SourceStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String id;

        private String userId;

        private int priorityId;

        private int sourceId;

        private String providerId;

        private OffsetDateTime timestamp;

        private String name;

        private ClientFacingSource source;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<Map<String, MealData>> data = Optional.empty();

        private Optional<Micros> micros = Optional.empty();

        private Optional<Macros> macros = Optional.empty();

        private Optional<Energy> energy = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(MealInDbBaseClientFacingSource other) {
            id(other.getId());
            userId(other.getUserId());
            priorityId(other.getPriorityId());
            sourceId(other.getSourceId());
            providerId(other.getProviderId());
            timestamp(other.getTimestamp());
            name(other.getName());
            energy(other.getEnergy());
            macros(other.getMacros());
            micros(other.getMicros());
            data(other.getData());
            source(other.getSource());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @Override
        @JsonSetter("id")
        public UserIdStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public PriorityIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("priority_id")
        public SourceIdStage priorityId(int priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        @Override
        @JsonSetter("source_id")
        public ProviderIdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        @Override
        @JsonSetter("provider_id")
        public TimestampStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        @JsonSetter("timestamp")
        public NameStage timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Override
        @JsonSetter("name")
        public SourceStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("source")
        public CreatedAtStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("updated_at")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage data(Map<String, MealData> data) {
            this.data = Optional.of(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<Map<String, MealData>> data) {
            this.data = data;
            return this;
        }

        @Override
        public _FinalStage micros(Micros micros) {
            this.micros = Optional.of(micros);
            return this;
        }

        @Override
        @JsonSetter(value = "micros", nulls = Nulls.SKIP)
        public _FinalStage micros(Optional<Micros> micros) {
            this.micros = micros;
            return this;
        }

        @Override
        public _FinalStage macros(Macros macros) {
            this.macros = Optional.of(macros);
            return this;
        }

        @Override
        @JsonSetter(value = "macros", nulls = Nulls.SKIP)
        public _FinalStage macros(Optional<Macros> macros) {
            this.macros = macros;
            return this;
        }

        @Override
        public _FinalStage energy(Energy energy) {
            this.energy = Optional.of(energy);
            return this;
        }

        @Override
        @JsonSetter(value = "energy", nulls = Nulls.SKIP)
        public _FinalStage energy(Optional<Energy> energy) {
            this.energy = energy;
            return this;
        }

        @Override
        public MealInDbBaseClientFacingSource build() {
            return new MealInDbBaseClientFacingSource(
                    id,
                    userId,
                    priorityId,
                    sourceId,
                    providerId,
                    timestamp,
                    name,
                    energy,
                    macros,
                    micros,
                    data,
                    source,
                    createdAt,
                    updatedAt);
        }
    }
}
