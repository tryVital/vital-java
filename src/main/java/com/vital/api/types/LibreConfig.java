package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LibreConfig.Builder.class)
public final class LibreConfig {
    private final Map<String, Object> practiceId;

    private LibreConfig(Map<String, Object> practiceId) {
        this.practiceId = practiceId;
    }

    @JsonProperty("practice_id")
    public Map<String, Object> getPracticeId() {
        return practiceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LibreConfig && equalTo((LibreConfig) other);
    }

    private boolean equalTo(LibreConfig other) {
        return practiceId.equals(other.practiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.practiceId);
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
        private Map<String, Object> practiceId = new LinkedHashMap<>();

        private Builder() {}

        public Builder from(LibreConfig other) {
            practiceId(other.getPracticeId());
            return this;
        }

        @JsonSetter(value = "practice_id", nulls = Nulls.SKIP)
        public Builder practiceId(Map<String, Object> practiceId) {
            this.practiceId.clear();
            this.practiceId.putAll(practiceId);
            return this;
        }

        public Builder putAllPracticeId(Map<String, Object> practiceId) {
            this.practiceId.putAll(practiceId);
            return this;
        }

        public Builder practiceId(String key, Object value) {
            this.practiceId.put(key, value);
            return this;
        }

        public LibreConfig build() {
            return new LibreConfig(practiceId);
        }
    }
}
