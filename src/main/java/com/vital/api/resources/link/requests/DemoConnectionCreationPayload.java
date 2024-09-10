/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.DemoProviders;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DemoConnectionCreationPayload.Builder.class)
public final class DemoConnectionCreationPayload {
    private final String userId;

    private final DemoProviders provider;

    private final Map<String, Object> additionalProperties;

    private DemoConnectionCreationPayload(
            String userId, DemoProviders provider, Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.provider = provider;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Vital user ID
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * @return Demo provider. For more information, please check out our docs (https://docs.tryvital.io/wearables/providers/test_data)
     */
    @JsonProperty("provider")
    public DemoProviders getProvider() {
        return provider;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DemoConnectionCreationPayload && equalTo((DemoConnectionCreationPayload) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DemoConnectionCreationPayload other) {
        return userId.equals(other.userId) && provider.equals(other.provider);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId, this.provider);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        ProviderStage userId(String userId);

        Builder from(DemoConnectionCreationPayload other);
    }

    public interface ProviderStage {
        _FinalStage provider(DemoProviders provider);
    }

    public interface _FinalStage {
        DemoConnectionCreationPayload build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, ProviderStage, _FinalStage {
        private String userId;

        private DemoProviders provider;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DemoConnectionCreationPayload other) {
            userId(other.getUserId());
            provider(other.getProvider());
            return this;
        }

        /**
         * <p>Vital user ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("user_id")
        public ProviderStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Demo provider. For more information, please check out our docs (https://docs.tryvital.io/wearables/providers/test_data)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("provider")
        public _FinalStage provider(DemoProviders provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        public DemoConnectionCreationPayload build() {
            return new DemoConnectionCreationPayload(userId, provider, additionalProperties);
        }
    }
}
