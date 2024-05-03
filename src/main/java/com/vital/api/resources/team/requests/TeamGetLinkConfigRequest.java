/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.team.requests;

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
@JsonDeserialize(builder = TeamGetLinkConfigRequest.Builder.class)
public final class TeamGetLinkConfigRequest {
    private final Optional<String> vitalLinkToken;

    private final Map<String, Object> additionalProperties;

    private TeamGetLinkConfigRequest(Optional<String> vitalLinkToken, Map<String, Object> additionalProperties) {
        this.vitalLinkToken = vitalLinkToken;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("x-vital-link-token")
    public Optional<String> getVitalLinkToken() {
        return vitalLinkToken;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamGetLinkConfigRequest && equalTo((TeamGetLinkConfigRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TeamGetLinkConfigRequest other) {
        return vitalLinkToken.equals(other.vitalLinkToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.vitalLinkToken);
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
        private Optional<String> vitalLinkToken = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TeamGetLinkConfigRequest other) {
            vitalLinkToken(other.getVitalLinkToken());
            return this;
        }

        @JsonSetter(value = "x-vital-link-token", nulls = Nulls.SKIP)
        public Builder vitalLinkToken(Optional<String> vitalLinkToken) {
            this.vitalLinkToken = vitalLinkToken;
            return this;
        }

        public Builder vitalLinkToken(String vitalLinkToken) {
            this.vitalLinkToken = Optional.of(vitalLinkToken);
            return this;
        }

        public TeamGetLinkConfigRequest build() {
            return new TeamGetLinkConfigRequest(vitalLinkToken, additionalProperties);
        }
    }
}
