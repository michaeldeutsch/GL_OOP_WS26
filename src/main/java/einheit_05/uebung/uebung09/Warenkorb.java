package einheit_05.uebung.uebung09;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private double artikelPreis;
    private int anzahl;
    private List<RabattAktion> verfuegbareAktionen;

    public Warenkorb(double artikelPreis, int anzahl) {
        this.artikelPreis = artikelPreis;
        this.anzahl = anzahl;
        this.verfuegbareAktionen = new ArrayList<>();
    }

    public void addAktion(RabattAktion aktion) {
        if (aktion != null) {
            verfuegbareAktionen.add(aktion);
        }
    }

    public void zeigeVergleichUndBesterPreis() {
        double standardPreis = artikelPreis * anzahl;
        System.out.println("=== Warenkorb-Rabattanalyse ===");
        System.out.println("Artikelpreis: " + String.format("%.2f", artikelPreis) + " € | Menge: " + anzahl
                + " | Gesamtpreis (ohne Rabatt): " + String.format("%.2f", standardPreis) + " €");
        System.out.println("--------------------------------------------------");

        RabattAktion besteAktion = null;
        double besterPreis = standardPreis;

        for (RabattAktion aktion : verfuegbareAktionen) {
            double endpreis = aktion.wendeRabattAn(artikelPreis, anzahl);
            double ersparnis = standardPreis - endpreis;
            System.out.println("Aktion: " + aktion.getAktionsName()
                    + " -> Endpreis: " + String.format("%.2f", endpreis) + " € (Ersparnis: " + String.format("%.2f", ersparnis) + " €)");

            if (endpreis < besterPreis) {
                besterPreis = endpreis;
                besteAktion = aktion;
            }
        }

        System.out.println("--------------------------------------------------");
        if (besteAktion != null) {
            System.out.println("Empfohlen: " + besteAktion.getAktionsName()
                    + " mit dem günstigsten Endpreis von " + String.format("%.2f", besterPreis) + " €");
        } else {
            System.out.println("Keine wirksame Rabattaktion gefunden. Regulärer Preis: " + String.format("%.2f", standardPreis) + " €");
        }
        System.out.println();
    }
}
