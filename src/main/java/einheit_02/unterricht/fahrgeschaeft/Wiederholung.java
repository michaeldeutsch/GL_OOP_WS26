package einheit_02.unterricht.fahrgeschaeft;

public class Wiederholung {

    public static void main(String[] args) {
        // Fahrgeschäft: Name, Preis, istOffen, maxPersonen
        Fahrgeschaeft f1 = new Fahrgeschaeft("Achterbahn", 5.50, true, 24);
        System.out.println(f1);

        // Eine Methode kann den Preis erhöhen, aber nur wenn positiv und größer als der tatsächliche Preis
        f1.erhoehen(6.00);
        System.out.println("Neuer Preis: " + f1.getPreis());

        f1.erhoehen(4.00); // Ungültig
    }
}
