package einheit_05.uebung.uebung04;

public abstract class Konto {
    private String iban;
    private double kontostand;

    public Konto(String iban, double kontostand) {
        this.iban = iban;
        this.kontostand = kontostand;
    }

    public String getIban() {
        return iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            this.kontostand += betrag;
        }
    }

    // Finale Methode: Nicht überschreibbar in Subklassen
    public final void druckeKopfzeile() {
        System.out.println("=== OFFIZIELLER KONTOAUSZUG: " + iban + " ===");
    }

    // Abstrakte Methode: Muss in Subklassen implementiert werden
    public abstract void bucheZinsen();

    @Override
    public String toString() {
        return "IBAN: " + iban + " | Saldo: " + String.format("%.2f", kontostand) + " €";
    }
}
