package com.vital.api.resources.timeseries;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.timeseries.requests.PostUserBloodPressureV2TimeseriesUserIdBloodPressurePostRequest;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TimeseriesClient {
    protected final ClientOptions clientOptions;

    public TimeseriesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public String postUserBloodPressure(
            String userId, PostUserBloodPressureV2TimeseriesUserIdBloodPressurePostRequest request) {
        return postUserBloodPressure(userId, request, null);
    }

    public String postUserBloodPressure(
            String userId,
            PostUserBloodPressureV2TimeseriesUserIdBloodPressurePostRequest request,
            RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("blood_pressure")
                .build();
        RequestBody _requestBody = RequestBody.create("", null);
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        if (request.getVitalIosSdkVersion().isPresent()) {
            _requestBuilder.addHeader(
                    "x-vital-ios-sdk-version", request.getVitalIosSdkVersion().get());
        }
        if (request.getVitalAndroidSdkVersion().isPresent()) {
            _requestBuilder.addHeader(
                    "x-vital-android-sdk-version",
                    request.getVitalAndroidSdkVersion().get());
        }
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), String.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String postUserBloodPressure(String userId) {
        return postUserBloodPressure(
                userId,
                PostUserBloodPressureV2TimeseriesUserIdBloodPressurePostRequest.builder()
                        .build());
    }
}
