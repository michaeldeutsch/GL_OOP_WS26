package einheit_03.uebung.uebung03;

public class Mitglied {
    private static int counter = 100;

    private final int mitgliedsNr;
    private final String vorname;
    private final String nachname;

    public Mitglied(String vorname, String nachname) {
        counter++;
        this.mitgliedsNr = counter;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Mitglied #" + mitgliedsNr + ": " + vorname + " " + nachname;
    }
}
