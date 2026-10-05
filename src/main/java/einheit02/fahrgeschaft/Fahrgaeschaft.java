package einheit02.fahrgeschaft;

public class Fahrgaeschaft {

    private int id;
    private String name;
    private double preis;
    private Kategorie kategorie;



    public Fahrgaeschaft(int id, String name, double preis, Kategorie kategorie) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.kategorie = kategorie;
    }


    @Override
    public String toString() {
        return "Fahrgaeschaft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                ", kategorie=" + kategorie +
                '}';
    }

    public void erhohen(double preis){
        this.preis = preis;
    }
}
