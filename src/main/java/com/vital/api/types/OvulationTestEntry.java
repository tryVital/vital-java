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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OvulationTestEntry.Builder.class)
public final class OvulationTestEntry {
    private final String date;

    private final OvulationTestEntryTestResult testResult;

    private final Map<String, Object> additionalProperties;

    private OvulationTestEntry(
            String date, OvulationTestEntryTestResult testResult, Map<String, Object> additionalProperties) {
        this.date = date;
        this.testResult = testResult;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * @return ℹ️ This enum is non-exhaustive.
     */
    @JsonProperty("test_result")
    public OvulationTestEntryTestResult getTestResult() {
        return testResult;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OvulationTestEntry && equalTo((OvulationTestEntry) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OvulationTestEntry other) {
        return date.equals(other.date) && testResult.equals(other.testResult);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.date, this.testResult);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        TestResultStage date(String date);

        Builder from(OvulationTestEntry other);
    }

    public interface TestResultStage {
        _FinalStage testResult(OvulationTestEntryTestResult testResult);
    }

    public interface _FinalStage {
        OvulationTestEntry build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DateStage, TestResultStage, _FinalStage {
        private String date;

        private OvulationTestEntryTestResult testResult;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OvulationTestEntry other) {
            date(other.getDate());
            testResult(other.getTestResult());
            return this;
        }

        @java.lang.Override
        @JsonSetter("date")
        public TestResultStage date(String date) {
            this.date = date;
            return this;
        }

        /**
         * <p>ℹ️ This enum is non-exhaustive.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("test_result")
        public _FinalStage testResult(OvulationTestEntryTestResult testResult) {
            this.testResult = testResult;
            return this;
        }

        @java.lang.Override
        public OvulationTestEntry build() {
            return new OvulationTestEntry(date, testResult, additionalProperties);
        }
    }
}
