/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.devices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.core.VitalException;
import com.vital.api.errors.UnprocessableEntityError;
import com.vital.api.resources.devices.requests.DevicesGetRawRequest;
import com.vital.api.types.HttpValidationError;
import com.vital.api.types.RawDevices;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class DevicesClient {
    protected final ClientOptions clientOptions;

    public DevicesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get Devices for user_id
     */
    public RawDevices getRaw(String userId) {
        return getRaw(userId, DevicesGetRawRequest.builder().build());
    }

    /**
     * Get Devices for user_id
     */
    public RawDevices getRaw(String userId, DevicesGetRawRequest request) {
        return getRaw(userId, request, null);
    }

    /**
     * Get Devices for user_id
     */
    public RawDevices getRaw(String userId, DevicesGetRawRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/devices")
                .addPathSegment(userId)
                .addPathSegments("raw");
        if (request.getProvider().isPresent()) {
            httpUrl.addQueryParameter("provider", request.getProvider().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), RawDevices.class);
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
