package einheit_03.fußball;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private final ArrayList<Spieler> spielerListe;

    public Mannschaft(String name) {
        this.name = name;
        this.spielerListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void anschreiben(Spieler spieler) {
        if (spieler != null) {
            spieler.setTeam(this.name);
            spielerListe.add(spieler);
        }
    }

    public void addSpieler(Spieler spieler) {
        anschreiben(spieler);
    }

    public void zeigeMannschaft() {
        System.out.println("\nMannschaft: " + name);
        if (spielerListe.isEmpty()) {
            System.out.println("Zum jetzigen Zeitpunkt sind keine Spieler zugebucht.");
        } else {
            spielerListe.forEach(System.out::println);
        }
    }

    @Override
    public String toString() {
        String info = !spielerListe.isEmpty()
                ? ", Anzahl Spieler=" + spielerListe.size()
                : ", Zum jetzigen Zeitpunkt sind keine Spieler zugebucht";

        return "Mannschaft{name='" + name + '\'' + info + '}';
    }
}
