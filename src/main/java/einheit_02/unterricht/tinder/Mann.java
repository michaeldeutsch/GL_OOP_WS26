package einheit_02.unterricht.tinder;

public class Mann {

    private String name;
    private int alter;
    private Geschlecht geschlecht;
    private Kategorie kategorie;

    public Mann(String name, int alter, Kategorie kategorie) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = Geschlecht.MAENNLICH;
        this.kategorie = kategorie;
    }

    public Mann(String name, int alter) {
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

    public void date(Frau frau) {
        if (this.kategorie != null && frau != null && this.kategorie == frau.getKategorie()) {
            System.out.println("Date erfolgreich!");
        } else {
            System.out.println("Date nicht möglich!");
        }
    }

    @Override
    public String toString() {
        return "Mann{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", geschlecht=" + geschlecht +
                ", kategorie=" + kategorie +
                '}';
    }
}
