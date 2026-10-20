package einheit_03.uebung.uebung04;

public class Fussballer {
    private final String name;
    private final int alter;
    private final Position position;

    public Fussballer(String name, int alter, Position position) {
        this.name = name;
        this.alter = alter;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " (" + alter + " Jahre, Position: " + position + ")";
    }
}
