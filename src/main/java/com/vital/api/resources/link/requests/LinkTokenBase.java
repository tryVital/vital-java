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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.LinkRequirements;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkTokenBase.Builder.class)
public final class LinkTokenBase {
    private final String token;

    private final Optional<Boolean> isUsed;

    private final Optional<Map<String, Object>> oauthInfo;

    private final Optional<LinkRequirements> requirements;

    private final Map<String, Object> additionalProperties;

    private LinkTokenBase(
            String token,
            Optional<Boolean> isUsed,
            Optional<Map<String, Object>> oauthInfo,
            Optional<LinkRequirements> requirements,
            Map<String, Object> additionalProperties) {
        this.token = token;
        this.isUsed = isUsed;
        this.oauthInfo = oauthInfo;
        this.requirements = requirements;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("is_used")
    public Optional<Boolean> getIsUsed() {
        return isUsed;
    }

    @JsonProperty("oauth_info")
    public Optional<Map<String, Object>> getOauthInfo() {
        return oauthInfo;
    }

    @JsonProperty("requirements")
    public Optional<LinkRequirements> getRequirements() {
        return requirements;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkTokenBase && equalTo((LinkTokenBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkTokenBase other) {
        return token.equals(other.token)
                && isUsed.equals(other.isUsed)
                && oauthInfo.equals(other.oauthInfo)
                && requirements.equals(other.requirements);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.token, this.isUsed, this.oauthInfo, this.requirements);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TokenStage builder() {
        return new Builder();
    }

    public interface TokenStage {
        _FinalStage token(String token);

        Builder from(LinkTokenBase other);
    }

    public interface _FinalStage {
        LinkTokenBase build();

        _FinalStage isUsed(Optional<Boolean> isUsed);

        _FinalStage isUsed(Boolean isUsed);

        _FinalStage oauthInfo(Optional<Map<String, Object>> oauthInfo);

        _FinalStage oauthInfo(Map<String, Object> oauthInfo);

        _FinalStage requirements(Optional<LinkRequirements> requirements);

        _FinalStage requirements(LinkRequirements requirements);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TokenStage, _FinalStage {
        private String token;

        private Optional<LinkRequirements> requirements = Optional.empty();

        private Optional<Map<String, Object>> oauthInfo = Optional.empty();

        private Optional<Boolean> isUsed = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LinkTokenBase other) {
            token(other.getToken());
            isUsed(other.getIsUsed());
            oauthInfo(other.getOauthInfo());
            requirements(other.getRequirements());
            return this;
        }

        @java.lang.Override
        @JsonSetter("token")
        public _FinalStage token(String token) {
            this.token = token;
            return this;
        }

        @java.lang.Override
        public _FinalStage requirements(LinkRequirements requirements) {
            this.requirements = Optional.of(requirements);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "requirements", nulls = Nulls.SKIP)
        public _FinalStage requirements(Optional<LinkRequirements> requirements) {
            this.requirements = requirements;
            return this;
        }

        @java.lang.Override
        public _FinalStage oauthInfo(Map<String, Object> oauthInfo) {
            this.oauthInfo = Optional.of(oauthInfo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "oauth_info", nulls = Nulls.SKIP)
        public _FinalStage oauthInfo(Optional<Map<String, Object>> oauthInfo) {
            this.oauthInfo = oauthInfo;
            return this;
        }

        @java.lang.Override
        public _FinalStage isUsed(Boolean isUsed) {
            this.isUsed = Optional.of(isUsed);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "is_used", nulls = Nulls.SKIP)
        public _FinalStage isUsed(Optional<Boolean> isUsed) {
            this.isUsed = isUsed;
            return this;
        }

        @java.lang.Override
        public LinkTokenBase build() {
            return new LinkTokenBase(token, isUsed, oauthInfo, requirements, additionalProperties);
        }
    }
}
