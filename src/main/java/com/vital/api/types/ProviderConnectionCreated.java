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
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ProviderConnectionCreated.Builder.class)
public final class ProviderConnectionCreated {
    private final String userId;

    private final ClientFacingProvider source;

    private final ClientFacingProvider provider;

    private final Optional<String> externalUserId;

    private final Map<String, ResourceAvailability> resourceAvailability;

    private final Map<String, Object> additionalProperties;

    private ProviderConnectionCreated(
            String userId,
            ClientFacingProvider source,
            ClientFacingProvider provider,
            Optional<String> externalUserId,
            Map<String, ResourceAvailability> resourceAvailability,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.source = source;
        this.provider = provider;
        this.externalUserId = externalUserId;
        this.resourceAvailability = resourceAvailability;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * @return Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.
     */
    @JsonProperty("source")
    public ClientFacingProvider getSource() {
        return source;
    }

    @JsonProperty("provider")
    public ClientFacingProvider getProvider() {
        return provider;
    }

    /**
     * @return The unique identifier of the associated external data provider user.
     * <ul>
     * <li>OAuth Providers: User unique identifier; provider-specific formats</li>
     * <li>Password Providers: Username</li>
     * <li>Email Providers: Email</li>
     * <li>Junction Mobile SDK Providers: <code>null</code> (not available)</li>
     * </ul>
     */
    @JsonProperty("external_user_id")
    public Optional<String> getExternalUserId() {
        return externalUserId;
    }

    @JsonProperty("resource_availability")
    public Map<String, ResourceAvailability> getResourceAvailability() {
        return resourceAvailability;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProviderConnectionCreated && equalTo((ProviderConnectionCreated) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProviderConnectionCreated other) {
        return userId.equals(other.userId)
                && source.equals(other.source)
                && provider.equals(other.provider)
                && externalUserId.equals(other.externalUserId)
                && resourceAvailability.equals(other.resourceAvailability);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId, this.source, this.provider, this.externalUserId, this.resourceAvailability);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        SourceStage userId(String userId);

        Builder from(ProviderConnectionCreated other);
    }

    public interface SourceStage {
        ProviderStage source(ClientFacingProvider source);
    }

    public interface ProviderStage {
        _FinalStage provider(ClientFacingProvider provider);
    }

    public interface _FinalStage {
        ProviderConnectionCreated build();

        _FinalStage externalUserId(Optional<String> externalUserId);

        _FinalStage externalUserId(String externalUserId);

        _FinalStage resourceAvailability(Map<String, ResourceAvailability> resourceAvailability);

        _FinalStage putAllResourceAvailability(Map<String, ResourceAvailability> resourceAvailability);

        _FinalStage resourceAvailability(String key, ResourceAvailability value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, SourceStage, ProviderStage, _FinalStage {
        private String userId;

        private ClientFacingProvider source;

        private ClientFacingProvider provider;

        private Map<String, ResourceAvailability> resourceAvailability = new LinkedHashMap<>();

        private Optional<String> externalUserId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ProviderConnectionCreated other) {
            userId(other.getUserId());
            source(other.getSource());
            provider(other.getProvider());
            externalUserId(other.getExternalUserId());
            resourceAvailability(other.getResourceAvailability());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public SourceStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source")
        public ProviderStage source(ClientFacingProvider source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        @JsonSetter("provider")
        public _FinalStage provider(ClientFacingProvider provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        public _FinalStage resourceAvailability(String key, ResourceAvailability value) {
            this.resourceAvailability.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllResourceAvailability(Map<String, ResourceAvailability> resourceAvailability) {
            this.resourceAvailability.putAll(resourceAvailability);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "resource_availability", nulls = Nulls.SKIP)
        public _FinalStage resourceAvailability(Map<String, ResourceAvailability> resourceAvailability) {
            this.resourceAvailability.clear();
            this.resourceAvailability.putAll(resourceAvailability);
            return this;
        }

        /**
         * <p>The unique identifier of the associated external data provider user.</p>
         * <ul>
         * <li>OAuth Providers: User unique identifier; provider-specific formats</li>
         * <li>Password Providers: Username</li>
         * <li>Email Providers: Email</li>
         * <li>Junction Mobile SDK Providers: <code>null</code> (not available)</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage externalUserId(String externalUserId) {
            this.externalUserId = Optional.of(externalUserId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "external_user_id", nulls = Nulls.SKIP)
        public _FinalStage externalUserId(Optional<String> externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }

        @java.lang.Override
        public ProviderConnectionCreated build() {
            return new ProviderConnectionCreated(
                    userId, source, provider, externalUserId, resourceAvailability, additionalProperties);
        }
    }
}
