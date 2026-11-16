package einheit_05.uebung.uebung10;

import java.util.ArrayList;
import java.util.List;

public class CampusManager {
    private String campusName;
    private List<CampusMitglied> mitglieder;

    public CampusManager(String campusName) {
        this.campusName = campusName;
        this.mitglieder = new ArrayList<>();
    }

    public void addMitglied(CampusMitglied m) {
        if (m != null) {
            mitglieder.add(m);
        }
    }

    public void zeigeAlleMitglieder() {
        System.out.println("=== Alle Mitglieder am " + campusName + " ===");
        for (CampusMitglied m : mitglieder) {
            System.out.println(m.getVorname() + " " + m.getNachname()
                    + " [" + m.getRolle() + "]"
                    + " | Alter: " + m.berechneAlter()
                    + " | Campus-Zugehörigkeit: " + m.berechneJahreAmCampus() + " Jahre"
                    + " | Berechtigung: " + m.getZugangslevel());
        }
        System.out.println();
    }

    public double berechneDurchschnittsAlter() {
        if (mitglieder.isEmpty()) {
            return 0.0;
        }
        double summe = 0.0;
        for (CampusMitglied m : mitglieder) {
            summe += m.berechneAlter();
        }
        return summe / mitglieder.size();
    }

    public List<CampusMitglied> findeMitgliederMitMindestJahren(int mindestJahre) {
        List<CampusMitglied> ergebnis = new ArrayList<>();
        for (CampusMitglied m : mitglieder) {
            if (m.berechneJahreAmCampus() >= mindestJahre) {
                ergebnis.add(m);
            }
        }
        return ergebnis;
    }

    public void zeigeZugangsliste() {
        System.out.println("=== Zugangsrechte-Matrix am " + campusName + " ===");
        for (CampusMitglied m : mitglieder) {
            System.out.println(String.format("%-20s -> %s", m.getVorname() + " " + m.getNachname(), m.getZugangslevel()));
        }
        System.out.println();
    }
}
