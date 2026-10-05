package einheit_01.uebung;

public class Uebung09 {
    public static void main(String[] args) {
        Student student = new Student("Mina", 4);
        student.printStatus();

        while (student.advanceSemester()) {
            student.printStatus();
        }
        System.out.println("Studienabschluss erreicht.");
    }

    private static class Student {
        private final String vorname;
        private int semester;

        private Student(String vorname, int semester) {
            this.vorname = vorname;
            this.semester = semester;
        }

        private boolean advanceSemester() {
            if (semester >= 6) {
                return false;
            }
            semester++;
            return true;
        }

        private void printStatus() {
            System.out.printf("%s ist im %d. Semester.%n", vorname, semester);
        }
    }
}
