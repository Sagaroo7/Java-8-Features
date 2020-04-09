package collectorsClass.streamCollectorsFetchingData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FetchingDataFromList {
    public static void main(String[] args) {

//      Create Student class object to call studentDetails() method from Student Class
//      studentDetails() method has an ArrayList
        Student student = new Student();

//      Fetching student names as List
        List<String> studentNames = student.studentDetails().stream()
                .map(studentName -> studentName.getName())
                .collect(Collectors.toList());

        System.out.println(studentNames);
    }
}

// Note:
// we are converting the list of students to the stream
// Then we are applying the Java Stream filter to get the selected records from the stream
// After that we are converting that stream to set using Collectors.toSet() method.