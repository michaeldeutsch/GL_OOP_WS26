package einheit_04.uebung.uebung04;

public class Smartphone extends Geraet {
    private String betriebssystem;
    private int speicherGB;

    public Smartphone(String hersteller, double preis, String betriebssystem, int speicherGB) {
        super(hersteller, preis);
        this.betriebssystem = betriebssystem;
        this.speicherGB = speicherGB;
    }

    public String getBetriebssystem() {
        return betriebssystem;
    }

    public int getSpeicherGB() {
        return speicherGB;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "seriennummer=" + getSeriennummer() +
                ", hersteller='" + getHersteller() + '\'' +
                ", preis=" + getPreis() +
                ", betriebssystem='" + betriebssystem + '\'' +
                ", speicherGB=" + speicherGB +
                '}';
    }
}
