package einheit_04.uebung.uebung10;

import java.util.ArrayList;

public class Schule {
    private String schulname;
    private ArrayList<Person> mitglieder;

    public Schule(String schulname) {
        this.schulname = schulname;
        this.mitglieder = new ArrayList<>();
    }

    public void addPerson(Person p) {
        mitglieder.add(p);
    }

    public void zeigeAlleMitglieder() {
        System.out.println("=== Schule: " + schulname + " (Alle Mitglieder) ===");
        for (Person p : mitglieder) {
            System.out.println(p);
        }
    }

    public void zeigeNurSchueler() {
        System.out.println("=== Schule: " + schulname + " (Nur Schüler) ===");
        for (Person p : mitglieder) {
            if (p instanceof Schueler) {
                System.out.println(p);
            }
        }
    }

    public double berechneGesamtGehaelter() {
        double summe = 0.0;
        for (Person p : mitglieder) {
            if (p instanceof Lehrer) {
                summe += ((Lehrer) p).getGehalt();
            }
        }
        return summe;
    }
}
