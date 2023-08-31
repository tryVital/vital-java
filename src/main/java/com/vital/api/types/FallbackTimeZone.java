package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FallbackTimeZone.Builder.class)
public final class FallbackTimeZone {
    private final String id;

    private final String sourceSlug;

    private final OffsetDateTime updatedAt;

    private FallbackTimeZone(String id, String sourceSlug, OffsetDateTime updatedAt) {
        this.id = id;
        this.sourceSlug = sourceSlug;
        this.updatedAt = updatedAt;
    }

    /**
     * @return Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
     * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Slug for designated source
     */
    @JsonProperty("source_slug")
    public String getSourceSlug() {
        return sourceSlug;
    }

    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackTimeZone && equalTo((FallbackTimeZone) other);
    }

    private boolean equalTo(FallbackTimeZone other) {
        return id.equals(other.id) && sourceSlug.equals(other.sourceSlug) && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.sourceSlug, this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SourceSlugStage id(String id);

        Builder from(FallbackTimeZone other);
    }

    public interface SourceSlugStage {
        UpdatedAtStage sourceSlug(String sourceSlug);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        FallbackTimeZone build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, SourceSlugStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String sourceSlug;

        private OffsetDateTime updatedAt;

        private Builder() {}

        @Override
        public Builder from(FallbackTimeZone other) {
            id(other.getId());
            sourceSlug(other.getSourceSlug());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., <code>Europe/London</code> or <code>America/Los_Angeles</code>).
         * Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public SourceSlugStage id(String id) {
            this.id = id;
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
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public FallbackTimeZone build() {
            return new FallbackTimeZone(id, sourceSlug, updatedAt);
        }
    }
}
