package einheit_04.uebung.uebung04;

public class Geraet {
    private static int COUNTER = 1000;

    private final int seriennummer;
    private String hersteller;
    private double preis;

    public Geraet(String hersteller, double preis) {
        this.seriennummer = COUNTER++;
        this.hersteller = hersteller;
        this.preis = preis;
    }

    public int getSeriennummer() {
        return seriennummer;
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Geraet{" +
                "seriennummer=" + seriennummer +
                ", hersteller='" + hersteller + '\'' +
                ", preis=" + preis +
                '}';
    }
}
