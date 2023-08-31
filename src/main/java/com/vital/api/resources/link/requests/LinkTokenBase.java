package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkTokenBase.Builder.class)
public final class LinkTokenBase {
    private final String token;

    private final Optional<Boolean> isUsed;

    private final Optional<Map<String, Object>> oauthInfo;

    private LinkTokenBase(String token, Optional<Boolean> isUsed, Optional<Map<String, Object>> oauthInfo) {
        this.token = token;
        this.isUsed = isUsed;
        this.oauthInfo = oauthInfo;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkTokenBase && equalTo((LinkTokenBase) other);
    }

    private boolean equalTo(LinkTokenBase other) {
        return token.equals(other.token) && isUsed.equals(other.isUsed) && oauthInfo.equals(other.oauthInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.token, this.isUsed, this.oauthInfo);
    }

    @Override
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
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TokenStage, _FinalStage {
        private String token;

        private Optional<Map<String, Object>> oauthInfo = Optional.empty();

        private Optional<Boolean> isUsed = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LinkTokenBase other) {
            token(other.getToken());
            isUsed(other.getIsUsed());
            oauthInfo(other.getOauthInfo());
            return this;
        }

        @Override
        @JsonSetter("token")
        public _FinalStage token(String token) {
            this.token = token;
            return this;
        }

        @Override
        public _FinalStage oauthInfo(Map<String, Object> oauthInfo) {
            this.oauthInfo = Optional.of(oauthInfo);
            return this;
        }

        @Override
        @JsonSetter(value = "oauth_info", nulls = Nulls.SKIP)
        public _FinalStage oauthInfo(Optional<Map<String, Object>> oauthInfo) {
            this.oauthInfo = oauthInfo;
            return this;
        }

        @Override
        public _FinalStage isUsed(Boolean isUsed) {
            this.isUsed = Optional.of(isUsed);
            return this;
        }

        @Override
        @JsonSetter(value = "is_used", nulls = Nulls.SKIP)
        public _FinalStage isUsed(Optional<Boolean> isUsed) {
            this.isUsed = isUsed;
            return this;
        }

        @Override
        public LinkTokenBase build() {
            return new LinkTokenBase(token, isUsed, oauthInfo);
        }
    }
}
