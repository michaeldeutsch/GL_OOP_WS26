package einheit_02.unterricht.list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();

        namen.add("Max");
        namen.add("Moritz");
        namen.remove("Moritz");
        namen.add("Mia");
        namen.add("Maja");
        namen.add("Maja");

        if (namen.contains("Maja")) {
            System.out.println("Maja ist drin");
        }

        System.out.println("Anzahl der Elemente: " + namen.size());
    }
}
