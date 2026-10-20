package einheit_03.studiengang;

import java.util.ArrayList;

public class Studiengang {

    private String name;
    private Type form;
    private ArrayList<Student> students;

    public Studiengang(String name, Type form) {
        this.name = name;
        this.form = form;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.err.println("Keine Studenten vorhanden");
            return;
        }
        System.out.println("Aktuelle Studentenliste: " + name);
        students.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Studiengang{" +
                "name='" + name + '\'' +
                ", form=" + form +
                '}';
    }
}
