package einheit_02.unterricht.list;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        zahlen.add(5);

        // Entfernt das Element an Index 2 (Wert: 3)
        zahlen.remove(2);

        System.out.println("Zahlen in der Liste: " + zahlen);
        System.out.println("Anzahl der Elemente: " + zahlen.size());
    }
}
