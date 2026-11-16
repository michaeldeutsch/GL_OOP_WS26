package einheit_05.uebung.uebung02;

public class Kreis extends Figur {
    private double radius;

    public Kreis(String farbe, double radius) {
        super(farbe);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Kreis [radius=" + radius + "] " + super.toString();
    }
}
