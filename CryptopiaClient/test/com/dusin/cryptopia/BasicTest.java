package com.dusin.cryptopia;

import com.dusin.cryptopia.remote.data.MarketOrders;
import com.dusin.cryptopia.remote.data.OpenOrder;
import com.dusin.cryptopia.remote.data.TradeCancel;
import com.dusin.cryptopia.remote.data.TradeSubmission;
import com.dusin.cryptopia.remote.data.enums.CancelType;
import com.dusin.cryptopia.remote.data.enums.TradeType;
import com.dusin.cryptopia.remote.data.enums.TransactionType;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Really just serves as a sample for using this lib. Created by Dylan Janeke on
 * 2017/06/23.
 */
public class BasicTest {

    final CryptopiaClient client
            = new CryptopiaClient();

    {
        client.setKey("c1556435c4694264972acdaa59eba81f");
        client.setSecretKey("FRtHQ4N9NbQCKFkRHbocgHG4eW9C6K06O8QQ0UEMkm0=");
    }

    // * -- Public API -- * //
    @Test
    public void testGetCurrencies() {
        System.out.println("* -- GetCurrencies -- *");
        client.getCurrencies().forEach(System.out::println);
    }

    @Test
    public void testGetTradePairs() {
        System.out.println("* -- GetTradePairs -- *");
        client.getTradePairs().forEach(System.out::println);
    }

    @Test
    public void testGetMarkets() {
        System.out.println("* -- GetMarkets -- *");
        client.getMarkets("BTC").forEach(System.out::println);
    }

    @Test
    public void testGetMarket() {
        System.out.println("* -- GetMarket -- *");
        System.out.println(client.getMarket("GUN_DOGE"));
    }

    @Test
    public void testGetMarketHistory() {
        System.out.println("* -- GetMarketHistory -- *");
        client.getMarketHistory("GUN_DOGE", 1).forEach(System.out::println);
    }

    @Test
    public void testGetMarketOrders() {
        System.out.println("* -- GetMarketOrders -- *");
        MarketOrders orders = client.getMarketOrders("GUN_DOGE", 2L);
        orders.getBuy().forEach(System.out::println);
        orders.getSell().forEach(System.out::println);
    }

    @Test
    public void testGetMarketOrderGroups() {
        System.out.println("* -- GetMarketOrderGroups -- *");
        client.getMarketOrderGroups(Arrays.asList("GUN_DOGE", "ETH_BTC"), 1).forEach(System.out::println);
    }

    // * -- Private API -- * //
    @Test
    public void testGetBalance() {
        client.getBalance("GUN").forEach(System.out::println);
        client.getBalance("FTC").forEach(System.out::println);
        client.getBalance("BTC").forEach(System.out::println);
    }

    @Test
    public void testGetDepositAddress() {
        System.out.println(client.getDepositAddress("GUN"));
    }

    @Test
    public void testGetOpenOrders() {
        client.getOpenOrders("GUN_DOGE").forEach(System.out::println);
    }

    @Test
    public void testGetTradeHistory() {
        client.getTradeHistory("GUN_DOGE");
    }

    @Test
    public void testGetTransactions() {
        client.getTransactions(TransactionType.DEPOSIT).forEach(System.out::println);
    }

    //@Test
    public void testSubmitTrade() {
        client.submitTrade(new TradeSubmission()
                .setType(TradeType.BUY)//.setMarketId(1461L)
                .setMarket("GUN_DOGE")
                .setRate(new BigDecimal(0.00000011))
                .setAmount(new BigDecimal(5000.0000))
        );
    }

    //@Test 
    public void testCancelTrade() {
        TradeCancel tradeCancel = new TradeCancel();
        tradeCancel.setType(CancelType.TRADE);
        tradeCancel.setOrderId(636712440L);
        client.cancelTrade(tradeCancel);
    }

    //第一次自动交易。如果卖单成交，则下一个买单。
    @Test
    public void checkAndBuy() {
        List<OpenOrder> list=null;
        while (true) {
            int amount = 6000;  //假设两个买单都不在了，则买入6000
            try{
                 list = client.getOpenOrders("GUN_BTC");
            }catch(Exception e){
                System.out.println(e.getMessage());
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                continue;
            }
            for (OpenOrder order : list) {
                if (order.getOrderId() == 648532209) {  //老卖单还在，没有成交。则买入0
                    amount = 0;
                }
                if (order.getOrderId() == 648540870) { //新卖单还在
                    amount = 3000;
                }
            }
            System.out.println(amount);                    
            if(amount!=0)
                break;
            try {
                Thread.sleep(120000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        //下买单
        client.submitTrade(new TradeSubmission()
                .setType(TradeType.BUY)//.setMarketId(1461L)
                .setMarket("GUN_BTC")
                .setRate(new BigDecimal(0.00000046))
                .setAmount(new BigDecimal(3000.0000))
        );
    }
}
