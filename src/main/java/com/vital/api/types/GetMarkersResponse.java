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
@JsonDeserialize(builder = GetMarkersResponse.Builder.class)
public final class GetMarkersResponse {
    private final List<ClientFacingMarker> markers;

    private final int total;

    private final int page;

    private final int size;

    private GetMarkersResponse(List<ClientFacingMarker> markers, int total, int page, int size) {
        this.markers = markers;
        this.total = total;
        this.page = page;
        this.size = size;
    }

    @JsonProperty("markers")
    public List<ClientFacingMarker> getMarkers() {
        return markers;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetMarkersResponse && equalTo((GetMarkersResponse) other);
    }

    private boolean equalTo(GetMarkersResponse other) {
        return markers.equals(other.markers) && total == other.total && page == other.page && size == other.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.markers, this.total, this.page, this.size);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalStage builder() {
        return new Builder();
    }

    public interface TotalStage {
        PageStage total(int total);

        Builder from(GetMarkersResponse other);
    }

    public interface PageStage {
        SizeStage page(int page);
    }

    public interface SizeStage {
        _FinalStage size(int size);
    }

    public interface _FinalStage {
        GetMarkersResponse build();

        _FinalStage markers(List<ClientFacingMarker> markers);

        _FinalStage addMarkers(ClientFacingMarker markers);

        _FinalStage addAllMarkers(List<ClientFacingMarker> markers);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalStage, PageStage, SizeStage, _FinalStage {
        private int total;

        private int page;

        private int size;

        private List<ClientFacingMarker> markers = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(GetMarkersResponse other) {
            markers(other.getMarkers());
            total(other.getTotal());
            page(other.getPage());
            size(other.getSize());
            return this;
        }

        @Override
        @JsonSetter("total")
        public PageStage total(int total) {
            this.total = total;
            return this;
        }

        @Override
        @JsonSetter("page")
        public SizeStage page(int page) {
            this.page = page;
            return this;
        }

        @Override
        @JsonSetter("size")
        public _FinalStage size(int size) {
            this.size = size;
            return this;
        }

        @Override
        public _FinalStage addAllMarkers(List<ClientFacingMarker> markers) {
            this.markers.addAll(markers);
            return this;
        }

        @Override
        public _FinalStage addMarkers(ClientFacingMarker markers) {
            this.markers.add(markers);
            return this;
        }

        @Override
        @JsonSetter(value = "markers", nulls = Nulls.SKIP)
        public _FinalStage markers(List<ClientFacingMarker> markers) {
            this.markers.clear();
            this.markers.addAll(markers);
            return this;
        }

        @Override
        public GetMarkersResponse build() {
            return new GetMarkersResponse(markers, total, page, size);
        }
    }
}