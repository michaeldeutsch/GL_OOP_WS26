package einheit_02.unterricht.auswahl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Auswahl {

    public static void main(String[] args) {
        String csvFile = "namen.csv";
        String line;
        String cvsSplitBy = ";";
        ArrayList<String> names = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] name = line.split(cvsSplitBy);
                if (name.length >= 2) {
                    names.add(name[1].trim() + " " + name[0].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random rand = new Random();
        if (!names.isEmpty()) {
            int randomIndex = rand.nextInt(names.size());
            System.out.println("Zufällige Auswahl: " + names.get(randomIndex));
        }
    }
}
