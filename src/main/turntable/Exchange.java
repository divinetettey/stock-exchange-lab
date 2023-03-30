package main.turntable;

import main.turntable.clients.Bronze;
import main.turntable.clients.Client;
import main.turntable.clients.MembershipType;
import main.turntable.trades.BondTrade;
import main.turntable.trades.FundTrade;
import main.turntable.trades.Trade;

import java.time.LocalDateTime;

public class Exchange {
    public static void main(String [] args){
        System.out.println("Welcome To Exchange");


//        Account account = new Account();
//        Trader trader = new Trader("John Bolton", account);
//        printMessage("New Trader: "+trader.getName()+" \nAccount Trades: "+trader.getAccount().getValue());


        // BondTrade bondTrade = new BondTrade("ID","APL",1, 10.34, 19);
//
//        printMessage(bondTrade.toString());
//        printMessage("Bond Dividend: "+bondTrade.calcDividend());

        // //create a new client
        // Client client = new Client("Sheldon", "Cooper");
        // printMessage("New Client Added: "+client.getFirstName() + " "+client.getLastName());

//        BondTrade bondTrade = new BondTrade("BT001","BCP", 10,10.23);
//
//
        //update trading start time and check if they can add trade
        // bondTrade.setTradeCreatedAt(LocalDateTime.now().minusHours(10L));
        // Bronze bronze = new Bronze();
        // client.setMembershipType(bronze);
        // if(client.addTrade(bondTrade)){
        //     printMessage("Can Add Bond Trade: "+bondTrade.getSymbol());
        //     printMessage("Points Gained: "+client.getPointsGained());
        // } else {
        //     printMessage("Can Not Add Bond Trade: "+bondTrade.getSymbol());
        // }

        // //test for fund trade
        // FundTrade fundTrade = new FundTrade("FT1","ACL", 2, 104, 10);
        // if(client.addTrade(fundTrade)){
        //     printMessage("Can Add Fund Trade: "+fundTrade.getSymbol());
        //     printMessage("Points Gained: "+client.getPointsGained());
        // } else {
        //     printMessage("Can Not Add Fund Trade");
        // }

        Account account = new Account();
        BondTrade[] bondTrades = new BondTrade[10];
        for(int i = 0; i < 7; i++){
            BondTrade trade = new BondTrade("T23","MSFT",i,i*12.35,13);
            bondTrades[i] = trade;
        }

        System.out.println("Total Values: "+account.getTotalValues());

    }

    private static void printMessage(String message){
        System.out.println(message);
    }
}
