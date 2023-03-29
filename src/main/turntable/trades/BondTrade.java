package main.turntable.trades;

public class BondTrade  extends  Trade{
    final private double dividend;

    public BondTrade(String ID, String symbol,int quantity, double price, final double dividend){
        super(ID, symbol,quantity, price);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend(){
        return this.dividend;
    }

}
