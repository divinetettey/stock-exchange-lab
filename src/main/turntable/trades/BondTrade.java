package main.turntable.trades;

public class BondTrade  extends  Trade{
    private double dividend;

    public BondTrade(String ID, String symbol, int quantity, double price){
        super(ID, symbol,quantity,price);
        this.dividend = 10;
    }

    @Override
    public double calcDividend() {
        return this.dividend;
    }
}
