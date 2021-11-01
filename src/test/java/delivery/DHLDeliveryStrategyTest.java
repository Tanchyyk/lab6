package delivery;

import flowers.Item;
import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    Flower flower1 = new Flower(FlowerType.TULIP);
    Flower flower2 = new Flower(FlowerType.CHAMOMILE);
    List<Item> items = new ArrayList<Item>();
    DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();

    @BeforeEach
    void setUp() {
        items.add(flower1);
        items.add(flower2);
    }

    @Test
    void deliver() {
        assertEquals("Items [Flower{price=0.0, sepalLength=0.0, color=null, flowerType=TULIP}, Flower{price=0.0, sepalLength=0.0, color=null, flowerType=CHAMOMILE}]are delivered by DHL service", dhlDeliveryStrategy.deliver(items));
    }
}