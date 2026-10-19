package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung08 {

    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark("Wien Hauptstandort");

        Fahrzeug f1 = new Fahrzeug("VW Golf", 2018, FahrzeugTyp.PKW);
        Fahrzeug f2 = new Fahrzeug("MAN TGX", 2021, FahrzeugTyp.LKW);
        Fahrzeug f3 = new Fahrzeug("BMW R 1250", 2023, FahrzeugTyp.MOTORRAD);
        Fahrzeug f4 = new Fahrzeug("Tesla Model 3", 2022, FahrzeugTyp.PKW);

        fuhrpark.addFahrzeug(f1);
        fuhrpark.addFahrzeug(f2);
        fuhrpark.addFahrzeug(f3);
        fuhrpark.addFahrzeug(f4);

        System.out.println("Alle Fahrzeuge im Fuhrpark:");
        fuhrpark.zeigeAlleFahrzeuge();

        System.out.println("\nFahrzeuge ab Baujahr 2021:");
        ArrayList<Fahrzeug> neuere = fuhrpark.findeFahrzeugeNeuerAls(2021);
        for (Fahrzeug f : neuere) {
            System.out.println("- " + f);
        }

        System.out.println("\nLöschen von Fahrzeug mit ID " + f1.getId() + ": " + fuhrpark.entferneFahrzeug(f1.getId()));
        System.out.println("Aktualisierter Fuhrpark:");
        fuhrpark.zeigeAlleFahrzeuge();
    }

    private enum FahrzeugTyp {
        PKW,
        LKW,
        MOTORRAD
    }

    private static class Fahrzeug {
        private static int counter = 0;

        private final int id;
        private final String modell;
        private final int baujahr;
        private final FahrzeugTyp typ;

        public Fahrzeug(String modell, int baujahr, FahrzeugTyp typ) {
            counter++;
            this.id = counter;
            this.modell = modell;
            this.baujahr = baujahr;
            this.typ = typ;
        }

        public int getId() {
            return id;
        }

        public String getModell() {
            return modell;
        }

        public int getBaujahr() {
            return baujahr;
        }

        public FahrzeugTyp getTyp() {
            return typ;
        }

        @Override
        public String toString() {
            return "Fahrzeug #" + id + " [" + typ + "]: " + modell + " (" + baujahr + ")";
        }
    }

    private static class Fuhrpark {
        private final String standort;
        private final ArrayList<Fahrzeug> fahrzeuge;

        public Fuhrpark(String standort) {
            this.standort = standort;
            this.fahrzeuge = new ArrayList<>();
        }

        public void addFahrzeug(Fahrzeug fahrzeug) {
            if (fahrzeug != null && !fahrzeuge.contains(fahrzeug)) {
                fahrzeuge.add(fahrzeug);
            }
        }

        public boolean entferneFahrzeug(int fahrzeugId) {
            return fahrzeuge.removeIf(f -> f.getId() == fahrzeugId);
        }

        public ArrayList<Fahrzeug> findeFahrzeugeNeuerAls(int mindestBaujahr) {
            ArrayList<Fahrzeug> result = new ArrayList<>();
            for (Fahrzeug f : fahrzeuge) {
                if (f.getBaujahr() >= mindestBaujahr) {
                    result.add(f);
                }
            }
            return result;
        }

        public void zeigeAlleFahrzeuge() {
            System.out.println("Fuhrpark (" + standort + "):");
            if (fahrzeuge.isEmpty()) {
                System.out.println("- Keine Fahrzeuge vorhanden.");
            } else {
                for (Fahrzeug f : fahrzeuge) {
                    System.out.println("- " + f);
                }
            }
        }
    }
}
