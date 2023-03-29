package tlc.turntable;

public class Trade {
    private String ID;
    private String symbol;
    private int quantity;
    private double price;

    public Trade() {

    }

    public Trade(String ID, String symbol, int quantity, double price){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        this.price = price;
    }

    public String toString() {
        return this.ID+":"+this.symbol+":"+this.quantity+":"+this.price;
    }
}
