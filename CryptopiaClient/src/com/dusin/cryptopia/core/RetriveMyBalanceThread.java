/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dusin.cryptopia.core;

import com.dusin.cryptopia.CryptopiaClient;
import com.dusin.cryptopia.remote.data.Balance;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author vcc
 */
public class RetriveMyBalanceThread extends Thread{
    private boolean isStop;
    private int sleepSeconds;
    private HashMap<String,Balance> balances  ;
    private CryptopiaClient cryptopiaClient;
    private List<String> currency;
    
    @Override
    public void run() {
        while(!isStop){
            try {
                sleep(sleepSeconds);
            } catch (InterruptedException ex) {
                
            }
        }
        
    }
    
}
