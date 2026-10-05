package einheit02.fahrgeschaft;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Auswahl {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        Scanner scanner = new Scanner(new File("namen.csv"));
        ArrayList<String> namen = new ArrayList<>();

        while (scanner.hasNextLine()){
            namen.add(scanner.nextLine());
        }
        int zufall = ThreadLocalRandom.current().nextInt(0, namen.size());
        Thread.sleep(100000);
        System.out.println(namen.get(zufall));


    }
}
