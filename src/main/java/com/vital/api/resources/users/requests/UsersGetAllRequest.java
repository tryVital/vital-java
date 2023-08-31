package com.vital.api.resources.users.requests;

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
@JsonDeserialize(builder = UsersGetAllRequest.Builder.class)
public final class UsersGetAllRequest {
    private final Optional<Integer> offset;

    private final Optional<Integer> limit;

    private UsersGetAllRequest(Optional<Integer> offset, Optional<Integer> limit) {
        this.offset = offset;
        this.limit = limit;
    }

    @JsonProperty("offset")
    public Optional<Integer> getOffset() {
        return offset;
    }

    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UsersGetAllRequest && equalTo((UsersGetAllRequest) other);
    }

    private boolean equalTo(UsersGetAllRequest other) {
        return offset.equals(other.offset) && limit.equals(other.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.offset, this.limit);
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
        private Optional<Integer> offset = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Builder() {}

        public Builder from(UsersGetAllRequest other) {
            offset(other.getOffset());
            limit(other.getLimit());
            return this;
        }

        @JsonSetter(value = "offset", nulls = Nulls.SKIP)
        public Builder offset(Optional<Integer> offset) {
            this.offset = offset;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = Optional.of(offset);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        public UsersGetAllRequest build() {
            return new UsersGetAllRequest(offset, limit);
        }
    }
}
