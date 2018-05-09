
package com.dusin.cryptopia.remote.data;



import com.dusin.cryptopia.remote.data.enums.TradeType;
import java.math.BigDecimal;

/**
 *
 * Created by Dylan Janeke on 2017/06/23.
 */
public class TradeSubmission {
    private String market;
    private Long marketId;
    private TradeType type;
    private BigDecimal rate;
    private BigDecimal amount;

    public String getMarket() {
        return market;
    }

    public TradeSubmission setMarket(String market) {
        this.market = market;
        return this;
    }

    public Long getMarketId() {
        return marketId;
    }

    public TradeSubmission setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }

    public TradeType getType() {
        return type;
    }

    public TradeSubmission setType(TradeType type) {
        this.type = type;
        return this;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public TradeSubmission setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TradeSubmission setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeSubmission{");
        sb.append("market='").append(market).append('\'');
        sb.append(", marketId=").append(marketId);
        sb.append(", type=").append(type);
        sb.append(", rate=").append(rate);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
