package einheit_03.studiengang;

import java.util.ArrayList;

public class Studiengang {

    private String name;
    private Type form;
    private final ArrayList<Student> students;

    public Studiengang(String name, Type form) {
        this.name = name;
        this.form = form;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getForm() {
        return form;
    }

    public void setForm(Type form) {
        this.form = form;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
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
