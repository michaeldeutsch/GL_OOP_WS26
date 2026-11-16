package einheit_05.fh;

import einheit_05.person.Geschlecht;
import einheit_05.person.Person;

import java.time.LocalDate;

public class Mitarbeiter extends Person {

    private int mitarbeiterID;
    private Arbeitsform arbeitsform;

    public Mitarbeiter(String vorname, String nachname, LocalDate geburtsdatum, Geschlecht geschlecht, boolean aktiv, int mitarbeiterID, Arbeitsform arbeitsform) {
        super(vorname, nachname, geburtsdatum, geschlecht, aktiv);
        this.mitarbeiterID = mitarbeiterID;
        this.arbeitsform = arbeitsform;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public Arbeitsform getArbeitsform() {
        return arbeitsform;
    }

    public void setArbeitsform(Arbeitsform arbeitsform) {
        this.arbeitsform = arbeitsform;
    }

    @Override
    public void getInfo() {
        System.out.println("Mitarbeiter-Info: " + getVorname() + " " + getNachname() + " (ID: " + mitarbeiterID + ", Form: " + arbeitsform + ")");
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "mitarbeiterID=" + mitarbeiterID +
                ", arbeitsform=" + arbeitsform +
                "} " + super.toString();
    }
}
