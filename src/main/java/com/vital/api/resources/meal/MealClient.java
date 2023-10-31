/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.meal;

import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.resources.meal.requests.MealGetRequest;
import com.vital.api.types.ClientFacingMealResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class MealClient {
    protected final ClientOptions clientOptions;

    public MealClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get user's meals
     */
    public ClientFacingMealResponse get(String userId, MealGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/summary/meal")
                .addPathSegment(userId);
        if (request.getProvider().isPresent()) {
            httpUrl.addQueryParameter("provider", request.getProvider().get());
        }
        httpUrl.addQueryParameter("start_date", request.getStartDate());
        if (request.getEndDate().isPresent()) {
            httpUrl.addQueryParameter("end_date", request.getEndDate().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ClientFacingMealResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get user's meals
     */
    public ClientFacingMealResponse get(String userId, MealGetRequest request) {
        return get(userId, request, null);
    }
}