/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.providers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vital.api.core.ApiError;
import com.vital.api.core.ClientOptions;
import com.vital.api.core.ObjectMappers;
import com.vital.api.core.RequestOptions;
import com.vital.api.core.VitalException;
import com.vital.api.errors.UnprocessableEntityError;
import com.vital.api.resources.providers.requests.ProvidersGetAllRequest;
import com.vital.api.types.ClientFacingProviderDetailed;
import com.vital.api.types.HttpValidationError;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ProvidersClient {
    protected final ClientOptions clientOptions;

    public ProvidersClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get Provider list
     */
    public List<ClientFacingProviderDetailed> getAll() {
        return getAll(ProvidersGetAllRequest.builder().build());
    }

    /**
     * Get Provider list
     */
    public List<ClientFacingProviderDetailed> getAll(ProvidersGetAllRequest request) {
        return getAll(request, null);
    }

    /**
     * Get Provider list
     */
    public List<ClientFacingProviderDetailed> getAll(ProvidersGetAllRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/providers");
        if (request.getSourceType().isPresent()) {
            httpUrl.addQueryParameter("source_type", request.getSourceType().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), new TypeReference<List<ClientFacingProviderDetailed>>() {});
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
