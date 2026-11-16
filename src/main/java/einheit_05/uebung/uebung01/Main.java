package einheit_05.uebung.uebung01;

public class Main {
    public static void main(String[] args) {
        // 1. All-Args Konstruktor via Lombok
        Produkt p1 = new Produkt(1, "Laptop", 999.99, "Elektronik");

        // 2. No-Args Konstruktor und Setter via Lombok
        Produkt p2 = new Produkt();
        p2.setId(2);
        p2.setBezeichnung("Maus");
        p2.setPreis(29.90);
        p2.setKategorie("Zubehör");

        // 3. Ausgabe via generierter toString()
        System.out.println("Produkt 1: " + p1);
        System.out.println("Produkt 2: " + p2);

        // 4. Getter und Preisänderung
        p1.setPreis(899.99);
        System.out.println("Aktualisierter Preis für " + p1.getBezeichnung() + ": " + p1.getPreis() + " €");
    }
}
