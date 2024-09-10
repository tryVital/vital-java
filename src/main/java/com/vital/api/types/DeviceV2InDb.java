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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DeviceV2InDb.Builder.class)
public final class DeviceV2InDb {
    private final Map<String, Object> data;

    private final String providerId;

    private final String userId;

    private final int sourceId;

    private final String id;

    private final ClientFacingProvider source;

    private final Map<String, Object> additionalProperties;

    private DeviceV2InDb(
            Map<String, Object> data,
            String providerId,
            String userId,
            int sourceId,
            String id,
            ClientFacingProvider source,
            Map<String, Object> additionalProperties) {
        this.data = data;
        this.providerId = providerId;
        this.userId = userId;
        this.sourceId = sourceId;
        this.id = id;
        this.source = source;
        this.additionalProperties = additionalProperties;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public ClientFacingProvider getSource() {
        return source;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceV2InDb && equalTo((DeviceV2InDb) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeviceV2InDb other) {
        return data.equals(other.data)
                && providerId.equals(other.providerId)
                && userId.equals(other.userId)
                && sourceId == other.sourceId
                && id.equals(other.id)
                && source.equals(other.source);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data, this.providerId, this.userId, this.sourceId, this.id, this.source);
    }

    @java.lang.Override
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
        SourceStage id(String id);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingProvider source);
    }

    public interface _FinalStage {
        DeviceV2InDb build();

        _FinalStage data(Map<String, Object> data);

        _FinalStage putAllData(Map<String, Object> data);

        _FinalStage data(String key, Object value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ProviderIdStage, UserIdStage, SourceIdStage, IdStage, SourceStage, _FinalStage {
        private String providerId;

        private String userId;

        private int sourceId;

        private String id;

        private ClientFacingProvider source;

        private Map<String, Object> data = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DeviceV2InDb other) {
            data(other.getData());
            providerId(other.getProviderId());
            userId(other.getUserId());
            sourceId(other.getSourceId());
            id(other.getId());
            source(other.getSource());
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
        public IdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
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
        public DeviceV2InDb build() {
            return new DeviceV2InDb(data, providerId, userId, sourceId, id, source, additionalProperties);
        }
    }
}
