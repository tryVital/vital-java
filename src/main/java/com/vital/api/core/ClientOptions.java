/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import okhttp3.OkHttpClient;

public final class ClientOptions {
    private final Environment environment;

    private final Map<String, String> headers;

    private final Map<String, Supplier<String>> headerSuppliers;

    private final OkHttpClient httpClient;

    private ClientOptions(
            Environment environment,
            Map<String, String> headers,
            Map<String, Supplier<String>> headerSuppliers,
            OkHttpClient httpClient) {
        this.environment = environment;
        this.headers = new HashMap<>();
        this.headers.putAll(headers);
        this.headers.putAll(new HashMap<String, String>() {
            {
                put("X-Fern-Language", "JAVA");
                put("X-Fern-SDK-Name", "com.vital.fern:api-sdk");
                put("X-Fern-SDK-Version", "1.2.254");
            }
        });
        this.headerSuppliers = headerSuppliers;
        this.httpClient = httpClient;
    }

    public Environment environment() {
        return this.environment;
    }

    public Map<String, String> headers(RequestOptions requestOptions) {
        Map<String, String> values = new HashMap<>(this.headers);
        headerSuppliers.forEach((key, supplier) -> {
            values.put(key, supplier.get());
        });
        if (requestOptions != null) {
            values.putAll(requestOptions.getHeaders());
        }
        return values;
    }

    public OkHttpClient httpClient() {
        return this.httpClient;
    }

    public OkHttpClient httpClientWithTimeout(RequestOptions requestOptions) {
        if (requestOptions == null) {
            return this.httpClient;
        }
        return this.httpClient
                .newBuilder()
                .callTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                .connectTimeout(0, TimeUnit.SECONDS)
                .writeTimeout(0, TimeUnit.SECONDS)
                .readTimeout(0, TimeUnit.SECONDS)
                .build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Environment environment;

        private final Map<String, String> headers = new HashMap<>();

        private final Map<String, Supplier<String>> headerSuppliers = new HashMap<>();

        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder addHeader(String key, Supplier<String> value) {
            this.headerSuppliers.put(key, value);
            return this;
        }

        public ClientOptions build() {
            OkHttpClient okhttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new RetryInterceptor(3))
                    .build();
            return new ClientOptions(environment, headers, headerSuppliers, okhttpClient);
        }
    }
}
