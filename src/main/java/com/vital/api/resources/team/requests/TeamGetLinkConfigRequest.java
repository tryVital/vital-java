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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TeamGetLinkConfigRequest.Builder.class)
public final class TeamGetLinkConfigRequest {
    private final Object vitalLinkToken;

    private final Map<String, Object> additionalProperties;

    private TeamGetLinkConfigRequest(Object vitalLinkToken, Map<String, Object> additionalProperties) {
        this.vitalLinkToken = vitalLinkToken;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("x-vital-link-token")
    public Object getVitalLinkToken() {
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

    public static VitalLinkTokenStage builder() {
        return new Builder();
    }

    public interface VitalLinkTokenStage {
        _FinalStage vitalLinkToken(Object vitalLinkToken);

        Builder from(TeamGetLinkConfigRequest other);
    }

    public interface _FinalStage {
        TeamGetLinkConfigRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VitalLinkTokenStage, _FinalStage {
        private Object vitalLinkToken;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(TeamGetLinkConfigRequest other) {
            vitalLinkToken(other.getVitalLinkToken());
            return this;
        }

        @Override
        @JsonSetter("x-vital-link-token")
        public _FinalStage vitalLinkToken(Object vitalLinkToken) {
            this.vitalLinkToken = vitalLinkToken;
            return this;
        }

        @Override
        public TeamGetLinkConfigRequest build() {
            return new TeamGetLinkConfigRequest(vitalLinkToken, additionalProperties);
        }
    }
}
