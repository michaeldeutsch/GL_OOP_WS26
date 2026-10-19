package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung03 {

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

    private static class Mitglied {
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

        public int getMitgliedsNr() {
            return mitgliedsNr;
        }

        public String getVorname() {
            return vorname;
        }

        public String getNachname() {
            return nachname;
        }

        @Override
        public String toString() {
            return "Mitglied #" + mitgliedsNr + ": " + vorname + " " + nachname;
        }
    }

    private static class Verein {
        private final String name;
        private final ArrayList<Mitglied> mitglieder;

        public Verein(String name) {
            this.name = name;
            this.mitglieder = new ArrayList<>();
        }

        public void addMitglied(Mitglied mitglied) {
            if (mitglied != null && !mitglieder.contains(mitglied)) {
                mitglieder.add(mitglied);
            }
        }

        public void zeigeMitglieder() {
            System.out.println("Vereinsmitglieder von '" + name + "':");
            if (mitglieder.isEmpty()) {
                System.out.println("- Keine Mitglieder vorhanden.");
            } else {
                for (Mitglied m : mitglieder) {
                    System.out.println("- " + m);
                }
            }
        }
    }
}
