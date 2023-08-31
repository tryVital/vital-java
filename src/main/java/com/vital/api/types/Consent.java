package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Consent.Builder.class)
public final class Consent {
    private final ConsentType consentType;

    private final Optional<String> version;

    private final Optional<OffsetDateTime> timeOfConsent;

    private Consent(ConsentType consentType, Optional<String> version, Optional<OffsetDateTime> timeOfConsent) {
        this.consentType = consentType;
        this.version = version;
        this.timeOfConsent = timeOfConsent;
    }

    @JsonProperty("consentType")
    public ConsentType getConsentType() {
        return consentType;
    }

    @JsonProperty("version")
    public Optional<String> getVersion() {
        return version;
    }

    @JsonProperty("timeOfConsent")
    public Optional<OffsetDateTime> getTimeOfConsent() {
        return timeOfConsent;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Consent && equalTo((Consent) other);
    }

    private boolean equalTo(Consent other) {
        return consentType.equals(other.consentType)
                && version.equals(other.version)
                && timeOfConsent.equals(other.timeOfConsent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.consentType, this.version, this.timeOfConsent);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConsentTypeStage builder() {
        return new Builder();
    }

    public interface ConsentTypeStage {
        _FinalStage consentType(ConsentType consentType);

        Builder from(Consent other);
    }

    public interface _FinalStage {
        Consent build();

        _FinalStage version(Optional<String> version);

        _FinalStage version(String version);

        _FinalStage timeOfConsent(Optional<OffsetDateTime> timeOfConsent);

        _FinalStage timeOfConsent(OffsetDateTime timeOfConsent);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConsentTypeStage, _FinalStage {
        private ConsentType consentType;

        private Optional<OffsetDateTime> timeOfConsent = Optional.empty();

        private Optional<String> version = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Consent other) {
            consentType(other.getConsentType());
            version(other.getVersion());
            timeOfConsent(other.getTimeOfConsent());
            return this;
        }

        @Override
        @JsonSetter("consentType")
        public _FinalStage consentType(ConsentType consentType) {
            this.consentType = consentType;
            return this;
        }

        @Override
        public _FinalStage timeOfConsent(OffsetDateTime timeOfConsent) {
            this.timeOfConsent = Optional.of(timeOfConsent);
            return this;
        }

        @Override
        @JsonSetter(value = "timeOfConsent", nulls = Nulls.SKIP)
        public _FinalStage timeOfConsent(Optional<OffsetDateTime> timeOfConsent) {
            this.timeOfConsent = timeOfConsent;
            return this;
        }

        @Override
        public _FinalStage version(String version) {
            this.version = Optional.of(version);
            return this;
        }

        @Override
        @JsonSetter(value = "version", nulls = Nulls.SKIP)
        public _FinalStage version(Optional<String> version) {
            this.version = version;
            return this;
        }

        @Override
        public Consent build() {
            return new Consent(consentType, version, timeOfConsent);
        }
    }
}
