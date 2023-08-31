package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RawProfile.Builder.class)
public final class RawProfile {
    private final ProfileInDb profile;

    private RawProfile(ProfileInDb profile) {
        this.profile = profile;
    }

    @JsonProperty("profile")
    public ProfileInDb getProfile() {
        return profile;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RawProfile && equalTo((RawProfile) other);
    }

    private boolean equalTo(RawProfile other) {
        return profile.equals(other.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.profile);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProfileStage builder() {
        return new Builder();
    }

    public interface ProfileStage {
        _FinalStage profile(ProfileInDb profile);

        Builder from(RawProfile other);
    }

    public interface _FinalStage {
        RawProfile build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProfileStage, _FinalStage {
        private ProfileInDb profile;

        private Builder() {}

        @Override
        public Builder from(RawProfile other) {
            profile(other.getProfile());
            return this;
        }

        @Override
        @JsonSetter("profile")
        public _FinalStage profile(ProfileInDb profile) {
            this.profile = profile;
            return this;
        }

        @Override
        public RawProfile build() {
            return new RawProfile(profile);
        }
    }
}
