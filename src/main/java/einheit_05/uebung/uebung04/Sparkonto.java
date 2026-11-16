package einheit_05.uebung.uebung04;

// Finale Klasse: Von Sparkonto kann nicht weiter abgeleitet werden
public final class Sparkonto extends Konto {
    private double habenzinsSatz; // z.B. 0.025 für 2.5%

    public Sparkonto(String iban, double kontostand, double habenzinsSatz) {
        super(iban, kontostand);
        this.habenzinsSatz = habenzinsSatz;
    }

    public double getHabenzinsSatz() {
        return habenzinsSatz;
    }

    @Override
    public void bucheZinsen() {
        if (getKontostand() > 0) {
            double habenzinsen = getKontostand() * habenzinsSatz;
            setKontostand(getKontostand() + habenzinsen);
            System.out.println("Sparkonto " + getIban() + ": Habenzinsen von " + String.format("%.2f", habenzinsen) + " € gutgeschrieben.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Sparzins: " + String.format("%.2f", (habenzinsSatz * 100)) + " %";
    }
}
