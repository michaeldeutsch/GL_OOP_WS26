package einheit_04.uebung.uebung09;

public class Lkw extends Fahrzeug {
    private double ladekapazitaetTonnen;

    public Lkw(String kennzeichen, String modell, double tagespreis, double ladekapazitaetTonnen) {
        super(kennzeichen, modell, tagespreis);
        this.ladekapazitaetTonnen = ladekapazitaetTonnen;
    }

    public double getLadekapazitaetTonnen() {
        return ladekapazitaetTonnen;
    }

    @Override
    public String toString() {
        return "Lkw{" +
                "kennzeichen='" + getKennzeichen() + '\'' +
                ", modell='" + getModell() + '\'' +
                ", tagespreis=" + getTagespreis() +
                ", ladekapazitaetTonnen=" + ladekapazitaetTonnen +
                '}';
    }
}
