package einheit_01.uebung;

public class Uebung08 {
    public static void main(String[] args) {
        Student student = new Student("Mina", 3);

        while (student.advanceSemester()) {
            System.out.printf("Willkommen im Semester %d.%n", student.getSemester());
        }
        System.out.println(student.getVorname() + " hat den Studienabschluss erreicht.");
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

        private int getSemester() {
            return semester;
        }

        private String getVorname() {
            return vorname;
        }
    }
}
