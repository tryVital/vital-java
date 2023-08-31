package com.vital.api.resources.link.requests;

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
@JsonDeserialize(builder = LinkConnectProviderRequest.Builder.class)
public final class LinkConnectProviderRequest {
    private final Optional<String> vitalSdkNoRedirect;

    private LinkConnectProviderRequest(Optional<String> vitalSdkNoRedirect) {
        this.vitalSdkNoRedirect = vitalSdkNoRedirect;
    }

    @JsonProperty("x-vital-sdk-no-redirect")
    public Optional<String> getVitalSdkNoRedirect() {
        return vitalSdkNoRedirect;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkConnectProviderRequest && equalTo((LinkConnectProviderRequest) other);
    }

    private boolean equalTo(LinkConnectProviderRequest other) {
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

        private Builder() {}

        public Builder from(LinkConnectProviderRequest other) {
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

        public LinkConnectProviderRequest build() {
            return new LinkConnectProviderRequest(vitalSdkNoRedirect);
        }
    }
}
