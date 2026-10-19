package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung04 {

    public static void main(String[] args) {
        Team team = new Team("Rapid Kickers");

        Fussballer f1 = new Fussballer("Manuel", 32, Position.TORWART);
        Fussballer f2 = new Fussballer("David", 28, Position.ABWEHR);
        Fussballer f3 = new Fussballer("Luka", 24, Position.MITTFELD);
        Fussballer f4 = new Fussballer("Toni", 26, Position.MITTFELD);
        Fussballer f5 = new Fussballer("Erling", 22, Position.ANGRIFF);

        team.addSpieler(f1);
        team.addSpieler(f2);
        team.addSpieler(f3);
        team.addSpieler(f4);
        team.addSpieler(f5);

        team.zeigeSpielerAufPosition(Position.MITTFELD);
        team.zeigeSpielerAufPosition(Position.TORWART);
    }

    private enum Position {
        TORWART,
        ABWEHR,
        MITTFELD,
        ANGRIFF
    }

    private static class Fussballer {
        private final String name;
        private final int alter;
        private final Position position;

        public Fussballer(String name, int alter, Position position) {
            this.name = name;
            this.alter = alter;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public int getAlter() {
            return alter;
        }

        public Position getPosition() {
            return position;
        }

        @Override
        public String toString() {
            return name + " (" + alter + " Jahre, Position: " + position + ")";
        }
    }

    private static class Team {
        private final String teamName;
        private final ArrayList<Fussballer> spielerListe;

        public Team(String teamName) {
            this.teamName = teamName;
            this.spielerListe = new ArrayList<>();
        }

        public void addSpieler(Fussballer spieler) {
            if (spieler != null && !spielerListe.contains(spieler)) {
                spielerListe.add(spieler);
            }
        }

        public void zeigeSpielerAufPosition(Position position) {
            System.out.println("Spieler auf Position " + position + " im Team '" + teamName + "':");
            boolean gefunden = false;
            for (Fussballer f : spielerListe) {
                if (f.getPosition() == position) {
                    System.out.println("- " + f);
                    gefunden = true;
                }
            }
            if (!gefunden) {
                System.out.println("- Keine Spieler auf dieser Position gefunden.");
            }
        }
    }
}
