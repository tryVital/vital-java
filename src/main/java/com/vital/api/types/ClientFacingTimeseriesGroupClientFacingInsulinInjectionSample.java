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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample.Builder.class)
public final class ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample {
    private final ClientFacingSource source;

    private final List<ClientFacingInsulinInjectionSample> data;

    private final Map<String, Object> additionalProperties;

    private ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample(
            ClientFacingSource source,
            List<ClientFacingInsulinInjectionSample> data,
            Map<String, Object> additionalProperties) {
        this.source = source;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("data")
    public List<ClientFacingInsulinInjectionSample> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample
                && equalTo((ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample other) {
        return source.equals(other.source) && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.source, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourceStage builder() {
        return new Builder();
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);

        Builder from(ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample other);
    }

    public interface _FinalStage {
        ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample build();

        _FinalStage data(List<ClientFacingInsulinInjectionSample> data);

        _FinalStage addData(ClientFacingInsulinInjectionSample data);

        _FinalStage addAllData(List<ClientFacingInsulinInjectionSample> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, _FinalStage {
        private ClientFacingSource source;

        private List<ClientFacingInsulinInjectionSample> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample other) {
            source(other.getSource());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllData(List<ClientFacingInsulinInjectionSample> data) {
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public _FinalStage addData(ClientFacingInsulinInjectionSample data) {
            this.data.add(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<ClientFacingInsulinInjectionSample> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample build() {
            return new ClientFacingTimeseriesGroupClientFacingInsulinInjectionSample(
                    source, data, additionalProperties);
        }
    }
}
