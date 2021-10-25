import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(4);
        FlowerPack flowerPack = new FlowerPack(flower, 2);
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(8, flowerBucket.getPrice());
    }
}