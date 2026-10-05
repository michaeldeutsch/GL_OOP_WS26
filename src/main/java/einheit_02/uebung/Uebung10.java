package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung10 {

    public static void main(String[] args) {
        Community platform = new Community("MatchPoint");

        Person mia = new Person("Mia", 22, Kategorie.SPORT);
        Person jonas = new Person("Jonas", 24, Kategorie.SPORT);
        Person lukas = new Person("Lukas", 30, Kategorie.SPORT);
        Person emma = new Person("Emma", 21, Kategorie.GAMING);
        Person tim = new Person("Tim", 25, Kategorie.SPORT);

        platform.addPerson(mia);
        platform.addPerson(jonas);
        platform.addPerson(lukas);
        platform.addPerson(emma);
        platform.addPerson(tim);

        System.out.println("Gesuchte Matches für: " + mia);
        ArrayList<Person> matches = platform.findeMatches(mia);

        System.out.println("Gefundene Matches (" + matches.size() + "):");
        for (Person match : matches) {
            System.out.println("- " + match);
        }
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

        public boolean match(Person anderePerson) {
            if (anderePerson == null || anderePerson == this) {
                return false;
            }
            boolean gleicheKategorie = this.kategorie == anderePerson.getKategorie();
            boolean passendesAlter = Math.abs(this.alter - anderePerson.getAlter()) <= 5;
            return gleicheKategorie && passendesAlter;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', alter=" + alter + ", kategorie=" + kategorie + "}";
        }
    }

    private static class Community {
        private final String name;
        private final ArrayList<Person> mitglieder;

        public Community(String name) {
            this.name = name;
            this.mitglieder = new ArrayList<>();
        }

        public void addPerson(Person person) {
            if (person != null && !mitglieder.contains(person)) {
                mitglieder.add(person);
            }
        }

        public ArrayList<Person> findeMatches(Person sucher) {
            ArrayList<Person> matches = new ArrayList<>();
            for (Person kandidat : mitglieder) {
                if (sucher.match(kandidat)) {
                    matches.add(kandidat);
                }
            }
            return matches;
        }
    }
}
