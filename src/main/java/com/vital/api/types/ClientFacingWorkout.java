package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingWorkout.Builder.class)
public final class ClientFacingWorkout {
    private final String userId;

    private final String id;

    private final Optional<String> title;

    private final Optional<Integer> timezoneOffset;

    private final Optional<Integer> averageHr;

    private final Optional<Integer> maxHr;

    private final Optional<Double> distance;

    private final String calendarDate;

    private final OffsetDateTime timeStart;

    private final OffsetDateTime timeEnd;

    private final Optional<Double> calories;

    private final Optional<ClientFacingSport> sport;

    private final Optional<List<Integer>> hrZones;

    private final Optional<Integer> movingTime;

    private final Optional<Double> totalElevationGain;

    private final Optional<Double> elevHigh;

    private final Optional<Double> elevLow;

    private final Optional<Double> averageSpeed;

    private final Optional<Double> maxSpeed;

    private final Optional<Double> averageWatts;

    private final Optional<Double> deviceWatts;

    private final Optional<Double> maxWatts;

    private final Optional<Double> weightedAverageWatts;

    private final Optional<Map<String, Object>> map;

    private final String providerId;

    private final ClientFacingSource source;

    private ClientFacingWorkout(
            String userId,
            String id,
            Optional<String> title,
            Optional<Integer> timezoneOffset,
            Optional<Integer> averageHr,
            Optional<Integer> maxHr,
            Optional<Double> distance,
            String calendarDate,
            OffsetDateTime timeStart,
            OffsetDateTime timeEnd,
            Optional<Double> calories,
            Optional<ClientFacingSport> sport,
            Optional<List<Integer>> hrZones,
            Optional<Integer> movingTime,
            Optional<Double> totalElevationGain,
            Optional<Double> elevHigh,
            Optional<Double> elevLow,
            Optional<Double> averageSpeed,
            Optional<Double> maxSpeed,
            Optional<Double> averageWatts,
            Optional<Double> deviceWatts,
            Optional<Double> maxWatts,
            Optional<Double> weightedAverageWatts,
            Optional<Map<String, Object>> map,
            String providerId,
            ClientFacingSource source) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.timezoneOffset = timezoneOffset;
        this.averageHr = averageHr;
        this.maxHr = maxHr;
        this.distance = distance;
        this.calendarDate = calendarDate;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.calories = calories;
        this.sport = sport;
        this.hrZones = hrZones;
        this.movingTime = movingTime;
        this.totalElevationGain = totalElevationGain;
        this.elevHigh = elevHigh;
        this.elevLow = elevLow;
        this.averageSpeed = averageSpeed;
        this.maxSpeed = maxSpeed;
        this.averageWatts = averageWatts;
        this.deviceWatts = deviceWatts;
        this.maxWatts = maxWatts;
        this.weightedAverageWatts = weightedAverageWatts;
        this.map = map;
        this.providerId = providerId;
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
     * @return Title given for the workout
     */
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    /**
     * @return Timezone offset from UTC as seconds. For example, EEST (Eastern European Summer Time, +3h) is 10800. PST (Pacific Standard Time, -8h) is -28800::seconds
     */
    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @return Average heart rate during workout::bpm
     */
    @JsonProperty("average_hr")
    public Optional<Integer> getAverageHr() {
        return averageHr;
    }

    /**
     * @return Max heart rate during workout::bpm
     */
    @JsonProperty("max_hr")
    public Optional<Integer> getMaxHr() {
        return maxHr;
    }

    /**
     * @return Distance travelled during workout::meters
     */
    @JsonProperty("distance")
    public Optional<Double> getDistance() {
        return distance;
    }

    /**
     * @return Date of the workout summary in the YYYY-mm-dd format. This generally matches the workout start date.
     */
    @JsonProperty("calendar_date")
    public String getCalendarDate() {
        return calendarDate;
    }

    /**
     * @return Start time of the workout::time
     */
    @JsonProperty("time_start")
    public OffsetDateTime getTimeStart() {
        return timeStart;
    }

    /**
     * @return End time of the workout::time
     */
    @JsonProperty("time_end")
    public OffsetDateTime getTimeEnd() {
        return timeEnd;
    }

    /**
     * @return Calories burned during the workout::kCal
     */
    @JsonProperty("calories")
    public Optional<Double> getCalories() {
        return calories;
    }

    /**
     * @return Sport's name
     */
    @JsonProperty("sport")
    public Optional<ClientFacingSport> getSport() {
        return sport;
    }

    /**
     * @return Time in seconds spent in different heart rate zones &lt;50%, 50-60%, 60-70%, 70-80%, 80-90%, 90%+. Due to rounding errors, it's possible that summing all values is different than the total time of the workout. Not available for all providers::seconds
     */
    @JsonProperty("hr_zones")
    public Optional<List<Integer>> getHrZones() {
        return hrZones;
    }

    /**
     * @return Time spent active during the workout::seconds
     */
    @JsonProperty("moving_time")
    public Optional<Integer> getMovingTime() {
        return movingTime;
    }

    /**
     * @return Elevation gain during the workout::meters
     */
    @JsonProperty("total_elevation_gain")
    public Optional<Double> getTotalElevationGain() {
        return totalElevationGain;
    }

    /**
     * @return Highest point of elevation::meters
     */
    @JsonProperty("elev_high")
    public Optional<Double> getElevHigh() {
        return elevHigh;
    }

    /**
     * @return Lowest point of elevation::meters
     */
    @JsonProperty("elev_low")
    public Optional<Double> getElevLow() {
        return elevLow;
    }

    /**
     * @return Average speed during workout in m/s::meters/sec
     */
    @JsonProperty("average_speed")
    public Optional<Double> getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * @return Max speed during workout in m/s::meters/sec
     */
    @JsonProperty("max_speed")
    public Optional<Double> getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @return Average watts burned during exercise::watts
     */
    @JsonProperty("average_watts")
    public Optional<Double> getAverageWatts() {
        return averageWatts;
    }

    /**
     * @return Watts burned during exercise::watts
     */
    @JsonProperty("device_watts")
    public Optional<Double> getDeviceWatts() {
        return deviceWatts;
    }

    /**
     * @return Max watts burned during exercise::watts
     */
    @JsonProperty("max_watts")
    public Optional<Double> getMaxWatts() {
        return maxWatts;
    }

    /**
     * @return Weighted average watts burned during exercise::watts
     */
    @JsonProperty("weighted_average_watts")
    public Optional<Double> getWeightedAverageWatts() {
        return weightedAverageWatts;
    }

    /**
     * @return Map of workouts encoded as polyline
     */
    @JsonProperty("map")
    public Optional<Map<String, Object>> getMap() {
        return map;
    }

    /**
     * @return Provider ID given for that specific workout
     */
    @JsonProperty("provider_id")
    public String getProviderId() {
        return providerId;
    }

    /**
     * @return Source the data has come from.
     */
    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingWorkout && equalTo((ClientFacingWorkout) other);
    }

    private boolean equalTo(ClientFacingWorkout other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && title.equals(other.title)
                && timezoneOffset.equals(other.timezoneOffset)
                && averageHr.equals(other.averageHr)
                && maxHr.equals(other.maxHr)
                && distance.equals(other.distance)
                && calendarDate.equals(other.calendarDate)
                && timeStart.equals(other.timeStart)
                && timeEnd.equals(other.timeEnd)
                && calories.equals(other.calories)
                && sport.equals(other.sport)
                && hrZones.equals(other.hrZones)
                && movingTime.equals(other.movingTime)
                && totalElevationGain.equals(other.totalElevationGain)
                && elevHigh.equals(other.elevHigh)
                && elevLow.equals(other.elevLow)
                && averageSpeed.equals(other.averageSpeed)
                && maxSpeed.equals(other.maxSpeed)
                && averageWatts.equals(other.averageWatts)
                && deviceWatts.equals(other.deviceWatts)
                && maxWatts.equals(other.maxWatts)
                && weightedAverageWatts.equals(other.weightedAverageWatts)
                && map.equals(other.map)
                && providerId.equals(other.providerId)
                && source.equals(other.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.id,
                this.title,
                this.timezoneOffset,
                this.averageHr,
                this.maxHr,
                this.distance,
                this.calendarDate,
                this.timeStart,
                this.timeEnd,
                this.calories,
                this.sport,
                this.hrZones,
                this.movingTime,
                this.totalElevationGain,
                this.elevHigh,
                this.elevLow,
                this.averageSpeed,
                this.maxSpeed,
                this.averageWatts,
                this.deviceWatts,
                this.maxWatts,
                this.weightedAverageWatts,
                this.map,
                this.providerId,
                this.source);
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

        Builder from(ClientFacingWorkout other);
    }

    public interface IdStage {
        CalendarDateStage id(String id);
    }

    public interface CalendarDateStage {
        TimeStartStage calendarDate(String calendarDate);
    }

    public interface TimeStartStage {
        TimeEndStage timeStart(OffsetDateTime timeStart);
    }

    public interface TimeEndStage {
        ProviderIdStage timeEnd(OffsetDateTime timeEnd);
    }

    public interface ProviderIdStage {
        SourceStage providerId(String providerId);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ClientFacingWorkout build();

        _FinalStage title(Optional<String> title);

        _FinalStage title(String title);

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage averageHr(Optional<Integer> averageHr);

        _FinalStage averageHr(Integer averageHr);

        _FinalStage maxHr(Optional<Integer> maxHr);

        _FinalStage maxHr(Integer maxHr);

        _FinalStage distance(Optional<Double> distance);

        _FinalStage distance(Double distance);

        _FinalStage calories(Optional<Double> calories);

        _FinalStage calories(Double calories);

        _FinalStage sport(Optional<ClientFacingSport> sport);

        _FinalStage sport(ClientFacingSport sport);

        _FinalStage hrZones(Optional<List<Integer>> hrZones);

        _FinalStage hrZones(List<Integer> hrZones);

        _FinalStage movingTime(Optional<Integer> movingTime);

        _FinalStage movingTime(Integer movingTime);

        _FinalStage totalElevationGain(Optional<Double> totalElevationGain);

        _FinalStage totalElevationGain(Double totalElevationGain);

        _FinalStage elevHigh(Optional<Double> elevHigh);

        _FinalStage elevHigh(Double elevHigh);

        _FinalStage elevLow(Optional<Double> elevLow);

        _FinalStage elevLow(Double elevLow);

        _FinalStage averageSpeed(Optional<Double> averageSpeed);

        _FinalStage averageSpeed(Double averageSpeed);

        _FinalStage maxSpeed(Optional<Double> maxSpeed);

        _FinalStage maxSpeed(Double maxSpeed);

        _FinalStage averageWatts(Optional<Double> averageWatts);

        _FinalStage averageWatts(Double averageWatts);

        _FinalStage deviceWatts(Optional<Double> deviceWatts);

        _FinalStage deviceWatts(Double deviceWatts);

        _FinalStage maxWatts(Optional<Double> maxWatts);

        _FinalStage maxWatts(Double maxWatts);

        _FinalStage weightedAverageWatts(Optional<Double> weightedAverageWatts);

        _FinalStage weightedAverageWatts(Double weightedAverageWatts);

        _FinalStage map(Optional<Map<String, Object>> map);

        _FinalStage map(Map<String, Object> map);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage,
                    IdStage,
                    CalendarDateStage,
                    TimeStartStage,
                    TimeEndStage,
                    ProviderIdStage,
                    SourceStage,
                    _FinalStage {
        private String userId;

        private String id;

        private String calendarDate;

        private OffsetDateTime timeStart;

        private OffsetDateTime timeEnd;

        private String providerId;

        private ClientFacingSource source;

        private Optional<Map<String, Object>> map = Optional.empty();

        private Optional<Double> weightedAverageWatts = Optional.empty();

        private Optional<Double> maxWatts = Optional.empty();

        private Optional<Double> deviceWatts = Optional.empty();

        private Optional<Double> averageWatts = Optional.empty();

        private Optional<Double> maxSpeed = Optional.empty();

        private Optional<Double> averageSpeed = Optional.empty();

        private Optional<Double> elevLow = Optional.empty();

        private Optional<Double> elevHigh = Optional.empty();

        private Optional<Double> totalElevationGain = Optional.empty();

        private Optional<Integer> movingTime = Optional.empty();

        private Optional<List<Integer>> hrZones = Optional.empty();

        private Optional<ClientFacingSport> sport = Optional.empty();

        private Optional<Double> calories = Optional.empty();

        private Optional<Double> distance = Optional.empty();

        private Optional<Integer> maxHr = Optional.empty();

        private Optional<Integer> averageHr = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Optional<String> title = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingWorkout other) {
            userId(other.getUserId());
            id(other.getId());
            title(other.getTitle());
            timezoneOffset(other.getTimezoneOffset());
            averageHr(other.getAverageHr());
            maxHr(other.getMaxHr());
            distance(other.getDistance());
            calendarDate(other.getCalendarDate());
            timeStart(other.getTimeStart());
            timeEnd(other.getTimeEnd());
            calories(other.getCalories());
            sport(other.getSport());
            hrZones(other.getHrZones());
            movingTime(other.getMovingTime());
            totalElevationGain(other.getTotalElevationGain());
            elevHigh(other.getElevHigh());
            elevLow(other.getElevLow());
            averageSpeed(other.getAverageSpeed());
            maxSpeed(other.getMaxSpeed());
            averageWatts(other.getAverageWatts());
            deviceWatts(other.getDeviceWatts());
            maxWatts(other.getMaxWatts());
            weightedAverageWatts(other.getWeightedAverageWatts());
            map(other.getMap());
            providerId(other.getProviderId());
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
        public CalendarDateStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date of the workout summary in the YYYY-mm-dd format. This generally matches the workout start date.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("calendar_date")
        public TimeStartStage calendarDate(String calendarDate) {
            this.calendarDate = calendarDate;
            return this;
        }

        /**
         * <p>Start time of the workout::time</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("time_start")
        public TimeEndStage timeStart(OffsetDateTime timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * <p>End time of the workout::time</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("time_end")
        public ProviderIdStage timeEnd(OffsetDateTime timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>Provider ID given for that specific workout</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("provider_id")
        public SourceStage providerId(String providerId) {
            this.providerId = providerId;
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
         * <p>Map of workouts encoded as polyline</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage map(Map<String, Object> map) {
            this.map = Optional.of(map);
            return this;
        }

        @Override
        @JsonSetter(value = "map", nulls = Nulls.SKIP)
        public _FinalStage map(Optional<Map<String, Object>> map) {
            this.map = map;
            return this;
        }

        /**
         * <p>Weighted average watts burned during exercise::watts</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage weightedAverageWatts(Double weightedAverageWatts) {
            this.weightedAverageWatts = Optional.of(weightedAverageWatts);
            return this;
        }

        @Override
        @JsonSetter(value = "weighted_average_watts", nulls = Nulls.SKIP)
        public _FinalStage weightedAverageWatts(Optional<Double> weightedAverageWatts) {
            this.weightedAverageWatts = weightedAverageWatts;
            return this;
        }

        /**
         * <p>Max watts burned during exercise::watts</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage maxWatts(Double maxWatts) {
            this.maxWatts = Optional.of(maxWatts);
            return this;
        }

        @Override
        @JsonSetter(value = "max_watts", nulls = Nulls.SKIP)
        public _FinalStage maxWatts(Optional<Double> maxWatts) {
            this.maxWatts = maxWatts;
            return this;
        }

        /**
         * <p>Watts burned during exercise::watts</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage deviceWatts(Double deviceWatts) {
            this.deviceWatts = Optional.of(deviceWatts);
            return this;
        }

        @Override
        @JsonSetter(value = "device_watts", nulls = Nulls.SKIP)
        public _FinalStage deviceWatts(Optional<Double> deviceWatts) {
            this.deviceWatts = deviceWatts;
            return this;
        }

        /**
         * <p>Average watts burned during exercise::watts</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage averageWatts(Double averageWatts) {
            this.averageWatts = Optional.of(averageWatts);
            return this;
        }

        @Override
        @JsonSetter(value = "average_watts", nulls = Nulls.SKIP)
        public _FinalStage averageWatts(Optional<Double> averageWatts) {
            this.averageWatts = averageWatts;
            return this;
        }

        /**
         * <p>Max speed during workout in m/s::meters/sec</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage maxSpeed(Double maxSpeed) {
            this.maxSpeed = Optional.of(maxSpeed);
            return this;
        }

        @Override
        @JsonSetter(value = "max_speed", nulls = Nulls.SKIP)
        public _FinalStage maxSpeed(Optional<Double> maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        /**
         * <p>Average speed during workout in m/s::meters/sec</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage averageSpeed(Double averageSpeed) {
            this.averageSpeed = Optional.of(averageSpeed);
            return this;
        }

        @Override
        @JsonSetter(value = "average_speed", nulls = Nulls.SKIP)
        public _FinalStage averageSpeed(Optional<Double> averageSpeed) {
            this.averageSpeed = averageSpeed;
            return this;
        }

        /**
         * <p>Lowest point of elevation::meters</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage elevLow(Double elevLow) {
            this.elevLow = Optional.of(elevLow);
            return this;
        }

        @Override
        @JsonSetter(value = "elev_low", nulls = Nulls.SKIP)
        public _FinalStage elevLow(Optional<Double> elevLow) {
            this.elevLow = elevLow;
            return this;
        }

        /**
         * <p>Highest point of elevation::meters</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage elevHigh(Double elevHigh) {
            this.elevHigh = Optional.of(elevHigh);
            return this;
        }

        @Override
        @JsonSetter(value = "elev_high", nulls = Nulls.SKIP)
        public _FinalStage elevHigh(Optional<Double> elevHigh) {
            this.elevHigh = elevHigh;
            return this;
        }

        /**
         * <p>Elevation gain during the workout::meters</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage totalElevationGain(Double totalElevationGain) {
            this.totalElevationGain = Optional.of(totalElevationGain);
            return this;
        }

        @Override
        @JsonSetter(value = "total_elevation_gain", nulls = Nulls.SKIP)
        public _FinalStage totalElevationGain(Optional<Double> totalElevationGain) {
            this.totalElevationGain = totalElevationGain;
            return this;
        }

        /**
         * <p>Time spent active during the workout::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage movingTime(Integer movingTime) {
            this.movingTime = Optional.of(movingTime);
            return this;
        }

        @Override
        @JsonSetter(value = "moving_time", nulls = Nulls.SKIP)
        public _FinalStage movingTime(Optional<Integer> movingTime) {
            this.movingTime = movingTime;
            return this;
        }

        /**
         * <p>Time in seconds spent in different heart rate zones &lt;50%, 50-60%, 60-70%, 70-80%, 80-90%, 90%+. Due to rounding errors, it's possible that summing all values is different than the total time of the workout. Not available for all providers::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage hrZones(List<Integer> hrZones) {
            this.hrZones = Optional.of(hrZones);
            return this;
        }

        @Override
        @JsonSetter(value = "hr_zones", nulls = Nulls.SKIP)
        public _FinalStage hrZones(Optional<List<Integer>> hrZones) {
            this.hrZones = hrZones;
            return this;
        }

        /**
         * <p>Sport's name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage sport(ClientFacingSport sport) {
            this.sport = Optional.of(sport);
            return this;
        }

        @Override
        @JsonSetter(value = "sport", nulls = Nulls.SKIP)
        public _FinalStage sport(Optional<ClientFacingSport> sport) {
            this.sport = sport;
            return this;
        }

        /**
         * <p>Calories burned during the workout::kCal</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage calories(Double calories) {
            this.calories = Optional.of(calories);
            return this;
        }

        @Override
        @JsonSetter(value = "calories", nulls = Nulls.SKIP)
        public _FinalStage calories(Optional<Double> calories) {
            this.calories = calories;
            return this;
        }

        /**
         * <p>Distance travelled during workout::meters</p>
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
         * <p>Max heart rate during workout::bpm</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage maxHr(Integer maxHr) {
            this.maxHr = Optional.of(maxHr);
            return this;
        }

        @Override
        @JsonSetter(value = "max_hr", nulls = Nulls.SKIP)
        public _FinalStage maxHr(Optional<Integer> maxHr) {
            this.maxHr = maxHr;
            return this;
        }

        /**
         * <p>Average heart rate during workout::bpm</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage averageHr(Integer averageHr) {
            this.averageHr = Optional.of(averageHr);
            return this;
        }

        @Override
        @JsonSetter(value = "average_hr", nulls = Nulls.SKIP)
        public _FinalStage averageHr(Optional<Integer> averageHr) {
            this.averageHr = averageHr;
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
         * <p>Title given for the workout</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage title(String title) {
            this.title = Optional.of(title);
            return this;
        }

        @Override
        @JsonSetter(value = "title", nulls = Nulls.SKIP)
        public _FinalStage title(Optional<String> title) {
            this.title = title;
            return this;
        }

        @Override
        public ClientFacingWorkout build() {
            return new ClientFacingWorkout(
                    userId,
                    id,
                    title,
                    timezoneOffset,
                    averageHr,
                    maxHr,
                    distance,
                    calendarDate,
                    timeStart,
                    timeEnd,
                    calories,
                    sport,
                    hrZones,
                    movingTime,
                    totalElevationGain,
                    elevHigh,
                    elevLow,
                    averageSpeed,
                    maxSpeed,
                    averageWatts,
                    deviceWatts,
                    maxWatts,
                    weightedAverageWatts,
                    map,
                    providerId,
                    source);
        }
    }
}
