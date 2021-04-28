package Block8;

public class StudenDemo {
    public static void main(String[] args) {
        Student.findAllStudents();
        System.out.println("Student.findAllStudents() = " + Student.findAllStudents().toString());
       System.out.println("Student.findDepartmentByStudentName() = " + Student.findDepartmentByStudentName("alan"));

    }
}
