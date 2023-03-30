package main.turntable;

import main.turntable.trades.Trade;

public class Account {
    private double value;

    private Trade[] trades;

    public Account() {
        this(0);
    }

    public Account(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
