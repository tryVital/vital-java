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
@JsonDeserialize(builder = ClientFacingSleep.Builder.class)
public final class ClientFacingSleep {
    private final String userId;

    private final String id;

    private final OffsetDateTime date;

    private final String calendarDate;

    private final OffsetDateTime bedtimeStart;

    private final OffsetDateTime bedtimeStop;

    private final Optional<Integer> timezoneOffset;

    private final int duration;

    private final int total;

    private final int awake;

    private final int light;

    private final int rem;

    private final int deep;

    private final Optional<Integer> score;

    private final Optional<Integer> hrLowest;

    private final Optional<Integer> hrAverage;

    private final Optional<Double> efficiency;

    private final Optional<Integer> latency;

    private final Optional<Double> temperatureDelta;

    private final Optional<Double> skinTemperature;

    private final Optional<Double> averageHrv;

    private final Optional<Double> respiratoryRate;

    private final ClientFacingSource source;

    private final Optional<ClientFacingSleepStream> sleepStream;

    private ClientFacingSleep(
            String userId,
            String id,
            OffsetDateTime date,
            String calendarDate,
            OffsetDateTime bedtimeStart,
            OffsetDateTime bedtimeStop,
            Optional<Integer> timezoneOffset,
            int duration,
            int total,
            int awake,
            int light,
            int rem,
            int deep,
            Optional<Integer> score,
            Optional<Integer> hrLowest,
            Optional<Integer> hrAverage,
            Optional<Double> efficiency,
            Optional<Integer> latency,
            Optional<Double> temperatureDelta,
            Optional<Double> skinTemperature,
            Optional<Double> averageHrv,
            Optional<Double> respiratoryRate,
            ClientFacingSource source,
            Optional<ClientFacingSleepStream> sleepStream) {
        this.userId = userId;
        this.id = id;
        this.date = date;
        this.calendarDate = calendarDate;
        this.bedtimeStart = bedtimeStart;
        this.bedtimeStop = bedtimeStop;
        this.timezoneOffset = timezoneOffset;
        this.duration = duration;
        this.total = total;
        this.awake = awake;
        this.light = light;
        this.rem = rem;
        this.deep = deep;
        this.score = score;
        this.hrLowest = hrLowest;
        this.hrAverage = hrAverage;
        this.efficiency = efficiency;
        this.latency = latency;
        this.temperatureDelta = temperatureDelta;
        this.skinTemperature = skinTemperature;
        this.averageHrv = averageHrv;
        this.respiratoryRate = respiratoryRate;
        this.source = source;
        this.sleepStream = sleepStream;
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
     * @return Date of the sleep summary in the YYYY-mm-dd format. This generally matches the sleep end date.
     */
    @JsonProperty("calendar_date")
    public String getCalendarDate() {
        return calendarDate;
    }

    /**
     * @return UTC Time when the sleep period started
     */
    @JsonProperty("bedtime_start")
    public OffsetDateTime getBedtimeStart() {
        return bedtimeStart;
    }

    /**
     * @return UTC Time when the sleep period ended
     */
    @JsonProperty("bedtime_stop")
    public OffsetDateTime getBedtimeStop() {
        return bedtimeStop;
    }

    /**
     * @return Timezone offset from UTC as seconds. For example, EEST (Eastern European Summer Time, +3h) is 10800. PST (Pacific Standard Time, -8h) is -28800::seconds
     */
    @JsonProperty("timezone_offset")
    public Optional<Integer> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @return Total duration of the sleep period (sleep.duration = sleep.bedtime_end - sleep.bedtime_start)::seconds
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    /**
     * @return Total amount of sleep registered during the sleep period (sleep.total = sleep.rem + sleep.light + sleep.deep)::seconds
     */
    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    /**
     * @return Total amount of awake time registered during the sleep period::seconds
     */
    @JsonProperty("awake")
    public int getAwake() {
        return awake;
    }

    /**
     * @return Total amount of light sleep registered during the sleep period::seconds
     */
    @JsonProperty("light")
    public int getLight() {
        return light;
    }

    /**
     * @return Total amount of REM sleep registered during the sleep period, minutes::seconds
     */
    @JsonProperty("rem")
    public int getRem() {
        return rem;
    }

    /**
     * @return Total amount of deep (N3) sleep registered during the sleep period::seconds
     */
    @JsonProperty("deep")
    public int getDeep() {
        return deep;
    }

    /**
     * @return A value between 1 and 100 representing how well the user slept. Currently only available for Withings, Oura, Whoop and Garmin::scalar
     */
    @JsonProperty("score")
    public Optional<Integer> getScore() {
        return score;
    }

    /**
     * @return The lowest heart rate (5 minutes sliding average) registered during the sleep period::beats per minute
     */
    @JsonProperty("hr_lowest")
    public Optional<Integer> getHrLowest() {
        return hrLowest;
    }

    /**
     * @return The average heart rate registered during the sleep period::beats per minute
     */
    @JsonProperty("hr_average")
    public Optional<Integer> getHrAverage() {
        return hrAverage;
    }

    /**
     * @return Sleep efficiency is the percentage of the sleep period spent asleep (100% * sleep.total / sleep.duration)::perc
     */
    @JsonProperty("efficiency")
    public Optional<Double> getEfficiency() {
        return efficiency;
    }

    /**
     * @return Detected latency from bedtime_start to the beginning of the first five minutes of persistent sleep::seconds
     */
    @JsonProperty("latency")
    public Optional<Integer> getLatency() {
        return latency;
    }

    /**
     * @return Skin temperature deviation from the long-term temperature average::celcius
     */
    @JsonProperty("temperature_delta")
    public Optional<Double> getTemperatureDelta() {
        return temperatureDelta;
    }

    /**
     * @return The skin temperature::celcius
     */
    @JsonProperty("skin_temperature")
    public Optional<Double> getSkinTemperature() {
        return skinTemperature;
    }

    /**
     * @return The average heart rate variability registered during the sleep period::rmssd
     */
    @JsonProperty("average_hrv")
    public Optional<Double> getAverageHrv() {
        return averageHrv;
    }

    /**
     * @return Average respiratory rate::breaths per minute
     */
    @JsonProperty("respiratory_rate")
    public Optional<Double> getRespiratoryRate() {
        return respiratoryRate;
    }

    /**
     * @return Source the data has come from.
     */
    @JsonProperty("source")
    public ClientFacingSource getSource() {
        return source;
    }

    @JsonProperty("sleep_stream")
    public Optional<ClientFacingSleepStream> getSleepStream() {
        return sleepStream;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingSleep && equalTo((ClientFacingSleep) other);
    }

    private boolean equalTo(ClientFacingSleep other) {
        return userId.equals(other.userId)
                && id.equals(other.id)
                && date.equals(other.date)
                && calendarDate.equals(other.calendarDate)
                && bedtimeStart.equals(other.bedtimeStart)
                && bedtimeStop.equals(other.bedtimeStop)
                && timezoneOffset.equals(other.timezoneOffset)
                && duration == other.duration
                && total == other.total
                && awake == other.awake
                && light == other.light
                && rem == other.rem
                && deep == other.deep
                && score.equals(other.score)
                && hrLowest.equals(other.hrLowest)
                && hrAverage.equals(other.hrAverage)
                && efficiency.equals(other.efficiency)
                && latency.equals(other.latency)
                && temperatureDelta.equals(other.temperatureDelta)
                && skinTemperature.equals(other.skinTemperature)
                && averageHrv.equals(other.averageHrv)
                && respiratoryRate.equals(other.respiratoryRate)
                && source.equals(other.source)
                && sleepStream.equals(other.sleepStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.id,
                this.date,
                this.calendarDate,
                this.bedtimeStart,
                this.bedtimeStop,
                this.timezoneOffset,
                this.duration,
                this.total,
                this.awake,
                this.light,
                this.rem,
                this.deep,
                this.score,
                this.hrLowest,
                this.hrAverage,
                this.efficiency,
                this.latency,
                this.temperatureDelta,
                this.skinTemperature,
                this.averageHrv,
                this.respiratoryRate,
                this.source,
                this.sleepStream);
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

        Builder from(ClientFacingSleep other);
    }

    public interface IdStage {
        DateStage id(String id);
    }

    public interface DateStage {
        CalendarDateStage date(OffsetDateTime date);
    }

    public interface CalendarDateStage {
        BedtimeStartStage calendarDate(String calendarDate);
    }

    public interface BedtimeStartStage {
        BedtimeStopStage bedtimeStart(OffsetDateTime bedtimeStart);
    }

    public interface BedtimeStopStage {
        DurationStage bedtimeStop(OffsetDateTime bedtimeStop);
    }

    public interface DurationStage {
        TotalStage duration(int duration);
    }

    public interface TotalStage {
        AwakeStage total(int total);
    }

    public interface AwakeStage {
        LightStage awake(int awake);
    }

    public interface LightStage {
        RemStage light(int light);
    }

    public interface RemStage {
        DeepStage rem(int rem);
    }

    public interface DeepStage {
        SourceStage deep(int deep);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingSource source);
    }

    public interface _FinalStage {
        ClientFacingSleep build();

        _FinalStage timezoneOffset(Optional<Integer> timezoneOffset);

        _FinalStage timezoneOffset(Integer timezoneOffset);

        _FinalStage score(Optional<Integer> score);

        _FinalStage score(Integer score);

        _FinalStage hrLowest(Optional<Integer> hrLowest);

        _FinalStage hrLowest(Integer hrLowest);

        _FinalStage hrAverage(Optional<Integer> hrAverage);

        _FinalStage hrAverage(Integer hrAverage);

        _FinalStage efficiency(Optional<Double> efficiency);

        _FinalStage efficiency(Double efficiency);

        _FinalStage latency(Optional<Integer> latency);

        _FinalStage latency(Integer latency);

        _FinalStage temperatureDelta(Optional<Double> temperatureDelta);

        _FinalStage temperatureDelta(Double temperatureDelta);

        _FinalStage skinTemperature(Optional<Double> skinTemperature);

        _FinalStage skinTemperature(Double skinTemperature);

        _FinalStage averageHrv(Optional<Double> averageHrv);

        _FinalStage averageHrv(Double averageHrv);

        _FinalStage respiratoryRate(Optional<Double> respiratoryRate);

        _FinalStage respiratoryRate(Double respiratoryRate);

        _FinalStage sleepStream(Optional<ClientFacingSleepStream> sleepStream);

        _FinalStage sleepStream(ClientFacingSleepStream sleepStream);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UserIdStage,
                    IdStage,
                    DateStage,
                    CalendarDateStage,
                    BedtimeStartStage,
                    BedtimeStopStage,
                    DurationStage,
                    TotalStage,
                    AwakeStage,
                    LightStage,
                    RemStage,
                    DeepStage,
                    SourceStage,
                    _FinalStage {
        private String userId;

        private String id;

        private OffsetDateTime date;

        private String calendarDate;

        private OffsetDateTime bedtimeStart;

        private OffsetDateTime bedtimeStop;

        private int duration;

        private int total;

        private int awake;

        private int light;

        private int rem;

        private int deep;

        private ClientFacingSource source;

        private Optional<ClientFacingSleepStream> sleepStream = Optional.empty();

        private Optional<Double> respiratoryRate = Optional.empty();

        private Optional<Double> averageHrv = Optional.empty();

        private Optional<Double> skinTemperature = Optional.empty();

        private Optional<Double> temperatureDelta = Optional.empty();

        private Optional<Integer> latency = Optional.empty();

        private Optional<Double> efficiency = Optional.empty();

        private Optional<Integer> hrAverage = Optional.empty();

        private Optional<Integer> hrLowest = Optional.empty();

        private Optional<Integer> score = Optional.empty();

        private Optional<Integer> timezoneOffset = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientFacingSleep other) {
            userId(other.getUserId());
            id(other.getId());
            date(other.getDate());
            calendarDate(other.getCalendarDate());
            bedtimeStart(other.getBedtimeStart());
            bedtimeStop(other.getBedtimeStop());
            timezoneOffset(other.getTimezoneOffset());
            duration(other.getDuration());
            total(other.getTotal());
            awake(other.getAwake());
            light(other.getLight());
            rem(other.getRem());
            deep(other.getDeep());
            score(other.getScore());
            hrLowest(other.getHrLowest());
            hrAverage(other.getHrAverage());
            efficiency(other.getEfficiency());
            latency(other.getLatency());
            temperatureDelta(other.getTemperatureDelta());
            skinTemperature(other.getSkinTemperature());
            averageHrv(other.getAverageHrv());
            respiratoryRate(other.getRespiratoryRate());
            source(other.getSource());
            sleepStream(other.getSleepStream());
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
         * <p>Date of the sleep summary in the YYYY-mm-dd format. This generally matches the sleep end date.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("calendar_date")
        public BedtimeStartStage calendarDate(String calendarDate) {
            this.calendarDate = calendarDate;
            return this;
        }

        /**
         * <p>UTC Time when the sleep period started</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("bedtime_start")
        public BedtimeStopStage bedtimeStart(OffsetDateTime bedtimeStart) {
            this.bedtimeStart = bedtimeStart;
            return this;
        }

        /**
         * <p>UTC Time when the sleep period ended</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("bedtime_stop")
        public DurationStage bedtimeStop(OffsetDateTime bedtimeStop) {
            this.bedtimeStop = bedtimeStop;
            return this;
        }

        /**
         * <p>Total duration of the sleep period (sleep.duration = sleep.bedtime_end - sleep.bedtime_start)::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("duration")
        public TotalStage duration(int duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>Total amount of sleep registered during the sleep period (sleep.total = sleep.rem + sleep.light + sleep.deep)::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("total")
        public AwakeStage total(int total) {
            this.total = total;
            return this;
        }

        /**
         * <p>Total amount of awake time registered during the sleep period::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("awake")
        public LightStage awake(int awake) {
            this.awake = awake;
            return this;
        }

        /**
         * <p>Total amount of light sleep registered during the sleep period::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("light")
        public RemStage light(int light) {
            this.light = light;
            return this;
        }

        /**
         * <p>Total amount of REM sleep registered during the sleep period, minutes::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("rem")
        public DeepStage rem(int rem) {
            this.rem = rem;
            return this;
        }

        /**
         * <p>Total amount of deep (N3) sleep registered during the sleep period::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("deep")
        public SourceStage deep(int deep) {
            this.deep = deep;
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

        @Override
        public _FinalStage sleepStream(ClientFacingSleepStream sleepStream) {
            this.sleepStream = Optional.of(sleepStream);
            return this;
        }

        @Override
        @JsonSetter(value = "sleep_stream", nulls = Nulls.SKIP)
        public _FinalStage sleepStream(Optional<ClientFacingSleepStream> sleepStream) {
            this.sleepStream = sleepStream;
            return this;
        }

        /**
         * <p>Average respiratory rate::breaths per minute</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage respiratoryRate(Double respiratoryRate) {
            this.respiratoryRate = Optional.of(respiratoryRate);
            return this;
        }

        @Override
        @JsonSetter(value = "respiratory_rate", nulls = Nulls.SKIP)
        public _FinalStage respiratoryRate(Optional<Double> respiratoryRate) {
            this.respiratoryRate = respiratoryRate;
            return this;
        }

        /**
         * <p>The average heart rate variability registered during the sleep period::rmssd</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage averageHrv(Double averageHrv) {
            this.averageHrv = Optional.of(averageHrv);
            return this;
        }

        @Override
        @JsonSetter(value = "average_hrv", nulls = Nulls.SKIP)
        public _FinalStage averageHrv(Optional<Double> averageHrv) {
            this.averageHrv = averageHrv;
            return this;
        }

        /**
         * <p>The skin temperature::celcius</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage skinTemperature(Double skinTemperature) {
            this.skinTemperature = Optional.of(skinTemperature);
            return this;
        }

        @Override
        @JsonSetter(value = "skin_temperature", nulls = Nulls.SKIP)
        public _FinalStage skinTemperature(Optional<Double> skinTemperature) {
            this.skinTemperature = skinTemperature;
            return this;
        }

        /**
         * <p>Skin temperature deviation from the long-term temperature average::celcius</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage temperatureDelta(Double temperatureDelta) {
            this.temperatureDelta = Optional.of(temperatureDelta);
            return this;
        }

        @Override
        @JsonSetter(value = "temperature_delta", nulls = Nulls.SKIP)
        public _FinalStage temperatureDelta(Optional<Double> temperatureDelta) {
            this.temperatureDelta = temperatureDelta;
            return this;
        }

        /**
         * <p>Detected latency from bedtime_start to the beginning of the first five minutes of persistent sleep::seconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage latency(Integer latency) {
            this.latency = Optional.of(latency);
            return this;
        }

        @Override
        @JsonSetter(value = "latency", nulls = Nulls.SKIP)
        public _FinalStage latency(Optional<Integer> latency) {
            this.latency = latency;
            return this;
        }

        /**
         * <p>Sleep efficiency is the percentage of the sleep period spent asleep (100% * sleep.total / sleep.duration)::perc</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage efficiency(Double efficiency) {
            this.efficiency = Optional.of(efficiency);
            return this;
        }

        @Override
        @JsonSetter(value = "efficiency", nulls = Nulls.SKIP)
        public _FinalStage efficiency(Optional<Double> efficiency) {
            this.efficiency = efficiency;
            return this;
        }

        /**
         * <p>The average heart rate registered during the sleep period::beats per minute</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage hrAverage(Integer hrAverage) {
            this.hrAverage = Optional.of(hrAverage);
            return this;
        }

        @Override
        @JsonSetter(value = "hr_average", nulls = Nulls.SKIP)
        public _FinalStage hrAverage(Optional<Integer> hrAverage) {
            this.hrAverage = hrAverage;
            return this;
        }

        /**
         * <p>The lowest heart rate (5 minutes sliding average) registered during the sleep period::beats per minute</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage hrLowest(Integer hrLowest) {
            this.hrLowest = Optional.of(hrLowest);
            return this;
        }

        @Override
        @JsonSetter(value = "hr_lowest", nulls = Nulls.SKIP)
        public _FinalStage hrLowest(Optional<Integer> hrLowest) {
            this.hrLowest = hrLowest;
            return this;
        }

        /**
         * <p>A value between 1 and 100 representing how well the user slept. Currently only available for Withings, Oura, Whoop and Garmin::scalar</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage score(Integer score) {
            this.score = Optional.of(score);
            return this;
        }

        @Override
        @JsonSetter(value = "score", nulls = Nulls.SKIP)
        public _FinalStage score(Optional<Integer> score) {
            this.score = score;
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

        @Override
        public ClientFacingSleep build() {
            return new ClientFacingSleep(
                    userId,
                    id,
                    date,
                    calendarDate,
                    bedtimeStart,
                    bedtimeStop,
                    timezoneOffset,
                    duration,
                    total,
                    awake,
                    light,
                    rem,
                    deep,
                    score,
                    hrLowest,
                    hrAverage,
                    efficiency,
                    latency,
                    temperatureDelta,
                    skinTemperature,
                    averageHrv,
                    respiratoryRate,
                    source,
                    sleepStream);
        }
    }
}
