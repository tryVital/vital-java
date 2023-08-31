package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Png.Builder.class)
public final class Png {
    private final String content;

    private Png(String content) {
        this.content = content;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Png && equalTo((Png) other);
    }

    private boolean equalTo(Png other) {
        return content.equals(other.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.content);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(String content);

        Builder from(Png other);
    }

    public interface _FinalStage {
        Png build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private String content;

        private Builder() {}

        @Override
        public Builder from(Png other) {
            content(other.getContent());
            return this;
        }

        @Override
        @JsonSetter("content")
        public _FinalStage content(String content) {
            this.content = content;
            return this;
        }

        @Override
        public Png build() {
            return new Png(content);
        }
    }
}
