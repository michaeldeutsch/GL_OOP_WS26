package zt.zt1;

public class Main {
    public static void main(String[] args) {
        SuessigkeitenStation station = new SuessigkeitenStation("Halloween-Bar", 20, true);

        System.out.println("Anfangszustand:");
        printStation(station);

        boolean erfolgreich = station.verteile(5);
        System.out.println("\nverteile(5): " + erfolgreich);
        printStation(station);

        boolean nichtErfolgreich = station.verteile(100);
        System.out.println("\nverteile(100): " + nichtErfolgreich);
        printStation(station);

        station.setGeoeffnet(false);
        System.out.println("\nStation wurde geschlossen.");

        boolean geschlossen = station.verteile(2);
        System.out.println("verteile(2) bei geschlossener Station: " + geschlossen);

        System.out.println("\nEndzustand:");
        printStation(station);
    }

    private static void printStation(SuessigkeitenStation station) {
        System.out.println("Bezeichnung: " + station.getBezeichnung());
        System.out.println("Bestand: " + station.getBestand());
        System.out.println("Geoeffnet: " + station.isGeoeffnet());
    }
}
