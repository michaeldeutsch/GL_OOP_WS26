package einheit_05.uebung.uebung02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck("Blau", 5.0, 3.0);
        Kreis kreis = new Kreis("Rot", 4.0);

        List<Figur> figuren = new ArrayList<>();
        figuren.add(rechteck);
        figuren.add(kreis);

        System.out.println("=== Geometrische Figuren ===");
        for (Figur f : figuren) {
            System.out.println(f);
        }
    }
}
