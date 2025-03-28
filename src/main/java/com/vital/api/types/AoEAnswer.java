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
@JsonDeserialize(builder = AoEAnswer.Builder.class)
public final class AoEAnswer {
    private final int markerId;

    private final int questionId;

    private final String answer;

    private final Map<String, Object> additionalProperties;

    private AoEAnswer(int markerId, int questionId, String answer, Map<String, Object> additionalProperties) {
        this.markerId = markerId;
        this.questionId = questionId;
        this.answer = answer;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("marker_id")
    public int getMarkerId() {
        return markerId;
    }

    @JsonProperty("question_id")
    public int getQuestionId() {
        return questionId;
    }

    @JsonProperty("answer")
    public String getAnswer() {
        return answer;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AoEAnswer && equalTo((AoEAnswer) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AoEAnswer other) {
        return markerId == other.markerId && questionId == other.questionId && answer.equals(other.answer);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.markerId, this.questionId, this.answer);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MarkerIdStage builder() {
        return new Builder();
    }

    public interface MarkerIdStage {
        QuestionIdStage markerId(int markerId);

        Builder from(AoEAnswer other);
    }

    public interface QuestionIdStage {
        AnswerStage questionId(int questionId);
    }

    public interface AnswerStage {
        _FinalStage answer(String answer);
    }

    public interface _FinalStage {
        AoEAnswer build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MarkerIdStage, QuestionIdStage, AnswerStage, _FinalStage {
        private int markerId;

        private int questionId;

        private String answer;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AoEAnswer other) {
            markerId(other.getMarkerId());
            questionId(other.getQuestionId());
            answer(other.getAnswer());
            return this;
        }

        @java.lang.Override
        @JsonSetter("marker_id")
        public QuestionIdStage markerId(int markerId) {
            this.markerId = markerId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("question_id")
        public AnswerStage questionId(int questionId) {
            this.questionId = questionId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("answer")
        public _FinalStage answer(String answer) {
            this.answer = answer;
            return this;
        }

        @java.lang.Override
        public AoEAnswer build() {
            return new AoEAnswer(markerId, questionId, answer, additionalProperties);
        }
    }
}
