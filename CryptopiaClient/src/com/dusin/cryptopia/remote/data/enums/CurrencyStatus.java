
package com.dusin.cryptopia.remote.data.enums;

/**
 *
 * Created by Dylan Janeke on 2017/06/22.
 */
public enum CurrencyStatus {
    OK("OK"), MAINTENANCE("Maintenance");
    private final String label;
    CurrencyStatus(String l) {
        this.label = l;
    }

    public static CurrencyStatus byLabel(String l) {
        for (CurrencyStatus st : values()) {
            if (st.label.equals(l)) {
                return st;
            }
        }
        return null;
    }
}