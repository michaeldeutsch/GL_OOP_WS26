package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung06 {

    public static void main(String[] args) {
        Kurs kurs = new Kurs("Programmieren 1", 2);

        Student s1 = new Student(101, "Lukas");
        Student s2 = new Student(102, "Sophie");
        Student s3 = new Student(103, "Maximilian");

        System.out.println("Anmeldung s1: " + kurs.anmelden(s1));
        System.out.println("Anmeldung s1 erneut: " + kurs.anmelden(s1));
        System.out.println("Anmeldung s2: " + kurs.anmelden(s2));
        System.out.println("Anmeldung s3 (überfüllt): " + kurs.anmelden(s3));

        System.out.println("\nKursübersicht:");
        System.out.println(kurs);
    }

    private static class Student {
        private final int matrikelNr;
        private final String name;

        public Student(int matrikelNr, String name) {
            this.matrikelNr = matrikelNr;
            this.name = name;
        }

        public int getMatrikelNr() {
            return matrikelNr;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " (" + matrikelNr + ")";
        }
    }

    private static class Kurs {
        private final String titel;
        private final int maxTeilnehmer;
        private final ArrayList<Student> teilnehmer;

        public Kurs(String titel, int maxTeilnehmer) {
            this.titel = titel;
            this.maxTeilnehmer = maxTeilnehmer;
            this.teilnehmer = new ArrayList<>();
        }

        public boolean anmelden(Student student) {
            if (student == null) {
                System.out.println("Fehler: Ungültiger Student.");
                return false;
            }
            if (teilnehmer.contains(student)) {
                System.out.println("Hinweis: Student " + student.getName() + " ist bereits für " + titel + " angemeldet.");
                return false;
            }
            if (teilnehmer.size() >= maxTeilnehmer) {
                System.out.println("Fehler: Kurs '" + titel + "' ist voll (Max: " + maxTeilnehmer + "). Anmeldung für " + student.getName() + " abgelehnt.");
                return false;
            }

            teilnehmer.add(student);
            System.out.println("Erfolg: " + student.getName() + " wurde für '" + titel + "' registriert.");
            return true;
        }

        @Override
        public String toString() {
            return "Kurs{titel='" + titel + "', maxTeilnehmer=" + maxTeilnehmer + ", angemeldeteTeilnehmer=" + teilnehmer.size() + "}";
        }
    }
}
