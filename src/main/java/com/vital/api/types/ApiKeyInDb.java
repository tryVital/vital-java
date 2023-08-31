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
@JsonDeserialize(builder = ApiKeyInDb.Builder.class)
public final class ApiKeyInDb {
    private final String label;

    private final String value;

    private final String teamId;

    private final String id;

    private final boolean inApp;

    private final OffsetDateTime createdAt;

    private final Optional<OffsetDateTime> deletedAt;

    private final ApiKeyRole role;

    private ApiKeyInDb(
            String label,
            String value,
            String teamId,
            String id,
            boolean inApp,
            OffsetDateTime createdAt,
            Optional<OffsetDateTime> deletedAt,
            ApiKeyRole role) {
        this.label = label;
        this.value = value;
        this.teamId = teamId;
        this.id = id;
        this.inApp = inApp;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.role = role;
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
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("in_app")
    public boolean getInApp() {
        return inApp;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("deleted_at")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("role")
    public ApiKeyRole getRole() {
        return role;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApiKeyInDb && equalTo((ApiKeyInDb) other);
    }

    private boolean equalTo(ApiKeyInDb other) {
        return label.equals(other.label)
                && value.equals(other.value)
                && teamId.equals(other.teamId)
                && id.equals(other.id)
                && inApp == other.inApp
                && createdAt.equals(other.createdAt)
                && deletedAt.equals(other.deletedAt)
                && role.equals(other.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.label, this.value, this.teamId, this.id, this.inApp, this.createdAt, this.deletedAt, this.role);
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

        Builder from(ApiKeyInDb other);
    }

    public interface ValueStage {
        TeamIdStage value(String value);
    }

    public interface TeamIdStage {
        IdStage teamId(String teamId);
    }

    public interface IdStage {
        InAppStage id(String id);
    }

    public interface InAppStage {
        CreatedAtStage inApp(boolean inApp);
    }

    public interface CreatedAtStage {
        RoleStage createdAt(OffsetDateTime createdAt);
    }

    public interface RoleStage {
        _FinalStage role(ApiKeyRole role);
    }

    public interface _FinalStage {
        ApiKeyInDb build();

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LabelStage,
                    ValueStage,
                    TeamIdStage,
                    IdStage,
                    InAppStage,
                    CreatedAtStage,
                    RoleStage,
                    _FinalStage {
        private String label;

        private String value;

        private String teamId;

        private String id;

        private boolean inApp;

        private OffsetDateTime createdAt;

        private ApiKeyRole role;

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ApiKeyInDb other) {
            label(other.getLabel());
            value(other.getValue());
            teamId(other.getTeamId());
            id(other.getId());
            inApp(other.getInApp());
            createdAt(other.getCreatedAt());
            deletedAt(other.getDeletedAt());
            role(other.getRole());
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
        public TeamIdStage value(String value) {
            this.value = value;
            return this;
        }

        @Override
        @JsonSetter("team_id")
        public IdStage teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public InAppStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("in_app")
        public CreatedAtStage inApp(boolean inApp) {
            this.inApp = inApp;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public RoleStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("role")
        public _FinalStage role(ApiKeyRole role) {
            this.role = role;
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
        public ApiKeyInDb build() {
            return new ApiKeyInDb(label, value, teamId, id, inApp, createdAt, deletedAt, role);
        }
    }
}
