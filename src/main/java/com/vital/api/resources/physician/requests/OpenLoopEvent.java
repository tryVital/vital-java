package com.vital.api.resources.physician.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.OpenLoopResourceIdType;
import com.vital.api.types.OpenLoopWebhookType;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OpenLoopEvent.Builder.class)
public final class OpenLoopEvent {
    private final String resourceId;

    private final OpenLoopResourceIdType resourceIdType;

    private final OpenLoopWebhookType eventType;

    private OpenLoopEvent(String resourceId, OpenLoopResourceIdType resourceIdType, OpenLoopWebhookType eventType) {
        this.resourceId = resourceId;
        this.resourceIdType = resourceIdType;
        this.eventType = eventType;
    }

    @JsonProperty("resource_id")
    public String getResourceId() {
        return resourceId;
    }

    @JsonProperty("resource_id_type")
    public OpenLoopResourceIdType getResourceIdType() {
        return resourceIdType;
    }

    @JsonProperty("event_type")
    public OpenLoopWebhookType getEventType() {
        return eventType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OpenLoopEvent && equalTo((OpenLoopEvent) other);
    }

    private boolean equalTo(OpenLoopEvent other) {
        return resourceId.equals(other.resourceId)
                && resourceIdType.equals(other.resourceIdType)
                && eventType.equals(other.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.resourceId, this.resourceIdType, this.eventType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ResourceIdStage builder() {
        return new Builder();
    }

    public interface ResourceIdStage {
        ResourceIdTypeStage resourceId(String resourceId);

        Builder from(OpenLoopEvent other);
    }

    public interface ResourceIdTypeStage {
        EventTypeStage resourceIdType(OpenLoopResourceIdType resourceIdType);
    }

    public interface EventTypeStage {
        _FinalStage eventType(OpenLoopWebhookType eventType);
    }

    public interface _FinalStage {
        OpenLoopEvent build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ResourceIdStage, ResourceIdTypeStage, EventTypeStage, _FinalStage {
        private String resourceId;

        private OpenLoopResourceIdType resourceIdType;

        private OpenLoopWebhookType eventType;

        private Builder() {}

        @Override
        public Builder from(OpenLoopEvent other) {
            resourceId(other.getResourceId());
            resourceIdType(other.getResourceIdType());
            eventType(other.getEventType());
            return this;
        }

        @Override
        @JsonSetter("resource_id")
        public ResourceIdTypeStage resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        @Override
        @JsonSetter("resource_id_type")
        public EventTypeStage resourceIdType(OpenLoopResourceIdType resourceIdType) {
            this.resourceIdType = resourceIdType;
            return this;
        }

        @Override
        @JsonSetter("event_type")
        public _FinalStage eventType(OpenLoopWebhookType eventType) {
            this.eventType = eventType;
            return this;
        }

        @Override
        public OpenLoopEvent build() {
            return new OpenLoopEvent(resourceId, resourceIdType, eventType);
        }
    }
}
