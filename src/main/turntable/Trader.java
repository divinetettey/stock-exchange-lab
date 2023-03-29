package main.turntable;

import main.turntable.trades.Trade;

public class Trader {
    private String name;
    private Account account;

    public Trader() {
        this("", null);
    }
    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * add a new trade to the account
     *
     * @param trade
     */
    public void addTrade(Trade trade){
        this.account.setTotalTrades(trade.getPrice() * trade.getQuantity());
    }
}
