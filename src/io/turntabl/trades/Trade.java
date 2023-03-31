package io.turntabl.trades;

import java.time.LocalDateTime;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

    private LocalDateTime tradeCreatedAt;

    public Trade() {

    }

    public Trade(String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

        tradeCreatedAt = LocalDateTime.now();
    }

    public Trade(String id, String symbol, int quantity) {
        this(id,symbol, quantity, 0.0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0.0){
            this.price = 0.0;
        } else{
            this.price = price;
        }
    }

    public LocalDateTime getTradeCreatedAt() {
        return tradeCreatedAt;
    }

    public void setTradeCreatedAt(LocalDateTime tradeCreatedAt) {
        this.tradeCreatedAt = tradeCreatedAt;
    }

    public String toString() {

        return "\nTRADE DETAILS " +
                "\nID: "+ id +
                "\nSymbol:  "+ symbol +
                "\nQuantity: "+ quantity +
                "\nPrice: "+ price +
                "\nCreated At: "+ tradeCreatedAt.toString();
    }

    public abstract double calcDividend();
}
