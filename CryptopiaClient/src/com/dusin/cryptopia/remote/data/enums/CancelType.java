
package com.dusin.cryptopia.remote.data.enums;

/**
 *
 * Created by Dusin on 2018/05/05.
 */
public enum CancelType {
    ALL("All"), TRADE("Trade"),TRADEPAIR("TradePair");
    private final String label;
    CancelType(String l) {
        this.label = l;
    }

    public static CancelType byLabel(String l) {
        for (CancelType st : values()) {
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
