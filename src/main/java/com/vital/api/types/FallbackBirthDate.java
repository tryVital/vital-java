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
@JsonDeserialize(builder = FallbackBirthDate.Builder.class)
public final class FallbackBirthDate {
    private final String value;

    private final String sourceSlug;

    private final String updatedAt;

    private final Map<String, Object> additionalProperties;

    private FallbackBirthDate(
            String value, String sourceSlug, String updatedAt, Map<String, Object> additionalProperties) {
        this.value = value;
        this.sourceSlug = sourceSlug;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * @return Slug for designated source
     */
    @JsonProperty("source_slug")
    public String getSourceSlug() {
        return sourceSlug;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackBirthDate && equalTo((FallbackBirthDate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackBirthDate other) {
        return value.equals(other.value) && sourceSlug.equals(other.sourceSlug) && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.sourceSlug, this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValueStage builder() {
        return new Builder();
    }

    public interface ValueStage {
        SourceSlugStage value(String value);

        Builder from(FallbackBirthDate other);
    }

    public interface SourceSlugStage {
        UpdatedAtStage sourceSlug(String sourceSlug);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(String updatedAt);
    }

    public interface _FinalStage {
        FallbackBirthDate build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValueStage, SourceSlugStage, UpdatedAtStage, _FinalStage {
        private String value;

        private String sourceSlug;

        private String updatedAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(FallbackBirthDate other) {
            value(other.getValue());
            sourceSlug(other.getSourceSlug());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("value")
        public SourceSlugStage value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>Slug for designated source</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("source_slug")
        public UpdatedAtStage sourceSlug(String sourceSlug) {
            this.sourceSlug = sourceSlug;
            return this;
        }

        @Override
        @JsonSetter("updated_at")
        public _FinalStage updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public FallbackBirthDate build() {
            return new FallbackBirthDate(value, sourceSlug, updatedAt, additionalProperties);
        }
    }
}
