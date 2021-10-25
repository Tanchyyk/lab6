import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(5);
        flower.setColor(new int[]{127, 0, 0});
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(5, flower.getPrice());
    }

    @Test
    void getColor() {
        assertEquals(127, flower.getColor()[0]);
        assertEquals(0, flower.getColor()[1]);
        assertEquals(0, flower.getColor()[2]);
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}