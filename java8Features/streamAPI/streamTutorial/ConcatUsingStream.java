package java8Features.streamAPI.streamTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatUsingStream {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("My", "name", "is");
        List<String> names = Arrays.asList("Sagar","Dave");

        Stream<String> concatStream = Stream.concat(strings.stream(), names.stream());
        concatStream.forEach(str -> System.out.print(str + " "));
    }
}
