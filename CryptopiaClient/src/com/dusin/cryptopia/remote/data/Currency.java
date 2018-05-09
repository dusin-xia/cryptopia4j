
package com.dusin.cryptopia.remote.data;



import com.dusin.cryptopia.remote.data.enums.CurrencyListingStatus;
import com.dusin.cryptopia.remote.data.enums.CurrencyStatus;
import java.math.BigDecimal;

/**
 * Created by Dylan Janeke on 2017/06/22.
 */
public class Currency {
    private Long id;
    private String name;
    private String symbol;
    private String algorithm;
    private BigDecimal withdrawFee;
    private BigDecimal minWithdraw;
    private BigDecimal minBaseTrade;
    private boolean isTipEnabled;
    private BigDecimal minTip;
    private Long depositConfirmations;
    private CurrencyStatus status;
    private String statusMessage;
    private CurrencyListingStatus listingStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public BigDecimal getMinWithdraw() {
        return minWithdraw;
    }

    public void setMinWithdraw(BigDecimal minWithdraw) {
        this.minWithdraw = minWithdraw;
    }

    public BigDecimal getMinBaseTrade() {
        return minBaseTrade;
    }

    public void setMinBaseTrade(BigDecimal minBaseTrade) {
        this.minBaseTrade = minBaseTrade;
    }

    public boolean isTipEnabled() {
        return isTipEnabled;
    }

    public void setTipEnabled(boolean tipEnabled) {
        isTipEnabled = tipEnabled;
    }

    public BigDecimal getMinTip() {
        return minTip;
    }

    public void setMinTip(BigDecimal minTip) {
        this.minTip = minTip;
    }

    public Long getDepositConfirmations() {
        return depositConfirmations;
    }

    public void setDepositConfirmations(Long depositConfirmations) {
        this.depositConfirmations = depositConfirmations;
    }

    public CurrencyStatus getStatus() {
        return status;
    }

    public void setStatus(CurrencyStatus status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public CurrencyListingStatus getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(CurrencyListingStatus listingStatus) {
        this.listingStatus = listingStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Currency{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", symbol='").append(symbol).append('\'');
        sb.append(", algorithm='").append(algorithm).append('\'');
        sb.append(", withdrawFee=").append(withdrawFee);
        sb.append(", minWithdraw=").append(minWithdraw);
        sb.append(", minBaseTrade=").append(minBaseTrade);
        sb.append(", isTipEnabled=").append(isTipEnabled);
        sb.append(", minTip=").append(minTip);
        sb.append(", depositConfirmations=").append(depositConfirmations);
        sb.append(", status=").append(status);
        sb.append(", statusMessage='").append(statusMessage).append('\'');
        sb.append(", listingStatus=").append(listingStatus);
        sb.append('}');
        return sb.toString();
    }
}
