package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetOrdersResponse.Builder.class)
public final class GetOrdersResponse {
    private final List<ClientFacingOrder> orders;

    private final int total;

    private final int page;

    private final int size;

    private GetOrdersResponse(List<ClientFacingOrder> orders, int total, int page, int size) {
        this.orders = orders;
        this.total = total;
        this.page = page;
        this.size = size;
    }

    @JsonProperty("orders")
    public List<ClientFacingOrder> getOrders() {
        return orders;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetOrdersResponse && equalTo((GetOrdersResponse) other);
    }

    private boolean equalTo(GetOrdersResponse other) {
        return orders.equals(other.orders) && total == other.total && page == other.page && size == other.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.orders, this.total, this.page, this.size);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalStage builder() {
        return new Builder();
    }

    public interface TotalStage {
        PageStage total(int total);

        Builder from(GetOrdersResponse other);
    }

    public interface PageStage {
        SizeStage page(int page);
    }

    public interface SizeStage {
        _FinalStage size(int size);
    }

    public interface _FinalStage {
        GetOrdersResponse build();

        _FinalStage orders(List<ClientFacingOrder> orders);

        _FinalStage addOrders(ClientFacingOrder orders);

        _FinalStage addAllOrders(List<ClientFacingOrder> orders);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalStage, PageStage, SizeStage, _FinalStage {
        private int total;

        private int page;

        private int size;

        private List<ClientFacingOrder> orders = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(GetOrdersResponse other) {
            orders(other.getOrders());
            total(other.getTotal());
            page(other.getPage());
            size(other.getSize());
            return this;
        }

        @Override
        @JsonSetter("total")
        public PageStage total(int total) {
            this.total = total;
            return this;
        }

        @Override
        @JsonSetter("page")
        public SizeStage page(int page) {
            this.page = page;
            return this;
        }

        @Override
        @JsonSetter("size")
        public _FinalStage size(int size) {
            this.size = size;
            return this;
        }

        @Override
        public _FinalStage addAllOrders(List<ClientFacingOrder> orders) {
            this.orders.addAll(orders);
            return this;
        }

        @Override
        public _FinalStage addOrders(ClientFacingOrder orders) {
            this.orders.add(orders);
            return this;
        }

        @Override
        @JsonSetter(value = "orders", nulls = Nulls.SKIP)
        public _FinalStage orders(List<ClientFacingOrder> orders) {
            this.orders.clear();
            this.orders.addAll(orders);
            return this;
        }

        @Override
        public GetOrdersResponse build() {
            return new GetOrdersResponse(orders, total, page, size);
        }
    }
}
