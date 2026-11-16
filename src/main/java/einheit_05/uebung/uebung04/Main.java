package einheit_05.uebung.uebung04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Girokonto girokonto = new Girokonto("AT123456789012345678", -500.0, 1000.0, 0.09);
        Sparkonto sparkonto = new Sparkonto("AT987654321098765432", 10000.0, 0.03);

        List<Konto> konten = new ArrayList<>();
        konten.add(girokonto);
        konten.add(sparkonto);

        System.out.println("=== Kontenverwaltung und finale Methoden ===");
        for (Konto k : konten) {
            // Finale Methode aufrufen
            k.druckeKopfzeile();
            System.out.println("Vor Zinsbuchung: " + k);

            // Abstrakte / polymorphe Methode aufrufen
            k.bucheZinsen();
            System.out.println("Nach Zinsbuchung: " + k);
            System.out.println();
        }
    }
}
