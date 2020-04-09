package streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValues {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);

        List<String> result = list.stream()
                .filter(str -> str != null)
                .collect(Collectors.toList());

        result.forEach(System.out::println);            // Print with forEach loop using method references
        System.out.println("Result is: " + result);     // Print as normal Array
    }
}
