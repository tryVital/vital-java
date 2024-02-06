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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingTeam.Builder.class)
public final class ClientFacingTeam {
    private final String id;

    private final Optional<String> orgId;

    private final String name;

    private final Optional<String> svixAppId;

    private final Optional<String> clientId;

    private final Optional<String> clientSecret;

    private final Optional<String> airtableApiKey;

    private final Optional<String> airtableBaseId;

    private final Optional<String> webhookSecret;

    private final Optional<String> apiKey;

    private final Optional<List<ClientFacingApiKey>> apiKeys;

    private final Optional<TeamConfig> configuration;

    private final boolean testkitsTextsEnabled;

    private final boolean labTestsPatientCommunicationEnabled;

    private final boolean labTestsPatientSmsCommunicationEnabled;

    private final boolean labTestsPatientEmailCommunicationEnabled;

    private final Optional<String> logoUrl;

    private final DelegatedFlowType delegatedFlow;

    private final Map<String, Object> additionalProperties;

    private ClientFacingTeam(
            String id,
            Optional<String> orgId,
            String name,
            Optional<String> svixAppId,
            Optional<String> clientId,
            Optional<String> clientSecret,
            Optional<String> airtableApiKey,
            Optional<String> airtableBaseId,
            Optional<String> webhookSecret,
            Optional<String> apiKey,
            Optional<List<ClientFacingApiKey>> apiKeys,
            Optional<TeamConfig> configuration,
            boolean testkitsTextsEnabled,
            boolean labTestsPatientCommunicationEnabled,
            boolean labTestsPatientSmsCommunicationEnabled,
            boolean labTestsPatientEmailCommunicationEnabled,
            Optional<String> logoUrl,
            DelegatedFlowType delegatedFlow,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.orgId = orgId;
        this.name = name;
        this.svixAppId = svixAppId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.airtableApiKey = airtableApiKey;
        this.airtableBaseId = airtableBaseId;
        this.webhookSecret = webhookSecret;
        this.apiKey = apiKey;
        this.apiKeys = apiKeys;
        this.configuration = configuration;
        this.testkitsTextsEnabled = testkitsTextsEnabled;
        this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
        this.labTestsPatientSmsCommunicationEnabled = labTestsPatientSmsCommunicationEnabled;
        this.labTestsPatientEmailCommunicationEnabled = labTestsPatientEmailCommunicationEnabled;
        this.logoUrl = logoUrl;
        this.delegatedFlow = delegatedFlow;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("org_id")
    public Optional<String> getOrgId() {
        return orgId;
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

    @JsonProperty("lab_tests_patient_sms_communication_enabled")
    public boolean getLabTestsPatientSmsCommunicationEnabled() {
        return labTestsPatientSmsCommunicationEnabled;
    }

    @JsonProperty("lab_tests_patient_email_communication_enabled")
    public boolean getLabTestsPatientEmailCommunicationEnabled() {
        return labTestsPatientEmailCommunicationEnabled;
    }

    @JsonProperty("logo_url")
    public Optional<String> getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("delegated_flow")
    public DelegatedFlowType getDelegatedFlow() {
        return delegatedFlow;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingTeam && equalTo((ClientFacingTeam) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingTeam other) {
        return id.equals(other.id)
                && orgId.equals(other.orgId)
                && name.equals(other.name)
                && svixAppId.equals(other.svixAppId)
                && clientId.equals(other.clientId)
                && clientSecret.equals(other.clientSecret)
                && airtableApiKey.equals(other.airtableApiKey)
                && airtableBaseId.equals(other.airtableBaseId)
                && webhookSecret.equals(other.webhookSecret)
                && apiKey.equals(other.apiKey)
                && apiKeys.equals(other.apiKeys)
                && configuration.equals(other.configuration)
                && testkitsTextsEnabled == other.testkitsTextsEnabled
                && labTestsPatientCommunicationEnabled == other.labTestsPatientCommunicationEnabled
                && labTestsPatientSmsCommunicationEnabled == other.labTestsPatientSmsCommunicationEnabled
                && labTestsPatientEmailCommunicationEnabled == other.labTestsPatientEmailCommunicationEnabled
                && logoUrl.equals(other.logoUrl)
                && delegatedFlow.equals(other.delegatedFlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.orgId,
                this.name,
                this.svixAppId,
                this.clientId,
                this.clientSecret,
                this.airtableApiKey,
                this.airtableBaseId,
                this.webhookSecret,
                this.apiKey,
                this.apiKeys,
                this.configuration,
                this.testkitsTextsEnabled,
                this.labTestsPatientCommunicationEnabled,
                this.labTestsPatientSmsCommunicationEnabled,
                this.labTestsPatientEmailCommunicationEnabled,
                this.logoUrl,
                this.delegatedFlow);
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
        LabTestsPatientSmsCommunicationEnabledStage labTestsPatientCommunicationEnabled(
                boolean labTestsPatientCommunicationEnabled);
    }

    public interface LabTestsPatientSmsCommunicationEnabledStage {
        LabTestsPatientEmailCommunicationEnabledStage labTestsPatientSmsCommunicationEnabled(
                boolean labTestsPatientSmsCommunicationEnabled);
    }

    public interface LabTestsPatientEmailCommunicationEnabledStage {
        DelegatedFlowStage labTestsPatientEmailCommunicationEnabled(boolean labTestsPatientEmailCommunicationEnabled);
    }

    public interface DelegatedFlowStage {
        _FinalStage delegatedFlow(DelegatedFlowType delegatedFlow);
    }

    public interface _FinalStage {
        ClientFacingTeam build();

        _FinalStage orgId(Optional<String> orgId);

        _FinalStage orgId(String orgId);

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
                    LabTestsPatientSmsCommunicationEnabledStage,
                    LabTestsPatientEmailCommunicationEnabledStage,
                    DelegatedFlowStage,
                    _FinalStage {
        private String id;

        private String name;

        private boolean testkitsTextsEnabled;

        private boolean labTestsPatientCommunicationEnabled;

        private boolean labTestsPatientSmsCommunicationEnabled;

        private boolean labTestsPatientEmailCommunicationEnabled;

        private DelegatedFlowType delegatedFlow;

        private Optional<String> logoUrl = Optional.empty();

        private Optional<TeamConfig> configuration = Optional.empty();

        private Optional<List<ClientFacingApiKey>> apiKeys = Optional.empty();

        private Optional<String> apiKey = Optional.empty();

        private Optional<String> webhookSecret = Optional.empty();

        private Optional<String> airtableBaseId = Optional.empty();

        private Optional<String> airtableApiKey = Optional.empty();

        private Optional<String> clientSecret = Optional.empty();

        private Optional<String> clientId = Optional.empty();

        private Optional<String> svixAppId = Optional.empty();

        private Optional<String> orgId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientFacingTeam other) {
            id(other.getId());
            orgId(other.getOrgId());
            name(other.getName());
            svixAppId(other.getSvixAppId());
            clientId(other.getClientId());
            clientSecret(other.getClientSecret());
            airtableApiKey(other.getAirtableApiKey());
            airtableBaseId(other.getAirtableBaseId());
            webhookSecret(other.getWebhookSecret());
            apiKey(other.getApiKey());
            apiKeys(other.getApiKeys());
            configuration(other.getConfiguration());
            testkitsTextsEnabled(other.getTestkitsTextsEnabled());
            labTestsPatientCommunicationEnabled(other.getLabTestsPatientCommunicationEnabled());
            labTestsPatientSmsCommunicationEnabled(other.getLabTestsPatientSmsCommunicationEnabled());
            labTestsPatientEmailCommunicationEnabled(other.getLabTestsPatientEmailCommunicationEnabled());
            logoUrl(other.getLogoUrl());
            delegatedFlow(other.getDelegatedFlow());
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
        public LabTestsPatientSmsCommunicationEnabledStage labTestsPatientCommunicationEnabled(
                boolean labTestsPatientCommunicationEnabled) {
            this.labTestsPatientCommunicationEnabled = labTestsPatientCommunicationEnabled;
            return this;
        }

        @Override
        @JsonSetter("lab_tests_patient_sms_communication_enabled")
        public LabTestsPatientEmailCommunicationEnabledStage labTestsPatientSmsCommunicationEnabled(
                boolean labTestsPatientSmsCommunicationEnabled) {
            this.labTestsPatientSmsCommunicationEnabled = labTestsPatientSmsCommunicationEnabled;
            return this;
        }

        @Override
        @JsonSetter("lab_tests_patient_email_communication_enabled")
        public DelegatedFlowStage labTestsPatientEmailCommunicationEnabled(
                boolean labTestsPatientEmailCommunicationEnabled) {
            this.labTestsPatientEmailCommunicationEnabled = labTestsPatientEmailCommunicationEnabled;
            return this;
        }

        @Override
        @JsonSetter("delegated_flow")
        public _FinalStage delegatedFlow(DelegatedFlowType delegatedFlow) {
            this.delegatedFlow = delegatedFlow;
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
        public _FinalStage orgId(String orgId) {
            this.orgId = Optional.of(orgId);
            return this;
        }

        @Override
        @JsonSetter(value = "org_id", nulls = Nulls.SKIP)
        public _FinalStage orgId(Optional<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        @Override
        public ClientFacingTeam build() {
            return new ClientFacingTeam(
                    id,
                    orgId,
                    name,
                    svixAppId,
                    clientId,
                    clientSecret,
                    airtableApiKey,
                    airtableBaseId,
                    webhookSecret,
                    apiKey,
                    apiKeys,
                    configuration,
                    testkitsTextsEnabled,
                    labTestsPatientCommunicationEnabled,
                    labTestsPatientSmsCommunicationEnabled,
                    labTestsPatientEmailCommunicationEnabled,
                    logoUrl,
                    delegatedFlow,
                    additionalProperties);
        }
    }
}
