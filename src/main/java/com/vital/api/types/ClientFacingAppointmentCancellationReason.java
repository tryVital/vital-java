package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingAppointmentCancellationReason.Builder.class)
public final class ClientFacingAppointmentCancellationReason {
    private final String id;

    private final String name;

    private final boolean isRefundable;

    private ClientFacingAppointmentCancellationReason(String id, String name, boolean isRefundable) {
        this.id = id;
        this.name = name;
        this.isRefundable = isRefundable;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("is_refundable")
    public boolean getIsRefundable() {
        return isRefundable;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingAppointmentCancellationReason
                && equalTo((ClientFacingAppointmentCancellationReason) other);
    }

    private boolean equalTo(ClientFacingAppointmentCancellationReason other) {
        return id.equals(other.id) && name.equals(other.name) && isRefundable == other.isRefundable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.isRefundable);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(String id);

        Builder from(ClientFacingAppointmentCancellationReason other);
    }

    public interface NameStage {
        IsRefundableStage name(String name);
    }

    public interface IsRefundableStage {
        _FinalStage isRefundable(boolean isRefundable);
    }

    public interface _FinalStage {
        ClientFacingAppointmentCancellationReason build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, NameStage, IsRefundableStage, _FinalStage {
        private String id;

        private String name;

        private boolean isRefundable;

        private Builder() {}

        @Override
        public Builder from(ClientFacingAppointmentCancellationReason other) {
            id(other.getId());
            name(other.getName());
            isRefundable(other.getIsRefundable());
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("name")
        public IsRefundableStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("is_refundable")
        public _FinalStage isRefundable(boolean isRefundable) {
            this.isRefundable = isRefundable;
            return this;
        }

        @Override
        public ClientFacingAppointmentCancellationReason build() {
            return new ClientFacingAppointmentCancellationReason(id, name, isRefundable);
        }
    }
}
