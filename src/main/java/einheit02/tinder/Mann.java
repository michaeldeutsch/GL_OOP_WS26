package einheit02.tinder;

public class Mann {

    private String name;
    private int alter;
    private Geschlecht geschlecht;
    private Kategorie kategorie;

    public Mann(String name, int alter, Kategorie kategorie){
        this.name = name;
        this.alter = alter;
        this.kategorie = kategorie;
        this.geschlecht = Geschlecht.MAENNLICH;
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

    public void date(Frau eva) {

        if (this.kategorie == eva.getKategorie()) {
            System.out.println("Date erfolgreich!");
        }else{
            System.out.println("Date nicht möglich!");
        }
        }

    }
