package einheit02.tinder;

public class Frau {

    private String name;
    private int alter;
    private Geschlecht geschlecht;
    private Kategorie kategorie;

    public Frau(String name, int alter, Kategorie kategorie){
        this.name = name;
        this.alter = alter;
        this.geschlecht = Geschlecht.WEIBLICH;
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

    public Kategorie getKategorie() {
        return kategorie;
    }
}
