package collectorsClass.streamCollectorsFetchingData;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
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

    public List<Student> studentDetails()
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(11,"Jon",22));
        studentList.add(new Student(22,"Steve",18));
        studentList.add(new Student(33,"Lucy",22));
        studentList.add(new Student(44,"Sansa",23));
        studentList.add(new Student(55,"Maggie",18));
        return studentList;
    }
}
