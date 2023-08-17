public class SchoolManagementApp {
    public static void main(String[] args) {

        //Create instances
        Teacher javaTeacher = new Teacher("Daniel", 35, " Introduction To Java ");
        Student ginika = new Student("Ginika", 20, 12345);
        Student chris = new Student(" Chris", 16, 67890);
        Course math = new Course(courseName:"Mathematics");

        //Simulate Interactions

        mathTeacher.teachCourse(mathCourse.getCourseName());

        ginika.takeCourse(mathCourse.getCourseName());

        chris.takeCourse(mathCourse.getCourseName());

        //Display information
        System.out.println("Teacher: " + mathTeacher.getName());
        System.out.println("Student 1: " + ginika.getName());
        System.out.println("Student 2: " + chris.getName());
        System.out.println("Course: " + mathCourse.getCourseName());

        //Create a class and enroll students
        class mathClass =new Class("Math Class", mathTeacher);
        mathClass.addStudent(ginika);
        mathClass.addStudent(chris);

        //Print class information
        mathClass.printClassInfo();
        //Create more instances for demonstration
        Principal principal = new Principal("Great Tiku", 50);
        Course BiologyCourse = new Course("Biology");

        //Simulate more interactions
        principal.expelStudent(ginika);
        principal.admitApplicant(ginika);
        principal.admitApplicant(chris);

        //Display Admission
        System.out.println("Admission status for " + ginika.getName() + ":" + ginika.isAdmitted());
        System.out.println("Admission status for " + chris.getName() + ":" + chris.isAdmitted());

        //Demonstrate array of courses and enrollment
        Course[] courses = {mathCourse, historyCourse};
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());

        }

        //Demonstrate multidimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matrix[1][2]: " + matrix[1][2]);

    }

}
