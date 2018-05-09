
package com.dusin.cryptopia.remote.data.enums;

/**
 * Created by Dylan Janeke on 2017/06/23.
 */
public enum TransactionType {
    DEPOSIT("Deposit"), WITHDRAW("Withdraw");
    private final String label;
    TransactionType(String l) {
        this.label = l;
    }

    public static TransactionType byLabel(String l) {
        for (TransactionType st : values()) {
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
