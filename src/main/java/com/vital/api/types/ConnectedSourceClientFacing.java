/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedSourceClientFacing.Builder.class)
public final class ConnectedSourceClientFacing {
    private final ClientFacingProvider provider;

    private final OffsetDateTime createdOn;

    private final ClientFacingProvider source;

    private final Map<String, Object> additionalProperties;

    private ConnectedSourceClientFacing(
            ClientFacingProvider provider,
            OffsetDateTime createdOn,
            ClientFacingProvider source,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.createdOn = createdOn;
        this.source = source;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The provider of this connected source.
     */
    @JsonProperty("provider")
    public ClientFacingProvider getProvider() {
        return provider;
    }

    /**
     * @return When your item is created
     */
    @JsonProperty("created_on")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * @return Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.
     */
    @JsonProperty("source")
    public ClientFacingProvider getSource() {
        return source;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedSourceClientFacing && equalTo((ConnectedSourceClientFacing) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectedSourceClientFacing other) {
        return provider.equals(other.provider) && createdOn.equals(other.createdOn) && source.equals(other.source);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.provider, this.createdOn, this.source);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        CreatedOnStage provider(ClientFacingProvider provider);

        Builder from(ConnectedSourceClientFacing other);
    }

    public interface CreatedOnStage {
        SourceStage createdOn(OffsetDateTime createdOn);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingProvider source);
    }

    public interface _FinalStage {
        ConnectedSourceClientFacing build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, CreatedOnStage, SourceStage, _FinalStage {
        private ClientFacingProvider provider;

        private OffsetDateTime createdOn;

        private ClientFacingProvider source;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConnectedSourceClientFacing other) {
            provider(other.getProvider());
            createdOn(other.getCreatedOn());
            source(other.getSource());
            return this;
        }

        /**
         * <p>The provider of this connected source.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("provider")
        public CreatedOnStage provider(ClientFacingProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>When your item is created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("created_on")
        public SourceStage createdOn(OffsetDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>provider</code> instead. Subject to removal after 1 Jan 2024.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingProvider source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        public ConnectedSourceClientFacing build() {
            return new ConnectedSourceClientFacing(provider, createdOn, source, additionalProperties);
        }
    }
}
