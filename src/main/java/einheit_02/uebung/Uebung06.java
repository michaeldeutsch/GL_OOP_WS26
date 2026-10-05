package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung06 {

    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<>();
        personen.add(new Person("Mia", 22));
        personen.add(new Person("Jonas", 17));
        personen.add(new Person("Sophie", 25));
        personen.add(new Person("Lukas", 16));

        System.out.println("Personen ab 18 Jahren:");
        printErwachsene(personen, 18);
    }

    private static void printErwachsene(ArrayList<Person> personen, int minAlter) {
        for (Person p : personen) {
            if (p.getAlter() >= minAlter) {
                System.out.println("- " + p.getName() + " (" + p.getAlter() + " Jahre)");
            }
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
