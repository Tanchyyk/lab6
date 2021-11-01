package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            totalPrice += flowerPack.getPrice();
        }
        return totalPrice;
    }

}
