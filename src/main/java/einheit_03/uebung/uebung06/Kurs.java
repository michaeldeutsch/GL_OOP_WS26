package einheit_03.uebung.uebung06;

import java.util.ArrayList;

public class Kurs {
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
