package streamAPI.allMatch;

import java.util.List;
import java.util.function.Predicate;

public class StreamAllMatch {
    public static void main(String[] args) {

        Predicate<StudentDetails> p1 = s -> s.getName().startsWith("A");
        Predicate<StudentDetails> p2 = age -> age.getAge() < 40;
        Predicate<StudentDetails> p3 = s -> s.getName().startsWith("P") && s.getAge() < 40;

        List<StudentDetails> studentList = StudentDetails.allDetails();

//      allMatch() method returns true
//      if, all the elements of stream satisfy the given predicate
//      else, it returns false

//      This will return false because all student names do not start with "A"
        boolean b1 = studentList.stream().allMatch(p1);
        System.out.println("allMatch(P1) is: " + b1);

//      This will return true because all students have age less than 40
        boolean b2 = studentList.stream().allMatch(p2);
        System.out.println("allMatch(P2) is: " + b2);

//      This will return false because all the students do not satisfy the predicate:
//      Age must be less than 40 and name starts with letter "P"
        boolean b3 = studentList.stream().allMatch(p3);
        System.out.println("allMatch(P3) is: " + b3);
    }
}
