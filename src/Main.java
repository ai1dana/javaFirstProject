public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S001");
        Student student2 = new Student("Bob", 22, "S002");

        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics", 50000);
        Teacher teacher2 = new Teacher("Ms. Johnson", "English", 55000);

        Institution institution = new Institution("Greenwood High School", "New York");

        System.out.println("=== Institution Details ===");
        institution.displayInfo();

        System.out.println("\n=== Student Details ===");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("\n=== Teacher Details ===");
        teacher1.displayInfo();
        teacher2.displayInfo();

        System.out.println("\n=== Comparing Students ===");
        if (student1.getAge() > student2.getAge()) {
            System.out.println(student1.getName() + " is older than " + student2.getName());
        } else if (student1.getAge() < student2.getAge()) {
            System.out.println(student2.getName() + " is older than " + student1.getName());
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " are the same age.");
        }
    }
}

public class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Age: " + age);
    }
}
public class Teacher {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject + ", Salary: $" + salary);
    }
}
