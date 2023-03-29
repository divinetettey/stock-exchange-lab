package main.turntable.trades;

public class FundTrade extends Trade {
    private double dividend;

    public FundTrade(String ID, String symbol, int quantity, double price, double dividend){
        super(ID, symbol,quantity,price);
        this.dividend = dividend;
    }

    /**
     *  calculate dividend
     * @return
     */
    @Override
    public double calcDividend() {
        if(this.dividend > 100 || this.dividend <  0){
            return this.getPrice();
        }


        return this.getPrice() * (this.dividend/100);
    }
}
