package decorator;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Item flower = new Flower(FlowerType.TULIP);

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        flower = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(50, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower{price=10.0, sepalLength=0.0, color=null, flowerType=TULIP}, decorated with ribbon", flower.getDescription());
    }
}