package einheit_03.uebung.uebung09;

public class Professor {
    private static int counter = 0;

    private final int profId;
    private final String name;
    private final String fachgebiet;

    public Professor(String name, String fachgebiet) {
        counter++;
        this.profId = counter;
        this.name = name;
        this.fachgebiet = fachgebiet;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    @Override
    public String toString() {
        return "Prof. #" + profId + ": " + name + " (Fachgebiet: " + fachgebiet + ")";
    }
}
