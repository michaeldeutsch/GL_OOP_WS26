package einheit_05.uebung.uebung06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Angestellter ang1 = new Festangestellter(1, "Julia Maier", LocalDate.of(1992, 6, 10), 3200.0);
        Angestellter ang2 = new Freiberufler(2, "Felix Baum", LocalDate.of(1988, 11, 4), 75.0, 40);
        Angestellter ang3 = new Manager(3, "Dr. Claudia Kern", LocalDate.of(1979, 2, 18), 5500.0, 1500.0);

        List<Angestellter> belegschaft = new ArrayList<>();
        belegschaft.add(ang1);
        belegschaft.add(ang2);
        belegschaft.add(ang3);

        System.out.println("=== Gehaltsabrechnung der Belegschaft ===");
        double gesamtsumme = 0.0;
        for (Angestellter a : belegschaft) {
            double gehalt = a.berechneMonatsgehalt();
            gesamtsumme += gehalt;
            System.out.println(a.getName() + " -> Monatsgehalt: " + String.format("%.2f", gehalt) + " €");
        }

        System.out.println("----------------------------------------------");
        System.out.println("Gesamte Gehaltskosten: " + String.format("%.2f", gesamtsumme) + " €");
    }
}
