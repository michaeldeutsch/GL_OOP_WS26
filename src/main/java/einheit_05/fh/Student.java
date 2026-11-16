package einheit_05.fh;

import einheit_05.person.Geschlecht;
import einheit_05.person.Person;

import java.time.LocalDate;

public class Student extends Person {

    private int matrikelNr;

    public Student(String vorname, String nachname, LocalDate geburtsdatum, Geschlecht geschlecht, boolean aktiv, int matrikelNr) {
        super(vorname, nachname, geburtsdatum, geschlecht, aktiv);
        this.matrikelNr = matrikelNr;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public void getInfo() {
        System.out.println("Student-Info: " + getVorname() + " " + getNachname() + " (MatrikelNr: " + matrikelNr + ")");
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelNr=" + matrikelNr +
                "} " + super.toString();
    }
}
