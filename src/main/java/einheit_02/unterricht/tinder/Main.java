package einheit_02.unterricht.tinder;

public class Main {

    public static void main(String[] args) {
        Mann adam = new Mann("Adam", 25, Kategorie.LESEN);
        System.out.println(adam);

        Frau eva = new Frau("Eva", 25, Kategorie.LESEN);
        System.out.println(eva);

        adam.date(eva);
    }
}
