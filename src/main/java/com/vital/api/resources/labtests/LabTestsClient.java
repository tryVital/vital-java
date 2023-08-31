package com.vital.api.resources.labtests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.labtests.requests.CreateLabTestRequest;
import com.vital.api.resources.labtests.requests.GetMarkersV3LabTestsMarkersGetRequest;
import com.vital.api.types.ClientFacingLab;
import com.vital.api.types.ClientFacingLabTest;
import com.vital.api.types.GetMarkersResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LabTestsClient {
    protected final ClientOptions clientOptions;

    public LabTestsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClientFacingLabTest createLabTestForTeam(CreateLabTestRequest request) {
        return createLabTestForTeam(request, null);
    }

    public ClientFacingLabTest createLabTestForTeam(CreateLabTestRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v3/lab_tests")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("marker_ids", request.getMarkerIds());
        _requestBodyProperties.put("lab_id", request.getLabId());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("method", request.getMethod());
        _requestBodyProperties.put("sample_type", request.getSampleType());
        _requestBodyProperties.put("description", request.getDescription());
        if (request.getFasting().isPresent()) {
            _requestBodyProperties.put("fasting", request.getFasting());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientFacingLabTest.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetMarkersResponse getMarkers(GetMarkersV3LabTestsMarkersGetRequest request) {
        return getMarkers(request, null);
    }

    public GetMarkersResponse getMarkers(GetMarkersV3LabTestsMarkersGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v3/lab_tests/markers");
        if (request.getLabId().isPresent()) {
            _httpUrl.addQueryParameter("lab_id", request.getLabId().get().toString());
        }
        if (request.getName().isPresent()) {
            _httpUrl.addQueryParameter("name", request.getName().get());
        }
        if (request.getPage().isPresent()) {
            _httpUrl.addQueryParameter("page", request.getPage().get().toString());
        }
        if (request.getSize().isPresent()) {
            _httpUrl.addQueryParameter("size", request.getSize().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), GetMarkersResponse.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetMarkersResponse getMarkers() {
        return getMarkers(GetMarkersV3LabTestsMarkersGetRequest.builder().build());
    }

    public List<ClientFacingLab> getLabs() {
        return getLabs(null);
    }

    public List<ClientFacingLab> getLabs(RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v3/lab_tests/labs")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), new TypeReference<List<ClientFacingLab>>() {});
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
