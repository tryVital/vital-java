package com.vital.api.core;

import java.util.HashMap;
import java.util.Map;

public final class RequestOptions {
    private final String apiKey;

    private RequestOptions(String apiKey) {
        this.apiKey = apiKey;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.apiKey != null) {
            headers.put("x-vital-api-key", this.apiKey);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String apiKey = null;

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(apiKey);
        }
    }
}
