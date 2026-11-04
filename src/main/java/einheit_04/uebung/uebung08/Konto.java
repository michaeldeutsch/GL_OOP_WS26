package einheit_04.uebung.uebung08;

public class Konto {
    private static int COUNTER = 1001;

    private final int kontoNummer;
    private String inhaber;
    protected double kontostand;

    public Konto(String inhaber, double anfangsbestand) {
        this.kontoNummer = COUNTER++;
        this.inhaber = inhaber;
        this.kontostand = Math.max(0.0, anfangsbestand);
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        }
    }

    public boolean abheben(double betrag) {
        if (betrag > 0 && kontostand >= betrag) {
            kontostand -= betrag;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoNummer=" + kontoNummer +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
