package einheit_04.uebung.uebung03;

public class Mitarbeiter {
    private static int COUNTER = 100;

    private final int id;
    private String name;
    private double grundgehalt;

    public Mitarbeiter(String name, double grundgehalt) {
        this.id = COUNTER++;
        this.name = name;
        this.grundgehalt = grundgehalt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public double berechneGehalt() {
        return grundgehalt;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grundgehalt=" + grundgehalt +
                ", gesamtgehalt=" + berechneGehalt() +
                '}';
    }
}
