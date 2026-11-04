package einheit_04.uebung.uebung09;

public class Main {
    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark("Express Logistics");

        fuhrpark.addFahrzeug(new Pkw("W-12345A", "VW Golf", 49.00, 5));
        fuhrpark.addFahrzeug(new Pkw("W-67890B", "Audi A4", 79.00, 5));
        fuhrpark.addFahrzeug(new Lkw("W-99999L", "MAN TGX", 199.00, 18.0));
        fuhrpark.addFahrzeug(new Pkw("W-12345A", "BMW 3er", 89.00, 5)); // Duplikat -> UNBEKANNT

        fuhrpark.zeigeAlleFahrzeuge();
        System.out.println("Gesamteinnahmen/Tag: " + fuhrpark.berechneGesamteinnahmenProTag() + " EUR");
    }
}
