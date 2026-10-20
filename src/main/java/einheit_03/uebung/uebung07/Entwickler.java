package einheit_03.uebung.uebung07;

public class Entwickler {
    private final String name;
    private final Level level;
    private final double stundensatz;

    public Entwickler(String name, Level level, double stundensatz) {
        this.name = name;
        this.level = level;
        this.stundensatz = stundensatz;
    }

    public Level getLevel() {
        return level;
    }

    public double getStundensatz() {
        return stundensatz;
    }

    @Override
    public String toString() {
        return name + " (" + level + ", " + stundensatz + " EUR/h)";
    }
}
