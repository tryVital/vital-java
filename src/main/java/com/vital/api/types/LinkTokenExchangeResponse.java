package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkTokenExchangeResponse.Builder.class)
public final class LinkTokenExchangeResponse {
    private final String linkToken;

    private LinkTokenExchangeResponse(String linkToken) {
        this.linkToken = linkToken;
    }

    /**
     * @return Link token to use to launch link widget
     */
    @JsonProperty("link_token")
    public String getLinkToken() {
        return linkToken;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkTokenExchangeResponse && equalTo((LinkTokenExchangeResponse) other);
    }

    private boolean equalTo(LinkTokenExchangeResponse other) {
        return linkToken.equals(other.linkToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.linkToken);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LinkTokenStage builder() {
        return new Builder();
    }

    public interface LinkTokenStage {
        _FinalStage linkToken(String linkToken);

        Builder from(LinkTokenExchangeResponse other);
    }

    public interface _FinalStage {
        LinkTokenExchangeResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LinkTokenStage, _FinalStage {
        private String linkToken;

        private Builder() {}

        @Override
        public Builder from(LinkTokenExchangeResponse other) {
            linkToken(other.getLinkToken());
            return this;
        }

        /**
         * <p>Link token to use to launch link widget</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("link_token")
        public _FinalStage linkToken(String linkToken) {
            this.linkToken = linkToken;
            return this;
        }

        @Override
        public LinkTokenExchangeResponse build() {
            return new LinkTokenExchangeResponse(linkToken);
        }
    }
}
