package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung07 {

    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<>();
        personen.add(new Person("Mia", 22, Kategorie.SPORT));
        personen.add(new Person("Jonas", 19, Kategorie.GAMING));
        personen.add(new Person("Sophie", 25, Kategorie.SPORT));
        personen.add(new Person("Lukas", 21, Kategorie.REISEN));
        personen.add(new Person("Emma", 23, Kategorie.SPORT));

        int anzahlSport = zaehleKategorie(personen, Kategorie.SPORT);
        int anzahlGaming = zaehleKategorie(personen, Kategorie.GAMING);
        int anzahlKultur = zaehleKategorie(personen, Kategorie.KULTUR);

        System.out.println("Anzahl SPORT: " + anzahlSport);
        System.out.println("Anzahl GAMING: " + anzahlGaming);
        System.out.println("Anzahl KULTUR: " + anzahlKultur);
    }

    private static int zaehleKategorie(ArrayList<Person> personen, Kategorie gesuchteKategorie) {
        int zaehler = 0;
        for (Person p : personen) {
            if (p.getKategorie() == gesuchteKategorie) {
                zaehler++;
            }
        }
        return zaehler;
    }

    private enum Kategorie {
        SPORT,
        KULTUR,
        GAMING,
        REISEN
    }

    private static class Person {
        private final String name;
        private final int alter;
        private final Kategorie kategorie;

        private Person(String name, int alter, Kategorie kategorie) {
            this.name = name;
            this.alter = alter;
            this.kategorie = kategorie;
        }

        public String getName() {
            return name;
        }

        public int getAlter() {
            return alter;
        }

        public Kategorie getKategorie() {
            return kategorie;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', alter=" + alter + ", kategorie=" + kategorie + "}";
        }
    }
}
