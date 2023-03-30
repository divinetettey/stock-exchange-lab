package io.turntabl.clients;

public class Gold extends MembershipType{
    private final int MAX_TRADES_PER_DAY = 20;
    public Gold(){
        this.setMinPoints(20);

        this.setMaxTradesPerDay(MAX_TRADES_PER_DAY);
    }
}
