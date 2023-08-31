package com.vital.api.resources.team.requests;

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
@JsonDeserialize(builder = TeamUpdate.Builder.class)
public final class TeamUpdate {
    private final Optional<Boolean> labTestsPatientCommunicationEnabled;

    private final Optional<String> subscriptionStatus;

    private final Optional<String> logoUrl;

    private TeamUpdate(
            Optional<Boolean> labTestsPatientCommunicationEnabled,
            Optional<String> subscriptionStatus,
            Optional<String> logoUrl) {
        this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
        this.subscriptionStatus = subscriptionStatus;
        this.logoUrl = logoUrl;
    }

    @JsonProperty("lab_tests_patient_communication_enabled")
    public Optional<Boolean> getLabTestsPatientCommunicationEnabled() {
        return labTestsPatientCommunicationEnabled;
    }

    @JsonProperty("subscription_status")
    public Optional<String> getSubscriptionStatus() {
        return subscriptionStatus;
    }

    @JsonProperty("logo_url")
    public Optional<String> getLogoUrl() {
        return logoUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamUpdate && equalTo((TeamUpdate) other);
    }

    private boolean equalTo(TeamUpdate other) {
        return labTestsPatientCommunicationEnabled.equals(other.labTestsPatientCommunicationEnabled)
                && subscriptionStatus.equals(other.subscriptionStatus)
                && logoUrl.equals(other.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.labTestsPatientCommunicationEnabled, this.subscriptionStatus, this.logoUrl);
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
        private Optional<Boolean> labTestsPatientCommunicationEnabled = Optional.empty();

        private Optional<String> subscriptionStatus = Optional.empty();

        private Optional<String> logoUrl = Optional.empty();

        private Builder() {}

        public Builder from(TeamUpdate other) {
            labTestsPatientCommunicationEnabled(other.getLabTestsPatientCommunicationEnabled());
            subscriptionStatus(other.getSubscriptionStatus());
            logoUrl(other.getLogoUrl());
            return this;
        }

        @JsonSetter(value = "lab_tests_patient_communication_enabled", nulls = Nulls.SKIP)
        public Builder labTestsPatientCommunicationEnabled(Optional<Boolean> labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
            return this;
        }

        public Builder labTestsPatientCommunicationEnabled(Boolean labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = Optional.of(labTestsPatientCommunicationEnabled);
            return this;
        }

        @JsonSetter(value = "subscription_status", nulls = Nulls.SKIP)
        public Builder subscriptionStatus(Optional<String> subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }

        public Builder subscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = Optional.of(subscriptionStatus);
            return this;
        }

        @JsonSetter(value = "logo_url", nulls = Nulls.SKIP)
        public Builder logoUrl(Optional<String> logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        public Builder logoUrl(String logoUrl) {
            this.logoUrl = Optional.of(logoUrl);
            return this;
        }

        public TeamUpdate build() {
            return new TeamUpdate(labTestsPatientCommunicationEnabled, subscriptionStatus, logoUrl);
        }
    }
}
