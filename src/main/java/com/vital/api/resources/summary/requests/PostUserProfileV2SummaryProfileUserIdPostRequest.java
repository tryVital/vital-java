package com.vital.api.resources.summary.requests;

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
@JsonDeserialize(builder = PostUserProfileV2SummaryProfileUserIdPostRequest.Builder.class)
public final class PostUserProfileV2SummaryProfileUserIdPostRequest {
    private final Optional<String> vitalIosSdkVersion;

    private final Optional<String> vitalAndroidSdkVersion;

    private PostUserProfileV2SummaryProfileUserIdPostRequest(
            Optional<String> vitalIosSdkVersion, Optional<String> vitalAndroidSdkVersion) {
        this.vitalIosSdkVersion = vitalIosSdkVersion;
        this.vitalAndroidSdkVersion = vitalAndroidSdkVersion;
    }

    @JsonProperty("x-vital-ios-sdk-version")
    public Optional<String> getVitalIosSdkVersion() {
        return vitalIosSdkVersion;
    }

    @JsonProperty("x-vital-android-sdk-version")
    public Optional<String> getVitalAndroidSdkVersion() {
        return vitalAndroidSdkVersion;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PostUserProfileV2SummaryProfileUserIdPostRequest
                && equalTo((PostUserProfileV2SummaryProfileUserIdPostRequest) other);
    }

    private boolean equalTo(PostUserProfileV2SummaryProfileUserIdPostRequest other) {
        return vitalIosSdkVersion.equals(other.vitalIosSdkVersion)
                && vitalAndroidSdkVersion.equals(other.vitalAndroidSdkVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.vitalIosSdkVersion, this.vitalAndroidSdkVersion);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> vitalIosSdkVersion = Optional.empty();

        private Optional<String> vitalAndroidSdkVersion = Optional.empty();

        private Builder() {}

        public Builder from(PostUserProfileV2SummaryProfileUserIdPostRequest other) {
            vitalIosSdkVersion(other.getVitalIosSdkVersion());
            vitalAndroidSdkVersion(other.getVitalAndroidSdkVersion());
            return this;
        }

        @JsonSetter(value = "x-vital-ios-sdk-version", nulls = Nulls.SKIP)
        public Builder vitalIosSdkVersion(Optional<String> vitalIosSdkVersion) {
            this.vitalIosSdkVersion = vitalIosSdkVersion;
            return this;
        }

        public Builder vitalIosSdkVersion(String vitalIosSdkVersion) {
            this.vitalIosSdkVersion = Optional.of(vitalIosSdkVersion);
            return this;
        }

        @JsonSetter(value = "x-vital-android-sdk-version", nulls = Nulls.SKIP)
        public Builder vitalAndroidSdkVersion(Optional<String> vitalAndroidSdkVersion) {
            this.vitalAndroidSdkVersion = vitalAndroidSdkVersion;
            return this;
        }

        public Builder vitalAndroidSdkVersion(String vitalAndroidSdkVersion) {
            this.vitalAndroidSdkVersion = Optional.of(vitalAndroidSdkVersion);
            return this;
        }

        public PostUserProfileV2SummaryProfileUserIdPostRequest build() {
            return new PostUserProfileV2SummaryProfileUserIdPostRequest(vitalIosSdkVersion, vitalAndroidSdkVersion);
        }
    }
}
