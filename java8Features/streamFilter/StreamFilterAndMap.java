package java8Features.streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndMap {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squareNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.print(squareNumbers);
    }
}
