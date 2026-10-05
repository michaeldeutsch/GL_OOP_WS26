package einheit02.tinder;

public class Main {

    public static void main(String[] args) {
        // Mann name, alter
        // Frau name, alter
        // Mann kann haben Frau, Frau kann haben Mann
        // Kategorie: HOBBIES, SPORT, LESEN,  check
        // Geschlecht: MAENNLICH, WEIBLICH, DIVERS - check

        //------
        // Mann fraegt Frau, Frau fraegt Mann

        Mann adam = new Mann("Adam", 25, Kategorie.HOBBIES);
        System.out.println(adam);

        Frau eva = new Frau("Eva",25, Kategorie.LESEN);
        System.out.println(eva);

        adam.date(eva);



    }
}
