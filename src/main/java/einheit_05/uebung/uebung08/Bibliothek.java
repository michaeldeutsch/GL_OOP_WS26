package einheit_05.uebung.uebung08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private String name;
    private List<Medium> ausgelieheneMedien;

    public Bibliothek(String name) {
        this.name = name;
        this.ausgelieheneMedien = new ArrayList<>();
    }

    public void addMedium(Medium m) {
        if (m != null) {
            ausgelieheneMedien.add(m);
        }
    }

    public void zeigeUeberfaelligeMedien(LocalDate stichtag) {
        System.out.println("=== Überfällige Medien in Bibliothek '" + name + "' am Stichtag " + stichtag + " ===");
        int count = 0;
        for (Medium m : ausgelieheneMedien) {
            if (m.istUeberfaellig(stichtag)) {
                count++;
                System.out.println("  [ÜBERFÄLLIG] " + m.getTitel() + " (" + m.getSignatur() + ")"
                        + " | Ausgeliehen am: " + m.getAusleihDatum()
                        + " | Fällig am: " + m.berechneRueckgabeDatum());
            } else {
                System.out.println("  [OK] " + m.getTitel() + " | Fällig am: " + m.berechneRueckgabeDatum());
            }
        }
        System.out.println("Gesamtzahl überfälliger Medien: " + count);
        System.out.println();
    }
}
