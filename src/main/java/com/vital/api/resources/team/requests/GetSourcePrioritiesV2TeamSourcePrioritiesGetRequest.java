package com.vital.api.resources.team.requests;

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
@JsonDeserialize(builder = GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest.Builder.class)
public final class GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest {
    private final Optional<String> dataType;

    private GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest(Optional<String> dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("data_type")
    public Optional<String> getDataType() {
        return dataType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest
                && equalTo((GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest) other);
    }

    private boolean equalTo(GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest other) {
        return dataType.equals(other.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.dataType);
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
        private Optional<String> dataType = Optional.empty();

        private Builder() {}

        public Builder from(GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest other) {
            dataType(other.getDataType());
            return this;
        }

        @JsonSetter(value = "data_type", nulls = Nulls.SKIP)
        public Builder dataType(Optional<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder dataType(String dataType) {
            this.dataType = Optional.of(dataType);
            return this;
        }

        public GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest build() {
            return new GetSourcePrioritiesV2TeamSourcePrioritiesGetRequest(dataType);
        }
    }
}
