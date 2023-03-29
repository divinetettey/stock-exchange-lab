package main.turntable;

public class Exchange {
    public static void main(String [] args){
        System.out.println("Welcome To Exchange");


        Account account = new Account();
        Trader trader = new Trader("John Bolton", account);
        printMessage("New Trader: "+trader.getName()+" \nAccount Trades: "+trader.getAccount().getTotalTrades());
    }

    private static void printMessage(String message){
        System.out.println(message);
    }
}
