package main.turntable;

import main.turntable.clients.Bronze;
import main.turntable.clients.Client;
import main.turntable.clients.MembershipType;
import main.turntable.trades.BondTrade;
import main.turntable.trades.Trade;

public class Exchange {
    public static void main(String [] args){
        System.out.println("Welcome To Exchange");


//        Account account = new Account();
//        Trader trader = new Trader("John Bolton", account);
//        printMessage("New Trader: "+trader.getName()+" \nAccount Trades: "+trader.getAccount().getValue());


//        BondTrade bondTrade = new BondTrade("ID","APL",100, 10.34, 19);
//
//        printMessage("Trade: "+bondTrade.toString());
//        printMessage("Bond Dividend: "+bondTrade.calcDividend());

        //create a new client
//        Client client = new Client("Sheldon", "Cooper");
//        printMessage("New Client Added: "+client.getFirstName() + " "+client.getLastName());
//
//        BondTrade bondTrade = new BondTrade("BT001","BCP", 10,10.23);
//
//
//        Bronze bronze = new Bronze();
//        client.setPointsGained(1);
//        client.setMembershipType(bronze);
//        client.addTrade(bondTrade);
//
//        printMessage(client.getFullName()+" added new trade: "+bondTrade.toString());
//        printMessage("Points Gained: "+client.getPointsGained());
    }

    private static void printMessage(String message){
        System.out.println(message);
    }
}
