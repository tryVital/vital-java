package com.vital.api.resources.team;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.team.requests.CreateApiKeyBody;
import com.vital.api.resources.team.requests.GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest;
import com.vital.api.resources.team.requests.PriorityCreate;
import com.vital.api.resources.team.requests.SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest;
import com.vital.api.resources.team.requests.TeamCreate;
import com.vital.api.resources.team.requests.TeamUpdate;
import com.vital.api.resources.team.requests.UpdateApiKeyBody;
import com.vital.api.resources.team.requests.UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest;
import com.vital.api.types.ApiKeyInDb;
import com.vital.api.types.ClientFacingTeam;
import com.vital.api.types.ClientFacingUser;
import com.vital.api.types.Priority;
import com.vital.api.types.TeamInDb;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TeamClient {
    protected final ClientOptions clientOptions;

    public TeamClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public Map<String, Object> getTeamConfig() {
        return getTeamConfig(null);
    }

    public Map<String, Object> getTeamConfig(RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/link/config")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<Map<String, Object>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientFacingTeam getTeam(String teamId) {
        return getTeam(teamId, null);
    }

    public ClientFacingTeam getTeam(String teamId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientFacingTeam.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TeamInDb updateTeam(String teamId, TeamUpdate request) {
        return updateTeam(teamId, request, null);
    }

    public TeamInDb updateTeam(String teamId, TeamUpdate request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getLabTestsPatientCommunicationEnabled().isPresent()) {
            _requestBodyProperties.put(
                    "lab_tests_patient_communication_enabled", request.getLabTestsPatientCommunicationEnabled());
        }
        if (request.getSubscriptionStatus().isPresent()) {
            _requestBodyProperties.put("subscription_status", request.getSubscriptionStatus());
        }
        if (request.getLogoUrl().isPresent()) {
            _requestBodyProperties.put("logo_url", request.getLogoUrl());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("PATCH", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), TeamInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TeamInDb updateTeam(String teamId) {
        return updateTeam(teamId, TeamUpdate.builder().build());
    }

    public Map<String, Object> getTeamUserCount(String teamId) {
        return getTeamUserCount(teamId, null);
    }

    public Map<String, Object> getTeamUserCount(String teamId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("users/count")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<Map<String, Object>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingUser> searchTeamUsersByUuidOrClientUserId(
            SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest request) {
        return searchTeamUsersByUuidOrClientUserId(request, null);
    }

    public List<ClientFacingUser> searchTeamUsersByUuidOrClientUserId(
            SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/users/search");
        if (request.getQueryId().isPresent()) {
            _httpUrl.addQueryParameter("query_id", request.getQueryId().get());
        }
        RequestBody _requestBody = null;
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl.build())
                .method("GET", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingUser>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingUser> searchTeamUsersByUuidOrClientUserId() {
        return searchTeamUsersByUuidOrClientUserId(
                SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest.builder()
                        .build());
    }

    public ApiKeyInDb createApiKey(String teamId, CreateApiKeyBody request) {
        return createApiKey(teamId, request, null);
    }

    public ApiKeyInDb createApiKey(String teamId, CreateApiKeyBody request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("apikey")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("label", request.getLabel());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ApiKeyInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ApiKeyInDb> getApiKeysForTeam(String teamId) {
        return getApiKeysForTeam(teamId, null);
    }

    public List<ApiKeyInDb> getApiKeysForTeam(String teamId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("apikeys")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ApiKeyInDb>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ApiKeyInDb updateApiKeyLabel(String teamId, String apiKeyId, UpdateApiKeyBody request) {
        return updateApiKeyLabel(teamId, apiKeyId, request, null);
    }

    public ApiKeyInDb updateApiKeyLabel(
            String teamId, String apiKeyId, UpdateApiKeyBody request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("apikey")
                .addPathSegment(apiKeyId)
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("label", request.getLabel());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("PATCH", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ApiKeyInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ApiKeyInDb deleteApiKey(String teamId, String apiKeyId) {
        return deleteApiKey(teamId, apiKeyId, null);
    }

    public ApiKeyInDb deleteApiKey(String teamId, String apiKeyId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("apikey")
                .addPathSegment(apiKeyId)
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ApiKeyInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ApiKeyInDb rotateApiKey(String teamId, String apiKeyId) {
        return rotateApiKey(teamId, apiKeyId, null);
    }

    public ApiKeyInDb rotateApiKey(String teamId, String apiKeyId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("apikey")
                .addPathSegment(apiKeyId)
                .addPathSegments("rotate")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("PATCH", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ApiKeyInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TeamInDb createTeam(TeamCreate request) {
        return createTeam(request, null);
    }

    public TeamInDb createTeam(TeamCreate request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getSvixAppId().isPresent()) {
            _requestBodyProperties.put("svix_app_id", request.getSvixAppId());
        }
        if (request.getClientId().isPresent()) {
            _requestBodyProperties.put("client_id", request.getClientId());
        }
        if (request.getClientSecret().isPresent()) {
            _requestBodyProperties.put("client_secret", request.getClientSecret());
        }
        if (request.getApiKey().isPresent()) {
            _requestBodyProperties.put("api_key", request.getApiKey());
        }
        if (request.getAirtableApiKey().isPresent()) {
            _requestBodyProperties.put("airtable_api_key", request.getAirtableApiKey());
        }
        if (request.getAirtableBaseId().isPresent()) {
            _requestBodyProperties.put("airtable_base_id", request.getAirtableBaseId());
        }
        if (request.getWebhookSecret().isPresent()) {
            _requestBodyProperties.put("webhook_secret", request.getWebhookSecret());
        }
        if (request.getFfWheelEnabled().isPresent()) {
            _requestBodyProperties.put("ff_wheel_enabled", request.getFfWheelEnabled());
        }
        if (request.getFfAppleMobileAppEnabled().isPresent()) {
            _requestBodyProperties.put("ff_apple_mobile_app_enabled", request.getFfAppleMobileAppEnabled());
        }
        if (request.getLabTestsPatientCommunicationEnabled().isPresent()) {
            _requestBodyProperties.put(
                    "lab_tests_patient_communication_enabled", request.getLabTestsPatientCommunicationEnabled());
        }
        if (request.getLabTestDelegatedFlowEnabled().isPresent()) {
            _requestBodyProperties.put("lab_test_delegated_flow_enabled", request.getLabTestDelegatedFlowEnabled());
        }
        if (request.getPhysicianNetwork().isPresent()) {
            _requestBodyProperties.put("physician_network", request.getPhysicianNetwork());
        }
        if (request.getId().isPresent()) {
            _requestBodyProperties.put("id", request.getId());
        }
        _requestBodyProperties.put("name", request.getName());
        if (request.getSubscriptionStatus().isPresent()) {
            _requestBodyProperties.put("subscription_status", request.getSubscriptionStatus());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), TeamInDb.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Priority createPriority(String teamId, PriorityCreate request) {
        return createPriority(teamId, request, null);
    }

    public Priority createPriority(String teamId, PriorityCreate request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .addPathSegments("priority")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getId().isPresent()) {
            _requestBodyProperties.put("id", request.getId());
        }
        _requestBodyProperties.put("priority", request.getPriority());
        _requestBodyProperties.put("team_id", request.getPriorityCreateTeamId());
        _requestBodyProperties.put("source_id", request.getSourceId());
        if (request.getDataType().isPresent()) {
            _requestBodyProperties.put("data_type", request.getDataType());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Priority.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Object> getSvixWebhookUrl() {
        return getSvixWebhookUrl(null);
    }

    public Map<String, Object> getSvixWebhookUrl(RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/svix/url")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<Map<String, Object>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Map<String, Object>> getSourcePriorities(GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest request) {
        return getSourcePriorities(request, null);
    }

    public List<Map<String, Object>> getSourcePriorities(
            GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/source/priorities");
        if (request.getDataType().isPresent()) {
            _httpUrl.addQueryParameter("data_type", request.getDataType().get());
        }
        RequestBody _requestBody = null;
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl.build())
                .method("GET", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<Map<String, Object>>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Map<String, Object>> getSourcePriorities() {
        return getSourcePriorities(
                GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest.builder().build());
    }

    public List<Map<String, Object>> updateSourcePriorities(
            UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest request) {
        return updateSourcePriorities(request, null);
    }

    public List<Map<String, Object>> updateSourcePriorities(
            UpdateSourcePrioritiesV2TeamSourcePrioritiesPatchRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/source/priorities");
        _httpUrl.addQueryParameter("team_id", request.getTeamId());
        RequestBody _requestBody = null;
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl.build())
                .method("PATCH", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<Map<String, Object>>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
