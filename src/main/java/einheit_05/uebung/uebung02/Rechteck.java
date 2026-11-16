package einheit_05.uebung.uebung02;

public class Rechteck extends Figur {
    private double breite;
    private double hoehe;

    public Rechteck(String farbe, double breite, double hoehe) {
        super(farbe);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public double berechneFlaeche() {
        return breite * hoehe;
    }

    @Override
    public double berechneUmfang() {
        return 2 * (breite + hoehe);
    }

    @Override
    public String toString() {
        return "Rechteck [breite=" + breite + ", hoehe=" + hoehe + "] " + super.toString();
    }
}
