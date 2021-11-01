package flowers;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    @Getter @Setter
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
