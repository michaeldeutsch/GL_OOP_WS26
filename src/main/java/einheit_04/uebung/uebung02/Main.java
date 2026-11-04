package einheit_04.uebung.uebung02;

public class Main {
    public static void main(String[] args) {
        Benutzer b1 = new Benutzer("anna", "anna@example.com");
        Benutzer b2 = new Benutzer("bernd", "bernd@example.com");
        Benutzer b3 = new Benutzer("anna", "anna2@example.com"); // Duplikat -> gast

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
