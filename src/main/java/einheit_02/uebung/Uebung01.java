package einheit_02.uebung;

public class Uebung01 {

    public static void main(String[] args) {
        Profil profil = new Profil("Alex", Kategorie.GAMING);
        System.out.println(profil);
    }

    private enum Kategorie {
        SPORT,
        KULTUR,
        GAMING,
        REISEN
    }

    private static class Profil {
        private final String name;
        private final Kategorie kategorie;

        private Profil(String name, Kategorie kategorie) {
            this.name = name;
            this.kategorie = kategorie;
        }

        public String getName() {
            return name;
        }

        public Kategorie getKategorie() {
            return kategorie;
        }

        @Override
        public String toString() {
            return "Profil{name='" + name + "', kategorie=" + kategorie + "}";
        }
    }
}
