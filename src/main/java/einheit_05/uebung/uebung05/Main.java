package einheit_05.uebung.uebung05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter(1, "Thomas Gruber", LocalDate.of(1980, 4, 15), LocalDate.of(2010, 3, 1));
        Mitarbeiter m2 = new Mitarbeiter(2, "Sandra Weber", LocalDate.of(1995, 8, 22), LocalDate.of(2021, 9, 15));
        Mitarbeiter m3 = new Mitarbeiter(3, "Markus Huber", LocalDate.of(1972, 12, 5), LocalDate.of(1998, 7, 1));

        List<Mitarbeiter> team = new ArrayList<>();
        team.add(m1);
        team.add(m2);
        team.add(m3);

        System.out.println("=== Mitarbeiter-Alters- und Dienstzeitanalyse ===");
        for (Mitarbeiter m : team) {
            System.out.println(m.getFormatiertesProfil());
            System.out.println("  -> Hat 10-Jahres-Jubiläum erreicht: " + (m.hatJubilaeum(10) ? "JA" : "NEIN"));
            System.out.println("  -> Hat 25-Jahres-Jubiläum erreicht: " + (m.hatJubilaeum(25) ? "JA" : "NEIN"));
            System.out.println();
        }
    }
}
