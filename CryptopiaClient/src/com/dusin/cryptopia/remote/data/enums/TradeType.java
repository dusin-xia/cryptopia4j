
package com.dusin.cryptopia.remote.data.enums;

/**
 *
 * Created by Dylan Janeke on 2017/06/23.
 */
public enum TradeType {
    BUY("Buy"), SELL("Sell");
    private final String label;
    TradeType(String l) {
        this.label = l;
    }

    public static TradeType byLabel(String l) {
        for (TradeType st : values()) {
            if (st.label.equals(l)) {
                return st;
            }
        }
        return null;
    }

    public String getLabel() {
        return label;
    }
}
