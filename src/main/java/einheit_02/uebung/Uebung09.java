package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung09 {

    public static void main(String[] args) {
        Community community = new Community("Campus Wien");

        Person p1 = new Person("Mia", 22, Kategorie.SPORT);
        Person p2 = new Person("Jonas", 19, Kategorie.GAMING);
        Person p3 = new Person("Sophie", 25, Kategorie.REISEN);

        community.addPerson(p1);
        community.addPerson(p2);
        community.addPerson(p3);

        System.out.println("Mitgliederzahl: " + community.getAnzahl());

        Person gesucht = community.findePerson("Jonas");
        System.out.println("Gefunden: " + gesucht);

        community.removePerson(p2);
        System.out.println("Nach dem Entfernen: " + community.getAnzahl());
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

        public void removePerson(Person person) {
            mitglieder.remove(person);
        }

        public int getAnzahl() {
            return mitglieder.size();
        }

        public Person findePerson(String name) {
            for (Person p : mitglieder) {
                if (p.getName().equalsIgnoreCase(name)) {
                    return p;
                }
            }
            return null;
        }
    }
}
