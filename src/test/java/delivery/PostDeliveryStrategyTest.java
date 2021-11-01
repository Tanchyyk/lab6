package delivery;

import flowers.Item;
import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    Flower flower = new Flower(FlowerType.ROSE);
    List<Item> items = new ArrayList<Item>();
    PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
    @BeforeEach
    void setUp() {
        items.add(flower);
    }

    @Test
    void deliver() {
        assertEquals("Items [Flower{price=0.0, sepalLength=0.0, color=null, flowerType=ROSE}] are delivered by post", postDeliveryStrategy.deliver(items));
    }
}