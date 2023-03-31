package io.turntabl.trades;

public class BondTrade  extends  Trade{
    final private double dividend;

    public BondTrade(String id, String symbol,int quantity, double price, final double dividend){
        super(id, symbol,quantity, price);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend(){
        return this.dividend;
    }

}
