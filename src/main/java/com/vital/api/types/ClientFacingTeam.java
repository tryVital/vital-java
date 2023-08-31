package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingTeam.Builder.class)
public final class ClientFacingTeam {
    private final String id;

    private final String name;

    private final Optional<String> svixAppId;

    private final Optional<String> clientId;

    private final Optional<String> clientSecret;

    private final Optional<String> airtableApiKey;

    private final Optional<String> airtableBaseId;

    private final Optional<String> webhookSecret;

    private final Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources;

    private final Optional<String> apiKey;

    private final Optional<List<ClientFacingApiKey>> apiKeys;

    private final Optional<TeamConfig> configuration;

    private final boolean testkitsTextsEnabled;

    private final boolean labTestsPatientCommunicationEnabled;

    private final Optional<String> logoUrl;

    private ClientFacingTeam(
            String id,
            String name,
            Optional<String> svixAppId,
            Optional<String> clientId,
            Optional<String> clientSecret,
            Optional<String> airtableApiKey,
            Optional<String> airtableBaseId,
            Optional<String> webhookSecret,
            Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources,
            Optional<String> apiKey,
            Optional<List<ClientFacingApiKey>> apiKeys,
            Optional<TeamConfig> configuration,
            boolean testkitsTextsEnabled,
            boolean labTestsPatientCommunicationEnabled,
            Optional<String> logoUrl) {
        this.id = id;
        this.name = name;
        this.svixAppId = svixAppId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.airtableApiKey = airtableApiKey;
        this.airtableBaseId = airtableBaseId;
        this.webhookSecret = webhookSecret;
        this.connectedSources = connectedSources;
        this.apiKey = apiKey;
        this.apiKeys = apiKeys;
        this.configuration = configuration;
        this.testkitsTextsEnabled = testkitsTextsEnabled;
        this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
        this.logoUrl = logoUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
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

    @JsonProperty("connected_sources")
    public Optional<List<ConnectedSourceClientFacingRedacted>> getConnectedSources() {
        return connectedSources;
    }

    @JsonProperty("api_key")
    public Optional<String> getApiKey() {
        return apiKey;
    }

    @JsonProperty("api_keys")
    public Optional<List<ClientFacingApiKey>> getApiKeys() {
        return apiKeys;
    }

    @JsonProperty("configuration")
    public Optional<TeamConfig> getConfiguration() {
        return configuration;
    }

    @JsonProperty("testkits_texts_enabled")
    public boolean getTestkitsTextsEnabled() {
        return testkitsTextsEnabled;
    }

    @JsonProperty("lab_tests_patient_communication_enabled")
    public boolean getLabTestsPatientCommunicationEnabled() {
        return labTestsPatientCommunicationEnabled;
    }

    @JsonProperty("logo_url")
    public Optional<String> getLogoUrl() {
        return logoUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingTeam && equalTo((ClientFacingTeam) other);
    }

    private boolean equalTo(ClientFacingTeam other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && svixAppId.equals(other.svixAppId)
                && clientId.equals(other.clientId)
                && clientSecret.equals(other.clientSecret)
                && airtableApiKey.equals(other.airtableApiKey)
                && airtableBaseId.equals(other.airtableBaseId)
                && webhookSecret.equals(other.webhookSecret)
                && connectedSources.equals(other.connectedSources)
                && apiKey.equals(other.apiKey)
                && apiKeys.equals(other.apiKeys)
                && configuration.equals(other.configuration)
                && testkitsTextsEnabled == other.testkitsTextsEnabled
                && labTestsPatientCommunicationEnabled == other.labTestsPatientCommunicationEnabled
                && logoUrl.equals(other.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.svixAppId,
                this.clientId,
                this.clientSecret,
                this.airtableApiKey,
                this.airtableBaseId,
                this.webhookSecret,
                this.connectedSources,
                this.apiKey,
                this.apiKeys,
                this.configuration,
                this.testkitsTextsEnabled,
                this.labTestsPatientCommunicationEnabled,
                this.logoUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(String id);

        Builder from(ClientFacingTeam other);
    }

    public interface NameStage {
        TestkitsTextsEnabledStage name(String name);
    }

    public interface TestkitsTextsEnabledStage {
        LabTestsPatientCommunicationEnabledStage testkitsTextsEnabled(boolean testkitsTextsEnabled);
    }

    public interface LabTestsPatientCommunicationEnabledStage {
        _FinalStage labTestsPatientCommunicationEnabled(boolean labTestsPatientCommunicationEnabled);
    }

    public interface _FinalStage {
        ClientFacingTeam build();

        _FinalStage svixAppId(Optional<String> svixAppId);

        _FinalStage svixAppId(String svixAppId);

        _FinalStage clientId(Optional<String> clientId);

        _FinalStage clientId(String clientId);

        _FinalStage clientSecret(Optional<String> clientSecret);

        _FinalStage clientSecret(String clientSecret);

        _FinalStage airtableApiKey(Optional<String> airtableApiKey);

        _FinalStage airtableApiKey(String airtableApiKey);

        _FinalStage airtableBaseId(Optional<String> airtableBaseId);

        _FinalStage airtableBaseId(String airtableBaseId);

        _FinalStage webhookSecret(Optional<String> webhookSecret);

        _FinalStage webhookSecret(String webhookSecret);

        _FinalStage connectedSources(Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources);

        _FinalStage connectedSources(List<ConnectedSourceClientFacingRedacted> connectedSources);

        _FinalStage apiKey(Optional<String> apiKey);

        _FinalStage apiKey(String apiKey);

        _FinalStage apiKeys(Optional<List<ClientFacingApiKey>> apiKeys);

        _FinalStage apiKeys(List<ClientFacingApiKey> apiKeys);

        _FinalStage configuration(Optional<TeamConfig> configuration);

        _FinalStage configuration(TeamConfig configuration);

        _FinalStage logoUrl(Optional<String> logoUrl);

        _FinalStage logoUrl(String logoUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    NameStage,
                    TestkitsTextsEnabledStage,
                    LabTestsPatientCommunicationEnabledStage,
                    _FinalStage {
        private String id;

        private String name;

        private boolean testkitsTextsEnabled;

        private boolean labTestsPatientCommunicationEnabled;

        private Optional<String> logoUrl = Optional.empty();

        private Optional<TeamConfig> configuration = Optional.empty();

        private Optional<List<ClientFacingApiKey>> apiKeys = Optional.empty();

        private Optional<String> apiKey = Optional.empty();

        private Optional<List<ConnectedSourceClientFacingRedacted>> connectedSources = Optional.empty();

        private Optional<String> webhookSecret = Optional.empty();

        private Optional<String> airtableBaseId = Optional.empty();

        private Optional<String> airtableApiKey = Optional.empty();

        private Optional<String> clientSecret = Optional.empty();

        private Optional<String> clientId = Optional.empty();

        private Optional<String> svixAppId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingTeam other) {
            id(other.getId());
            name(other.getName());
            svixAppId(other.getSvixAppId());
            clientId(other.getClientId());
            clientSecret(other.getClientSecret());
            airtableApiKey(other.getAirtableApiKey());
            airtableBaseId(other.getAirtableBaseId());
            webhookSecret(other.getWebhookSecret());
            connectedSources(other.getConnectedSources());
            apiKey(other.getApiKey());
            apiKeys(other.getApiKeys());
            configuration(other.getConfiguration());
            testkitsTextsEnabled(other.getTestkitsTextsEnabled());
            labTestsPatientCommunicationEnabled(other.getLabTestsPatientCommunicationEnabled());
            logoUrl(other.getLogoUrl());
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
        public TestkitsTextsEnabledStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("testkits_texts_enabled")
        public LabTestsPatientCommunicationEnabledStage testkitsTextsEnabled(boolean testkitsTextsEnabled) {
            this.testkitsTextsEnabled = testkitsTextsEnabled;
            return this;
        }

        @Override
        @JsonSetter("lab_tests_patient_communication_enabled")
        public _FinalStage labTestsPatientCommunicationEnabled(boolean labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
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
        public _FinalStage configuration(TeamConfig configuration) {
            this.configuration = Optional.of(configuration);
            return this;
        }

        @Override
        @JsonSetter(value = "configuration", nulls = Nulls.SKIP)
        public _FinalStage configuration(Optional<TeamConfig> configuration) {
            this.configuration = configuration;
            return this;
        }

        @Override
        public _FinalStage apiKeys(List<ClientFacingApiKey> apiKeys) {
            this.apiKeys = Optional.of(apiKeys);
            return this;
        }

        @Override
        @JsonSetter(value = "api_keys", nulls = Nulls.SKIP)
        public _FinalStage apiKeys(Optional<List<ClientFacingApiKey>> apiKeys) {
            this.apiKeys = apiKeys;
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
        public ClientFacingTeam build() {
            return new ClientFacingTeam(
                    id,
                    name,
                    svixAppId,
                    clientId,
                    clientSecret,
                    airtableApiKey,
                    airtableBaseId,
                    webhookSecret,
                    connectedSources,
                    apiKey,
                    apiKeys,
                    configuration,
                    testkitsTextsEnabled,
                    labTestsPatientCommunicationEnabled,
                    logoUrl);
        }
    }
}
