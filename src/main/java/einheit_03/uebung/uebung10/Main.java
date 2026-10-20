package einheit_03.uebung.uebung10;

public class Main {

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
}
