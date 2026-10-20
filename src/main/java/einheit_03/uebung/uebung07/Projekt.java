package einheit_03.uebung.uebung07;

import java.util.ArrayList;

public class Projekt {
    private final String projektName;
    private final ArrayList<Entwickler> team;

    public Projekt(String projektName) {
        this.projektName = projektName;
        this.team = new ArrayList<>();
    }

    public String getProjektName() {
        return projektName;
    }

    public void addEntwickler(Entwickler entwickler) {
        if (entwickler != null && !team.contains(entwickler)) {
            team.add(entwickler);
        }
    }

    public double berechneGesamtStundensatz() {
        double summe = 0.0;
        for (Entwickler e : team) {
            summe += e.getStundensatz();
        }
        return summe;
    }

    public ArrayList<Entwickler> getEntwicklerNachLevel(Level level) {
        ArrayList<Entwickler> gefiltert = new ArrayList<>();
        for (Entwickler e : team) {
            if (e.getLevel() == level) {
                gefiltert.add(e);
            }
        }
        return gefiltert;
    }
}
