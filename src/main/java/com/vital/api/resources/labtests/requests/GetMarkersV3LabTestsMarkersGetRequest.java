package com.vital.api.resources.labtests.requests;

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
@JsonDeserialize(builder = GetMarkersV3LabTestsMarkersGetRequest.Builder.class)
public final class GetMarkersV3LabTestsMarkersGetRequest {
    private final Optional<Integer> labId;

    private final Optional<String> name;

    private final Optional<Integer> page;

    private final Optional<Integer> size;

    private GetMarkersV3LabTestsMarkersGetRequest(
            Optional<Integer> labId, Optional<String> name, Optional<Integer> page, Optional<Integer> size) {
        this.labId = labId;
        this.name = name;
        this.page = page;
        this.size = size;
    }

    /**
     * @return The identifier Vital assigned to a lab partner.
     */
    @JsonProperty("lab_id")
    public Optional<Integer> getLabId() {
        return labId;
    }

    /**
     * @return The name of an individual biomarker or a panel. Used as a fuzzy filter when searching markers.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("page")
    public Optional<Integer> getPage() {
        return page;
    }

    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetMarkersV3LabTestsMarkersGetRequest
                && equalTo((GetMarkersV3LabTestsMarkersGetRequest) other);
    }

    private boolean equalTo(GetMarkersV3LabTestsMarkersGetRequest other) {
        return labId.equals(other.labId)
                && name.equals(other.name)
                && page.equals(other.page)
                && size.equals(other.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.labId, this.name, this.page, this.size);
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
        private Optional<Integer> labId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Integer> page = Optional.empty();

        private Optional<Integer> size = Optional.empty();

        private Builder() {}

        public Builder from(GetMarkersV3LabTestsMarkersGetRequest other) {
            labId(other.getLabId());
            name(other.getName());
            page(other.getPage());
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "lab_id", nulls = Nulls.SKIP)
        public Builder labId(Optional<Integer> labId) {
            this.labId = labId;
            return this;
        }

        public Builder labId(Integer labId) {
            this.labId = Optional.of(labId);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "page", nulls = Nulls.SKIP)
        public Builder page(Optional<Integer> page) {
            this.page = page;
            return this;
        }

        public Builder page(Integer page) {
            this.page = Optional.of(page);
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Optional.of(size);
            return this;
        }

        public GetMarkersV3LabTestsMarkersGetRequest build() {
            return new GetMarkersV3LabTestsMarkersGetRequest(labId, name, page, size);
        }
    }
}
