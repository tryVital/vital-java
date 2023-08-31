package com.vital.api.resources.devices;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.devices.requests.DevicesGetRawRequest;
import com.vital.api.types.RawDevices;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DevicesClient {
    protected final ClientOptions clientOptions;

    public DevicesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public RawDevices getRaw(String userId, DevicesGetRawRequest request) {
        return getRaw(userId, request, null);
    }

    public RawDevices getRaw(String userId, DevicesGetRawRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/devices")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), RawDevices.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public RawDevices getRaw(String userId) {
        return getRaw(userId, DevicesGetRawRequest.builder().build());
    }
}
