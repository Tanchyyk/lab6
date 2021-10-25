import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter @Setter
    private List<Flower> flowers = new ArrayList<Flower>();
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    private List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public boolean searchFlower(Flower flower) {
        return flowers.contains(flower);
    }

    public boolean searchPack(FlowerPack flowerPack) {
        return flowerPacks.contains(flowerPack);
    }

    public boolean searchBucket(FlowerBucket flowerBucket) {
        return flowerBuckets.contains(flowerBucket);
    }

    public void setFlowers(Flower flower) {
        this.flowers.add(flower);
    }

    public void setFlowerPacks(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public void setFlowerBuckets(FlowerBucket flowerBucket) {
        this.flowerBuckets.add(flowerBucket);
    }
}
