package einheit_02.unterricht.fahrgeschaeft;

public class Fahrgeschaeft {

    private String name;
    private double preis;
    private boolean offen;
    private int maxPersonen;

    public Fahrgeschaeft(String name, double preis, boolean offen, int maxPersonen) {
        this.name = name;
        this.preis = preis;
        this.offen = offen;
        this.maxPersonen = maxPersonen;
    }

    public Fahrgeschaeft(String name, double preis, int maxPersonen) {
        this(name, preis, false, maxPersonen);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isOffen() {
        return offen;
    }

    public void setOffen(boolean offen) {
        this.offen = offen;
    }

    public int getMaxPersonen() {
        return maxPersonen;
    }

    public void setMaxPersonen(int maxPersonen) {
        this.maxPersonen = maxPersonen;
    }

    public void erhoehen(double neuerPreis) {
        if (neuerPreis > this.preis && neuerPreis > 0) {
            this.preis = neuerPreis;
        } else {
            System.out.println("Preisänderung ungültig: Neuer Preis muss größer als der aktuelle Preis sein.");
        }
    }

    @Override
    public String toString() {
        return "Fahrgeschaeft{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", offen=" + offen +
                ", maxPersonen=" + maxPersonen +
                '}';
    }
}
