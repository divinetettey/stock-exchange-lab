package main.turntable;

import main.turntable.clients.Client;
import main.turntable.trades.BondTrade;

public class Exchange {
    public static void main(String [] args){
        System.out.println("Welcome To Exchange");


        Account account = new Account();
        Trader trader = new Trader("John Bolton", account);
        printMessage("New Trader: "+trader.getName()+" \nAccount Trades: "+trader.getAccount().getTotalTrades());

//        BondTrade bondTrade = new BondTrade(10.4);
//        bondTrade.setID("BT01");
//        bondTrade.setPrice(103.32);
//        bondTrade.setSymbol("BPL");
//
//
//        printMessage("Trade: "+bondTrade.toString());
//        printMessage("Bond Dividend: "+bondTrade.calcDividend());

        //create a new client
        Client client = new Client("Sheldon", "Cooper");
        printMessage("New Client Added: "+client.getFirstName() + " "+client.getLastName());

        BondTrade bondTrade = new BondTrade("BT001","BCP", 10,10.23, 10.4);
        printMessage(client.getFullName()+" added new trade: "+bondTrade.toString());
    }

    private static void printMessage(String message){
        System.out.println(message);
    }
}
