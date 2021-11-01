import decorator.BasketDecorator;
import decorator.ItemDecorator;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower(FlowerType.TULIP);
        flower.setPrice(10);
        flower = new ItemDecorator(flower);
        System.out.println(flower.getPrice());
        System.out.println(flower.getDescription());

    }
}
