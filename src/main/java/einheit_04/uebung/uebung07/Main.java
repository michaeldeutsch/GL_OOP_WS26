package einheit_04.uebung.uebung07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tier> tiere = new ArrayList<>();
        tiere.add(new Hund("Bello", 4, "Fleisch", "Labrador"));
        tiere.add(new Katze("Mimi", 2, "Fisch", true));
        tiere.add(new Vogel("Hansi", 1, "Körner", 0.25));

        for (Tier t : tiere) {
            System.out.println(t);
            t.gibLaut();
            System.out.println();
        }
    }
}
