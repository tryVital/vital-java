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
@JsonDeserialize(builder = ConnectedSourceClientFacingRedacted.Builder.class)
public final class ConnectedSourceClientFacingRedacted {
    private final String id;

    private final ClientFacingSource source;

    private final Optional<String> providerId;

    private ConnectedSourceClientFacingRedacted(String id, ClientFacingSource source, Optional<String> providerId) {
        this.id = id;
        this.source = source;
        this.providerId = providerId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("provider_id")
    public Optional<String> getProviderId() {
        return providerId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedSourceClientFacingRedacted
                && equalTo((ConnectedSourceClientFacingRedacted) other);
    }

    private boolean equalTo(ConnectedSourceClientFacingRedacted other) {
        return id.equals(other.id) && source.equals(other.source) && providerId.equals(other.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.source, this.providerId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SourceStage id(String id);

        Builder from(ConnectedSourceClientFacingRedacted other);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ConnectedSourceClientFacingRedacted build();

        _FinalStage providerId(Optional<String> providerId);

        _FinalStage providerId(String providerId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, SourceStage, _FinalStage {
        private String id;

        private ClientFacingSource source;

        private Optional<String> providerId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ConnectedSourceClientFacingRedacted other) {
            id(other.getId());
            source(other.getSource());
            providerId(other.getProviderId());
            return this;
        }

        @Override
        @JsonSetter("id")
        public SourceStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @Override
        public _FinalStage providerId(String providerId) {
            this.providerId = Optional.of(providerId);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_id", nulls = Nulls.SKIP)
        public _FinalStage providerId(Optional<String> providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        public ConnectedSourceClientFacingRedacted build() {
            return new ConnectedSourceClientFacingRedacted(id, source, providerId);
        }
    }
}
