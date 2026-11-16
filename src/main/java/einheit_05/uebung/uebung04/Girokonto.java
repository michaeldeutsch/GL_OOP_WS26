package einheit_05.uebung.uebung04;

public class Girokonto extends Konto {
    private double disporahmen;
    private double sollzinsSatz; // z.B. 0.08 für 8%

    public Girokonto(String iban, double kontostand, double disporahmen, double sollzinsSatz) {
        super(iban, kontostand);
        this.disporahmen = disporahmen;
        this.sollzinsSatz = sollzinsSatz;
    }

    public double getDisporahmen() {
        return disporahmen;
    }

    public double getSollzinsSatz() {
        return sollzinsSatz;
    }

    @Override
    public void bucheZinsen() {
        if (getKontostand() < 0) {
            double sollzinsen = Math.abs(getKontostand()) * sollzinsSatz;
            setKontostand(getKontostand() - sollzinsen);
            System.out.println("Girokonto " + getIban() + ": Sollzinsen von " + String.format("%.2f", sollzinsen) + " € belastet.");
        } else {
            System.out.println("Girokonto " + getIban() + ": Keine Sollzinsen angefallen (Saldo >= 0).");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Dispo: " + String.format("%.2f", disporahmen) + " €";
    }
}
