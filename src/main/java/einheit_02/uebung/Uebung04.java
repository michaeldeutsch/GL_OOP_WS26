package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung04 {

    public static void main(String[] args) {
        ArrayList<Integer> punkte = new ArrayList<>();
        punkte.add(85);
        punkte.add(92);
        punkte.add(78);
        punkte.add(95);
        punkte.add(64);

        int summe = 0;
        int max = punkte.get(0);

        for (int p : punkte) {
            summe += p;
            if (p > max) {
                max = p;
            }
        }

        double durchschnitt = (double) summe / punkte.size();

        System.out.println("Zahlenliste: " + punkte);
        System.out.println("Summe: " + summe);
        System.out.printf("Durchschnitt: %.2f%n", durchschnitt);
        System.out.println("Maximalwert: " + max);
    }
}
