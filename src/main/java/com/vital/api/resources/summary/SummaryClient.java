package com.vital.api.resources.summary;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.summary.requests.GetUserActivityRawV2SummaryActivityUserIdRawGetRequest;
import com.vital.api.resources.summary.requests.GetUserActivityV2SummaryActivityUserIdGetRequest;
import com.vital.api.resources.summary.requests.PostUserActivityV2SummaryActivityUserIdPostRequest;
import com.vital.api.resources.summary.requests.PostUserBodyV2SummaryBodyUserIdPostRequest;
import com.vital.api.resources.summary.requests.PostUserProfileV2SummaryProfileUserIdPostRequest;
import com.vital.api.resources.summary.requests.PostUserSleepV2SummarySleepUserIdPostRequest;
import com.vital.api.resources.summary.requests.PostUserWorkoutV2SummaryWorkoutsUserIdPostRequest;
import com.vital.api.types.ClientActivityResponse;
import com.vital.api.types.RawActivity;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SummaryClient {
    protected final ClientOptions clientOptions;

    public SummaryClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public String postUserProfile(String userId, PostUserProfileV2SummaryProfileUserIdPostRequest request) {
        return postUserProfile(userId, request, null);
    }

    public String postUserProfile(
            String userId, PostUserProfileV2SummaryProfileUserIdPostRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/profile")
                .addPathSegment(userId)
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

    public String postUserProfile(String userId) {
        return postUserProfile(
                userId,
                PostUserProfileV2SummaryProfileUserIdPostRequest.builder().build());
    }

    public ClientActivityResponse getUserActivity(
            String userId, GetUserActivityV2SummaryActivityUserIdGetRequest request) {
        return getUserActivity(userId, request, null);
    }

    public ClientActivityResponse getUserActivity(
            String userId, GetUserActivityV2SummaryActivityUserIdGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/activity")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientActivityResponse.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String postUserActivity(String userId, PostUserActivityV2SummaryActivityUserIdPostRequest request) {
        return postUserActivity(userId, request, null);
    }

    public String postUserActivity(
            String userId, PostUserActivityV2SummaryActivityUserIdPostRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/activity")
                .addPathSegment(userId)
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

    public String postUserActivity(String userId) {
        return postUserActivity(
                userId,
                PostUserActivityV2SummaryActivityUserIdPostRequest.builder().build());
    }

    public RawActivity getUserActivityRaw(
            String userId, GetUserActivityRawV2SummaryActivityUserIdRawGetRequest request) {
        return getUserActivityRaw(userId, request, null);
    }

    public RawActivity getUserActivityRaw(
            String userId,
            GetUserActivityRawV2SummaryActivityUserIdRawGetRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/activity")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), RawActivity.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String postUserWorkout(String userId, PostUserWorkoutV2SummaryWorkoutsUserIdPostRequest request) {
        return postUserWorkout(userId, request, null);
    }

    public String postUserWorkout(
            String userId, PostUserWorkoutV2SummaryWorkoutsUserIdPostRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/workouts")
                .addPathSegment(userId)
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

    public String postUserWorkout(String userId) {
        return postUserWorkout(
                userId,
                PostUserWorkoutV2SummaryWorkoutsUserIdPostRequest.builder().build());
    }

    public String postUserSleep(String userId, PostUserSleepV2SummarySleepUserIdPostRequest request) {
        return postUserSleep(userId, request, null);
    }

    public String postUserSleep(
            String userId, PostUserSleepV2SummarySleepUserIdPostRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/sleep")
                .addPathSegment(userId)
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

    public String postUserSleep(String userId) {
        return postUserSleep(
                userId, PostUserSleepV2SummarySleepUserIdPostRequest.builder().build());
    }

    public String postUserBody(String userId, PostUserBodyV2SummaryBodyUserIdPostRequest request) {
        return postUserBody(userId, request, null);
    }

    public String postUserBody(
            String userId, PostUserBodyV2SummaryBodyUserIdPostRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/body")
                .addPathSegment(userId)
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

    public String postUserBody(String userId) {
        return postUserBody(
                userId, PostUserBodyV2SummaryBodyUserIdPostRequest.builder().build());
    }
}
