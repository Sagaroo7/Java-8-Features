package java8Features.streamAPI.anyMatch;

import java8Features.streamAPI.allMatch.StudentDetails;

import java.util.List;
import java.util.function.Predicate;

public class StreamAnyMatch {

    public static void main(String[] args) {

        Predicate<StudentDetails> p1 = str -> str.getName().startsWith("S");
        Predicate<StudentDetails> p2 = str -> str.getName().startsWith("Z") && str.getAge() < 28;

        List<StudentDetails> studentList = StudentDetails.allDetails();

        boolean b1 = studentList.stream().anyMatch(p1);
        System.out.println(b1);

        boolean b2 = studentList.stream().anyMatch(p2);
        System.out.println(b2);
    }
}

//  Note:
//  Predicate p1 has condition that the student name starts with letter “S”
//  Predicate p2 has two conditions that the student name starts with letter “Z” and their age must be less than 28

//  When we pass predicate as an argument to the anyMatch() method
//  It iterates over the elements of the stream to find the match
//  Since their is a match for predicate p1 (Student “Steve” name starts with “S”), it returns true
//  However none of the element matches predicate p2 so the anyMatch() method returns false for p2.