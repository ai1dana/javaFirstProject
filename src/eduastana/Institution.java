package eduastana;

import java.util.List;

public class Institution {
    private String name;
    private String address;
    private List<Student> students;
    private List<Teacher> teachers;


    public Institution(String name, String address, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.address = address;
        this.students = students;
        this.teachers = teachers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }


    @Override
    public String toString() {
        return "Institution{name='" + name + "', address='" + address + "', students=" + students + ", teachers=" + teachers + "}";
    }
}
