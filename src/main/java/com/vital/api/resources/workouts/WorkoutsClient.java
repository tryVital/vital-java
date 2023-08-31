package com.vital.api.resources.workouts;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.workouts.requests.WorkoutsGetRawRequest;
import com.vital.api.resources.workouts.requests.WorkoutsGetRequest;
import com.vital.api.types.ClientFacingStream;
import com.vital.api.types.ClientWorkoutResponse;
import com.vital.api.types.RawWorkout;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class WorkoutsClient {
    protected final ClientOptions clientOptions;

    public WorkoutsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClientWorkoutResponse get(String userId, WorkoutsGetRequest request) {
        return get(userId, request, null);
    }

    public ClientWorkoutResponse get(String userId, WorkoutsGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/workouts")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientWorkoutResponse.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public RawWorkout getRaw(String userId, WorkoutsGetRawRequest request) {
        return getRaw(userId, request, null);
    }

    public RawWorkout getRaw(String userId, WorkoutsGetRawRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/workouts")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), RawWorkout.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientFacingStream getStream(String workoutId) {
        return getStream(workoutId, null);
    }

    public ClientFacingStream getStream(String workoutId, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries/workouts")
                .addPathSegment(workoutId)
                .addPathSegments("stream")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientFacingStream.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
