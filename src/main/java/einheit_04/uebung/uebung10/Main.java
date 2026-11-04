package einheit_04.uebung.uebung10;

public class Main {
    public static void main(String[] args) {
        Schule schule = new Schule("HTL Wien");

        schule.addPerson(new Schueler("Felix", "felix@htl.at", "3AHIT", 1.4));
        schule.addPerson(new Schueler("Sophie", "sophie@htl.at", "3AHIT", 1.8));
        schule.addPerson(new Lehrer("Mag. Berger", "berger@htl.at", Fachbereich.INFORMATIK, 4200.0));
        schule.addPerson(new Lehrer("Dr. Gruber", "gruber@htl.at", Fachbereich.WIRTSCHAFT, 4500.0));
        schule.addPerson(new Schueler("Felix Doppel", "felix@htl.at", "1AHIT", 2.0)); // Duplikat-E-Mail

        schule.zeigeAlleMitglieder();
        System.out.println();
        schule.zeigeNurSchueler();
        System.out.println();
        System.out.println("Gesamte Lehrergehälter: " + schule.berechneGesamtGehaelter() + " EUR");
    }
}
