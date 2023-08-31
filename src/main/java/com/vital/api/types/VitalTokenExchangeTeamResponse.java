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
@JsonDeserialize(builder = VitalTokenExchangeTeamResponse.Builder.class)
public final class VitalTokenExchangeTeamResponse {
    private final String name;

    private final Optional<String> logoUrl;

    private VitalTokenExchangeTeamResponse(String name, Optional<String> logoUrl) {
        this.name = name;
        this.logoUrl = logoUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("logo_url")
    public Optional<String> getLogoUrl() {
        return logoUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VitalTokenExchangeTeamResponse && equalTo((VitalTokenExchangeTeamResponse) other);
    }

    private boolean equalTo(VitalTokenExchangeTeamResponse other) {
        return name.equals(other.name) && logoUrl.equals(other.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.logoUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(String name);

        Builder from(VitalTokenExchangeTeamResponse other);
    }

    public interface _FinalStage {
        VitalTokenExchangeTeamResponse build();

        _FinalStage logoUrl(Optional<String> logoUrl);

        _FinalStage logoUrl(String logoUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<String> logoUrl = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(VitalTokenExchangeTeamResponse other) {
            name(other.getName());
            logoUrl(other.getLogoUrl());
            return this;
        }

        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage logoUrl(String logoUrl) {
            this.logoUrl = Optional.of(logoUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "logo_url", nulls = Nulls.SKIP)
        public _FinalStage logoUrl(Optional<String> logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        @Override
        public VitalTokenExchangeTeamResponse build() {
            return new VitalTokenExchangeTeamResponse(name, logoUrl);
        }
    }
}
