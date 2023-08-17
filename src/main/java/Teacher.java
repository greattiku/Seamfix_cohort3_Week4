public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teachCourse(String courseName) {
        System.out.println(getName() + " is teaching" + courseName);
    }

}
