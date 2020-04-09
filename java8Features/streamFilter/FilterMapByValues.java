package java8Features.streamFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByValues {
    public static void main(String[] args) {

        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(11, "Apple");
        fruits.put(22, "Orange");
        fruits.put(33, "Kiwi");
        fruits.put(44, "Banana");

        Map<Integer, String> result = fruits.entrySet()
                .stream().filter(map -> "Orange"
                .equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result is: " + result);
    }
}
