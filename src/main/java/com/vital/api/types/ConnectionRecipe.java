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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectionRecipe.Builder.class)
public final class ConnectionRecipe {
    private final String userId;

    private final String accessToken;

    private final String refreshToken;

    private final String providerId;

    private final int expiresAt;

    private final Optional<List<String>> oauthScopes;

    private final Map<String, Object> additionalProperties;

    private ConnectionRecipe(
            String userId,
            String accessToken,
            String refreshToken,
            String providerId,
            int expiresAt,
            Optional<List<String>> oauthScopes,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.providerId = providerId;
        this.expiresAt = expiresAt;
        this.oauthScopes = oauthScopes;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("expires_at")
    public int getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("oauth_scopes")
    public Optional<List<String>> getOauthScopes() {
        return oauthScopes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectionRecipe && equalTo((ConnectionRecipe) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectionRecipe other) {
        return userId.equals(other.userId)
                && accessToken.equals(other.accessToken)
                && refreshToken.equals(other.refreshToken)
                && providerId.equals(other.providerId)
                && expiresAt == other.expiresAt
                && oauthScopes.equals(other.oauthScopes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userId, this.accessToken, this.refreshToken, this.providerId, this.expiresAt, this.oauthScopes);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        AccessTokenStage userId(String userId);

        Builder from(ConnectionRecipe other);
    }

    public interface AccessTokenStage {
        RefreshTokenStage accessToken(String accessToken);
    }

    public interface RefreshTokenStage {
        ProviderIdStage refreshToken(String refreshToken);
    }

    public interface ProviderIdStage {
        ExpiresAtStage providerId(String providerId);
    }

    public interface ExpiresAtStage {
        _FinalStage expiresAt(int expiresAt);
    }

    public interface _FinalStage {
        ConnectionRecipe build();

        _FinalStage oauthScopes(Optional<List<String>> oauthScopes);

        _FinalStage oauthScopes(List<String> oauthScopes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, AccessTokenStage, RefreshTokenStage, ProviderIdStage, ExpiresAtStage, _FinalStage {
        private String userId;

        private String accessToken;

        private String refreshToken;

        private String providerId;

        private int expiresAt;

        private Optional<List<String>> oauthScopes = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConnectionRecipe other) {
            userId(other.getUserId());
            accessToken(other.getAccessToken());
            refreshToken(other.getRefreshToken());
            providerId(other.getProviderId());
            expiresAt(other.getExpiresAt());
            oauthScopes(other.getOauthScopes());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public AccessTokenStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("access_token")
        public RefreshTokenStage accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        @java.lang.Override
        @JsonSetter("refresh_token")
        public ProviderIdStage refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        @java.lang.Override
        @JsonSetter("provider_id")
        public ExpiresAtStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("expires_at")
        public _FinalStage expiresAt(int expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Optional.of(oauthScopes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "oauth_scopes", nulls = Nulls.SKIP)
        public _FinalStage oauthScopes(Optional<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        @java.lang.Override
        public ConnectionRecipe build() {
            return new ConnectionRecipe(
                    userId, accessToken, refreshToken, providerId, expiresAt, oauthScopes, additionalProperties);
        }
    }
}
