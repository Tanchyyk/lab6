package delivery;

import flowers.Item;
import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "Items " + items + "are delivered by DHL service";
    }
}
