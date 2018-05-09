
package com.dusin.cryptopia.remote.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dylan Janeke on 2017/06/22.
 */
public class MarketHistory {
    private Long tradePairId;
    private String label;
    private String type;
    private BigDecimal price;
    private BigDecimal amount;
    private BigDecimal total;
    private Date time;

    public Long getTradePairId() {
        return tradePairId;
    }

    public void setTradePairId(Long tradePairId) {
        this.tradePairId = tradePairId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketHistory{");
        sb.append("tradePairId=").append(tradePairId);
        sb.append(", label='").append(label).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", total=").append(total);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
