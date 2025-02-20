/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SingleResourceStatistics.Builder.class)
public final class SingleResourceStatistics {
    private final Optional<LastAttempt> lastAttempt;

    private final Optional<OffsetDateTime> oldestData;

    private final Optional<OffsetDateTime> newestData;

    private final Optional<Integer> sentCount;

    private final Map<String, Object> additionalProperties;

    private SingleResourceStatistics(
            Optional<LastAttempt> lastAttempt,
            Optional<OffsetDateTime> oldestData,
            Optional<OffsetDateTime> newestData,
            Optional<Integer> sentCount,
            Map<String, Object> additionalProperties) {
        this.lastAttempt = lastAttempt;
        this.oldestData = oldestData;
        this.newestData = newestData;
        this.sentCount = sentCount;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("last_attempt")
    public Optional<LastAttempt> getLastAttempt() {
        return lastAttempt;
    }

    @JsonProperty("oldest_data")
    public Optional<OffsetDateTime> getOldestData() {
        return oldestData;
    }

    @JsonProperty("newest_data")
    public Optional<OffsetDateTime> getNewestData() {
        return newestData;
    }

    @JsonProperty("sent_count")
    public Optional<Integer> getSentCount() {
        return sentCount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SingleResourceStatistics && equalTo((SingleResourceStatistics) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SingleResourceStatistics other) {
        return lastAttempt.equals(other.lastAttempt)
                && oldestData.equals(other.oldestData)
                && newestData.equals(other.newestData)
                && sentCount.equals(other.sentCount);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.lastAttempt, this.oldestData, this.newestData, this.sentCount);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<LastAttempt> lastAttempt = Optional.empty();

        private Optional<OffsetDateTime> oldestData = Optional.empty();

        private Optional<OffsetDateTime> newestData = Optional.empty();

        private Optional<Integer> sentCount = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SingleResourceStatistics other) {
            lastAttempt(other.getLastAttempt());
            oldestData(other.getOldestData());
            newestData(other.getNewestData());
            sentCount(other.getSentCount());
            return this;
        }

        @JsonSetter(value = "last_attempt", nulls = Nulls.SKIP)
        public Builder lastAttempt(Optional<LastAttempt> lastAttempt) {
            this.lastAttempt = lastAttempt;
            return this;
        }

        public Builder lastAttempt(LastAttempt lastAttempt) {
            this.lastAttempt = Optional.of(lastAttempt);
            return this;
        }

        @JsonSetter(value = "oldest_data", nulls = Nulls.SKIP)
        public Builder oldestData(Optional<OffsetDateTime> oldestData) {
            this.oldestData = oldestData;
            return this;
        }

        public Builder oldestData(OffsetDateTime oldestData) {
            this.oldestData = Optional.of(oldestData);
            return this;
        }

        @JsonSetter(value = "newest_data", nulls = Nulls.SKIP)
        public Builder newestData(Optional<OffsetDateTime> newestData) {
            this.newestData = newestData;
            return this;
        }

        public Builder newestData(OffsetDateTime newestData) {
            this.newestData = Optional.of(newestData);
            return this;
        }

        @JsonSetter(value = "sent_count", nulls = Nulls.SKIP)
        public Builder sentCount(Optional<Integer> sentCount) {
            this.sentCount = sentCount;
            return this;
        }

        public Builder sentCount(Integer sentCount) {
            this.sentCount = Optional.of(sentCount);
            return this;
        }

        public SingleResourceStatistics build() {
            return new SingleResourceStatistics(lastAttempt, oldestData, newestData, sentCount, additionalProperties);
        }
    }
}
