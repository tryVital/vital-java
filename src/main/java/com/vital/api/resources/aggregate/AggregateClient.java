/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.aggregate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.MediaTypes;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.core.VitalException;
import com.vital.api.errors.UnprocessableEntityError;
import com.vital.api.resources.aggregate.requests.AggregateGetTaskHistoryForContinuousQueryRequest;
import com.vital.api.resources.aggregate.requests.QueryBatch;
import com.vital.api.types.AggregationResponse;
import com.vital.api.types.AggregationResult;
import com.vital.api.types.ContinuousQueryTaskHistoryResponse;
import com.vital.api.types.HttpValidationError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class AggregateClient {
    protected final ClientOptions clientOptions;

    public AggregateClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public AggregationResponse queryOne(String userId, QueryBatch request) {
        return queryOne(userId, request, null);
    }

    public AggregationResponse queryOne(String userId, QueryBatch request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("aggregate/v1/user")
                .addPathSegment(userId)
                .addPathSegments("query")
                .build();
        Map<String, Object> properties = new HashMap<>();
        properties.put("timeframe", request.getTimeframe());
        properties.put("queries", request.getQueries());
        if (request.getConfig().isPresent()) {
            properties.put("config", request.getConfig());
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(properties), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        _requestBuilder.addHeader("accept", request.getAccept());
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), AggregationResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VitalException("Network error executing HTTP request", e);
        }
    }

    public AggregationResult getResultTableForContinuousQuery(String userId, String queryIdOrSlug) {
        return getResultTableForContinuousQuery(userId, queryIdOrSlug, null);
    }

    public AggregationResult getResultTableForContinuousQuery(
            String userId, String queryIdOrSlug, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("aggregate/v1/user")
                .addPathSegment(userId)
                .addPathSegments("continuous_query")
                .addPathSegment(queryIdOrSlug)
                .addPathSegments("result_table")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), AggregationResult.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VitalException("Network error executing HTTP request", e);
        }
    }

    public ContinuousQueryTaskHistoryResponse getTaskHistoryForContinuousQuery(String userId, String queryIdOrSlug) {
        return getTaskHistoryForContinuousQuery(
                userId,
                queryIdOrSlug,
                AggregateGetTaskHistoryForContinuousQueryRequest.builder().build());
    }

    public ContinuousQueryTaskHistoryResponse getTaskHistoryForContinuousQuery(
            String userId, String queryIdOrSlug, AggregateGetTaskHistoryForContinuousQueryRequest request) {
        return getTaskHistoryForContinuousQuery(userId, queryIdOrSlug, request, null);
    }

    public ContinuousQueryTaskHistoryResponse getTaskHistoryForContinuousQuery(
            String userId,
            String queryIdOrSlug,
            AggregateGetTaskHistoryForContinuousQueryRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("aggregate/v1/user")
                .addPathSegment(userId)
                .addPathSegments("continuous_query")
                .addPathSegment(queryIdOrSlug)
                .addPathSegments("task_history");
        if (request.getNextCursor().isPresent()) {
            httpUrl.addQueryParameter("next_cursor", request.getNextCursor().get());
        }
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), ContinuousQueryTaskHistoryResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VitalException("Network error executing HTTP request", e);
        }
    }
}
