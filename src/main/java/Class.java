import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<Student> students;
    private Teacher teacher;


    public Class(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printClassInfo() {
        System.out.println("Class: " + className);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println("- " + student.getName());

        }
    }
}
