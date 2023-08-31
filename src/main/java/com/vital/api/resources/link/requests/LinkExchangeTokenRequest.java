package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkExchangeTokenRequest.Builder.class)
public final class LinkExchangeTokenRequest {
    private final String code;

    private LinkExchangeTokenRequest(String code) {
        this.code = code;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkExchangeTokenRequest && equalTo((LinkExchangeTokenRequest) other);
    }

    private boolean equalTo(LinkExchangeTokenRequest other) {
        return code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CodeStage builder() {
        return new Builder();
    }

    public interface CodeStage {
        _FinalStage code(String code);

        Builder from(LinkExchangeTokenRequest other);
    }

    public interface _FinalStage {
        LinkExchangeTokenRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CodeStage, _FinalStage {
        private String code;

        private Builder() {}

        @Override
        public Builder from(LinkExchangeTokenRequest other) {
            code(other.getCode());
            return this;
        }

        @Override
        @JsonSetter("code")
        public _FinalStage code(String code) {
            this.code = code;
            return this;
        }

        @Override
        public LinkExchangeTokenRequest build() {
            return new LinkExchangeTokenRequest(code);
        }
    }
}
