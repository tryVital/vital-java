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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkTokenExchangeResponse.Builder.class)
public final class LinkTokenExchangeResponse {
    private final String linkToken;

    private final String linkWebUrl;

    private final Map<String, Object> additionalProperties;

    private LinkTokenExchangeResponse(String linkToken, String linkWebUrl, Map<String, Object> additionalProperties) {
        this.linkToken = linkToken;
        this.linkWebUrl = linkWebUrl;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A short-lived Vital Link token for your Custom Link Widget to communicate with the Vital API.
     */
    @JsonProperty("link_token")
    public String getLinkToken() {
        return linkToken;
    }

    /**
     * @return The web browser link to launch the default Vital Link experience. If you requested the token for one specific provider, the link would redirect directly to the provider authentication flow. Otherwise, the user would be presented with a list of providers based on your team and token configurations.
     */
    @JsonProperty("link_web_url")
    public String getLinkWebUrl() {
        return linkWebUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkTokenExchangeResponse && equalTo((LinkTokenExchangeResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkTokenExchangeResponse other) {
        return linkToken.equals(other.linkToken) && linkWebUrl.equals(other.linkWebUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.linkToken, this.linkWebUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LinkTokenStage builder() {
        return new Builder();
    }

    public interface LinkTokenStage {
        LinkWebUrlStage linkToken(String linkToken);

        Builder from(LinkTokenExchangeResponse other);
    }

    public interface LinkWebUrlStage {
        _FinalStage linkWebUrl(String linkWebUrl);
    }

    public interface _FinalStage {
        LinkTokenExchangeResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LinkTokenStage, LinkWebUrlStage, _FinalStage {
        private String linkToken;

        private String linkWebUrl;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(LinkTokenExchangeResponse other) {
            linkToken(other.getLinkToken());
            linkWebUrl(other.getLinkWebUrl());
            return this;
        }

        /**
         * <p>A short-lived Vital Link token for your Custom Link Widget to communicate with the Vital API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("link_token")
        public LinkWebUrlStage linkToken(String linkToken) {
            this.linkToken = linkToken;
            return this;
        }

        /**
         * <p>The web browser link to launch the default Vital Link experience. If you requested the token for one specific provider, the link would redirect directly to the provider authentication flow. Otherwise, the user would be presented with a list of providers based on your team and token configurations.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("link_web_url")
        public _FinalStage linkWebUrl(String linkWebUrl) {
            this.linkWebUrl = linkWebUrl;
            return this;
        }

        @Override
        public LinkTokenExchangeResponse build() {
            return new LinkTokenExchangeResponse(linkToken, linkWebUrl, additionalProperties);
        }
    }
}
