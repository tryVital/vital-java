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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkConnectOauthProviderRequest.Builder.class)
public final class LinkConnectOauthProviderRequest {
    private final Optional<String> vitalSdkNoRedirect;

    private final Map<String, Object> additionalProperties;

    private LinkConnectOauthProviderRequest(
            Optional<String> vitalSdkNoRedirect, Map<String, Object> additionalProperties) {
        this.vitalSdkNoRedirect = vitalSdkNoRedirect;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("x-vital-sdk-no-redirect")
    public Optional<String> getVitalSdkNoRedirect() {
        return vitalSdkNoRedirect;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkConnectOauthProviderRequest && equalTo((LinkConnectOauthProviderRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkConnectOauthProviderRequest other) {
        return vitalSdkNoRedirect.equals(other.vitalSdkNoRedirect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.vitalSdkNoRedirect);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> vitalSdkNoRedirect = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LinkConnectOauthProviderRequest other) {
            vitalSdkNoRedirect(other.getVitalSdkNoRedirect());
            return this;
        }

        @JsonSetter(value = "x-vital-sdk-no-redirect", nulls = Nulls.SKIP)
        public Builder vitalSdkNoRedirect(Optional<String> vitalSdkNoRedirect) {
            this.vitalSdkNoRedirect = vitalSdkNoRedirect;
            return this;
        }

        public Builder vitalSdkNoRedirect(String vitalSdkNoRedirect) {
            this.vitalSdkNoRedirect = Optional.of(vitalSdkNoRedirect);
            return this;
        }

        public LinkConnectOauthProviderRequest build() {
            return new LinkConnectOauthProviderRequest(vitalSdkNoRedirect, additionalProperties);
        }
    }
}
