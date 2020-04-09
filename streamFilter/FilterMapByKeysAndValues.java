package streamFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByKeysAndValues {
    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "ABC");
        hmap.put(2, "XCB");
        hmap.put(3, "ABB");
        hmap.put(4, "ZIO");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(key -> key.getKey().intValue() <= 2)            // Filter by key
                .filter(value -> value.getValue().startsWith("A"))      // Filter by values
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result is: " + result);

//      forEach to iterate and display each key and value pair of HashMap
        System.out.println("\nforEach() to iterate a Map");
        hmap.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}

// Note:
// You can also place both the conditions in the single filter() method and join them using any logical operator
// Such as OR (||), AND(&&) or NOT(!)