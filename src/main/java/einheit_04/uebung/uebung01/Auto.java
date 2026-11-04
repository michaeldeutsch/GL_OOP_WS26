package einheit_04.uebung.uebung01;

public class Auto extends Fahrzeug {
    private int anzahlTueren;

    public Auto(String marke, int baujahr, int anzahlTueren) {
        super(marke, baujahr);
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + getMarke() + '\'' +
                ", baujahr=" + getBaujahr() +
                ", anzahlTueren=" + anzahlTueren +
                '}';
    }
}
