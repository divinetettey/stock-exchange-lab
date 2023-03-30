package io.turntabl.trades;

public class FundTrade extends Trade {
    private double rate;
    private double dividend;

    public FundTrade() {
    }

    public FundTrade(String ID, String symbol, int quantity, double price, double rate){
        super(ID, symbol,quantity,price);
        this.rate = rate;

        this.dividend = calcDividend();
    }

    @Override
    public double calcDividend() {
        return super.getPrice() * this.rate;
    }

    /**
     *  calculate dividend
     * @return
     */
//    @Override
//    public double calcDividend() {
//        if(this.dividend > 100 || this.dividend <  0){
//            return this.getPrice();
//        }
//
//        return this.getPrice() * (this.dividend/100);
//    }
}
