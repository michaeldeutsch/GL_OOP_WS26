package einheit_01.uebung1;

public class Uebung07 {
    public static void main(String[] args) {
        Student student = new Student(5);

        if (student.advanceSemester()) {
            System.out.printf("Willkommen im Semester %d.%n", student.getSemester());
        }
        if (!student.advanceSemester()) {
            System.out.println("Die maximale Semesterzahl ist erreicht.");
        }
    }

    private static class Student {
        private int semester;

        private Student(int semester) {
            this.semester = semester;
        }

        private boolean advanceSemester() {
            if (semester >= 6) {
                return false;
            }
            semester++;
            return true;
        }

        private int getSemester() {
            return semester;
        }
    }
}
