package einheit_05.uebung.uebung09;

public class Main {
    public static void main(String[] args) {
        // Fall 1: Kleine Bestellmenge
        Warenkorb cart1 = new Warenkorb(50.0, 2);
        cart1.addAktion(new ProzentRabatt("Black-Friday 10%", "10% auf alles", 10.0));
        cart1.addAktion(new FixerRabatt("Gutschein-Code 15€", "15€ Direktabzug", 15.0));
        cart1.addAktion(new MengenRabatt("Mengenstaffel ab 5 Stück", "25% Rabatt ab 5 Stück", 5, 25.0));
        cart1.zeigeVergleichUndBesterPreis();

        // Fall 2: Große Bestellmenge
        Warenkorb cart2 = new Warenkorb(50.0, 10);
        cart2.addAktion(new ProzentRabatt("Black-Friday 10%", "10% auf alles", 10.0));
        cart2.addAktion(new FixerRabatt("Gutschein-Code 15€", "15€ Direktabzug", 15.0));
        cart2.addAktion(new MengenRabatt("Mengenstaffel ab 5 Stück", "25% Rabatt ab 5 Stück", 5, 25.0));
        cart2.zeigeVergleichUndBesterPreis();
    }
}
