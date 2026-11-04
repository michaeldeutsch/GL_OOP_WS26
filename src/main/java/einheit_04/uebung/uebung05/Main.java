package einheit_04.uebung.uebung05;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Lisa", 20);
        Angestellter a = new Angestellter("Markus", 35, 3200.0);
        Dozent d = new Dozent("Prof. Dr. Weber", 50, 5500.0, "Informatik", 12);

        System.out.println(p);
        System.out.println(a);
        System.out.println(d);
    }
}
