package streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndCollect {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longNames = names.stream()     // Converting the list to stream
        .filter(str -> str.length() > 6)            // Filter the stream to create a new stream
        .collect(Collectors.toList());              // Collect the final stream and convert it into a List

        List<String> multipleConditionLongNames = names.stream()
                .filter(str -> str.length() > 6 && str.length() < 8)    // Filter the stream with Multiple Condition
                .collect(Collectors.toList());

        longNames.forEach(System.out::println);

        System.out.println("\nResult using multiple conditions in filter:");
        multipleConditionLongNames.forEach(System.out::println);
    }
}
