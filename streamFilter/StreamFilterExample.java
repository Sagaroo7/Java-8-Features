package streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

//      Creating the stream of all names
        Stream<String> allNames = names.stream();

//      Creating another stream by filtering long names using filter()
        Stream<String> longNames = allNames.filter(str -> str.length() < 6);

//      displaying the long names
        longNames.forEach(str -> System.out.println(str));
    }
}

//  Note:
//  We are creating a stream from the list of names using stream() method
//  Then we are creating another stream of long names using stream filter()
//  The stream filter transforms the data from one stream to another stream

