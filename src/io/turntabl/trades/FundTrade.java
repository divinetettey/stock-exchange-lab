package io.turntabl.trades;

public class FundTrade extends Trade {
    private double rate;
    private double dividend;

    public FundTrade() {
    }

    public FundTrade(String id, String symbol, int quantity, double price, double rate){
        super(id, symbol,quantity,price);
        this.rate = rate;

        this.dividend = calcDividend();
    }

    @Override
    public double calcDividend() {
        return super.getPrice() * this.rate;
    }

}
