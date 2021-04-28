package Block8;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    private String department;
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    /**
     * Find all registered students.
     * @return Set of all registered students
     */
    public static Set<Student> findAllStudents() {
        final Student alan = new Student("Alan Turing", 42, "Cryptography");
        final Student ada = new Student("Ada Lovelace", 37, "Mathematics");
        final Student steve = new Student("Steve Jobs", 56, "Telematics");
        final Student mary = new Student("Mary Kenneth Keller", 72, "Computer Science");
        Set<Student> students = new HashSet<>();
        students.add(alan);
        students.add(steve);
        students.add(ada);
        students.add(mary);
        return students;

    }
    /**
     * Find associated department for a student.
     * @param name Name of a student
     * @returns Corresponding department of the student or null if no student was found
     **/
    public static String findDepartmentByStudentName(final String name) {
        // TODO

            if (findAllStudents().contains(name)) {
            }
    return null;
    }

}
