package einheit_03.uebung.uebung03;

import java.util.ArrayList;

public class Verein {
    private final String name;
    private final ArrayList<Mitglied> mitglieder;

    public Verein(String name) {
        this.name = name;
        this.mitglieder = new ArrayList<>();
    }

    public void addMitglied(Mitglied mitglied) {
        if (mitglied != null && !mitglieder.contains(mitglied)) {
            mitglieder.add(mitglied);
        }
    }

    public void zeigeMitglieder() {
        System.out.println("Vereinsmitglieder von '" + name + "':");
        if (mitglieder.isEmpty()) {
            System.out.println("- Keine Mitglieder vorhanden.");
        } else {
            for (Mitglied m : mitglieder) {
                System.out.println("- " + m);
            }
        }
    }
}
