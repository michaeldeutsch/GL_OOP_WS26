package einheit_03.uebung.uebung07;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Projekt projekt = new Projekt("E-Commerce Platform");

        Entwickler dev1 = new Entwickler("Alice", Level.SENIOR, 120.0);
        Entwickler dev2 = new Entwickler("Bob", Level.MEDIOR, 85.0);
        Entwickler dev3 = new Entwickler("Charlie", Level.JUNIOR, 55.0);
        Entwickler dev4 = new Entwickler("Diana", Level.SENIOR, 130.0);

        projekt.addEntwickler(dev1);
        projekt.addEntwickler(dev2);
        projekt.addEntwickler(dev3);
        projekt.addEntwickler(dev4);

        System.out.println("Projekt: " + projekt.getProjektName());
        System.out.println("Gesamtstundensatz des Teams: " + projekt.berechneGesamtStundensatz() + " EUR/h");

        System.out.println("\nSenior-Entwickler:");
        ArrayList<Entwickler> seniors = projekt.getEntwicklerNachLevel(Level.SENIOR);
        for (Entwickler s : seniors) {
            System.out.println("- " + s);
        }
    }
}
