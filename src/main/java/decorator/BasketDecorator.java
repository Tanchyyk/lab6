package decorator;

import flowers.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (4 + super.getPrice());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with basket";
    }
}
