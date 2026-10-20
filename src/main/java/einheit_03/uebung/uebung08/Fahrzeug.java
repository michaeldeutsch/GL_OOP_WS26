package einheit_03.uebung.uebung08;

public class Fahrzeug {
    private static int counter = 0;

    private final int id;
    private final String modell;
    private final int baujahr;
    private final FahrzeugTyp typ;

    public Fahrzeug(String modell, int baujahr, FahrzeugTyp typ) {
        counter++;
        this.id = counter;
        this.modell = modell;
        this.baujahr = baujahr;
        this.typ = typ;
    }

    public int getId() {
        return id;
    }

    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public String toString() {
        return "Fahrzeug #" + id + " [" + typ + "]: " + modell + " (" + baujahr + ")";
    }
}
