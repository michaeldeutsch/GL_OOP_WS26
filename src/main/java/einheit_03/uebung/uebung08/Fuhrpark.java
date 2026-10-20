package einheit_03.uebung.uebung08;

import java.util.ArrayList;

public class Fuhrpark {
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
