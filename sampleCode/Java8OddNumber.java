package sampleCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8OddNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 7, 5, 6, 7, 8);

//      Using Java 8
//      1st Way
        List<Integer> oddList = list.stream()
                .filter(e -> e%2 != 0)                  // Function to find Odd Numbers
                .collect(Collectors.toList());          // Convert Stream to List
        Integer total = oddList.stream()
                .reduce(0, Integer::sum);       // Inbuilt Sum method in Java 8
        System.out.println("1st Way: " + total);

//      2nd Way
        Stream<Integer> oddNumbers = list.stream()
                .filter(e -> e%2 != 0);                 // Function to find Odd Numbers
        Integer result = oddNumbers
                .reduce(0, Integer::sum);       // Inbuilt Sum method in Java 8
        System.out.println("2nd Way: " + result);

//      3rd Way
        Integer sumOddNumbers = list.stream()           // Function to find Odd Numbers
                .filter(e -> e%2 != 0)                  // stream().collect(all Java 8 inbuilt methods)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("3rd Way: " + sumOddNumbers);

//      Without Java 8
        int sum = 0;
        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i)%2 != 0)
            {
                sum = sum+list.get(i);
            }
        }
        System.out.println("Without Java 8: " + sum);
    }
}
