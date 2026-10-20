package einheit_03.uebung.uebung08;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark("Wien Hauptstandort");

        Fahrzeug f1 = new Fahrzeug("VW Golf", 2018, FahrzeugTyp.PKW);
        Fahrzeug f2 = new Fahrzeug("MAN TGX", 2021, FahrzeugTyp.LKW);
        Fahrzeug f3 = new Fahrzeug("BMW R 1250", 2023, FahrzeugTyp.MOTORRAD);
        Fahrzeug f4 = new Fahrzeug("Tesla Model 3", 2022, FahrzeugTyp.PKW);

        fuhrpark.addFahrzeug(f1);
        fuhrpark.addFahrzeug(f2);
        fuhrpark.addFahrzeug(f3);
        fuhrpark.addFahrzeug(f4);

        System.out.println("Alle Fahrzeuge im Fuhrpark:");
        fuhrpark.zeigeAlleFahrzeuge();

        System.out.println("\nFahrzeuge ab Baujahr 2021:");
        ArrayList<Fahrzeug> neuere = fuhrpark.findeFahrzeugeNeuerAls(2021);
        for (Fahrzeug f : neuere) {
            System.out.println("- " + f);
        }

        System.out.println("\nLöschen von Fahrzeug mit ID " + f1.getId() + ": " + fuhrpark.entferneFahrzeug(f1.getId()));
        System.out.println("Aktualisierter Fuhrpark:");
        fuhrpark.zeigeAlleFahrzeuge();
    }
}
