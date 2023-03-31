package io.turntabl.membership;

public class Silver extends MembershipType{
    private final int MAX_TRADES_PER_DAY = 10;
    public Silver() {
        this.setMinPoints(11);
        this.setMaxPoints(19);

        this.setMaxTradesPerDay(MAX_TRADES_PER_DAY);
    }
}
