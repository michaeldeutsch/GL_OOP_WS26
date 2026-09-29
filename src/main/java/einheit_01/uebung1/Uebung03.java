package einheit_01.uebung1;

public class Uebung03 {
    public static void main(String[] args) {
        Student student = new Student("Mina", "Muster", 2);
        System.out.println(student.getVorname());
        System.out.println(student.getNachname());
        System.out.println(student.getSemester());
    }

    private static class Student {
        private final String vorname;
        private final String nachname;
        private final int semester;

        private Student(String vorname, String nachname, int semester) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.semester = semester;
        }

        private String getVorname() {
            return vorname;
        }

        private String getNachname() {
            return nachname;
        }

        private int getSemester() {
            return semester;
        }
    }
}
