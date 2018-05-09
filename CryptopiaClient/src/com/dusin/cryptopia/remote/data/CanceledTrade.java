
package com.dusin.cryptopia.remote.data;

import java.util.List;

/**
 * Created by Dusin on 2018/05/05.
 */
public class CanceledTrade {
    private Long orderId;
    private List<Long> data;  //filled orders

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Long> getData() {
        return data;
    }

    public void setData(List<Long> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CanceledTrade{");
        sb.append("orderId=").append(orderId);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
