package einheit_04.uebung.uebung09;

import java.util.ArrayList;

public class Fuhrpark {
    private String name;
    private ArrayList<Fahrzeug> fahrzeuge;

    public Fuhrpark(String name) {
        this.name = name;
        this.fahrzeuge = new ArrayList<>();
    }

    public void addFahrzeug(Fahrzeug f) {
        fahrzeuge.add(f);
    }

    public void zeigeAlleFahrzeuge() {
        System.out.println("=== Fuhrpark: " + name + " ===");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f);
        }
    }

    public double berechneGesamteinnahmenProTag() {
        double summe = 0.0;
        for (Fahrzeug f : fahrzeuge) {
            summe += f.getTagespreis();
        }
        return summe;
    }
}
