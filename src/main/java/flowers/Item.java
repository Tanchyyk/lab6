package flowers;

public abstract class Item {
    private double price;

    public abstract String getDescription();
    public abstract double getPrice();

    public void setPrice(double price){
        this.price = price;
    };
}
