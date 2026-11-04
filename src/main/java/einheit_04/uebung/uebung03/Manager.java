package einheit_04.uebung.uebung03;

public class Manager extends Mitarbeiter {
    private double bonus;

    public Manager(String name, double grundgehalt, double bonus) {
        super(name, grundgehalt);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", grundgehalt=" + getGrundgehalt() +
                ", bonus=" + bonus +
                ", gesamtgehalt=" + berechneGehalt() +
                '}';
    }
}
