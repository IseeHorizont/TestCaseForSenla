package Task6;

public class Item {
    private String itemName;
    private int capacity;
    private int value;

    public Item(String itemName, int capacity, int value) {
        this.itemName = itemName;
        this.capacity = capacity;
        this.value = value;
    }

    public String getItemName() {
        return itemName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getValue() {
        return value;
    }
}
