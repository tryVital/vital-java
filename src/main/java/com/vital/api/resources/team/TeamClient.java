/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.team;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.team.requests.TeamGetSourcePrioritiesRequest;
import com.vital.api.resources.team.requests.TeamGetUserByIdRequest;
import com.vital.api.resources.team.requests.TeamUpdateSourcePrioritiesRequest;
import com.vital.api.types.ClientFacingTeam;
import com.vital.api.types.ClientFacingUser;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class TeamClient {
    protected final ClientOptions clientOptions;

    public TeamClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Post teams.
     */
    public Map<String, Object> getLinkConfig(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/link/config")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<Map<String, Object>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Post teams.
     */
    public Map<String, Object> getLinkConfig() {
        return getLinkConfig(null);
    }

    /**
     * Get team.
     */
    public ClientFacingTeam get(String teamId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team")
                .addPathSegment(teamId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ClientFacingTeam.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get team.
     */
    public ClientFacingTeam get(String teamId) {
        return get(teamId, null);
    }

    /**
     * Search team users by user_id
     */
    public List<ClientFacingUser> getUserById() {
        return getUserById(TeamGetUserByIdRequest.builder().build());
    }

    /**
     * Search team users by user_id
     */
    public List<ClientFacingUser> getUserById(TeamGetUserByIdRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/users/search");
        if (request.getQueryId().isPresent()) {
            httpUrl.addQueryParameter("query_id", request.getQueryId().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<List<ClientFacingUser>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Search team users by user_id
     */
    public List<ClientFacingUser> getUserById(TeamGetUserByIdRequest request) {
        return getUserById(request, null);
    }

    public Map<String, Object> getSvixUrl(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/svix/url")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<Map<String, Object>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Object> getSvixUrl() {
        return getSvixUrl(null);
    }

    /**
     * GET source priorities.
     */
    public List<Map<String, Object>> getSourcePriorities() {
        return getSourcePriorities(TeamGetSourcePrioritiesRequest.builder().build());
    }

    /**
     * GET source priorities.
     */
    public List<Map<String, Object>> getSourcePriorities(
            TeamGetSourcePrioritiesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/source/priorities");
        if (request.getDataType().isPresent()) {
            httpUrl.addQueryParameter("data_type", request.getDataType().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<List<Map<String, Object>>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * GET source priorities.
     */
    public List<Map<String, Object>> getSourcePriorities(TeamGetSourcePrioritiesRequest request) {
        return getSourcePriorities(request, null);
    }

    /**
     * Patch source priorities.
     */
    public List<Map<String, Object>> updateSourcePriorities(
            TeamUpdateSourcePrioritiesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/team/source/priorities");
        httpUrl.addQueryParameter("team_id", request.getTeamId());
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("PATCH", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<List<Map<String, Object>>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Patch source priorities.
     */
    public List<Map<String, Object>> updateSourcePriorities(TeamUpdateSourcePrioritiesRequest request) {
        return updateSourcePriorities(request, null);
    }
}
