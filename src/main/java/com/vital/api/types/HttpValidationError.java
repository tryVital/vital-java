package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = HttpValidationError.Builder.class)
public final class HttpValidationError {
    private final Optional<List<ValidationError>> detail;

    private HttpValidationError(Optional<List<ValidationError>> detail) {
        this.detail = detail;
    }

    @JsonProperty("detail")
    public Optional<List<ValidationError>> getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HttpValidationError && equalTo((HttpValidationError) other);
    }

    private boolean equalTo(HttpValidationError other) {
        return detail.equals(other.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.detail);
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
        private Optional<List<ValidationError>> detail = Optional.empty();

        private Builder() {}

        public Builder from(HttpValidationError other) {
            detail(other.getDetail());
            return this;
        }

        @JsonSetter(value = "detail", nulls = Nulls.SKIP)
        public Builder detail(Optional<List<ValidationError>> detail) {
            this.detail = detail;
            return this;
        }

        public Builder detail(List<ValidationError> detail) {
            this.detail = Optional.of(detail);
            return this;
        }

        public HttpValidationError build() {
            return new HttpValidationError(detail);
        }
    }
}