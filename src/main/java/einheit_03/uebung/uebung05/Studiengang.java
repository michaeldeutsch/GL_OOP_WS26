package einheit_03.uebung.uebung05;

import java.util.ArrayList;

public class Studiengang {
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
