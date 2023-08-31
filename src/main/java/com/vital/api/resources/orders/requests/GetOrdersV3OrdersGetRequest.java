package com.vital.api.resources.orders.requests;

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
@JsonDeserialize(builder = GetOrdersV3OrdersGetRequest.Builder.class)
public final class GetOrdersV3OrdersGetRequest {
    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<String> userId;

    private final Optional<String> patientName;

    private final Optional<String> orderIds;

    private final Optional<Integer> page;

    private final Optional<Integer> size;

    private GetOrdersV3OrdersGetRequest(
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<String> userId,
            Optional<String> patientName,
            Optional<String> orderIds,
            Optional<Integer> page,
            Optional<Integer> size) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
        this.patientName = patientName;
        this.orderIds = orderIds;
        this.page = page;
        this.size = size;
    }

    /**
     * @return Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
     */
    @JsonProperty("start_date")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
     */
    @JsonProperty("end_date")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Filter by user ID.
     */
    @JsonProperty("user_id")
    public Optional<String> getUserId() {
        return userId;
    }

    /**
     * @return Filter by patient name.
     */
    @JsonProperty("patient_name")
    public Optional<String> getPatientName() {
        return patientName;
    }

    /**
     * @return Filter by order ids.
     */
    @JsonProperty("order_ids")
    public Optional<String> getOrderIds() {
        return orderIds;
    }

    @JsonProperty("page")
    public Optional<Integer> getPage() {
        return page;
    }

    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetOrdersV3OrdersGetRequest && equalTo((GetOrdersV3OrdersGetRequest) other);
    }

    private boolean equalTo(GetOrdersV3OrdersGetRequest other) {
        return startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && userId.equals(other.userId)
                && patientName.equals(other.patientName)
                && orderIds.equals(other.orderIds)
                && page.equals(other.page)
                && size.equals(other.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.startDate, this.endDate, this.userId, this.patientName, this.orderIds, this.page, this.size);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private Optional<String> patientName = Optional.empty();

        private Optional<String> orderIds = Optional.empty();

        private Optional<Integer> page = Optional.empty();

        private Optional<Integer> size = Optional.empty();

        private Builder() {}

        public Builder from(GetOrdersV3OrdersGetRequest other) {
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            userId(other.getUserId());
            patientName(other.getPatientName());
            orderIds(other.getOrderIds());
            page(other.getPage());
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "start_date", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.of(startDate);
            return this;
        }

        @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @JsonSetter(value = "user_id", nulls = Nulls.SKIP)
        public Builder userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Optional.of(userId);
            return this;
        }

        @JsonSetter(value = "patient_name", nulls = Nulls.SKIP)
        public Builder patientName(Optional<String> patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder patientName(String patientName) {
            this.patientName = Optional.of(patientName);
            return this;
        }

        @JsonSetter(value = "order_ids", nulls = Nulls.SKIP)
        public Builder orderIds(Optional<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder orderIds(String orderIds) {
            this.orderIds = Optional.of(orderIds);
            return this;
        }

        @JsonSetter(value = "page", nulls = Nulls.SKIP)
        public Builder page(Optional<Integer> page) {
            this.page = page;
            return this;
        }

        public Builder page(Integer page) {
            this.page = Optional.of(page);
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Optional.of(size);
            return this;
        }

        public GetOrdersV3OrdersGetRequest build() {
            return new GetOrdersV3OrdersGetRequest(startDate, endDate, userId, patientName, orderIds, page, size);
        }
    }
}
