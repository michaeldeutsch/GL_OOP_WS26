package einheit_05.uebung.uebung02;

public abstract class Figur {
    private String farbe;

    public Figur(String farbe) {
        this.farbe = farbe;
    }

    public abstract double berechneFlaeche();

    public abstract double berechneUmfang();

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Figur [Farbe=" + farbe +
                ", Fläche=" + String.format("%.2f", berechneFlaeche()) +
                ", Umfang=" + String.format("%.2f", berechneUmfang()) + "]";
    }
}
