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
@JsonDeserialize(builder = TeamConfig.Builder.class)
public final class TeamConfig {
    private final LibreConfig libreview;

    private final Optional<Boolean> textsEnabled;

    private TeamConfig(LibreConfig libreview, Optional<Boolean> textsEnabled) {
        this.libreview = libreview;
        this.textsEnabled = textsEnabled;
    }

    @JsonProperty("libreview")
    public LibreConfig getLibreview() {
        return libreview;
    }

    @JsonProperty("texts_enabled")
    public Optional<Boolean> getTextsEnabled() {
        return textsEnabled;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TeamConfig && equalTo((TeamConfig) other);
    }

    private boolean equalTo(TeamConfig other) {
        return libreview.equals(other.libreview) && textsEnabled.equals(other.textsEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.libreview, this.textsEnabled);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LibreviewStage builder() {
        return new Builder();
    }

    public interface LibreviewStage {
        _FinalStage libreview(LibreConfig libreview);

        Builder from(TeamConfig other);
    }

    public interface _FinalStage {
        TeamConfig build();

        _FinalStage textsEnabled(Optional<Boolean> textsEnabled);

        _FinalStage textsEnabled(Boolean textsEnabled);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LibreviewStage, _FinalStage {
        private LibreConfig libreview;

        private Optional<Boolean> textsEnabled = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(TeamConfig other) {
            libreview(other.getLibreview());
            textsEnabled(other.getTextsEnabled());
            return this;
        }

        @Override
        @JsonSetter("libreview")
        public _FinalStage libreview(LibreConfig libreview) {
            this.libreview = libreview;
            return this;
        }

        @Override
        public _FinalStage textsEnabled(Boolean textsEnabled) {
            this.textsEnabled = Optional.of(textsEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "texts_enabled", nulls = Nulls.SKIP)
        public _FinalStage textsEnabled(Optional<Boolean> textsEnabled) {
            this.textsEnabled = textsEnabled;
            return this;
        }

        @Override
        public TeamConfig build() {
            return new TeamConfig(libreview, textsEnabled);
        }
    }
}
