package delivery;

import flowers.Item;
import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
}
