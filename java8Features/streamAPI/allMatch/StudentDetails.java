package java8Features.streamAPI.allMatch;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

    private int id;
    private String name;
    private int age;

    public StudentDetails(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<StudentDetails> allDetails()
    {
        List<StudentDetails> studentDetailsList = new ArrayList<>();
        studentDetailsList.add(new StudentDetails(11, "Lucy", 28));
        studentDetailsList.add(new StudentDetails(28, "Tim", 27));
        studentDetailsList.add(new StudentDetails(32, "Daniel", 30));
        studentDetailsList.add(new StudentDetails(49, "Steve", 27));
        return studentDetailsList;
    }
}
