package einheit_05.uebung.uebung10;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CampusManager manager = new CampusManager("FH BFI Wien Campus");

        LocalDate heute = LocalDate.now();

        // 1. Studenten anlegen
        Student s1 = new Student(1, "Lukas", "Bauer", LocalDate.of(2003, 5, 12), heute.minusYears(1), 2023001, "Informatik");
        Student s2 = new Student(2, "Sophie", "Müller", LocalDate.of(2002, 9, 30), heute.minusYears(3), 2021002, "Wirtschaftsinformatik");

        // 2. Dozenten anlegen (finale Klasse)
        Dozent d1 = new Dozent(101, "Prof. Dr. Michael", "Deutsch", LocalDate.of(1982, 1, 15), heute.minusYears(10), "Software Engineering", 5800.0);
        Dozent d2 = new Dozent(102, "Dr. Eva", "Sommer", LocalDate.of(1978, 11, 20), heute.minusYears(6), "Datenbanken", 5200.0);

        // 3. Forschenden anlegen
        Forschender f1 = new Forschender(201, "Dr. Alex", "Kern", LocalDate.of(1989, 7, 8), heute.minusYears(4), "KI im Bildungswesen", 150000.0);

        // Zum Manager hinzufügen
        manager.addMitglied(s1);
        manager.addMitglied(s2);
        manager.addMitglied(d1);
        manager.addMitglied(d2);
        manager.addMitglied(f1);

        // Auswertungen ausführen
        manager.zeigeAlleMitglieder();
        manager.zeigeZugangsliste();

        System.out.println("Durchschnittsalter aller Campus-Mitglieder: "
                + String.format("%.1f", manager.berechneDurchschnittsAlter()) + " Jahre\n");

        int mindestJahre = 5;
        List<CampusMitglied> langjaehrige = manager.findeMitgliederMitMindestJahren(mindestJahre);
        System.out.println("Mitglieder mit mindestens " + mindestJahre + " Jahren am Campus (" + langjaehrige.size() + "):");
        for (CampusMitglied m : langjaehrige) {
            System.out.println("  - " + m.getVorname() + " " + m.getNachname() + " (" + m.berechneJahreAmCampus() + " Jahre)");
        }
    }
}
