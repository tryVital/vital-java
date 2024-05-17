/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.labtests.requests;

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
@JsonDeserialize(builder = LabTestsGetLabelsPdfRequest.Builder.class)
public final class LabTestsGetLabelsPdfRequest {
    private final Optional<Integer> numberOfLabels;

    private final Optional<OffsetDateTime> collectionDate;

    private final Map<String, Object> additionalProperties;

    private LabTestsGetLabelsPdfRequest(
            Optional<Integer> numberOfLabels,
            Optional<OffsetDateTime> collectionDate,
            Map<String, Object> additionalProperties) {
        this.numberOfLabels = numberOfLabels;
        this.collectionDate = collectionDate;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of labels to generate
     */
    @JsonProperty("number_of_labels")
    public Optional<Integer> getNumberOfLabels() {
        return numberOfLabels;
    }

    /**
     * @return Collection date
     */
    @JsonProperty("collection_date")
    public Optional<OffsetDateTime> getCollectionDate() {
        return collectionDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LabTestsGetLabelsPdfRequest && equalTo((LabTestsGetLabelsPdfRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LabTestsGetLabelsPdfRequest other) {
        return numberOfLabels.equals(other.numberOfLabels) && collectionDate.equals(other.collectionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numberOfLabels, this.collectionDate);
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
        private Optional<Integer> numberOfLabels = Optional.empty();

        private Optional<OffsetDateTime> collectionDate = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LabTestsGetLabelsPdfRequest other) {
            numberOfLabels(other.getNumberOfLabels());
            collectionDate(other.getCollectionDate());
            return this;
        }

        @JsonSetter(value = "number_of_labels", nulls = Nulls.SKIP)
        public Builder numberOfLabels(Optional<Integer> numberOfLabels) {
            this.numberOfLabels = numberOfLabels;
            return this;
        }

        public Builder numberOfLabels(Integer numberOfLabels) {
            this.numberOfLabels = Optional.of(numberOfLabels);
            return this;
        }

        @JsonSetter(value = "collection_date", nulls = Nulls.SKIP)
        public Builder collectionDate(Optional<OffsetDateTime> collectionDate) {
            this.collectionDate = collectionDate;
            return this;
        }

        public Builder collectionDate(OffsetDateTime collectionDate) {
            this.collectionDate = Optional.of(collectionDate);
            return this;
        }

        public LabTestsGetLabelsPdfRequest build() {
            return new LabTestsGetLabelsPdfRequest(numberOfLabels, collectionDate, additionalProperties);
        }
    }
}
