package sampleCode.sumOfOddNumbers;

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
        int total = oddList.stream()
                .reduce(0, Integer::sum);       // Inbuilt Sum method in Java 8
        System.out.println("1st Way: " + total);

//      2nd Way
        Stream<Integer> oddNumbers = list.stream()
                .filter(e -> e%2 != 0);                 // Function to find Odd Numbers
        int result = oddNumbers
                .reduce(0, Integer::sum);       // Inbuilt Sum method in Java 8
        System.out.println("2nd Way: " + result);

//      3rd Way
        int sumOddNumbers = list.stream()           // Function to find Odd Numbers
                .filter(e -> e%2 != 0)                  // stream().collect(all Java 8 inbuilt methods)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("3rd Way: " + sumOddNumbers);

//      4th Way
        int sumOfOddNumbers = list.stream()
                .filter(e -> e%2 != 0)                  // Function to find Odd Numbers
                .mapToInt(Integer::valueOf)             // You can also use (Integer::intValue) instead of (Integer::valueOf)
                .sum();
        System.out.println("4th Way: " + sumOfOddNumbers);

//      Without Java 8
        int sum = 0;
        for (int i : list) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Without Java 8: " + sum);
    }
}
