package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung10 {

    public static void main(String[] args) {
        Liga bundesliga = new Liga("Bundesliga");

        Verein v1 = new Verein("FC Adler", LigaStatus.PROFI);
        v1.addAthlet(new Athlet("Lukas Podolski", 35, 180));
        v1.addAthlet(new Athlet("Bastian Schweinsteiger", 36, 150));
        v1.addAthlet(new Athlet("Thomas Müller", 31, 210));

        Verein v2 = new Verein("SV Eintracht", LigaStatus.PROFI);
        v2.addAthlet(new Athlet("Marco Reus", 32, 195));
        v2.addAthlet(new Athlet("Mats Hummels", 33, 140));
        v2.addAthlet(new Athlet("Mario Götze", 29, 160));

        Verein v3 = new Verein("TSV Dynamo", LigaStatus.AMATEUR);
        v3.addAthlet(new Athlet("Felix Kroos", 30, 110));
        v3.addAthlet(new Athlet("Nils Petersen", 32, 130));

        bundesliga.addVerein(v1);
        bundesliga.addVerein(v2);
        bundesliga.addVerein(v3);

        bundesliga.zeigeTabelle();

        Verein meister = bundesliga.getMeister();
        if (meister != null) {
            System.out.println("Aktueller Tabellenführer / Meister: " + meister.getName() +
                    " mit " + meister.getGesamtPunkte() + " Punkten!");
        }
    }

    private enum LigaStatus {
        AMATEUR,
        PROFI
    }

    private static class Athlet {
        private static int counter = 0;

        private final int id;
        private final String name;
        private final int alter;
        private final int punkte;

        public Athlet(String name, int alter, int punkte) {
            counter++;
            this.id = counter;
            this.name = name;
            this.alter = alter;
            this.punkte = punkte;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAlter() {
            return alter;
        }

        public int getPunkte() {
            return punkte;
        }

        @Override
        public String toString() {
            return name + " (" + alter + " J., " + punkte + " Pkt.)";
        }
    }

    private static class Verein {
        private final String name;
        private final LigaStatus status;
        private final ArrayList<Athlet> athleten;

        public Verein(String name, LigaStatus status) {
            this.name = name;
            this.status = status;
            this.athleten = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public LigaStatus getStatus() {
            return status;
        }

        public ArrayList<Athlet> getAthleten() {
            return athleten;
        }

        public void addAthlet(Athlet athlet) {
            if (athlet != null && !athleten.contains(athlet)) {
                athleten.add(athlet);
            }
        }

        public int getGesamtPunkte() {
            int summe = 0;
            for (Athlet a : athleten) {
                summe += a.getPunkte();
            }
            return summe;
        }

        public Athlet getBesterAthlet() {
            if (athleten.isEmpty()) {
                return null;
            }
            Athlet bester = athleten.get(0);
            for (Athlet a : athleten) {
                if (a.getPunkte() > bester.getPunkte()) {
                    bester = a;
                }
            }
            return bester;
        }

        @Override
        public String toString() {
            return "Verein{name='" + name + "', status=" + status + ", gesamtPunkte=" + getGesamtPunkte() + "}";
        }
    }

    private static class Liga {
        private final String ligaName;
        private final ArrayList<Verein> vereine;

        public Liga(String ligaName) {
            this.ligaName = ligaName;
            this.vereine = new ArrayList<>();
        }

        public void addVerein(Verein verein) {
            if (verein != null && !vereine.contains(verein)) {
                vereine.add(verein);
            }
        }

        public Verein getMeister() {
            if (vereine.isEmpty()) {
                return null;
            }
            Verein meister = vereine.get(0);
            for (Verein v : vereine) {
                if (v.getGesamtPunkte() > meister.getGesamtPunkte()) {
                    meister = v;
                }
            }
            return meister;
        }

        public void zeigeTabelle() {
            System.out.println("=== Tabelle der Liga: " + ligaName + " ===");
            for (Verein v : vereine) {
                Athlet top = v.getBesterAthlet();
                String topInfo = (top != null) ? top.toString() : "keine Athleten";
                System.out.println("- " + v.getName() + " [" + v.getStatus() + "] -> " +
                        v.getGesamtPunkte() + " Pkt. | Top-Athlet: " + topInfo);
            }
            System.out.println("=========================================\n");
        }
    }
}
