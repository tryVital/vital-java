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
@JsonDeserialize(builder = RawActivity.Builder.class)
public final class RawActivity {
    private final List<ActivityV2InDb> activity;

    private RawActivity(List<ActivityV2InDb> activity) {
        this.activity = activity;
    }

    @JsonProperty("activity")
    public List<ActivityV2InDb> getActivity() {
        return activity;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RawActivity && equalTo((RawActivity) other);
    }

    private boolean equalTo(RawActivity other) {
        return activity.equals(other.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.activity);
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
        private List<ActivityV2InDb> activity = new ArrayList<>();

        private Builder() {}

        public Builder from(RawActivity other) {
            activity(other.getActivity());
            return this;
        }

        @JsonSetter(value = "activity", nulls = Nulls.SKIP)
        public Builder activity(List<ActivityV2InDb> activity) {
            this.activity.clear();
            this.activity.addAll(activity);
            return this;
        }

        public Builder addActivity(ActivityV2InDb activity) {
            this.activity.add(activity);
            return this;
        }

        public Builder addAllActivity(List<ActivityV2InDb> activity) {
            this.activity.addAll(activity);
            return this;
        }

        public RawActivity build() {
            return new RawActivity(activity);
        }
    }
}