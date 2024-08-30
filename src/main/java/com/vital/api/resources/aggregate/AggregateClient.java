/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.aggregate;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.aggregate.requests.Query;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AggregateClient {
    protected final ClientOptions clientOptions;

    public AggregateClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public Object queryOne(String userId, Query request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("aggregate/v1/query_one")
                .addPathSegment(userId)
                .build();
        Map<String, Object> properties = new HashMap<>();
        properties.put("timeframe", request.getTimeframe());
        properties.put("instructions", request.getInstructions());
        if (request.getConfig().isPresent()) {
            properties.put("config", request.getConfig());
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(properties), MediaType.parse("application/json"));
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
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object queryOne(String userId, Query request) {
        return queryOne(userId, request, null);
    }
}
