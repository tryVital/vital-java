package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DemoConnectionStatus.Builder.class)
public final class DemoConnectionStatus {
    private final boolean success;

    private final String detail;

    private DemoConnectionStatus(boolean success, String detail) {
        this.success = success;
        this.detail = detail;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DemoConnectionStatus && equalTo((DemoConnectionStatus) other);
    }

    private boolean equalTo(DemoConnectionStatus other) {
        return success == other.success && detail.equals(other.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.success, this.detail);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        DetailStage success(boolean success);

        Builder from(DemoConnectionStatus other);
    }

    public interface DetailStage {
        _FinalStage detail(String detail);
    }

    public interface _FinalStage {
        DemoConnectionStatus build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, DetailStage, _FinalStage {
        private boolean success;

        private String detail;

        private Builder() {}

        @Override
        public Builder from(DemoConnectionStatus other) {
            success(other.getSuccess());
            detail(other.getDetail());
            return this;
        }

        @Override
        @JsonSetter("success")
        public DetailStage success(boolean success) {
            this.success = success;
            return this;
        }

        @Override
        @JsonSetter("detail")
        public _FinalStage detail(String detail) {
            this.detail = detail;
            return this;
        }

        @Override
        public DemoConnectionStatus build() {
            return new DemoConnectionStatus(success, detail);
        }
    }
}
