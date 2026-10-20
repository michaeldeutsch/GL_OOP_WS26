package einheit_03.uebung.uebung10;

import java.util.ArrayList;

public class Verein {
    private final String name;
    private final LigaStatus status;
    private final ArrayList<Athlet> athleten;

    public Verein(String name, LigaStatus status) {
        this.name = name;
        this.status = status;
        this.athleten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LigaStatus getStatus() {
        return status;
    }

    public void addAthlet(Athlet athlet) {
        if (athlet != null && !athleten.contains(athlet)) {
            athleten.add(athlet);
        }
    }

    public int getGesamtPunkte() {
        int summe = 0;
        for (Athlet a : athleten) {
            summe += a.getPunkte();
        }
        return summe;
    }

    public Athlet getBesterAthlet() {
        if (athleten.isEmpty()) {
            return null;
        }
        Athlet bester = athleten.get(0);
        for (Athlet a : athleten) {
            if (a.getPunkte() > bester.getPunkte()) {
                bester = a;
            }
        }
        return bester;
    }

    @Override
    public String toString() {
        return "Verein{name='" + name + "', status=" + status + ", gesamtPunkte=" + getGesamtPunkte() + "}";
    }
}
