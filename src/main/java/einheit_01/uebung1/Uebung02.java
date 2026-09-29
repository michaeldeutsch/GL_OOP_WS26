package einheit_01.uebung1;

public class Uebung02 {
    public static void main(String[] args) {
        Student student = new Student("Mina", "Muster", 1001, 2);
        System.out.println(student);
    }

    private static class Student {
        private final String vorname;
        private final String nachname;
        private final int matrikelNummer;
        private final int semester;

        private Student(String vorname, String nachname, int matrikelNummer, int semester) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.matrikelNummer = matrikelNummer;
            this.semester = semester;
        }

        @Override
        public String toString() {
            return "Student{vorname='" + vorname + "', nachname='" + nachname
                    + "', matrikelNummer=" + matrikelNummer + ", semester=" + semester + '}';
        }
    }
}
