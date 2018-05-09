
package com.dusin.cryptopia.remote.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * Created by Dylan Janeke on 2017/06/23.
 */
public class TradeHistory {
    private Long tradeId;
    private Long tradePairId;
    private String market;
    private String type;
    private BigDecimal rate;
    private BigDecimal amount;
    private BigDecimal total;
    private BigDecimal fee;
    private Date time;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getTradePairId() {
        return tradePairId;
    }

    public void setTradePairId(Long tradePairId) {
        this.tradePairId = tradePairId;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeHistory{");
        sb.append("tradeId=").append(tradeId);
        sb.append(", tradePairId=").append(tradePairId);
        sb.append(", market='").append(market).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", amount=").append(amount);
        sb.append(", total=").append(total);
        sb.append(", fee=").append(fee);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
