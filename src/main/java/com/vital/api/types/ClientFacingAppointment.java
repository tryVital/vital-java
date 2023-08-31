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
@JsonDeserialize(builder = ClientFacingAppointment.Builder.class)
public final class ClientFacingAppointment {
    private final String id;

    private final String userId;

    private final UsAddress address;

    private final LngLat location;

    private final OffsetDateTime startAt;

    private final OffsetDateTime endAt;

    private final String ianaTimezone;

    private final String type;

    private final AppointmentProvider provider;

    private final AppointmentStatus status;

    private final String providerId;

    private final boolean canReschedule;

    private ClientFacingAppointment(
            String id,
            String userId,
            UsAddress address,
            LngLat location,
            OffsetDateTime startAt,
            OffsetDateTime endAt,
            String ianaTimezone,
            String type,
            AppointmentProvider provider,
            AppointmentStatus status,
            String providerId,
            boolean canReschedule) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.location = location;
        this.startAt = startAt;
        this.endAt = endAt;
        this.ianaTimezone = ianaTimezone;
        this.type = type;
        this.provider = provider;
        this.status = status;
        this.providerId = providerId;
        this.canReschedule = canReschedule;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("address")
    public UsAddress getAddress() {
        return address;
    }

    @JsonProperty("location")
    public LngLat getLocation() {
        return location;
    }

    @JsonProperty("start_at")
    public OffsetDateTime getStartAt() {
        return startAt;
    }

    @JsonProperty("end_at")
    public OffsetDateTime getEndAt() {
        return endAt;
    }

    @JsonProperty("iana_timezone")
    public String getIanaTimezone() {
        return ianaTimezone;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("provider")
    public AppointmentProvider getProvider() {
        return provider;
    }

    @JsonProperty("status")
    public AppointmentStatus getStatus() {
        return status;
    }

    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("can_reschedule")
    public boolean getCanReschedule() {
        return canReschedule;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingAppointment && equalTo((ClientFacingAppointment) other);
    }

    private boolean equalTo(ClientFacingAppointment other) {
        return id.equals(other.id)
                && userId.equals(other.userId)
                && address.equals(other.address)
                && location.equals(other.location)
                && startAt.equals(other.startAt)
                && endAt.equals(other.endAt)
                && ianaTimezone.equals(other.ianaTimezone)
                && type.equals(other.type)
                && provider.equals(other.provider)
                && status.equals(other.status)
                && providerId.equals(other.providerId)
                && canReschedule == other.canReschedule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.userId,
                this.address,
                this.location,
                this.startAt,
                this.endAt,
                this.ianaTimezone,
                this.type,
                this.provider,
                this.status,
                this.providerId,
                this.canReschedule);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        UserIdStage id(String id);

        Builder from(ClientFacingAppointment other);
    }

    public interface UserIdStage {
        AddressStage userId(String userId);
    }

    public interface AddressStage {
        LocationStage address(UsAddress address);
    }

    public interface LocationStage {
        StartAtStage location(LngLat location);
    }

    public interface StartAtStage {
        EndAtStage startAt(OffsetDateTime startAt);
    }

    public interface EndAtStage {
        IanaTimezoneStage endAt(OffsetDateTime endAt);
    }

    public interface IanaTimezoneStage {
        TypeStage ianaTimezone(String ianaTimezone);
    }

    public interface TypeStage {
        ProviderStage type(String type);
    }

    public interface ProviderStage {
        StatusStage provider(AppointmentProvider provider);
    }

    public interface StatusStage {
        ProviderIdStage status(AppointmentStatus status);
    }

    public interface ProviderIdStage {
        CanRescheduleStage providerId(String providerId);
    }

    public interface CanRescheduleStage {
        _FinalStage canReschedule(boolean canReschedule);
    }

    public interface _FinalStage {
        ClientFacingAppointment build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    UserIdStage,
                    AddressStage,
                    LocationStage,
                    StartAtStage,
                    EndAtStage,
                    IanaTimezoneStage,
                    TypeStage,
                    ProviderStage,
                    StatusStage,
                    ProviderIdStage,
                    CanRescheduleStage,
                    _FinalStage {
        private String id;

        private String userId;

        private UsAddress address;

        private LngLat location;

        private OffsetDateTime startAt;

        private OffsetDateTime endAt;

        private String ianaTimezone;

        private String type;

        private AppointmentProvider provider;

        private AppointmentStatus status;

        private String providerId;

        private boolean canReschedule;

        private Builder() {}

        @Override
        public Builder from(ClientFacingAppointment other) {
            id(other.getId());
            userId(other.getUserId());
            address(other.getAddress());
            location(other.getLocation());
            startAt(other.getStartAt());
            endAt(other.getEndAt());
            ianaTimezone(other.getIanaTimezone());
            type(other.getType());
            provider(other.getProvider());
            status(other.getStatus());
            providerId(other.getProviderId());
            canReschedule(other.getCanReschedule());
            return this;
        }

        @Override
        @JsonSetter("id")
        public UserIdStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public AddressStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("address")
        public LocationStage address(UsAddress address) {
            this.address = address;
            return this;
        }

        @Override
        @JsonSetter("location")
        public StartAtStage location(LngLat location) {
            this.location = location;
            return this;
        }

        @Override
        @JsonSetter("start_at")
        public EndAtStage startAt(OffsetDateTime startAt) {
            this.startAt = startAt;
            return this;
        }

        @Override
        @JsonSetter("end_at")
        public IanaTimezoneStage endAt(OffsetDateTime endAt) {
            this.endAt = endAt;
            return this;
        }

        @Override
        @JsonSetter("iana_timezone")
        public TypeStage ianaTimezone(String ianaTimezone) {
            this.ianaTimezone = ianaTimezone;
            return this;
        }

        @Override
        @JsonSetter("type")
        public ProviderStage type(String type) {
            this.type = type;
            return this;
        }

        @Override
        @JsonSetter("provider")
        public StatusStage provider(AppointmentProvider provider) {
            this.provider = provider;
            return this;
        }

        @Override
        @JsonSetter("status")
        public ProviderIdStage status(AppointmentStatus status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("provider_id")
        public CanRescheduleStage providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        @Override
        @JsonSetter("can_reschedule")
        public _FinalStage canReschedule(boolean canReschedule) {
            this.canReschedule = canReschedule;
            return this;
        }

        @Override
        public ClientFacingAppointment build() {
            return new ClientFacingAppointment(
                    id,
                    userId,
                    address,
                    location,
                    startAt,
                    endAt,
                    ianaTimezone,
                    type,
                    provider,
                    status,
                    providerId,
                    canReschedule);
        }
    }
}
