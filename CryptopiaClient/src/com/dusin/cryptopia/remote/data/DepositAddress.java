
package com.dusin.cryptopia.remote.data;

/**
 *
 * Created by Dylan Janeke on 2017/06/23.
 */
public class DepositAddress {
    private String currency;
    private String address;
    private String baseAddress;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DepositAddress{");
        sb.append("currency='").append(currency).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", baseAddress='").append(baseAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
