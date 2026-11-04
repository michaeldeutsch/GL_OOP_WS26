package einheit_04.uebung.uebung01;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Fahrzeug("KTM", 2021);
        Auto auto = new Auto("VW", 2023, 5);

        System.out.println(fahrzeug);
        System.out.println(auto);
    }
}
