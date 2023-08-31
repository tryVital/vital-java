package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DeviceV2InDb.Builder.class)
public final class DeviceV2InDb {
    private final Optional<String> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final String id;

    private final Optional<ClientFacingSource> source;

    private DeviceV2InDb(
            Optional<String> data,
            String providerId,
            String userId,
            int sourceId,
            String id,
            Optional<ClientFacingSource> source) {
        this.data = data;
        this.providerId = providerId;
        this.userId = userId;
        this.sourceId = sourceId;
        this.id = id;
        this.source = source;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public Optional<ClientFacingSource> getSource() {
        return source;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceV2InDb && equalTo((DeviceV2InDb) other);
    }

    private boolean equalTo(DeviceV2InDb other) {
        return data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && id.equals(other.id)
                && source.equals(other.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data, this.providerId, this.userId, this.sourceId, this.id, this.source);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderIdStage builder() {
        return new Builder();
    }

    public interface ProviderIdStage {
        UserIdStage providerId(String providerId);

        Builder from(DeviceV2InDb other);
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
        DeviceV2InDb build();

        _FinalStage data(Optional<String> data);

        _FinalStage data(String data);

        _FinalStage source(Optional<ClientFacingSource> source);

        _FinalStage source(ClientFacingSource source);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderIdStage, UserIdStage, SourceIdStage, IdStage, _FinalStage {
        private String providerId;

        private String userId;

        private int sourceId;

        private String id;

        private Optional<ClientFacingSource> source = Optional.empty();

        private Optional<String> data = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(DeviceV2InDb other) {
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            id(other.getId());
            source(other.getSource());
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
        public DeviceV2InDb build() {
            return new DeviceV2InDb(data, providerId, userId, sourceId, id, source);
        }
    }
}
