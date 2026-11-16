package einheit_05.uebung.uebung07;

import java.util.ArrayList;
import java.util.List;

public class Flotte {
    private String unternehmensName;
    private List<Transportmittel> fahrzeuge;

    public Flotte(String unternehmensName) {
        this.unternehmensName = unternehmensName;
        this.fahrzeuge = new ArrayList<>();
    }

    public void addTransportmittel(Transportmittel t) {
        if (t != null) {
            fahrzeuge.add(t);
        }
    }

    public double berechneGesamteWartungskosten() {
        double gesamt = 0.0;
        for (Transportmittel t : fahrzeuge) {
            gesamt += t.berechneWartungskosten();
        }
        return gesamt;
    }

    public void zeigeWartungsuebersicht() {
        System.out.println("=== Wartungsübersicht der Flotte: " + unternehmensName + " ===");
        for (Transportmittel t : fahrzeuge) {
            System.out.println(t.getKennzeichen() + " (Alter: " + t.getFahrzeugAlter()
                    + " Jahre, Stand: " + t.getKilometerstand() + " km) -> Wartungskosten: "
                    + String.format("%.2f", t.berechneWartungskosten()) + " €");
        }
        System.out.println("Gesamte Flotten-Wartungskosten: " + String.format("%.2f", berechneGesamteWartungskosten()) + " €");
        System.out.println();
    }
}
