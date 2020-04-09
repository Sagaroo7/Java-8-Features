package java8Features.streamAPI.streamTutorial;

import java.util.ArrayList;
import java.util.List;

public class UsingStream {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");

//      Without Stream
        int count = 0;
        for (String str: names)
        {
            if (str.length() < 6)
                count++;
        }
        System.out.println("There are " + count + " names their length is below six");

//      Using Stream
        long count1 = names.stream().filter(str -> str.length() < 6).count();
        System.out.println("Using Stream the result is: " + count1);
    }
}

//  Note:
//  stream() method returns a stream of all the names
//  filter() method returns another stream of names with length less than 6
//  count() method reduces this stream to the result
//  All these operations are happening paralleled
//  which means we are able to parallelize the code with the help of streams
//  Parallel execution of operations using stream is faster than sequential execution without using streams.
