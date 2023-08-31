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
@JsonDeserialize(builder = ClientFacingActivity.Builder.class)
public final class ClientFacingActivity {
    private final String userId;

    private final String id;

    private final OffsetDateTime date;

    private final String calendarDate;

    private final Optional<Double> caloriesTotal;

    private final Optional<Double> caloriesActive;

    private final Optional<Integer> steps;

    private final Optional<Double> dailyMovement;

    private final Optional<Double> distance;

    private final Optional<Double> low;

    private final Optional<Double> medium;

    private final Optional<Double> high;

    private final ClientFacingSource source;

    private final Optional<Integer> floorsClimbed;

    private final Optional<String> timeZone;

    private final Optional<Integer> timezoneOffset;

    private final Optional<ClientFacingHeartRate> heartRate;

    private ClientFacingActivity(
            String userId,
            String id,
            OffsetDateTime date,
            String calendarDate,
            Optional<Double> caloriesTotal,
            Optional<Double> caloriesActive,
            Optional<Integer> steps,
            Optional<Double> dailyMovement,
            Optional<Double> distance,
            Optional<Double> low,
            Optional<Double> medium,
            Optional<Double> high,
            ClientFacingSource source,
            Optional<Integer> floorsClimbed,
            Optional<String> timeZone,
            Optional<Integer> timezoneOffset,
            Optional<ClientFacingHeartRate> heartRate) {
        this.userId = userId;
        this.id = id;
        this.date = date;
        this.calendarDate = calendarDate;
        this.caloriesTotal = caloriesTotal;
        this.caloriesActive = caloriesActive;
        this.steps = steps;
        this.dailyMovement = dailyMovement;
        this.distance = distance;
        this.low = low;
        this.medium = medium;
        this.high = high;
        this.source = source;
        this.floorsClimbed = floorsClimbed;
        this.timeZone = timeZone;
        this.timezoneOffset = timezoneOffset;
        this.heartRate = heartRate;
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
     * @return Total energy consumption during the day including Basal Metabolic Rate in kilocalories::kilocalories
     */
    @JsonProperty("calories_total")
    public Optional<Double> getCaloriesTotal() {
        return caloriesTotal;
    }

    /**
     * @return Energy consumption caused by the physical activity of the day in kilocalories::kilocalories
     */
    @JsonProperty("calories_active")
    public Optional<Double> getCaloriesActive() {
        return caloriesActive;
    }

    /**
     * @return Total number of steps registered during the day::steps
     */
    @JsonProperty("steps")
    public Optional<Integer> getSteps() {
        return steps;
    }

    /**
     * @return Deprecated. Daily physical activity as equal meters i.e. amount of walking needed to get the same amount of activity::meters
     */
    @JsonProperty("daily_movement")
    public Optional<Double> getDailyMovement() {
        return dailyMovement;
    }

    /**
     * @return Cumulated distance for exercise
     */
    @JsonProperty("distance")
    public Optional<Double> getDistance() {
        return distance;
    }

    /**
     * @return Number of minutes during the day with low intensity activity (e.g. household work)::minutes
     */
    @JsonProperty("low")
    public Optional<Double> getLow() {
        return low;
    }

    /**
     * @return Number of minutes during the day with medium intensity activity (e.g. walking)::minutes
     */
    @JsonProperty("medium")
    public Optional<Double> getMedium() {
        return medium;
    }

    /**
     * @return Number of minutes during the day with high intensity activity (e.g. running)::minutes
     */
    @JsonProperty("high")
    public Optional<Double> getHigh() {
        return high;
    }

    /**
     * @return Source the data has come from.
     */
    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    /**
     * @return Number of floors climbed by the user::count
     */
    @JsonProperty("floors_climbed")
    public Optional<Integer> getFloorsClimbed() {
        return floorsClimbed;
    }

    /**
     * @return [DEPRECATED] The time zone full identifier for the data. Example: 'Europe/London'.
     */
    @JsonProperty("time_zone")
    public Optional<String> getTimeZone() {
        return timeZone;
    }

    /**
     * @return Timezone offset from UTC as seconds. For example, EEST (Eastern European Summer Time, +3h) is 10800. PST (Pacific Standard Time, -8h) is -28800::seconds
     */
    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @return Heart rate daily summary.
     */
    @JsonProperty("heart_rate")
    public Optional<ClientFacingHeartRate> getHeartRate() {
        return heartRate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingActivity && equalTo((ClientFacingActivity) other);
    }

    private boolean equalTo(ClientFacingActivity other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && date.equals(other.date)
                && calendarDate.equals(other.calendarDate)
                && caloriesTotal.equals(other.caloriesTotal)
                && caloriesActive.equals(other.caloriesActive)
                && steps.equals(other.steps)
                && dailyMovement.equals(other.dailyMovement)
                && distance.equals(other.distance)
                && low.equals(other.low)
                && medium.equals(other.medium)
                && high.equals(other.high)
                && source.equals(other.source)
                && floorsClimbed.equals(other.floorsClimbed)
                && timeZone.equals(other.timeZone)
                && timezoneOffset.equals(other.timezoneOffset)
                && heartRate.equals(other.heartRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.id,
                this.date,
                this.calendarDate,
                this.caloriesTotal,
                this.caloriesActive,
                this.steps,
                this.dailyMovement,
                this.distance,
                this.low,
                this.medium,
                this.high,
                this.source,
                this.floorsClimbed,
                this.timeZone,
                this.timezoneOffset,
                this.heartRate);
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

        Builder from(ClientFacingActivity other);
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
        ClientFacingActivity build();

        _FinalStage caloriesTotal(Optional<Double> caloriesTotal);

        _FinalStage caloriesTotal(Double caloriesTotal);

        _FinalStage caloriesActive(Optional<Double> caloriesActive);

        _FinalStage caloriesActive(Double caloriesActive);

        _FinalStage steps(Optional<Integer> steps);

        _FinalStage steps(Integer steps);

        _FinalStage dailyMovement(Optional<Double> dailyMovement);

        _FinalStage dailyMovement(Double dailyMovement);

        _FinalStage distance(Optional<Double> distance);

        _FinalStage distance(Double distance);

        _FinalStage low(Optional<Double> low);

        _FinalStage low(Double low);

        _FinalStage medium(Optional<Double> medium);

        _FinalStage medium(Double medium);

        _FinalStage high(Optional<Double> high);

        _FinalStage high(Double high);

        _FinalStage floorsClimbed(Optional<Integer> floorsClimbed);

        _FinalStage floorsClimbed(Integer floorsClimbed);

        _FinalStage timeZone(Optional<String> timeZone);

        _FinalStage timeZone(String timeZone);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage heartRate(Optional<ClientFacingHeartRate> heartRate);

        _FinalStage heartRate(ClientFacingHeartRate heartRate);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage, IdStage, DateStage, CalendarDateStage, SourceStage, _FinalStage {
        private String userId;

        private String id;

        private OffsetDateTime date;

        private String calendarDate;

        private ClientFacingSource source;

        private Optional<ClientFacingHeartRate> heartRate = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<String> timeZone = Optional.empty();

        private Optional<Integer> floorsClimbed = Optional.empty();

        private Optional<Double> high = Optional.empty();

        private Optional<Double> medium = Optional.empty();

        private Optional<Double> low = Optional.empty();

        private Optional<Double> distance = Optional.empty();

        private Optional<Double> dailyMovement = Optional.empty();

        private Optional<Integer> steps = Optional.empty();

        private Optional<Double> caloriesActive = Optional.empty();

        private Optional<Double> caloriesTotal = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingActivity other) {
            userId(other.getUserId());
            id(other.getId());
            date(other.getDate());
            calendarDate(other.getCalendarDate());
            caloriesTotal(other.getCaloriesTotal());
            caloriesActive(other.getCaloriesActive());
            steps(other.getSteps());
            dailyMovement(other.getDailyMovement());
            distance(other.getDistance());
            low(other.getLow());
            medium(other.getMedium());
            high(other.getHigh());
            source(other.getSource());
            floorsClimbed(other.getFloorsClimbed());
            timeZone(other.getTimeZone());
            timezoneOffset(other.getTimezoneOffset());
            heartRate(other.getHeartRate());
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

        /**
         * <p>Source the data has come from.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingSource source) {
            this.source = source;
            return this;
        }

        /**
         * <p>Heart rate daily summary.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage heartRate(ClientFacingHeartRate heartRate) {
            this.heartRate = Optional.of(heartRate);
            return this;
        }

        @Override
        @JsonSetter(value = "heart_rate", nulls = Nulls.SKIP)
        public _FinalStage heartRate(Optional<ClientFacingHeartRate> heartRate) {
            this.heartRate = heartRate;
            return this;
        }

        /**
         * <p>Timezone offset from UTC as seconds. For example, EEST (Eastern European Summer Time, +3h) is 10800. PST (Pacific Standard Time, -8h) is -28800::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage timezoneOffset(Integer timezoneOffset) {
            this.timezoneOffset = Optional.of(timezoneOffset);
            return this;
        }

        @Override
        @JsonSetter(value = "timezone_offset", nulls = Nulls.SKIP)
        public _FinalStage timezoneOffset(Optional<Integer> timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
         * <p>[DEPRECATED] The time zone full identifier for the data. Example: 'Europe/London'.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage timeZone(String timeZone) {
            this.timeZone = Optional.of(timeZone);
            return this;
        }

        @Override
        @JsonSetter(value = "time_zone", nulls = Nulls.SKIP)
        public _FinalStage timeZone(Optional<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>Number of floors climbed by the user::count</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage floorsClimbed(Integer floorsClimbed) {
            this.floorsClimbed = Optional.of(floorsClimbed);
            return this;
        }

        @Override
        @JsonSetter(value = "floors_climbed", nulls = Nulls.SKIP)
        public _FinalStage floorsClimbed(Optional<Integer> floorsClimbed) {
            this.floorsClimbed = floorsClimbed;
            return this;
        }

        /**
         * <p>Number of minutes during the day with high intensity activity (e.g. running)::minutes</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage high(Double high) {
            this.high = Optional.of(high);
            return this;
        }

        @Override
        @JsonSetter(value = "high", nulls = Nulls.SKIP)
        public _FinalStage high(Optional<Double> high) {
            this.high = high;
            return this;
        }

        /**
         * <p>Number of minutes during the day with medium intensity activity (e.g. walking)::minutes</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage medium(Double medium) {
            this.medium = Optional.of(medium);
            return this;
        }

        @Override
        @JsonSetter(value = "medium", nulls = Nulls.SKIP)
        public _FinalStage medium(Optional<Double> medium) {
            this.medium = medium;
            return this;
        }

        /**
         * <p>Number of minutes during the day with low intensity activity (e.g. household work)::minutes</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage low(Double low) {
            this.low = Optional.of(low);
            return this;
        }

        @Override
        @JsonSetter(value = "low", nulls = Nulls.SKIP)
        public _FinalStage low(Optional<Double> low) {
            this.low = low;
            return this;
        }

        /**
         * <p>Cumulated distance for exercise</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage distance(Double distance) {
            this.distance = Optional.of(distance);
            return this;
        }

        @Override
        @JsonSetter(value = "distance", nulls = Nulls.SKIP)
        public _FinalStage distance(Optional<Double> distance) {
            this.distance = distance;
            return this;
        }

        /**
         * <p>Deprecated. Daily physical activity as equal meters i.e. amount of walking needed to get the same amount of activity::meters</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage dailyMovement(Double dailyMovement) {
            this.dailyMovement = Optional.of(dailyMovement);
            return this;
        }

        @Override
        @JsonSetter(value = "daily_movement", nulls = Nulls.SKIP)
        public _FinalStage dailyMovement(Optional<Double> dailyMovement) {
            this.dailyMovement = dailyMovement;
            return this;
        }

        /**
         * <p>Total number of steps registered during the day::steps</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage steps(Integer steps) {
            this.steps = Optional.of(steps);
            return this;
        }

        @Override
        @JsonSetter(value = "steps", nulls = Nulls.SKIP)
        public _FinalStage steps(Optional<Integer> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * <p>Energy consumption caused by the physical activity of the day in kilocalories::kilocalories</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage caloriesActive(Double caloriesActive) {
            this.caloriesActive = Optional.of(caloriesActive);
            return this;
        }

        @Override
        @JsonSetter(value = "calories_active", nulls = Nulls.SKIP)
        public _FinalStage caloriesActive(Optional<Double> caloriesActive) {
            this.caloriesActive = caloriesActive;
            return this;
        }

        /**
         * <p>Total energy consumption during the day including Basal Metabolic Rate in kilocalories::kilocalories</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage caloriesTotal(Double caloriesTotal) {
            this.caloriesTotal = Optional.of(caloriesTotal);
            return this;
        }

        @Override
        @JsonSetter(value = "calories_total", nulls = Nulls.SKIP)
        public _FinalStage caloriesTotal(Optional<Double> caloriesTotal) {
            this.caloriesTotal = caloriesTotal;
            return this;
        }

        @Override
        public ClientFacingActivity build() {
            return new ClientFacingActivity(
                    userId,
                    id,
                    date,
                    calendarDate,
                    caloriesTotal,
                    caloriesActive,
                    steps,
                    dailyMovement,
                    distance,
                    low,
                    medium,
                    high,
                    source,
                    floorsClimbed,
                    timeZone,
                    timezoneOffset,
                    heartRate);
        }
    }
}
