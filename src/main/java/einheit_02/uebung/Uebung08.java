package einheit_02.uebung;

public class Uebung08 {

    public static void main(String[] args) {
        Person p1 = new Person("Mia", 22, Kategorie.SPORT);
        Person p2 = new Person("Jonas", 25, Kategorie.SPORT);
        Person p3 = new Person("Sophie", 30, Kategorie.SPORT);
        Person p4 = new Person("Lukas", 23, Kategorie.GAMING);

        System.out.println("Match p1 & p2 (gleiche Kat, diff 3): " + p1.match(p2));
        System.out.println("Match p1 & p3 (gleiche Kat, diff 8): " + p1.match(p3));
        System.out.println("Match p1 & p4 (verschiedene Kat): " + p1.match(p4));
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
            if (anderePerson == null) {
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
}
