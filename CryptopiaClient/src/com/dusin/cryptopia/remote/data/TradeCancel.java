
package com.dusin.cryptopia.remote.data;



import com.dusin.cryptopia.remote.data.enums.CancelType;
import java.math.BigDecimal;

/**
 *
 * Created by Dusin on 2018/05/05.
 */
public class TradeCancel {
    
    private CancelType type;
    private Long OrderId;
    private Long TradePairId;

    public CancelType getType() {
        return type;
    }

    public void setType(CancelType type) {
        this.type = type;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public Long getTradePairId() {
        return TradePairId;
    }

    public void setTradePairId(Long TradePairId) {
        this.TradePairId = TradePairId;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeCancel{");
        sb.append("type='").append(type);
        sb.append(", OrderId=").append(OrderId);
        sb.append(", TradePairId=").append(TradePairId);        
        sb.append('}');
        return sb.toString();
    }
}
