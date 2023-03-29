package tlc.turntable;

public class Account {
    private double totalTrades;

    public Account() {
        this(0);
    }

    public Account(double totalTrades) {
        this.totalTrades = totalTrades;
    }

    public double getTotalTrades() {
        return totalTrades;
    }

    public void setTotalTrades(double totalTrades) {
        this.totalTrades = totalTrades;
    }
}
