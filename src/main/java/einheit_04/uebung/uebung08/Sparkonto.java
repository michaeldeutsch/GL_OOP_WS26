package einheit_04.uebung.uebung08;

public class Sparkonto extends Konto {
    private double zinssatz; // z.B. 0.025 für 2.5%

    public Sparkonto(String inhaber, double anfangsbestand, double zinssatz) {
        super(inhaber, anfangsbestand);
        this.zinssatz = Math.max(0.0, zinssatz);
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void zinsenGutschreiben() {
        double zinsen = kontostand * zinssatz;
        kontostand += zinsen;
    }

    @Override
    public String toString() {
        return "Sparkonto{" +
                "kontoNummer=" + getKontoNummer() +
                ", inhaber='" + getInhaber() + '\'' +
                ", kontostand=" + kontostand +
                ", zinssatz=" + (zinssatz * 100) + "%" +
                '}';
    }
}
