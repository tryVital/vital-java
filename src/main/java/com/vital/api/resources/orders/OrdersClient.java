package com.vital.api.resources.orders;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.orders.requests.GetOrdersV3OrdersGetRequest;
import com.vital.api.types.GetOrdersResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OrdersClient {
    protected final ClientOptions clientOptions;

    public OrdersClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public GetOrdersResponse getOrders(GetOrdersV3OrdersGetRequest request) {
        return getOrders(request, null);
    }

    public GetOrdersResponse getOrders(GetOrdersV3OrdersGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v3/orders");
        if (request.getStartDate().isPresent()) {
            _httpUrl.addQueryParameter(
                    "start_date", request.getStartDate().get().toString());
        }
        if (request.getEndDate().isPresent()) {
            _httpUrl.addQueryParameter("end_date", request.getEndDate().get().toString());
        }
        if (request.getUserId().isPresent()) {
            _httpUrl.addQueryParameter("user_id", request.getUserId().get());
        }
        if (request.getPatientName().isPresent()) {
            _httpUrl.addQueryParameter("patient_name", request.getPatientName().get());
        }
        if (request.getOrderIds().isPresent()) {
            _httpUrl.addQueryParameter("order_ids", request.getOrderIds().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), GetOrdersResponse.class);
            }
            throw new ApiError(
                    _response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetOrdersResponse getOrders() {
        return getOrders(GetOrdersV3OrdersGetRequest.builder().build());
    }
}
