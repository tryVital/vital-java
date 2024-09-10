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
@JsonDeserialize(builder = PhlebotomyAreaInfo.Builder.class)
public final class PhlebotomyAreaInfo {
    private final boolean isServed;

    private final List<PhlebotomyProviderInfo> providers;

    private final Map<String, Object> additionalProperties;

    private PhlebotomyAreaInfo(
            boolean isServed, List<PhlebotomyProviderInfo> providers, Map<String, Object> additionalProperties) {
        this.isServed = isServed;
        this.providers = providers;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("is_served")
    public boolean getIsServed() {
        return isServed;
    }

    @JsonProperty("providers")
    public List<PhlebotomyProviderInfo> getProviders() {
        return providers;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhlebotomyAreaInfo && equalTo((PhlebotomyAreaInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhlebotomyAreaInfo other) {
        return isServed == other.isServed && providers.equals(other.providers);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.isServed, this.providers);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IsServedStage builder() {
        return new Builder();
    }

    public interface IsServedStage {
        _FinalStage isServed(boolean isServed);

        Builder from(PhlebotomyAreaInfo other);
    }

    public interface _FinalStage {
        PhlebotomyAreaInfo build();

        _FinalStage providers(List<PhlebotomyProviderInfo> providers);

        _FinalStage addProviders(PhlebotomyProviderInfo providers);

        _FinalStage addAllProviders(List<PhlebotomyProviderInfo> providers);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IsServedStage, _FinalStage {
        private boolean isServed;

        private List<PhlebotomyProviderInfo> providers = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PhlebotomyAreaInfo other) {
            isServed(other.getIsServed());
            providers(other.getProviders());
            return this;
        }

        @java.lang.Override
        @JsonSetter("is_served")
        public _FinalStage isServed(boolean isServed) {
            this.isServed = isServed;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllProviders(List<PhlebotomyProviderInfo> providers) {
            this.providers.addAll(providers);
            return this;
        }

        @java.lang.Override
        public _FinalStage addProviders(PhlebotomyProviderInfo providers) {
            this.providers.add(providers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "providers", nulls = Nulls.SKIP)
        public _FinalStage providers(List<PhlebotomyProviderInfo> providers) {
            this.providers.clear();
            this.providers.addAll(providers);
            return this;
        }

        @java.lang.Override
        public PhlebotomyAreaInfo build() {
            return new PhlebotomyAreaInfo(isServed, providers, additionalProperties);
        }
    }
}
