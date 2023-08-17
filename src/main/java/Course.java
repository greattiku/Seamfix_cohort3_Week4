public class Course {

    private String courseName;

    private String CourseName(String courseName) {
        this.courseName = courseName;
        return courseName;
    }

    public void printCourseInfo() {
        System.out.println(courseName);
    }

    public static void main(String[] args) {

        Course courseName = new Course();
        System.out.println(courseName);
    }


}
