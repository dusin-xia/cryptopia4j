package com.dusin.cryptopia.remote.data.enums;

/**
 *
 * Created by Dylan Janeke on 2017/06/22.
 */
public enum TradePairStatus {
    OK("OK"), PAUSED("Paused");
    private final String label;
    TradePairStatus(String l) {
        this.label = l;
    }

    public static TradePairStatus byLabel(String l) {
        for (TradePairStatus st : values()) {
            if (st.label.equals(l)) {
                return st;
            }
        }
        return null;
    }
}
