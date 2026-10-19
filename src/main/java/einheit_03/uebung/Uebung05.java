package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung05 {

    public static void main(String[] args) {
        Studiengang se = new Studiengang("Software Engineering", Abschluss.BACHELOR);

        Student s1 = new Student("Florian");
        Student s2 = new Student("Sabine");

        se.einschreiben(s1);
        se.einschreiben(s2);

        System.out.println(se);
        se.zeigeStudenten();

        System.out.println("\nStudentendetails:");
        System.out.println(s1);
        System.out.println(s2);
    }

    private enum Abschluss {
        BACHELOR,
        MASTER
    }

    private static class Student {
        private static int counter = 2000;

        private final int matrikelNr;
        private final String name;
        private Studiengang studiengang;

        public Student(String name) {
            counter++;
            this.matrikelNr = counter;
            this.name = name;
        }

        public int getMatrikelNr() {
            return matrikelNr;
        }

        public String getName() {
            return name;
        }

        public Studiengang getStudiengang() {
            return studiengang;
        }

        public void setStudiengang(Studiengang studiengang) {
            this.studiengang = studiengang;
        }

        @Override
        public String toString() {
            String stgName = (studiengang != null) ? studiengang.getBezeichnung() : "keiner";
            return "Student{matrikelNr=" + matrikelNr + ", name='" + name + "', studiengang=" + stgName + "}";
        }
    }

    private static class Studiengang {
        private final String bezeichnung;
        private final Abschluss abschluss;
        private final ArrayList<Student> studenten;

        public Studiengang(String bezeichnung, Abschluss abschluss) {
            this.bezeichnung = bezeichnung;
            this.abschluss = abschluss;
            this.studenten = new ArrayList<>();
        }

        public String getBezeichnung() {
            return bezeichnung;
        }

        public Abschluss getAbschluss() {
            return abschluss;
        }

        public void einschreiben(Student student) {
            if (student != null && !studenten.contains(student)) {
                studenten.add(student);
                student.setStudiengang(this);
            }
        }

        public void zeigeStudenten() {
            System.out.println("Eingeschriebene Studenten im Studiengang " + bezeichnung + " (" + abschluss + "):");
            if (studenten.isEmpty()) {
                System.out.println("- Keine Studenten eingeschrieben.");
            } else {
                for (Student s : studenten) {
                    System.out.println("- MatrNr " + s.getMatrikelNr() + ": " + s.getName());
                }
            }
        }

        @Override
        public String toString() {
            return "Studiengang{bezeichnung='" + bezeichnung + "', abschluss=" + abschluss + ", studentenAnzahl=" + studenten.size() + "}";
        }
    }
}
