public class CourseEnrollement {
    private Student student;
    private Course course;


    public void CourseEnrollment(Student student, Course course) {

        this.student = student;

        this.course = course;

    }

    public void printEnrollmentInfo() {

        System.out.println(student.getName() + " is enrolled in " + course.getCourseName());

    }

}