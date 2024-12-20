package eduastana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20, "S001");
        Student student2 = new Student("Bob", 22, "S002");


        Teacher teacher1 = new Teacher("Dr. Smith", "Mathematics", 50000);
        Teacher teacher2 = new Teacher("Dr. Brown", "Physics", 55000);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);


        Institution institution = new Institution("Tech University", "123 Main St", students, teachers);


        System.out.println(institution);


        System.out.println("Are the students equal? " + student1.equals(student2));
    }
}
