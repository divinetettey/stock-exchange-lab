package main.turntable;

public class Account {
    private double value;

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
