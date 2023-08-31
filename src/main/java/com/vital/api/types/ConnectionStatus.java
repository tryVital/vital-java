package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectionStatus.Builder.class)
public final class ConnectionStatus {
    private final boolean success;

    private final Optional<String> redirectUrl;

    private ConnectionStatus(boolean success, Optional<String> redirectUrl) {
        this.success = success;
        this.redirectUrl = redirectUrl;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("redirect_url")
    public Optional<String> getRedirectUrl() {
        return redirectUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectionStatus && equalTo((ConnectionStatus) other);
    }

    private boolean equalTo(ConnectionStatus other) {
        return success == other.success && redirectUrl.equals(other.redirectUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.success, this.redirectUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        _FinalStage success(boolean success);

        Builder from(ConnectionStatus other);
    }

    public interface _FinalStage {
        ConnectionStatus build();

        _FinalStage redirectUrl(Optional<String> redirectUrl);

        _FinalStage redirectUrl(String redirectUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, _FinalStage {
        private boolean success;

        private Optional<String> redirectUrl = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ConnectionStatus other) {
            success(other.getSuccess());
            redirectUrl(other.getRedirectUrl());
            return this;
        }

        @Override
        @JsonSetter("success")
        public _FinalStage success(boolean success) {
            this.success = success;
            return this;
        }

        @Override
        public _FinalStage redirectUrl(String redirectUrl) {
            this.redirectUrl = Optional.of(redirectUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "redirect_url", nulls = Nulls.SKIP)
        public _FinalStage redirectUrl(Optional<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        @Override
        public ConnectionStatus build() {
            return new ConnectionStatus(success, redirectUrl);
        }
    }
}