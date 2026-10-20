package einheit_03.fußball;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private final ArrayList<Spieler> mannschaft;

    public Mannschaft(String name) {
        this.name = name;
        this.mannschaft = new ArrayList<>();
    }

    public void anschreiben(Spieler spieler) {
        if (spieler != null) {
            mannschaft.add(spieler);
        }
    }

    public void zeigeMannschaft() {
        System.out.println("\nMannschaft: " + name);
        if (mannschaft.isEmpty()) {
            System.out.println("Zum jetzigen Zeitpunkt sind keine Spieler zugebucht.");
        } else {
            mannschaft.forEach(System.out::println);
        }
    }

    @Override
    public String toString() {
        String anzahlSpieler = !mannschaft.isEmpty()
                ? ", " + mannschaft.size()
                : ", Zum jetztigen Zeitpunkt sind keine Spieler zugebucht";

        return "Mannschaft{name='" + name + '\'' + anzahlSpieler + '}';
    }
}
