package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingBody.Builder.class)
public final class ClientFacingBody {
    private final String userId;

    private final String id;

    private final OffsetDateTime date;

    private final String calendarDate;

    private final Optional<Double> weight;

    private final Optional<Double> fat;

    private final ClientFacingSource source;

    private ClientFacingBody(
            String userId,
            String id,
            OffsetDateTime date,
            String calendarDate,
            Optional<Double> weight,
            Optional<Double> fat,
            ClientFacingSource source) {
        this.userId = userId;
        this.id = id;
        this.date = date;
        this.calendarDate = calendarDate;
        this.weight = weight;
        this.fat = fat;
        this.source = source;
    }

    /**
     * @return User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Date of the specified record, formatted as ISO8601 datetime string in UTC 00:00. Deprecated in favour of calendar_date.
     */
    @JsonProperty("date")
    public OffsetDateTime getDate() {
        return date;
    }

    /**
     * @return Date of the summary in the YYYY-mm-dd format.
     */
    @JsonProperty("calendar_date")
    public String getCalendarDate() {
        return calendarDate;
    }

    /**
     * @return Weight in kg::kg
     */
    @JsonProperty("weight")
    public Optional<Double> getWeight() {
        return weight;
    }

    /**
     * @return Body fat percentage::perc
     */
    @JsonProperty("fat")
    public Optional<Double> getFat() {
        return fat;
    }

    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingBody && equalTo((ClientFacingBody) other);
    }

    private boolean equalTo(ClientFacingBody other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && date.equals(other.date)
                && calendarDate.equals(other.calendarDate)
                && weight.equals(other.weight)
                && fat.equals(other.fat)
                && source.equals(other.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.id, this.date, this.calendarDate, this.weight, this.fat, this.source);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        IdStage userId(String userId);

        Builder from(ClientFacingBody other);
    }

    public interface IdStage {
        DateStage id(String id);
    }

    public interface DateStage {
        CalendarDateStage date(OffsetDateTime date);
    }

    public interface CalendarDateStage {
        SourceStage calendarDate(String calendarDate);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ClientFacingBody build();

        _FinalStage weight(Optional<Double> weight);

        _FinalStage weight(Double weight);

        _FinalStage fat(Optional<Double> fat);

        _FinalStage fat(Double fat);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, IdStage, DateStage, CalendarDateStage, SourceStage, _FinalStage {
        private String userId;

        private String id;

        private OffsetDateTime date;

        private String calendarDate;

        private ClientFacingSource source;

        private Optional<Double> fat = Optional.empty();

        private Optional<Double> weight = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingBody other) {
            userId(other.getUserId());
            id(other.getId());
            date(other.getDate());
            calendarDate(other.getCalendarDate());
            weight(other.getWeight());
            fat(other.getFat());
            source(other.getSource());
            return this;
        }

        /**
         * <p>User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_id")
        public IdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public DateStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date of the specified record, formatted as ISO8601 datetime string in UTC 00:00. Deprecated in favour of calendar_date.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("date")
        public CalendarDateStage date(OffsetDateTime date) {
            this.date = date;
            return this;
        }

        /**
         * <p>Date of the summary in the YYYY-mm-dd format.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("calendar_date")
        public SourceStage calendarDate(String calendarDate) {
            this.calendarDate = calendarDate;
            return this;
        }

        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        /**
         * <p>Body fat percentage::perc</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fat(Double fat) {
            this.fat = Optional.of(fat);
            return this;
        }

        @Override
        @JsonSetter(value = "fat", nulls = Nulls.SKIP)
        public _FinalStage fat(Optional<Double> fat) {
            this.fat = fat;
            return this;
        }

        /**
         * <p>Weight in kg::kg</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage weight(Double weight) {
            this.weight = Optional.of(weight);
            return this;
        }

        @Override
        @JsonSetter(value = "weight", nulls = Nulls.SKIP)
        public _FinalStage weight(Optional<Double> weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public ClientFacingBody build() {
            return new ClientFacingBody(userId, id, date, calendarDate, weight, fat, source);
        }
    }
}
