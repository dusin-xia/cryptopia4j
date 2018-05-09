
package com.dusin.cryptopia.remote.data;

import java.util.List;

/**
 * Created by Dylan Janeke on 2017/06/22.
 */
public class MarketOrderGroup {
    private Long tradePairId;
    private String market;
    private List<MarketOrder> buy;
    private List<MarketOrder> sell;

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

    public List<MarketOrder> getBuy() {
        return buy;
    }

    public void setBuy(List<MarketOrder> buy) {
        this.buy = buy;
    }

    public List<MarketOrder> getSell() {
        return sell;
    }

    public void setSell(List<MarketOrder> sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketOrderGroup{");
        sb.append("tradePairId=").append(tradePairId);
        sb.append(", market='").append(market).append('\'');
        sb.append(", buy=").append(buy);
        sb.append(", sell=").append(sell);
        sb.append('}');
        return sb.toString();
    }
}
