package Task6;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task6 {

    public static void main(String[] args) {
        int itemCount = 3;
        int strongBoxCapacity = 4;

        Item[] items = {
                new Item("Батон", 1, 1500),
                new Item("Топор", 4, 3000),
                new Item("Винтовка", 3, 2000),
        };

        StrongBox[][] box = new StrongBox[itemCount + 1][strongBoxCapacity + 1];

        for (int i = 0; i < itemCount + 1; i++) {
            for (int j = 0; j < strongBoxCapacity + 1; j++) {
                if (i == 0 || j == 0) {
                    box[i][j] = new StrongBox(new Item[]{}, 0);
                } else if (i == 1) {
                    box[1][j] = items[0].getCapacity() <= j ? new StrongBox(new Item[]{items[0]}, items[0].getValue())
                                                            : new StrongBox(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getCapacity() > j) {
                        box[i][j] = box[i - 1][j];
                    } else {
                        int newValue = items[i - 1].getValue() + box[i - 1][j - items[i - 1].getCapacity()].getTotalValue();
                        if (box[i - 1][j].getTotalValue() > newValue) {
                            box[i][j] = box[i - 1][j];
                        } else {
                            box[i][j] = new StrongBox(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}), Arrays.stream(box[i - 1][j - items[i - 1].getCapacity()].getItems())).toArray(Item[]::new), newValue);
                        }
                    }
                }
            }
        }

        for (int i = 1; i < itemCount + 1; i++) {
            for (int j = 1; j < strongBoxCapacity + 1; j++) {
                System.out.print(box[i][j].getInfoAboutStrongBox() + "  ");
            }
            System.out.println();
        }
    }
}
