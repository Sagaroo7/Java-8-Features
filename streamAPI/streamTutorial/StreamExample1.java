package streamAPI.streamTutorial;

import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        Stream.iterate(1, count -> count+1)
                .filter(number -> number%3 == 0)
                .limit(6)
                .forEach(System.out::println);          // Display the stream using forEach()
    }
}
