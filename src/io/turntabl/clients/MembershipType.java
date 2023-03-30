package io.turntabl.clients;

import io.turntabl.trades.Trade;

public class MembershipType {
    private int minPoints;
    private int maxPoints;
    private int maxTradesPerDay;

    //TODO: REFACTOR THIS TO CLIENTS
    protected double MAX_TRADE_VALUE = 10000;

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
     * check if the member is allowed to trade
     *
     * @param trade
     * @return
     */
    public boolean canTrade(Trade trade){

        return trade.getQuantity() < maxTradesPerDay &&   (trade.getQuantity()* trade.getPrice()) < MAX_TRADE_VALUE;
    }
}
