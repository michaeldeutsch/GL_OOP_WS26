package einheit_02.unterricht.list;

import einheit_02.unterricht.tinder.Mann;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {
        ArrayList<Mann> alleMann = new ArrayList<>();
        alleMann.add(new Mann("Max", 20));
        alleMann.add(new Mann("Moritz", 21));
        alleMann.add(new Mann("Maxi", 22));
        alleMann.add(new Mann("Maximilian", 23));
        alleMann.add(new Mann("Maximilianus", 24));

        // Entfernt das Element an Index 2
        alleMann.remove(2);

        System.out.println("Anzahl der Männer: " + alleMann.size());
        for (Mann m : alleMann) {
            System.out.println(m);
        }
    }
}
