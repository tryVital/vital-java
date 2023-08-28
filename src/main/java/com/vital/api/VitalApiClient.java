package com.vital.api;

import com.vital.api.core.ClientOptions;

public class VitalApiClient {
    protected final ClientOptions clientOptions;

    public VitalApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public static VitalApiClientBuilder builder() {
        return new VitalApiClientBuilder();
    }
}
