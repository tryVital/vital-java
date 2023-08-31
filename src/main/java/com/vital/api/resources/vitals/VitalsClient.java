package com.vital.api.resources.vitals;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.vitals.requests.VitalsBloodOxygenRequest;
import com.vital.api.resources.vitals.requests.VitalsBloodPressureRequest;
import com.vital.api.resources.vitals.requests.VitalsCaffeineRequest;
import com.vital.api.resources.vitals.requests.VitalsCaloriesActiveRequest;
import com.vital.api.resources.vitals.requests.VitalsCaloriesBasalRequest;
import com.vital.api.resources.vitals.requests.VitalsCholesterolHdlRequest;
import com.vital.api.resources.vitals.requests.VitalsCholesterolLdlRequest;
import com.vital.api.resources.vitals.requests.VitalsCholesterolRequest;
import com.vital.api.resources.vitals.requests.VitalsCholesterolTotalRequest;
import com.vital.api.resources.vitals.requests.VitalsDistanceRequest;
import com.vital.api.resources.vitals.requests.VitalsFloorsClimbedRequest;
import com.vital.api.resources.vitals.requests.VitalsGlucoseRequest;
import com.vital.api.resources.vitals.requests.VitalsHeartrateRequest;
import com.vital.api.resources.vitals.requests.VitalsHrvRequest;
import com.vital.api.resources.vitals.requests.VitalsHypnogramRequest;
import com.vital.api.resources.vitals.requests.VitalsIgeRequest;
import com.vital.api.resources.vitals.requests.VitalsIggRequest;
import com.vital.api.resources.vitals.requests.VitalsMindfulnessMinutesRequest;
import com.vital.api.resources.vitals.requests.VitalsRespiratoryRateRequest;
import com.vital.api.resources.vitals.requests.VitalsStepsRequest;
import com.vital.api.resources.vitals.requests.VitalsTimeseriesRequestRequest;
import com.vital.api.resources.vitals.requests.VitalsTriglyceridesRequest;
import com.vital.api.resources.vitals.requests.VitalsWaterRequest;
import com.vital.api.types.ClientFacingBloodOxygenTimeseries;
import com.vital.api.types.ClientFacingBloodPressureTimeseries;
import com.vital.api.types.ClientFacingCaffeineTimeseries;
import com.vital.api.types.ClientFacingCaloriesActiveTimeseries;
import com.vital.api.types.ClientFacingCaloriesBasalTimeseries;
import com.vital.api.types.ClientFacingCholesterolTimeseries;
import com.vital.api.types.ClientFacingDistanceTimeseries;
import com.vital.api.types.ClientFacingFloorsClimbedTimeseries;
import com.vital.api.types.ClientFacingGlucoseTimeseries;
import com.vital.api.types.ClientFacingHeartRateTimeseries;
import com.vital.api.types.ClientFacingHrvTimeseries;
import com.vital.api.types.ClientFacingHypnogramTimeseries;
import com.vital.api.types.ClientFacingIgeTimeseries;
import com.vital.api.types.ClientFacingIggTimeseries;
import com.vital.api.types.ClientFacingMindfulnessMinutesTimeseries;
import com.vital.api.types.ClientFacingRespiratoryRateTimeseries;
import com.vital.api.types.ClientFacingWaterTimeseries;
import com.vital.api.types.IngestibleTimeseriesResource;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class VitalsClient {
    protected final ClientOptions clientOptions;

    public VitalsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public List<ClientFacingMindfulnessMinutesTimeseries> mindfulnessMinutes(
            String userId, VitalsMindfulnessMinutesRequest request) {
        return mindfulnessMinutes(userId, request, null);
    }

    public List<ClientFacingMindfulnessMinutesTimeseries> mindfulnessMinutes(
            String userId, VitalsMindfulnessMinutesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("mindfulness_minutes");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(),
                        new TypeReference<List<ClientFacingMindfulnessMinutesTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCaffeineTimeseries> caffeine(String userId, VitalsCaffeineRequest request) {
        return caffeine(userId, request, null);
    }

    public List<ClientFacingCaffeineTimeseries> caffeine(
            String userId, VitalsCaffeineRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("caffeine");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCaffeineTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingWaterTimeseries> water(String userId, VitalsWaterRequest request) {
        return water(userId, request, null);
    }

    public List<ClientFacingWaterTimeseries> water(
            String userId, VitalsWaterRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("water");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingWaterTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void steps(String userId, VitalsStepsRequest request) {
        steps(userId, request, null);
    }

    public void steps(String userId, VitalsStepsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("steps");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                .headers(Headers.of(clientOptions.headers(requestOptions)));
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingFloorsClimbedTimeseries> floorsClimbed(String userId, VitalsFloorsClimbedRequest request) {
        return floorsClimbed(userId, request, null);
    }

    public List<ClientFacingFloorsClimbedTimeseries> floorsClimbed(
            String userId, VitalsFloorsClimbedRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("floors_climbed");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingFloorsClimbedTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingDistanceTimeseries> distance(String userId, VitalsDistanceRequest request) {
        return distance(userId, request, null);
    }

    public List<ClientFacingDistanceTimeseries> distance(
            String userId, VitalsDistanceRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("distance");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingDistanceTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCaloriesBasalTimeseries> caloriesBasal(String userId, VitalsCaloriesBasalRequest request) {
        return caloriesBasal(userId, request, null);
    }

    public List<ClientFacingCaloriesBasalTimeseries> caloriesBasal(
            String userId, VitalsCaloriesBasalRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("calories_basal");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCaloriesBasalTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCaloriesActiveTimeseries> caloriesActive(
            String userId, VitalsCaloriesActiveRequest request) {
        return caloriesActive(userId, request, null);
    }

    public List<ClientFacingCaloriesActiveTimeseries> caloriesActive(
            String userId, VitalsCaloriesActiveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("calories_active");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCaloriesActiveTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingRespiratoryRateTimeseries> respiratoryRate(
            String userId, VitalsRespiratoryRateRequest request) {
        return respiratoryRate(userId, request, null);
    }

    public List<ClientFacingRespiratoryRateTimeseries> respiratoryRate(
            String userId, VitalsRespiratoryRateRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("respiratory_rate");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingRespiratoryRateTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingIgeTimeseries> ige(String userId, VitalsIgeRequest request) {
        return ige(userId, request, null);
    }

    public List<ClientFacingIgeTimeseries> ige(String userId, VitalsIgeRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("ige");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingIgeTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingIggTimeseries> igg(String userId, VitalsIggRequest request) {
        return igg(userId, request, null);
    }

    public List<ClientFacingIggTimeseries> igg(String userId, VitalsIggRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("igg");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingIggTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingHypnogramTimeseries> hypnogram(String userId, VitalsHypnogramRequest request) {
        return hypnogram(userId, request, null);
    }

    public List<ClientFacingHypnogramTimeseries> hypnogram(
            String userId, VitalsHypnogramRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("hypnogram");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingHypnogramTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingHrvTimeseries> hrv(String userId, VitalsHrvRequest request) {
        return hrv(userId, request, null);
    }

    public List<ClientFacingHrvTimeseries> hrv(String userId, VitalsHrvRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("hrv");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingHrvTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingHeartRateTimeseries> heartrate(String userId, VitalsHeartrateRequest request) {
        return heartrate(userId, request, null);
    }

    public List<ClientFacingHeartRateTimeseries> heartrate(
            String userId, VitalsHeartrateRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("heartrate");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingHeartRateTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingGlucoseTimeseries> glucose(String userId, VitalsGlucoseRequest request) {
        return glucose(userId, request, null);
    }

    public List<ClientFacingGlucoseTimeseries> glucose(
            String userId, VitalsGlucoseRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("glucose");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingGlucoseTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCholesterolTimeseries> triglycerides(String userId, VitalsTriglyceridesRequest request) {
        return triglycerides(userId, request, null);
    }

    public List<ClientFacingCholesterolTimeseries> triglycerides(
            String userId, VitalsTriglyceridesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("cholesterol/triglycerides");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCholesterolTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolTotal(
            String userId, VitalsCholesterolTotalRequest request) {
        return cholesterolTotal(userId, request, null);
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolTotal(
            String userId, VitalsCholesterolTotalRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("cholesterol/total");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCholesterolTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolHdl(String userId, VitalsCholesterolHdlRequest request) {
        return cholesterolHdl(userId, request, null);
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolHdl(
            String userId, VitalsCholesterolHdlRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("cholesterol/hdl");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCholesterolTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolLdl(String userId, VitalsCholesterolLdlRequest request) {
        return cholesterolLdl(userId, request, null);
    }

    public List<ClientFacingCholesterolTimeseries> cholesterolLdl(
            String userId, VitalsCholesterolLdlRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("cholesterol/ldl");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCholesterolTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingCholesterolTimeseries> cholesterol(String userId, VitalsCholesterolRequest request) {
        return cholesterol(userId, request, null);
    }

    public List<ClientFacingCholesterolTimeseries> cholesterol(
            String userId, VitalsCholesterolRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("cholesterol");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingCholesterolTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingBloodOxygenTimeseries> bloodOxygen(String userId, VitalsBloodOxygenRequest request) {
        return bloodOxygen(userId, request, null);
    }

    public List<ClientFacingBloodOxygenTimeseries> bloodOxygen(
            String userId, VitalsBloodOxygenRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("blood_oxygen");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingBloodOxygenTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientFacingBloodPressureTimeseries> bloodPressure(String userId, VitalsBloodPressureRequest request) {
        return bloodPressure(userId, request, null);
    }

    public List<ClientFacingBloodPressureTimeseries> bloodPressure(
            String userId, VitalsBloodPressureRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegments("blood_pressure");
        _httpUrl.addQueryParameter("resource", request.getResource().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingBloodPressureTimeseries>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String timeseriesRequest(
            IngestibleTimeseriesResource resource, String userId, VitalsTimeseriesRequestRequest request) {
        return timeseriesRequest(resource, userId, request, null);
    }

    public String timeseriesRequest(
            IngestibleTimeseriesResource resource,
            String userId,
            VitalsTimeseriesRequestRequest request,
            RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/timeseries")
                .addPathSegment(userId)
                .addPathSegment(resource.toString())
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

    public String timeseriesRequest(IngestibleTimeseriesResource resource, String userId) {
        return timeseriesRequest(
                resource, userId, VitalsTimeseriesRequestRequest.builder().build());
    }
}
