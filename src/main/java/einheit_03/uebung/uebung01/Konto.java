package einheit_03.uebung.uebung01;

public class Konto {
    private static int counter = 1000;

    private final int kontonummer;
    private final String inhaber;

    public Konto(String inhaber) {
        counter++;
        this.kontonummer = counter;
        this.inhaber = inhaber;
    }

    @Override
    public String toString() {
        return "Konto{kontonummer=" + kontonummer + ", inhaber='" + inhaber + "'}";
    }
}
