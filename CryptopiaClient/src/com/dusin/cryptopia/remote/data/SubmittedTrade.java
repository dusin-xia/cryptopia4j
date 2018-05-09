
package com.dusin.cryptopia.remote.data;

import java.util.List;

/**
 * Created by Dylan Janeke on 2017/06/23.
 */
public class SubmittedTrade {
    private Long orderId;
    private List<Long> filledOrders;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Long> getFilledOrders() {
        return filledOrders;
    }

    public void setFilledOrders(List<Long> filledOrders) {
        this.filledOrders = filledOrders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubmittedTrade{");
        sb.append("orderId=").append(orderId);
        sb.append(", filledOrders=").append(filledOrders);
        sb.append('}');
        return sb.toString();
    }
}
