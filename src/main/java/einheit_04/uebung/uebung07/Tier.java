package einheit_04.uebung.uebung07;

public class Tier {
    private String name;
    private int alter;
    private String futter;

    public Tier(String name, int alter, String futter) {
        this.name = name;
        this.alter = alter;
        this.futter = futter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getFutter() {
        return futter;
    }

    public void gibLaut() {
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", futter='" + futter + '\'' +
                '}';
    }
}
