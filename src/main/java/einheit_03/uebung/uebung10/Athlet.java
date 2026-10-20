package einheit_03.uebung.uebung10;

public class Athlet {
    private static int counter = 0;

    private final int id;
    private final String name;
    private final int alter;
    private final int punkte;

    public Athlet(String name, int alter, int punkte) {
        counter++;
        this.id = counter;
        this.name = name;
        this.alter = alter;
        this.punkte = punkte;
    }

    public int getPunkte() {
        return punkte;
    }

    @Override
    public String toString() {
        return name + " (" + alter + " J., " + punkte + " Pkt.)";
    }
}
