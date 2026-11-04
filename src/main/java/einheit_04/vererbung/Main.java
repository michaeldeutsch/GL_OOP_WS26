package einheit_04.vererbung;

public class Main {
    public static void main(String[] args) {

        // Lebewesen
        Lebewesen lebewesen = new Lebewesen("Fisch", 2);
        System.out.println(lebewesen);
        System.out.println(lebewesen.getName());
        System.out.println(lebewesen.getAlter());
        System.out.println("--------------------------\n");

        // Tier
        Tier tier = new Tier("Hund", 3, "Knochen");
        System.out.println(tier);
        System.out.println(tier.getName());
        System.out.println(tier.getAlter());
        System.out.println(tier.getFutter());
        System.out.println("--------------------------\n");

        // Mensch
        Mensch mensch = new Mensch("Max", 25, "Pizza");
        System.out.println(mensch);
        System.out.println(mensch.getName());
        System.out.println(mensch.getAlter());
        System.out.println(mensch.getAdress());


    }
}
