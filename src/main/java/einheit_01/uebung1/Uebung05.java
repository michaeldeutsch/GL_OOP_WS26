package einheit_01.uebung1;

public class Uebung05 {
    public static void main(String[] args) {
        Student student = new Student("Mina", 6);
        if (student.istAbgeschlossen()) {
            System.out.println(student.getVorname() + " hat das Studium abgeschlossen.");
        } else {
            System.out.println(student.getVorname() + " studiert noch.");
        }
    }

    private static class Student {
        private final String vorname;
        private final int semester;

        private Student(String vorname, int semester) {
            this.vorname = vorname;
            this.semester = semester;
        }

        private String getVorname() {
            return vorname;
        }

        private boolean istAbgeschlossen() {
            return semester >= 6;
        }
    }
}
