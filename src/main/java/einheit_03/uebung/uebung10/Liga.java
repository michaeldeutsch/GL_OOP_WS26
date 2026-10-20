package einheit_03.uebung.uebung10;

import java.util.ArrayList;

public class Liga {
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
