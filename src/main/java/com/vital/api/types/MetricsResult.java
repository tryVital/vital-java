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
@JsonDeserialize(builder = MetricsResult.Builder.class)
public final class MetricsResult {
    private final MetricsResultTeamId teamId;

    private final Optional<Integer> numberOfConnectedSources;

    private final Optional<Integer> numberOfUsers;

    private final Optional<Integer> numberOfErroredConnectedSources;

    private final Optional<List<TimeseriesMetricPoint>> numberOfConnectedSourcesByWeek;

    private final Optional<Integer> numberOfOrderedTests;

    private MetricsResult(
            MetricsResultTeamId teamId,
            Optional<Integer> numberOfConnectedSources,
            Optional<Integer> numberOfUsers,
            Optional<Integer> numberOfErroredConnectedSources,
            Optional<List<TimeseriesMetricPoint>> numberOfConnectedSourcesByWeek,
            Optional<Integer> numberOfOrderedTests) {
        this.teamId = teamId;
        this.numberOfConnectedSources = numberOfConnectedSources;
        this.numberOfUsers = numberOfUsers;
        this.numberOfErroredConnectedSources = numberOfErroredConnectedSources;
        this.numberOfConnectedSourcesByWeek = numberOfConnectedSourcesByWeek;
        this.numberOfOrderedTests = numberOfOrderedTests;
    }

    @JsonProperty("team_id")
    public MetricsResultTeamId getTeamId() {
        return teamId;
    }

    @JsonProperty("number_of_connected_sources")
    public Optional<Integer> getNumberOfConnectedSources() {
        return numberOfConnectedSources;
    }

    @JsonProperty("number_of_users")
    public Optional<Integer> getNumberOfUsers() {
        return numberOfUsers;
    }

    @JsonProperty("number_of_errored_connected_sources")
    public Optional<Integer> getNumberOfErroredConnectedSources() {
        return numberOfErroredConnectedSources;
    }

    @JsonProperty("number_of_connected_sources_by_week")
    public Optional<List<TimeseriesMetricPoint>> getNumberOfConnectedSourcesByWeek() {
        return numberOfConnectedSourcesByWeek;
    }

    @JsonProperty("number_of_ordered_tests")
    public Optional<Integer> getNumberOfOrderedTests() {
        return numberOfOrderedTests;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MetricsResult && equalTo((MetricsResult) other);
    }

    private boolean equalTo(MetricsResult other) {
        return teamId.equals(other.teamId)
                && numberOfConnectedSources.equals(other.numberOfConnectedSources)
                && numberOfUsers.equals(other.numberOfUsers)
                && numberOfErroredConnectedSources.equals(other.numberOfErroredConnectedSources)
                && numberOfConnectedSourcesByWeek.equals(other.numberOfConnectedSourcesByWeek)
                && numberOfOrderedTests.equals(other.numberOfOrderedTests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.teamId,
                this.numberOfConnectedSources,
                this.numberOfUsers,
                this.numberOfErroredConnectedSources,
                this.numberOfConnectedSourcesByWeek,
                this.numberOfOrderedTests);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TeamIdStage builder() {
        return new Builder();
    }

    public interface TeamIdStage {
        _FinalStage teamId(MetricsResultTeamId teamId);

        Builder from(MetricsResult other);
    }

    public interface _FinalStage {
        MetricsResult build();

        _FinalStage numberOfConnectedSources(Optional<Integer> numberOfConnectedSources);

        _FinalStage numberOfConnectedSources(Integer numberOfConnectedSources);

        _FinalStage numberOfUsers(Optional<Integer> numberOfUsers);

        _FinalStage numberOfUsers(Integer numberOfUsers);

        _FinalStage numberOfErroredConnectedSources(Optional<Integer> numberOfErroredConnectedSources);

        _FinalStage numberOfErroredConnectedSources(Integer numberOfErroredConnectedSources);

        _FinalStage numberOfConnectedSourcesByWeek(
                Optional<List<TimeseriesMetricPoint>> numberOfConnectedSourcesByWeek);

        _FinalStage numberOfConnectedSourcesByWeek(List<TimeseriesMetricPoint> numberOfConnectedSourcesByWeek);

        _FinalStage numberOfOrderedTests(Optional<Integer> numberOfOrderedTests);

        _FinalStage numberOfOrderedTests(Integer numberOfOrderedTests);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TeamIdStage, _FinalStage {
        private MetricsResultTeamId teamId;

        private Optional<Integer> numberOfOrderedTests = Optional.empty();

        private Optional<List<TimeseriesMetricPoint>> numberOfConnectedSourcesByWeek = Optional.empty();

        private Optional<Integer> numberOfErroredConnectedSources = Optional.empty();

        private Optional<Integer> numberOfUsers = Optional.empty();

        private Optional<Integer> numberOfConnectedSources = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(MetricsResult other) {
            teamId(other.getTeamId());
            numberOfConnectedSources(other.getNumberOfConnectedSources());
            numberOfUsers(other.getNumberOfUsers());
            numberOfErroredConnectedSources(other.getNumberOfErroredConnectedSources());
            numberOfConnectedSourcesByWeek(other.getNumberOfConnectedSourcesByWeek());
            numberOfOrderedTests(other.getNumberOfOrderedTests());
            return this;
        }

        @Override
        @JsonSetter("team_id")
        public _FinalStage teamId(MetricsResultTeamId teamId) {
            this.teamId = teamId;
            return this;
        }

        @Override
        public _FinalStage numberOfOrderedTests(Integer numberOfOrderedTests) {
            this.numberOfOrderedTests = Optional.of(numberOfOrderedTests);
            return this;
        }

        @Override
        @JsonSetter(value = "number_of_ordered_tests", nulls = Nulls.SKIP)
        public _FinalStage numberOfOrderedTests(Optional<Integer> numberOfOrderedTests) {
            this.numberOfOrderedTests = numberOfOrderedTests;
            return this;
        }

        @Override
        public _FinalStage numberOfConnectedSourcesByWeek(List<TimeseriesMetricPoint> numberOfConnectedSourcesByWeek) {
            this.numberOfConnectedSourcesByWeek = Optional.of(numberOfConnectedSourcesByWeek);
            return this;
        }

        @Override
        @JsonSetter(value = "number_of_connected_sources_by_week", nulls = Nulls.SKIP)
        public _FinalStage numberOfConnectedSourcesByWeek(
                Optional<List<TimeseriesMetricPoint>> numberOfConnectedSourcesByWeek) {
            this.numberOfConnectedSourcesByWeek = numberOfConnectedSourcesByWeek;
            return this;
        }

        @Override
        public _FinalStage numberOfErroredConnectedSources(Integer numberOfErroredConnectedSources) {
            this.numberOfErroredConnectedSources = Optional.of(numberOfErroredConnectedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "number_of_errored_connected_sources", nulls = Nulls.SKIP)
        public _FinalStage numberOfErroredConnectedSources(Optional<Integer> numberOfErroredConnectedSources) {
            this.numberOfErroredConnectedSources = numberOfErroredConnectedSources;
            return this;
        }

        @Override
        public _FinalStage numberOfUsers(Integer numberOfUsers) {
            this.numberOfUsers = Optional.of(numberOfUsers);
            return this;
        }

        @Override
        @JsonSetter(value = "number_of_users", nulls = Nulls.SKIP)
        public _FinalStage numberOfUsers(Optional<Integer> numberOfUsers) {
            this.numberOfUsers = numberOfUsers;
            return this;
        }

        @Override
        public _FinalStage numberOfConnectedSources(Integer numberOfConnectedSources) {
            this.numberOfConnectedSources = Optional.of(numberOfConnectedSources);
            return this;
        }

        @Override
        @JsonSetter(value = "number_of_connected_sources", nulls = Nulls.SKIP)
        public _FinalStage numberOfConnectedSources(Optional<Integer> numberOfConnectedSources) {
            this.numberOfConnectedSources = numberOfConnectedSources;
            return this;
        }

        @Override
        public MetricsResult build() {
            return new MetricsResult(
                    teamId,
                    numberOfConnectedSources,
                    numberOfUsers,
                    numberOfErroredConnectedSources,
                    numberOfConnectedSourcesByWeek,
                    numberOfOrderedTests);
        }
    }
}
