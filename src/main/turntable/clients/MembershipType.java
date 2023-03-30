package main.turntable.clients;

public class MembershipType {
    private int minPoints;
    private int maxPoints;
    private int maxTradesPerDay;


    public MembershipType() {
    }

    public MembershipType(int minPoints,int maxPoints) {
        this.minPoints = minPoints;
        this.maxPoints = maxPoints;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public void setMaxTradesPerDay(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    /**
     *
     * @param quantity
     * @param tradeValue
     * @return
     */
    public boolean canTrade(int quantity,double tradeValue){
        double MAX_TRADE_VALUE = 10000;
        return (quantity < this.getMaxTradesPerDay())  && (tradeValue < MAX_TRADE_VALUE);
    }
}
