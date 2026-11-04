package einheit_04.uebung.uebung05;

public class Dozent extends Angestellter {
    private String fachbereich;
    private int lehrstunden;

    public Dozent(String name, int alter, double gehalt, String fachbereich, int lehrstunden) {
        super(name, alter, gehalt);
        this.fachbereich = fachbereich;
        this.lehrstunden = lehrstunden;
    }

    public String getFachbereich() {
        return fachbereich;
    }

    public int getLehrstunden() {
        return lehrstunden;
    }

    @Override
    public String toString() {
        return "Dozent{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", personalNummer=" + getPersonalNummer() +
                ", gehalt=" + getGehalt() +
                ", fachbereich='" + fachbereich + '\'' +
                ", lehrstunden=" + lehrstunden +
                '}';
    }
}
