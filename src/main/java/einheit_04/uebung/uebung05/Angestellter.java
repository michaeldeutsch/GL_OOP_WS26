package einheit_04.uebung.uebung05;

public class Angestellter extends Person {
    private static int COUNTER = 5000;

    private final int personalNummer;
    private double gehalt;

    public Angestellter(String name, int alter, double gehalt) {
        super(name, alter);
        this.personalNummer = COUNTER++;
        this.gehalt = gehalt;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public double getGehalt() {
        return gehalt;
    }

    @Override
    public String toString() {
        return "Angestellter{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", personalNummer=" + personalNummer +
                ", gehalt=" + gehalt +
                '}';
    }
}
