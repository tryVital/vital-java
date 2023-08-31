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
@JsonDeserialize(builder = SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest.Builder.class)
public final class SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest {
    private final Optional<String> queryId;

    private SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest(Optional<String> queryId) {
        this.queryId = queryId;
    }

    @JsonProperty("query_id")
    public Optional<String> getQueryId() {
        return queryId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest
                && equalTo((SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest) other);
    }

    private boolean equalTo(SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest other) {
        return queryId.equals(other.queryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.queryId);
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
        private Optional<String> queryId = Optional.empty();

        private Builder() {}

        public Builder from(SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest other) {
            queryId(other.getQueryId());
            return this;
        }

        @JsonSetter(value = "query_id", nulls = Nulls.SKIP)
        public Builder queryId(Optional<String> queryId) {
            this.queryId = queryId;
            return this;
        }

        public Builder queryId(String queryId) {
            this.queryId = Optional.of(queryId);
            return this;
        }

        public SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest build() {
            return new SearchTeamUsersByUuidOrClientUserIdV2TeamUsersSearchGetRequest(queryId);
        }
    }
}
