package einheit_01.uebung1;

public class Uebung10 {
    public static void main(String[] args) {
        Student mina = new Student("Mina", 3);
        Student noah = new Student("Noah", 5);

        advanceUntilGraduation(mina);
        advanceUntilGraduation(noah);
    }

    private static void advanceUntilGraduation(Student student) {
        student.printStatus();
        while (student.advanceSemester()) {
            student.printStatus();
        }
        System.out.printf("%s hat das Studium abgeschlossen.%n", student.getVorname());
        student.printStatus();
        System.out.println();
    }

    private static class Student {
        private final String vorname;
        private int semester;

        private Student(String vorname, int semester) {
            this.vorname = vorname;
            this.semester = semester;
        }

        private String getVorname() {
            return vorname;
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
