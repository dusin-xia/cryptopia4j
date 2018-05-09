
package com.dusin.cryptopia.remote.data.enums;

/**
 * Created by Dylan Janeke on 2017/06/22.
 */
public enum CurrencyListingStatus {
    ACTIVE("Active"), DELISTING("Delisting");
    private final String label;
    private CurrencyListingStatus(String l) {
        this.label = l;
    }

    public static CurrencyListingStatus byLabel(String l) {
        for (CurrencyListingStatus st : values()) {
            if (st.label.equals(l)) {
                return st;
            }
        }
        return null;
    }
}
