package einheit_04.uebung.uebung08;

public class Girokonto extends Konto {
    private double dispolimit;

    public Girokonto(String inhaber, double anfangsbestand, double dispolimit) {
        super(inhaber, anfangsbestand);
        this.dispolimit = Math.max(0.0, dispolimit);
    }

    public double getDispolimit() {
        return dispolimit;
    }

    @Override
    public boolean abheben(double betrag) {
        if (betrag > 0 && (kontostand + dispolimit) >= betrag) {
            kontostand -= betrag;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "kontoNummer=" + getKontoNummer() +
                ", inhaber='" + getInhaber() + '\'' +
                ", kontostand=" + kontostand +
                ", dispolimit=" + dispolimit +
                '}';
    }
}
