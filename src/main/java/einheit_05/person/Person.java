package einheit_05.person;

import java.time.LocalDate;

public abstract class Person {

    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private Geschlecht geschlecht;
    private boolean aktiv;

    public Person(String vorname, String nachname, LocalDate geburtsdatum, Geschlecht geschlecht, boolean aktiv) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.aktiv = aktiv;
    }

    public abstract void getInfo();

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    // Methodenüberladung (Method Overloading)
    public void gibStatus() {
        System.out.println("Status von: " + vorname + " " + nachname);
    }

    public void gibStatus(int code) {
        System.out.println("Status von: " + vorname + " [Code " + code + "]");
    }

    public void gibStatus(double wert) {
        System.out.println("Status von: " + vorname + " [Wert " + wert + "]");
    }

    public void gibStatus(double wert, int code) {
        System.out.println("Status von: " + vorname + " [Wert " + wert + ", Code " + code + "]");
    }

    // Final-Methode: Darf in abgeleiteten Klassen nicht überschrieben werden
    public final void tueIrgendwas() {
        System.out.println("Finaler Ablauf für Person: " + vorname + " " + nachname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", geschlecht=" + geschlecht +
                ", aktiv=" + aktiv +
                '}';
    }
}
