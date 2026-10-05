package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung02 {

    public static void main(String[] args) {
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("Lesen");
        hobbys.add("Schwimmen");
        hobbys.add("Gitarre spielen");
        hobbys.add("Wandern");

        System.out.println("Anzahl der Hobbys: " + hobbys.size());
        System.out.println("Alle Hobbys:");
        for (String hobby : hobbys) {
            System.out.println("- " + hobby);
        }
    }
}
