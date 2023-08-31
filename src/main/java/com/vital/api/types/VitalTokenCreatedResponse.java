package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VitalTokenCreatedResponse.Builder.class)
public final class VitalTokenCreatedResponse {
    private final String code;

    private final String exchangeUrl;

    private VitalTokenCreatedResponse(String code, String exchangeUrl) {
        this.code = code;
        this.exchangeUrl = exchangeUrl;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("exchange_url")
    public String getExchangeUrl() {
        return exchangeUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalTokenCreatedResponse && equalTo((VitalTokenCreatedResponse) other);
    }

    private boolean equalTo(VitalTokenCreatedResponse other) {
        return code.equals(other.code) && exchangeUrl.equals(other.exchangeUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.exchangeUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CodeStage builder() {
        return new Builder();
    }

    public interface CodeStage {
        ExchangeUrlStage code(String code);

        Builder from(VitalTokenCreatedResponse other);
    }

    public interface ExchangeUrlStage {
        _FinalStage exchangeUrl(String exchangeUrl);
    }

    public interface _FinalStage {
        VitalTokenCreatedResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CodeStage, ExchangeUrlStage, _FinalStage {
        private String code;

        private String exchangeUrl;

        private Builder() {}

        @Override
        public Builder from(VitalTokenCreatedResponse other) {
            code(other.getCode());
            exchangeUrl(other.getExchangeUrl());
            return this;
        }

        @Override
        @JsonSetter("code")
        public ExchangeUrlStage code(String code) {
            this.code = code;
            return this;
        }

        @Override
        @JsonSetter("exchange_url")
        public _FinalStage exchangeUrl(String exchangeUrl) {
            this.exchangeUrl = exchangeUrl;
            return this;
        }

        @Override
        public VitalTokenCreatedResponse build() {
            return new VitalTokenCreatedResponse(code, exchangeUrl);
        }
    }
}
