package einheit_03.uebung.uebung03;

public class Main {

    public static void main(String[] args) {
        Verein verein = new Verein("Sportfreunde 2026");

        Mitglied m1 = new Mitglied("Max", "Mustermann");
        Mitglied m2 = new Mitglied("Erika", "Musterfrau");
        Mitglied m3 = new Mitglied("Lukas", "Huber");

        verein.addMitglied(m1);
        verein.addMitglied(m2);
        verein.addMitglied(m3);

        verein.zeigeMitglieder();
    }
}
