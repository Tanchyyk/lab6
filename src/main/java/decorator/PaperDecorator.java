package decorator;

import flowers.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return 13 + super.getPrice();
    }

    public String getDescription() {
        return super.getDescription() + ", decorated with paper";
    }
}
