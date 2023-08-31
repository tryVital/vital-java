package com.vital.api.resources.body;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.body.requests.BodyGetRawRequest;
import com.vital.api.resources.body.requests.BodyGetRequest;
import com.vital.api.types.ClientBodyResponse;
import com.vital.api.types.RawBody;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class BodyClient {
    protected final ClientOptions clientOptions;

    public BodyClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClientBodyResponse get(String userId, BodyGetRequest request) {
        return get(userId, request, null);
    }

    public ClientBodyResponse get(String userId, BodyGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/body")
                .addPathSegment(userId);
        if (request.getProvider().isPresent()) {
            _httpUrl.addQueryParameter("provider", request.getProvider().get());
        }
        _httpUrl.addQueryParameter("start_date", request.getStartDate());
        if (request.getEndDate().isPresent()) {
            _httpUrl.addQueryParameter("end_date", request.getEndDate().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientBodyResponse.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public RawBody getRaw(String userId, BodyGetRawRequest request) {
        return getRaw(userId, request, null);
    }

    public RawBody getRaw(String userId, BodyGetRawRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/body")
                .addPathSegment(userId)
                .addPathSegments("raw");
        if (request.getProvider().isPresent()) {
            _httpUrl.addQueryParameter("provider", request.getProvider().get());
        }
        _httpUrl.addQueryParameter("start_date", request.getStartDate());
        if (request.getEndDate().isPresent()) {
            _httpUrl.addQueryParameter("end_date", request.getEndDate().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), RawBody.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
