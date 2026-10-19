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

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
