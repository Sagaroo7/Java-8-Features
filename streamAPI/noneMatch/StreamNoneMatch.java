package streamAPI.noneMatch;

import streamAPI.allMatch.StudentDetails;

import java.util.List;
import java.util.function.Predicate;

public class StreamNoneMatch {
    public static void main(String[] args) {

        Predicate<StudentDetails> p1 = str -> str.getName().startsWith("S");
        Predicate<StudentDetails> p2 = str -> str.getName().startsWith("P") && str.getAge() < 28;

        List<StudentDetails> detailsList = StudentDetails.allDetails();

        boolean b1 = detailsList.stream().noneMatch(p1);
        System.out.println(b1);

        boolean b2 = detailsList.stream().noneMatch(p2);
        System.out.println(b2);
    }
}

//  Note:
//  The first call to the noneMatch() method with predicate p1 as argument returns false
//  Because there is an element in the stream that matches the condition specified by p1.
//  The second call to the noneMatch() method with predicate p2 as argument returns true
//  Because there is no element in the stream that matches the given conditions.