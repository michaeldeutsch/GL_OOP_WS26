package einheit_04.uebung.uebung01;

public class Fahrzeug {
    private String marke;
    private int baujahr;

    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
