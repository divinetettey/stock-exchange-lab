package main.turntable.clients;

public class Bronze extends MembershipType{

    private final int MAX_TRADES_PER_DAY = 5;
    public Bronze()
    {
        this.setMinPoints(1);
        this.setMaxPoints(10);

        this.setMaxTradesPerDay(MAX_TRADES_PER_DAY);
    }

}
