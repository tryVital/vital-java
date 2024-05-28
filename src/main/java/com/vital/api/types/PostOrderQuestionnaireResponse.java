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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PostOrderQuestionnaireResponse.Builder.class)
public final class PostOrderQuestionnaireResponse {
    private final String resourceType;

    private final String questionnaire;

    private final String status;

    private final List<QuestionaryItem> item;

    private final Map<String, Object> additionalProperties;

    private PostOrderQuestionnaireResponse(
            String resourceType,
            String questionnaire,
            String status,
            List<QuestionaryItem> item,
            Map<String, Object> additionalProperties) {
        this.resourceType = resourceType;
        this.questionnaire = questionnaire;
        this.status = status;
        this.item = item;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("questionnaire")
    public String getQuestionnaire() {
        return questionnaire;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("item")
    public List<QuestionaryItem> getItem() {
        return item;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PostOrderQuestionnaireResponse && equalTo((PostOrderQuestionnaireResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PostOrderQuestionnaireResponse other) {
        return resourceType.equals(other.resourceType)
                && questionnaire.equals(other.questionnaire)
                && status.equals(other.status)
                && item.equals(other.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.resourceType, this.questionnaire, this.status, this.item);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ResourceTypeStage builder() {
        return new Builder();
    }

    public interface ResourceTypeStage {
        QuestionnaireStage resourceType(String resourceType);

        Builder from(PostOrderQuestionnaireResponse other);
    }

    public interface QuestionnaireStage {
        StatusStage questionnaire(String questionnaire);
    }

    public interface StatusStage {
        _FinalStage status(String status);
    }

    public interface _FinalStage {
        PostOrderQuestionnaireResponse build();

        _FinalStage item(List<QuestionaryItem> item);

        _FinalStage addItem(QuestionaryItem item);

        _FinalStage addAllItem(List<QuestionaryItem> item);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ResourceTypeStage, QuestionnaireStage, StatusStage, _FinalStage {
        private String resourceType;

        private String questionnaire;

        private String status;

        private List<QuestionaryItem> item = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(PostOrderQuestionnaireResponse other) {
            resourceType(other.getResourceType());
            questionnaire(other.getQuestionnaire());
            status(other.getStatus());
            item(other.getItem());
            return this;
        }

        @Override
        @JsonSetter("resourceType")
        public QuestionnaireStage resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        @Override
        @JsonSetter("questionnaire")
        public StatusStage questionnaire(String questionnaire) {
            this.questionnaire = questionnaire;
            return this;
        }

        @Override
        @JsonSetter("status")
        public _FinalStage status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public _FinalStage addAllItem(List<QuestionaryItem> item) {
            this.item.addAll(item);
            return this;
        }

        @Override
        public _FinalStage addItem(QuestionaryItem item) {
            this.item.add(item);
            return this;
        }

        @Override
        @JsonSetter(value = "item", nulls = Nulls.SKIP)
        public _FinalStage item(List<QuestionaryItem> item) {
            this.item.clear();
            this.item.addAll(item);
            return this;
        }

        @Override
        public PostOrderQuestionnaireResponse build() {
            return new PostOrderQuestionnaireResponse(resourceType, questionnaire, status, item, additionalProperties);
        }
    }
}
