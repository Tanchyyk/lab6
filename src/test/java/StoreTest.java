import flowers.Flower;
import flowers.FlowerType;
import flowers.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store = new Store();
    private Flower flower1 = new Flower(FlowerType.TULIP);
    private Flower flower2 = new Flower(FlowerType.ROSE);
    private Flower flower3 = new Flower(FlowerType.CHAMOMILE);


    @BeforeEach
    void setUp() {
        store.setFlowers(flower1);
        store.setFlowers(flower2);
    }

    @Test
    void searchFlower() {
        assertTrue(store.searchFlower(flower1));
        assertTrue(store.searchFlower(flower2));
        assertFalse(store.searchFlower(flower3));
    }
}