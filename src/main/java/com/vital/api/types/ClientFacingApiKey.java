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
@JsonDeserialize(builder = ClientFacingApiKey.Builder.class)
public final class ClientFacingApiKey {
    private final String label;

    private final String value;

    private final Optional<String> teamId;

    private final String id;

    private final OffsetDateTime createdAt;

    private final Optional<OffsetDateTime> deletedAt;

    private ClientFacingApiKey(
            String label,
            String value,
            Optional<String> teamId,
            String id,
            OffsetDateTime createdAt,
            Optional<OffsetDateTime> deletedAt) {
        this.label = label;
        this.value = value;
        this.teamId = teamId;
        this.id = id;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("team_id")
    public Optional<String> getTeamId() {
        return teamId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("deleted_at")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingApiKey && equalTo((ClientFacingApiKey) other);
    }

    private boolean equalTo(ClientFacingApiKey other) {
        return label.equals(other.label)
                && value.equals(other.value)
                && teamId.equals(other.teamId)
                && id.equals(other.id)
                && createdAt.equals(other.createdAt)
                && deletedAt.equals(other.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.label, this.value, this.teamId, this.id, this.createdAt, this.deletedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LabelStage builder() {
        return new Builder();
    }

    public interface LabelStage {
        ValueStage label(String label);

        Builder from(ClientFacingApiKey other);
    }

    public interface ValueStage {
        IdStage value(String value);
    }

    public interface IdStage {
        CreatedAtStage id(String id);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        ClientFacingApiKey build();

        _FinalStage teamId(Optional<String> teamId);

        _FinalStage teamId(String teamId);

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LabelStage, ValueStage, IdStage, CreatedAtStage, _FinalStage {
        private String label;

        private String value;

        private String id;

        private OffsetDateTime createdAt;

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Optional<String> teamId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingApiKey other) {
            label(other.getLabel());
            value(other.getValue());
            teamId(other.getTeamId());
            id(other.getId());
            createdAt(other.getCreatedAt());
            deletedAt(other.getDeletedAt());
            return this;
        }

        @Override
        @JsonSetter("label")
        public ValueStage label(String label) {
            this.label = label;
            return this;
        }

        @Override
        @JsonSetter("value")
        public IdStage value(String value) {
            this.value = value;
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        public _FinalStage deletedAt(OffsetDateTime deletedAt) {
            this.deletedAt = Optional.of(deletedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "deleted_at", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        @Override
        public _FinalStage teamId(String teamId) {
            this.teamId = Optional.of(teamId);
            return this;
        }

        @Override
        @JsonSetter(value = "team_id", nulls = Nulls.SKIP)
        public _FinalStage teamId(Optional<String> teamId) {
            this.teamId = teamId;
            return this;
        }

        @Override
        public ClientFacingApiKey build() {
            return new ClientFacingApiKey(label, value, teamId, id, createdAt, deletedAt);
        }
    }
}