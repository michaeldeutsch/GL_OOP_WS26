package einheit_02.unterricht.tinder;

public class Frau {

    private String name;
    private int alter;
    private Geschlecht geschlecht;
    private Kategorie kategorie;

    public Frau(String name, int alter, Kategorie kategorie) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = Geschlecht.WEIBLICH;
        this.kategorie = kategorie;
    }

    public Frau(String name, int alter) {
        this(name, alter, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    @Override
    public String toString() {
        return "Frau{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", geschlecht=" + geschlecht +
                ", kategorie=" + kategorie +
                '}';
    }
}
