package collectorsClass.streamCollectorsAverage;

import collectorsClass.streamCollectorsFetchingData.Student;

import java.util.stream.Collectors;

public class GettingAverage {
    public static void main(String[] args) {

//      Create Student class object to call studentDetails() method from Student Class
//      studentDetails() method has an ArrayList
        Student student = new Student();

//      Getting the average Age
        Double ageAverage = student.studentDetails().stream()
        .collect(Collectors.averagingDouble(Student::getAge));

        System.out.println("Average age of student is: " + ageAverage);
    }
}
