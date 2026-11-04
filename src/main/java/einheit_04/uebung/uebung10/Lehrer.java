package einheit_04.uebung.uebung10;

public class Lehrer extends Person {
    private Fachbereich fachbereich;
    private double gehalt;

    public Lehrer(String name, String email, Fachbereich fachbereich, double gehalt) {
        super(name, email);
        this.fachbereich = fachbereich;
        this.gehalt = gehalt;
    }

    public Fachbereich getFachbereich() {
        return fachbereich;
    }

    public double getGehalt() {
        return gehalt;
    }

    @Override
    public String toString() {
        return "Lehrer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", fachbereich=" + fachbereich +
                ", gehalt=" + gehalt +
                '}';
    }
}
