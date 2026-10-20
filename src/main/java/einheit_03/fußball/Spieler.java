package einheit_03.fußball;

public class Spieler {

    private String vorname;
    private String nachname;
    private int alter;
    private Position position;
    private String team;

    public Spieler(String vorname, String nachname, int alter) {
        this(vorname, nachname, alter, null);
    }

    public Spieler(String vorname, String nachname, int alter, Position position) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                ", position=" + position +
                ", team='" + team + '\'' +
                '}';
    }
}
