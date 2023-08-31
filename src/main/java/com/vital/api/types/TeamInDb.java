package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TeamInDb.Builder.class)
public final class TeamInDb {
    private final Optional<String> svixAppId;

    private final Optional<String> clientId;

    private final Optional<String> clientSecret;

    private final Optional<String> apiKey;

    private final Optional<String> airtableApiKey;

    private final Optional<String> airtableBaseId;

    private final Optional<String> webhookSecret;

    private final Optional<Boolean> ffWheelEnabled;

    private final Optional<Boolean> ffAppleMobileAppEnabled;

    private final boolean labTestsPatientCommunicationEnabled;

    private final Optional<Boolean> labTestDelegatedFlowEnabled;

    private final Optional<PhysicianNetworkT> physicianNetwork;

    private final String id;

    private final String name;

    private final Optional<List<TeamUser>> users;

    private final Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources;

    private final Map<String, Object> configuration;

    private final Optional<List<PriorityInDb>> priorities;

    private final Optional<String> subscriptionStatus;

    private final Optional<List<ApiKeyInDb>> apiKeys;

    private final Optional<String> logoUrl;

    private TeamInDb(
            Optional<String> svixAppId,
            Optional<String> clientId,
            Optional<String> clientSecret,
            Optional<String> apiKey,
            Optional<String> airtableApiKey,
            Optional<String> airtableBaseId,
            Optional<String> webhookSecret,
            Optional<Boolean> ffWheelEnabled,
            Optional<Boolean> ffAppleMobileAppEnabled,
            boolean labTestsPatientCommunicationEnabled,
            Optional<Boolean> labTestDelegatedFlowEnabled,
            Optional<PhysicianNetworkT> physicianNetwork,
            String id,
            String name,
            Optional<List<TeamUser>> users,
            Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources,
            Map<String, Object> configuration,
            Optional<List<PriorityInDb>> priorities,
            Optional<String> subscriptionStatus,
            Optional<List<ApiKeyInDb>> apiKeys,
            Optional<String> logoUrl) {
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
        this.users = users;
        this.connectedSources = connectedSources;
        this.configuration = configuration;
        this.priorities = priorities;
        this.subscriptionStatus = subscriptionStatus;
        this.apiKeys = apiKeys;
        this.logoUrl = logoUrl;
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
    public boolean getLabTestsPatientCommunicationEnabled() {
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
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("users")
    public Optional<List<TeamUser>> getUsers() {
        return users;
    }

    @JsonProperty("connected_sources")
    public Optional<List<ConnectedSourceClientFacingRedacted>> getConnectedSources() {
        return connectedSources;
    }

    @JsonProperty("configuration")
    public Map<String, Object> getConfiguration() {
        return configuration;
    }

    @JsonProperty("priorities")
    public Optional<List<PriorityInDb>> getPriorities() {
        return priorities;
    }

    @JsonProperty("subscription_status")
    public Optional<String> getSubscriptionStatus() {
        return subscriptionStatus;
    }

    @JsonProperty("api_keys")
    public Optional<List<ApiKeyInDb>> getApiKeys() {
        return apiKeys;
    }

    @JsonProperty("logo_url")
    public Optional<String> getLogoUrl() {
        return logoUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamInDb && equalTo((TeamInDb) other);
    }

    private boolean equalTo(TeamInDb other) {
        return svixAppId.equals(other.svixAppId)
                && clientId.equals(other.clientId)
                && clientSecret.equals(other.clientSecret)
                && apiKey.equals(other.apiKey)
                && airtableApiKey.equals(other.airtableApiKey)
                && airtableBaseId.equals(other.airtableBaseId)
                && webhookSecret.equals(other.webhookSecret)
                && ffWheelEnabled.equals(other.ffWheelEnabled)
                && ffAppleMobileAppEnabled.equals(other.ffAppleMobileAppEnabled)
                && labTestsPatientCommunicationEnabled == other.labTestsPatientCommunicationEnabled
                && labTestDelegatedFlowEnabled.equals(other.labTestDelegatedFlowEnabled)
                && physicianNetwork.equals(other.physicianNetwork)
                && id.equals(other.id)
                && name.equals(other.name)
                && users.equals(other.users)
                && connectedSources.equals(other.connectedSources)
                && configuration.equals(other.configuration)
                && priorities.equals(other.priorities)
                && subscriptionStatus.equals(other.subscriptionStatus)
                && apiKeys.equals(other.apiKeys)
                && logoUrl.equals(other.logoUrl);
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
                this.users,
                this.connectedSources,
                this.configuration,
                this.priorities,
                this.subscriptionStatus,
                this.apiKeys,
                this.logoUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LabTestsPatientCommunicationEnabledStage builder() {
        return new Builder();
    }

    public interface LabTestsPatientCommunicationEnabledStage {
        IdStage labTestsPatientCommunicationEnabled(boolean labTestsPatientCommunicationEnabled);

        Builder from(TeamInDb other);
    }

    public interface IdStage {
        NameStage id(String id);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        TeamInDb build();

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

        _FinalStage labTestDelegatedFlowEnabled(Optional<Boolean> labTestDelegatedFlowEnabled);

        _FinalStage labTestDelegatedFlowEnabled(Boolean labTestDelegatedFlowEnabled);

        _FinalStage physicianNetwork(Optional<PhysicianNetworkT> physicianNetwork);

        _FinalStage physicianNetwork(PhysicianNetworkT physicianNetwork);

        _FinalStage users(Optional<List<TeamUser>> users);

        _FinalStage users(List<TeamUser> users);

        _FinalStage connectedSources(Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources);

        _FinalStage connectedSources(List<ConnectedSourceClientFacingRedacted> connectedSources);

        _FinalStage configuration(Map<String, Object> configuration);

        _FinalStage putAllConfiguration(Map<String, Object> configuration);

        _FinalStage configuration(String key, Object value);

        _FinalStage priorities(Optional<List<PriorityInDb>> priorities);

        _FinalStage priorities(List<PriorityInDb> priorities);

        _FinalStage subscriptionStatus(Optional<String> subscriptionStatus);

        _FinalStage subscriptionStatus(String subscriptionStatus);

        _FinalStage apiKeys(Optional<List<ApiKeyInDb>> apiKeys);

        _FinalStage apiKeys(List<ApiKeyInDb> apiKeys);

        _FinalStage logoUrl(Optional<String> logoUrl);

        _FinalStage logoUrl(String logoUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LabTestsPatientCommunicationEnabledStage, IdStage, NameStage, _FinalStage {
        private boolean labTestsPatientCommunicationEnabled;

        private String id;

        private String name;

        private Optional<String> logoUrl = Optional.empty();

        private Optional<List<ApiKeyInDb>> apiKeys = Optional.empty();

        private Optional<String> subscriptionStatus = Optional.empty();

        private Optional<List<PriorityInDb>> priorities = Optional.empty();

        private Map<String, Object> configuration = new LinkedHashMap<>();

        private Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources = Optional.empty();

        private Optional<List<TeamUser>> users = Optional.empty();

        private Optional<PhysicianNetworkT> physicianNetwork = Optional.empty();

        private Optional<Boolean> labTestDelegatedFlowEnabled = Optional.empty();

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
        public Builder from(TeamInDb other) {
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
            users(other.getUsers());
            connectedSources(other.getConnectedSources());
            configuration(other.getConfiguration());
            priorities(other.getPriorities());
            subscriptionStatus(other.getSubscriptionStatus());
            apiKeys(other.getApiKeys());
            logoUrl(other.getLogoUrl());
            return this;
        }

        @Override
        @JsonSetter("lab_tests_patient_communication_enabled")
        public IdStage labTestsPatientCommunicationEnabled(boolean labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage logoUrl(String logoUrl) {
            this.logoUrl = Optional.of(logoUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "logo_url", nulls = Nulls.SKIP)
        public _FinalStage logoUrl(Optional<String> logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        @Override
        public _FinalStage apiKeys(List<ApiKeyInDb> apiKeys) {
            this.apiKeys = Optional.of(apiKeys);
            return this;
        }

        @Override
        @JsonSetter(value = "api_keys", nulls = Nulls.SKIP)
        public _FinalStage apiKeys(Optional<List<ApiKeyInDb>> apiKeys) {
            this.apiKeys = apiKeys;
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
        public _FinalStage priorities(List<PriorityInDb> priorities) {
            this.priorities = Optional.of(priorities);
            return this;
        }

        @Override
        @JsonSetter(value = "priorities", nulls = Nulls.SKIP)
        public _FinalStage priorities(Optional<List<PriorityInDb>> priorities) {
            this.priorities = priorities;
            return this;
        }

        @Override
        public _FinalStage configuration(String key, Object value) {
            this.configuration.put(key, value);
            return this;
        }

        @Override
        public _FinalStage putAllConfiguration(Map<String, Object> configuration) {
            this.configuration.putAll(configuration);
            return this;
        }

        @Override
        @JsonSetter(value = "configuration", nulls = Nulls.SKIP)
        public _FinalStage configuration(Map<String, Object> configuration) {
            this.configuration.clear();
            this.configuration.putAll(configuration);
            return this;
        }

        @Override
        public _FinalStage connectedSources(List<ConnectedSourceClientFacingRedacted> connectedSources) {
            this.connectedSources = Optional.of(connectedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "connected_sources", nulls = Nulls.SKIP)
        public _FinalStage connectedSources(Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources) {
            this.connectedSources = connectedSources;
            return this;
        }

        @Override
        public _FinalStage users(List<TeamUser> users) {
            this.users = Optional.of(users);
            return this;
        }

        @Override
        @JsonSetter(value = "users", nulls = Nulls.SKIP)
        public _FinalStage users(Optional<List<TeamUser>> users) {
            this.users = users;
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
        public TeamInDb build() {
            return new TeamInDb(
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
                    users,
                    connectedSources,
                    configuration,
                    priorities,
                    subscriptionStatus,
                    apiKeys,
                    logoUrl);
        }
    }
}
