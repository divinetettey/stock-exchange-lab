package main.turntable;

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

    }

    private static void printMessage(String message){
        System.out.println(message);
    }
}
