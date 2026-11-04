package einheit_04.uebung.uebung09;

public class Pkw extends Fahrzeug {
    private int sitzplaetze;

    public Pkw(String kennzeichen, String modell, double tagespreis, int sitzplaetze) {
        super(kennzeichen, modell, tagespreis);
        this.sitzplaetze = sitzplaetze;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    @Override
    public String toString() {
        return "Pkw{" +
                "kennzeichen='" + getKennzeichen() + '\'' +
                ", modell='" + getModell() + '\'' +
                ", tagespreis=" + getTagespreis() +
                ", sitzplaetze=" + sitzplaetze +
                '}';
    }
}
