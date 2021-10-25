import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(10);
        flowerPack = new FlowerPack(flower, 10);
    }

    @Test
    void getPrice() {
        assertEquals(100, flowerPack.getPrice());
    }
}