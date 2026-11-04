package einheit_04.unqiue;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter m1 = new Mitarbeiter("Max", 20); // unique
        Mitarbeiter m2 = new Mitarbeiter("Susi", 20);// unique
        Mitarbeiter m3 = new Mitarbeiter("Max", 20); // bereits vorhanden -> dummy wird als alterantive gesetzt
        Mitarbeiter m4 = new Mitarbeiter("Max", 20); // bereits vorhanden -> dummy wird als alterantive gesetzt


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }


}
