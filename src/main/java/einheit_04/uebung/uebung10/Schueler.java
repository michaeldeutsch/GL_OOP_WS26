package einheit_04.uebung.uebung10;

public class Schueler extends Person {
    private String klassenName;
    private double notenschnitt;

    public Schueler(String name, String email, String klassenName, double notenschnitt) {
        super(name, email);
        this.klassenName = klassenName;
        this.notenschnitt = notenschnitt;
    }

    public String getKlassenName() {
        return klassenName;
    }

    public double getNotenschnitt() {
        return notenschnitt;
    }

    @Override
    public String toString() {
        return "Schueler{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", klassenName='" + klassenName + '\'' +
                ", notenschnitt=" + notenschnitt +
                '}';
    }
}
