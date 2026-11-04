package einheit_04.uebung.uebung03;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter("Stefan", 2500.0);
        Manager mgr = new Manager("Claudia", 4000.0, 1500.0);

        System.out.println(m);
        System.out.println(mgr);
    }
}
