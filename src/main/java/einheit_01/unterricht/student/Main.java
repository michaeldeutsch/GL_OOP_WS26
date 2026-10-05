package einheit_01.unterricht.student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Michael", "Deutsch", true, 3, 1);

        System.out.println(student);

        for (int semester = 0; semester < 4; semester++) {
            if (student.advanceSemester()) {
                System.out.printf("Willkommen im Semester %d%n", student.getCurrentSemester());
            } else {
                System.out.println("Sie haben das Studium abgeschlossen; eine Erhöhung ist nicht mehr möglich.");
            }
        }

        System.out.println(student);
    }
}
