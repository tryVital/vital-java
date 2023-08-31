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
@JsonDeserialize(builder = ConnectedSourceClientFacing.Builder.class)
public final class ConnectedSourceClientFacing {
    private final ClientFacingSource source;

    private final OffsetDateTime createdOn;

    private ConnectedSourceClientFacing(ClientFacingSource source, OffsetDateTime createdOn) {
        this.source = source;
        this.createdOn = createdOn;
    }

    /**
     * @return Source the data has come from.
     */
    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    /**
     * @return When your item is created
     */
    @JsonProperty("created_on")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedSourceClientFacing && equalTo((ConnectedSourceClientFacing) other);
    }

    private boolean equalTo(ConnectedSourceClientFacing other) {
        return source.equals(other.source) && createdOn.equals(other.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.source, this.createdOn);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourceStage builder() {
        return new Builder();
    }

    public interface SourceStage {
        CreatedOnStage source(ClientFacingSource source);

        Builder from(ConnectedSourceClientFacing other);
    }

    public interface CreatedOnStage {
        _FinalStage createdOn(OffsetDateTime createdOn);
    }

    public interface _FinalStage {
        ConnectedSourceClientFacing build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, CreatedOnStage, _FinalStage {
        private ClientFacingSource source;

        private OffsetDateTime createdOn;

        private Builder() {}

        @Override
        public Builder from(ConnectedSourceClientFacing other) {
            source(other.getSource());
            createdOn(other.getCreatedOn());
            return this;
        }

        /**
         * <p>Source the data has come from.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("source")
        public CreatedOnStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        /**
         * <p>When your item is created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("created_on")
        public _FinalStage createdOn(OffsetDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        @Override
        public ConnectedSourceClientFacing build() {
            return new ConnectedSourceClientFacing(source, createdOn);
        }
    }
}
