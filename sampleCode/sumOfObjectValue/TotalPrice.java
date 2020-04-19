package sampleCode.sumOfObjectValue;

import java.util.Arrays;
import java.util.List;

public class TotalPrice {

    public static void main(String[] args) {

        Item item1 = new Item(1, "Table", 39.50);
        Item item2 = new Item(2, "Chair", 29.50);
        Item item3 = new Item(3, "Lamp", 10.99);

        List<Item> itemList = Arrays.asList(item1, item2, item3);

        double totalPrice = itemList.stream().mapToDouble(Item::getPrice).sum();
        System.out.println("Total price of all itens: " + totalPrice);
    }
}
