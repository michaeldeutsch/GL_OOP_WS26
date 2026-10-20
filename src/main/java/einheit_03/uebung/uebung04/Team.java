package einheit_03.uebung.uebung04;

import java.util.ArrayList;

public class Team {
    private final String teamName;
    private final ArrayList<Fussballer> spielerListe;

    public Team(String teamName) {
        this.teamName = teamName;
        this.spielerListe = new ArrayList<>();
    }

    public void addSpieler(Fussballer spieler) {
        if (spieler != null && !spielerListe.contains(spieler)) {
            spielerListe.add(spieler);
        }
    }

    public void zeigeSpielerAufPosition(Position position) {
        System.out.println("Spieler auf Position " + position + " im Team '" + teamName + "':");
        boolean gefunden = false;
        for (Fussballer f : spielerListe) {
            if (f.getPosition() == position) {
                System.out.println("- " + f);
                gefunden = true;
            }
        }
        if (!gefunden) {
            System.out.println("- Keine Spieler auf dieser Position gefunden.");
        }
    }
}
