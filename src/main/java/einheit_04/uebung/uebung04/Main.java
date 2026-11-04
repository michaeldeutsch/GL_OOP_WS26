package einheit_04.uebung.uebung04;

public class Main {
    public static void main(String[] args) {
        Geraet g = new Geraet("Sony", 299.99);
        Smartphone s1 = new Smartphone("Apple", 999.00, "iOS", 128);
        Smartphone s2 = new Smartphone("Samsung", 799.00, "Android", 256);

        System.out.println(g);
        System.out.println(s1);
        System.out.println(s2);
    }
}
