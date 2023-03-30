package io.turntabl;

import io.turntabl.trades.Trade;

public class Account {
    private double value;

    private Trade[] trades;

    public Account() {
        this.trades = new Trade[10];
    }

    public void setTrades(Trade[] trades){
        this.trades = trades;
    }

    public Trade[] getTrades(){
        return this.trades;
    }


    /**
     * get total value of account 
     * @return
     */
    public double getTotalValues(){
        double total = 0; 
        for(int i = 0; i < trades.length;i++){
            if(trades[i] != null){
                total += (trades[i].getPrice() * trades[i].getQuantity());
            }
        }

        return total;
    }
}
