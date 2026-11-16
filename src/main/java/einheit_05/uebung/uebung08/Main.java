package einheit_05.uebung.uebung08;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek("Stadtbibliothek Wien");

        LocalDate heute = LocalDate.now();

        // Buch ausgeliehen vor 5 Wochen (Überfällig, da Leihfrist 4 Wochen)
        bib.addMedium(new Buch("Clean Code", "INF-001", heute.minusWeeks(5), "Robert C. Martin", 464));

        // Buch ausgeliehen vor 2 Wochen (Nicht überfällig)
        bib.addMedium(new Buch("Java ist auch eine Insel", "INF-002", heute.minusWeeks(2), "Christian Ullenboom", 1250));

        // DVD ausgeliehen vor 10 Tagen (Überfällig, da Leihfrist 7 Tage)
        bib.addMedium(new Dvd("Inception", "DVD-042", heute.minusDays(10), 148));

        // DVD ausgeliehen vor 3 Tagen (Nicht überfällig)
        bib.addMedium(new Dvd("Interstellar", "DVD-088", heute.minusDays(3), 169));

        bib.zeigeUeberfaelligeMedien(heute);
    }
}
