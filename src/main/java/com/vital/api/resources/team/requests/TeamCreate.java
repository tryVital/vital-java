package com.vital.api.resources.team.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.PhysicianNetworkT;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TeamCreate.Builder.class)
public final class TeamCreate {
    private final Optional<String> svixAppId;

    private final Optional<String> clientId;

    private final Optional<String> clientSecret;

    private final Optional<String> apiKey;

    private final Optional<String> airtableApiKey;

    private final Optional<String> airtableBaseId;

    private final Optional<String> webhookSecret;

    private final Optional<Boolean> ffWheelEnabled;

    private final Optional<Boolean> ffAppleMobileAppEnabled;

    private final Optional<Boolean> labTestsPatientCommunicationEnabled;

    private final Optional<Boolean> labTestDelegatedFlowEnabled;

    private final Optional<PhysicianNetworkT> physicianNetwork;

    private final Optional<String> id;

    private final String name;

    private final Optional<String> subscriptionStatus;

    private TeamCreate(
            Optional<String> svixAppId,
            Optional<String> clientId,
            Optional<String> clientSecret,
            Optional<String> apiKey,
            Optional<String> airtableApiKey,
            Optional<String> airtableBaseId,
            Optional<String> webhookSecret,
            Optional<Boolean> ffWheelEnabled,
            Optional<Boolean> ffAppleMobileAppEnabled,
            Optional<Boolean> labTestsPatientCommunicationEnabled,
            Optional<Boolean> labTestDelegatedFlowEnabled,
            Optional<PhysicianNetworkT> physicianNetwork,
            Optional<String> id,
            String name,
            Optional<String> subscriptionStatus) {
        this.svixAppId = svixAppId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.apiKey = apiKey;
        this.airtableApiKey = airtableApiKey;
        this.airtableBaseId = airtableBaseId;
        this.webhookSecret = webhookSecret;
        this.ffWheelEnabled = ffWheelEnabled;
        this.ffAppleMobileAppEnabled = ffAppleMobileAppEnabled;
        this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
        this.labTestDelegatedFlowEnabled = labTestDelegatedFlowEnabled;
        this.physicianNetwork = physicianNetwork;
        this.id = id;
        this.name = name;
        this.subscriptionStatus = subscriptionStatus;
    }

    @JsonProperty("svix_app_id")
    public Optional<String> getSvixAppId() {
        return svixAppId;
    }

    @JsonProperty("client_id")
    public Optional<String> getClientId() {
        return clientId;
    }

    @JsonProperty("client_secret")
    public Optional<String> getClientSecret() {
        return clientSecret;
    }

    @JsonProperty("api_key")
    public Optional<String> getApiKey() {
        return apiKey;
    }

    @JsonProperty("airtable_api_key")
    public Optional<String> getAirtableApiKey() {
        return airtableApiKey;
    }

    @JsonProperty("airtable_base_id")
    public Optional<String> getAirtableBaseId() {
        return airtableBaseId;
    }

    @JsonProperty("webhook_secret")
    public Optional<String> getWebhookSecret() {
        return webhookSecret;
    }

    @JsonProperty("ff_wheel_enabled")
    public Optional<Boolean> getFfWheelEnabled() {
        return ffWheelEnabled;
    }

    @JsonProperty("ff_apple_mobile_app_enabled")
    public Optional<Boolean> getFfAppleMobileAppEnabled() {
        return ffAppleMobileAppEnabled;
    }

    @JsonProperty("lab_tests_patient_communication_enabled")
    public Optional<Boolean> getLabTestsPatientCommunicationEnabled() {
        return labTestsPatientCommunicationEnabled;
    }

    @JsonProperty("lab_test_delegated_flow_enabled")
    public Optional<Boolean> getLabTestDelegatedFlowEnabled() {
        return labTestDelegatedFlowEnabled;
    }

    @JsonProperty("physician_network")
    public Optional<PhysicianNetworkT> getPhysicianNetwork() {
        return physicianNetwork;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("subscription_status")
    public Optional<String> getSubscriptionStatus() {
        return subscriptionStatus;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamCreate && equalTo((TeamCreate) other);
    }

    private boolean equalTo(TeamCreate other) {
        return svixAppId.equals(other.svixAppId)
                && clientId.equals(other.clientId)
                && clientSecret.equals(other.clientSecret)
                && apiKey.equals(other.apiKey)
                && airtableApiKey.equals(other.airtableApiKey)
                && airtableBaseId.equals(other.airtableBaseId)
                && webhookSecret.equals(other.webhookSecret)
                && ffWheelEnabled.equals(other.ffWheelEnabled)
                && ffAppleMobileAppEnabled.equals(other.ffAppleMobileAppEnabled)
                && labTestsPatientCommunicationEnabled.equals(other.labTestsPatientCommunicationEnabled)
                && labTestDelegatedFlowEnabled.equals(other.labTestDelegatedFlowEnabled)
                && physicianNetwork.equals(other.physicianNetwork)
                && id.equals(other.id)
                && name.equals(other.name)
                && subscriptionStatus.equals(other.subscriptionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.svixAppId,
                this.clientId,
                this.clientSecret,
                this.apiKey,
                this.airtableApiKey,
                this.airtableBaseId,
                this.webhookSecret,
                this.ffWheelEnabled,
                this.ffAppleMobileAppEnabled,
                this.labTestsPatientCommunicationEnabled,
                this.labTestDelegatedFlowEnabled,
                this.physicianNetwork,
                this.id,
                this.name,
                this.subscriptionStatus);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(String name);

        Builder from(TeamCreate other);
    }

    public interface _FinalStage {
        TeamCreate build();

        _FinalStage svixAppId(Optional<String> svixAppId);

        _FinalStage svixAppId(String svixAppId);

        _FinalStage clientId(Optional<String> clientId);

        _FinalStage clientId(String clientId);

        _FinalStage clientSecret(Optional<String> clientSecret);

        _FinalStage clientSecret(String clientSecret);

        _FinalStage apiKey(Optional<String> apiKey);

        _FinalStage apiKey(String apiKey);

        _FinalStage airtableApiKey(Optional<String> airtableApiKey);

        _FinalStage airtableApiKey(String airtableApiKey);

        _FinalStage airtableBaseId(Optional<String> airtableBaseId);

        _FinalStage airtableBaseId(String airtableBaseId);

        _FinalStage webhookSecret(Optional<String> webhookSecret);

        _FinalStage webhookSecret(String webhookSecret);

        _FinalStage ffWheelEnabled(Optional<Boolean> ffWheelEnabled);

        _FinalStage ffWheelEnabled(Boolean ffWheelEnabled);

        _FinalStage ffAppleMobileAppEnabled(Optional<Boolean> ffAppleMobileAppEnabled);

        _FinalStage ffAppleMobileAppEnabled(Boolean ffAppleMobileAppEnabled);

        _FinalStage labTestsPatientCommunicationEnabled(Optional<Boolean> labTestsPatientCommunicationEnabled);

        _FinalStage labTestsPatientCommunicationEnabled(Boolean labTestsPatientCommunicationEnabled);

        _FinalStage labTestDelegatedFlowEnabled(Optional<Boolean> labTestDelegatedFlowEnabled);

        _FinalStage labTestDelegatedFlowEnabled(Boolean labTestDelegatedFlowEnabled);

        _FinalStage physicianNetwork(Optional<PhysicianNetworkT> physicianNetwork);

        _FinalStage physicianNetwork(PhysicianNetworkT physicianNetwork);

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage subscriptionStatus(Optional<String> subscriptionStatus);

        _FinalStage subscriptionStatus(String subscriptionStatus);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<String> subscriptionStatus = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<PhysicianNetworkT> physicianNetwork = Optional.empty();

        private Optional<Boolean> labTestDelegatedFlowEnabled = Optional.empty();

        private Optional<Boolean> labTestsPatientCommunicationEnabled = Optional.empty();

        private Optional<Boolean> ffAppleMobileAppEnabled = Optional.empty();

        private Optional<Boolean> ffWheelEnabled = Optional.empty();

        private Optional<String> webhookSecret = Optional.empty();

        private Optional<String> airtableBaseId = Optional.empty();

        private Optional<String> airtableApiKey = Optional.empty();

        private Optional<String> apiKey = Optional.empty();

        private Optional<String> clientSecret = Optional.empty();

        private Optional<String> clientId = Optional.empty();

        private Optional<String> svixAppId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(TeamCreate other) {
            svixAppId(other.getSvixAppId());
            clientId(other.getClientId());
            clientSecret(other.getClientSecret());
            apiKey(other.getApiKey());
            airtableApiKey(other.getAirtableApiKey());
            airtableBaseId(other.getAirtableBaseId());
            webhookSecret(other.getWebhookSecret());
            ffWheelEnabled(other.getFfWheelEnabled());
            ffAppleMobileAppEnabled(other.getFfAppleMobileAppEnabled());
            labTestsPatientCommunicationEnabled(other.getLabTestsPatientCommunicationEnabled());
            labTestDelegatedFlowEnabled(other.getLabTestDelegatedFlowEnabled());
            physicianNetwork(other.getPhysicianNetwork());
            id(other.getId());
            name(other.getName());
            subscriptionStatus(other.getSubscriptionStatus());
            return this;
        }

        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage subscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = Optional.of(subscriptionStatus);
            return this;
        }

        @Override
        @JsonSetter(value = "subscription_status", nulls = Nulls.SKIP)
        public _FinalStage subscriptionStatus(Optional<String> subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }

        @Override
        public _FinalStage id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @Override
        public _FinalStage physicianNetwork(PhysicianNetworkT physicianNetwork) {
            this.physicianNetwork = Optional.of(physicianNetwork);
            return this;
        }

        @Override
        @JsonSetter(value = "physician_network", nulls = Nulls.SKIP)
        public _FinalStage physicianNetwork(Optional<PhysicianNetworkT> physicianNetwork) {
            this.physicianNetwork = physicianNetwork;
            return this;
        }

        @Override
        public _FinalStage labTestDelegatedFlowEnabled(Boolean labTestDelegatedFlowEnabled) {
            this.labTestDelegatedFlowEnabled = Optional.of(labTestDelegatedFlowEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "lab_test_delegated_flow_enabled", nulls = Nulls.SKIP)
        public _FinalStage labTestDelegatedFlowEnabled(Optional<Boolean> labTestDelegatedFlowEnabled) {
            this.labTestDelegatedFlowEnabled = labTestDelegatedFlowEnabled;
            return this;
        }

        @Override
        public _FinalStage labTestsPatientCommunicationEnabled(Boolean labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = Optional.of(labTestsPatientCommunicationEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "lab_tests_patient_communication_enabled", nulls = Nulls.SKIP)
        public _FinalStage labTestsPatientCommunicationEnabled(Optional<Boolean> labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
            return this;
        }

        @Override
        public _FinalStage ffAppleMobileAppEnabled(Boolean ffAppleMobileAppEnabled) {
            this.ffAppleMobileAppEnabled = Optional.of(ffAppleMobileAppEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "ff_apple_mobile_app_enabled", nulls = Nulls.SKIP)
        public _FinalStage ffAppleMobileAppEnabled(Optional<Boolean> ffAppleMobileAppEnabled) {
            this.ffAppleMobileAppEnabled = ffAppleMobileAppEnabled;
            return this;
        }

        @Override
        public _FinalStage ffWheelEnabled(Boolean ffWheelEnabled) {
            this.ffWheelEnabled = Optional.of(ffWheelEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "ff_wheel_enabled", nulls = Nulls.SKIP)
        public _FinalStage ffWheelEnabled(Optional<Boolean> ffWheelEnabled) {
            this.ffWheelEnabled = ffWheelEnabled;
            return this;
        }

        @Override
        public _FinalStage webhookSecret(String webhookSecret) {
            this.webhookSecret = Optional.of(webhookSecret);
            return this;
        }

        @Override
        @JsonSetter(value = "webhook_secret", nulls = Nulls.SKIP)
        public _FinalStage webhookSecret(Optional<String> webhookSecret) {
            this.webhookSecret = webhookSecret;
            return this;
        }

        @Override
        public _FinalStage airtableBaseId(String airtableBaseId) {
            this.airtableBaseId = Optional.of(airtableBaseId);
            return this;
        }

        @Override
        @JsonSetter(value = "airtable_base_id", nulls = Nulls.SKIP)
        public _FinalStage airtableBaseId(Optional<String> airtableBaseId) {
            this.airtableBaseId = airtableBaseId;
            return this;
        }

        @Override
        public _FinalStage airtableApiKey(String airtableApiKey) {
            this.airtableApiKey = Optional.of(airtableApiKey);
            return this;
        }

        @Override
        @JsonSetter(value = "airtable_api_key", nulls = Nulls.SKIP)
        public _FinalStage airtableApiKey(Optional<String> airtableApiKey) {
            this.airtableApiKey = airtableApiKey;
            return this;
        }

        @Override
        public _FinalStage apiKey(String apiKey) {
            this.apiKey = Optional.of(apiKey);
            return this;
        }

        @Override
        @JsonSetter(value = "api_key", nulls = Nulls.SKIP)
        public _FinalStage apiKey(Optional<String> apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        @Override
        public _FinalStage clientSecret(String clientSecret) {
            this.clientSecret = Optional.of(clientSecret);
            return this;
        }

        @Override
        @JsonSetter(value = "client_secret", nulls = Nulls.SKIP)
        public _FinalStage clientSecret(Optional<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        @Override
        public _FinalStage clientId(String clientId) {
            this.clientId = Optional.of(clientId);
            return this;
        }

        @Override
        @JsonSetter(value = "client_id", nulls = Nulls.SKIP)
        public _FinalStage clientId(Optional<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        @Override
        public _FinalStage svixAppId(String svixAppId) {
            this.svixAppId = Optional.of(svixAppId);
            return this;
        }

        @Override
        @JsonSetter(value = "svix_app_id", nulls = Nulls.SKIP)
        public _FinalStage svixAppId(Optional<String> svixAppId) {
            this.svixAppId = svixAppId;
            return this;
        }

        @Override
        public TeamCreate build() {
            return new TeamCreate(
                    svixAppId,
                    clientId,
                    clientSecret,
                    apiKey,
                    airtableApiKey,
                    airtableBaseId,
                    webhookSecret,
                    ffWheelEnabled,
                    ffAppleMobileAppEnabled,
                    labTestsPatientCommunicationEnabled,
                    labTestDelegatedFlowEnabled,
                    physicianNetwork,
                    id,
                    name,
                    subscriptionStatus);
        }
    }
}
