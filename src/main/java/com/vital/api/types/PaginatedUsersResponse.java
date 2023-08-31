package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaginatedUsersResponse.Builder.class)
public final class PaginatedUsersResponse {
    private final List<ClientFacingUser> users;

    private final int total;

    private final int offset;

    private final int limit;

    private PaginatedUsersResponse(List<ClientFacingUser> users, int total, int offset, int limit) {
        this.users = users;
        this.total = total;
        this.offset = offset;
        this.limit = limit;
    }

    @JsonProperty("users")
    public List<ClientFacingUser> getUsers() {
        return users;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return offset;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaginatedUsersResponse && equalTo((PaginatedUsersResponse) other);
    }

    private boolean equalTo(PaginatedUsersResponse other) {
        return users.equals(other.users) && total == other.total && offset == other.offset && limit == other.limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.users, this.total, this.offset, this.limit);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalStage builder() {
        return new Builder();
    }

    public interface TotalStage {
        OffsetStage total(int total);

        Builder from(PaginatedUsersResponse other);
    }

    public interface OffsetStage {
        LimitStage offset(int offset);
    }

    public interface LimitStage {
        _FinalStage limit(int limit);
    }

    public interface _FinalStage {
        PaginatedUsersResponse build();

        _FinalStage users(List<ClientFacingUser> users);

        _FinalStage addUsers(ClientFacingUser users);

        _FinalStage addAllUsers(List<ClientFacingUser> users);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalStage, OffsetStage, LimitStage, _FinalStage {
        private int total;

        private int offset;

        private int limit;

        private List<ClientFacingUser> users = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(PaginatedUsersResponse other) {
            users(other.getUsers());
            total(other.getTotal());
            offset(other.getOffset());
            limit(other.getLimit());
            return this;
        }

        @Override
        @JsonSetter("total")
        public OffsetStage total(int total) {
            this.total = total;
            return this;
        }

        @Override
        @JsonSetter("offset")
        public LimitStage offset(int offset) {
            this.offset = offset;
            return this;
        }

        @Override
        @JsonSetter("limit")
        public _FinalStage limit(int limit) {
            this.limit = limit;
            return this;
        }

        @Override
        public _FinalStage addAllUsers(List<ClientFacingUser> users) {
            this.users.addAll(users);
            return this;
        }

        @Override
        public _FinalStage addUsers(ClientFacingUser users) {
            this.users.add(users);
            return this;
        }

        @Override
        @JsonSetter(value = "users", nulls = Nulls.SKIP)
        public _FinalStage users(List<ClientFacingUser> users) {
            this.users.clear();
            this.users.addAll(users);
            return this;
        }

        @Override
        public PaginatedUsersResponse build() {
            return new PaginatedUsersResponse(users, total, offset, limit);
        }
    }
}