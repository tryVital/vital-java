package com.vital.api.resources.profile;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.profile.requests.ProfileGetRawRequest;
import com.vital.api.resources.profile.requests.ProfileGetRequest;
import com.vital.api.types.ClientFacingProfile;
import com.vital.api.types.RawProfile;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ProfileClient {
    protected final ClientOptions clientOptions;

    public ProfileClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClientFacingProfile get(String userId, ProfileGetRequest request) {
        return get(userId, request, null);
    }

    public ClientFacingProfile get(String userId, ProfileGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/profile")
                .addPathSegment(userId);
        if (request.getProvider().isPresent()) {
            _httpUrl.addQueryParameter("provider", request.getProvider().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientFacingProfile.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientFacingProfile get(String userId) {
        return get(userId, ProfileGetRequest.builder().build());
    }

    public RawProfile getRaw(String userId, ProfileGetRawRequest request) {
        return getRaw(userId, request, null);
    }

    public RawProfile getRaw(String userId, ProfileGetRawRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/profile")
                .addPathSegment(userId)
                .addPathSegments("raw");
        if (request.getProvider().isPresent()) {
            _httpUrl.addQueryParameter("provider", request.getProvider().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), RawProfile.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public RawProfile getRaw(String userId) {
        return getRaw(userId, ProfileGetRawRequest.builder().build());
    }
}
