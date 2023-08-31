package com.vital.api;

import com.vital.api.core.ClientOptions;
import com.vital.api.core.Environment;

public final class VitalApiClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment;

    public VitalApiClientBuilder apiKey(String apiKey) {
        this.clientOptionsBuilder.addHeader("x-vital-api-key", apiKey);
        return this;
    }

    public VitalApiClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public VitalApiClient build() {
        clientOptionsBuilder.environment(this.environment);
        return new VitalApiClient(clientOptionsBuilder.build());
    }
}
