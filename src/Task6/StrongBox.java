package Task6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StrongBox {
    private Item[] items;
    private int totalValue;

    public StrongBox(Item[] items, int totalValue) {
        this.items = items;
        this.totalValue = totalValue;
    }

    public Item[] getItems() {
        return items;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public String getInfoAboutStrongBox() {
        return items == null ? "box is empty" : Arrays.stream(items).map(Item::getItemName)
                                                                    .collect(Collectors.joining("+"))
                                                                    + "-" + getTotalValue();
    }
}
