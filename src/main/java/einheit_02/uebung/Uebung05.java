package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung05 {

    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<>();
        personen.add(new Person("Mia", 22));
        personen.add(new Person("Jonas", 17));
        personen.add(new Person("Sophie", 25));
        personen.add(new Person("Lukas", 19));

        System.out.println("Gespeicherte Personen (" + personen.size() + "):");
        for (Person p : personen) {
            System.out.println(p);
        }
    }

    private static class Person {
        private final String name;
        private final int alter;

        private Person(String name, int alter) {
            this.name = name;
            this.alter = alter;
        }

        public String getName() {
            return name;
        }

        public int getAlter() {
            return alter;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', alter=" + alter + "}";
        }
    }
}
