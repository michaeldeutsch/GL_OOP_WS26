package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung07 {

    public static void main(String[] args) {
        Projekt projekt = new Projekt("E-Commerce Platform");

        Entwickler dev1 = new Entwickler("Alice", Level.SENIOR, 120.0);
        Entwickler dev2 = new Entwickler("Bob", Level.MEDIOR, 85.0);
        Entwickler dev3 = new Entwickler("Charlie", Level.JUNIOR, 55.0);
        Entwickler dev4 = new Entwickler("Diana", Level.SENIOR, 130.0);

        projekt.addEntwickler(dev1);
        projekt.addEntwickler(dev2);
        projekt.addEntwickler(dev3);
        projekt.addEntwickler(dev4);

        System.out.println("Projekt: " + projekt.getProjektName());
        System.out.println("Gesamtstundensatz des Teams: " + projekt.berechneGesamtStundensatz() + " EUR/h");

        System.out.println("\nSenior-Entwickler:");
        ArrayList<Entwickler> seniors = projekt.getEntwicklerNachLevel(Level.SENIOR);
        for (Entwickler s : seniors) {
            System.out.println("- " + s);
        }
    }

    private enum Level {
        JUNIOR,
        MEDIOR,
        SENIOR
    }

    private static class Entwickler {
        private final String name;
        private final Level level;
        private final double stundensatz;

        public Entwickler(String name, Level level, double stundensatz) {
            this.name = name;
            this.level = level;
            this.stundensatz = stundensatz;
        }

        public String getName() {
            return name;
        }

        public Level getLevel() {
            return level;
        }

        public double getStundensatz() {
            return stundensatz;
        }

        @Override
        public String toString() {
            return name + " (" + level + ", " + stundensatz + " EUR/h)";
        }
    }

    private static class Projekt {
        private final String projektName;
        private final ArrayList<Entwickler> team;

        public Projekt(String projektName) {
            this.projektName = projektName;
            this.team = new ArrayList<>();
        }

        public String getProjektName() {
            return projektName;
        }

        public void addEntwickler(Entwickler entwickler) {
            if (entwickler != null && !team.contains(entwickler)) {
                team.add(entwickler);
            }
        }

        public double berechneGesamtStundensatz() {
            double summe = 0.0;
            for (Entwickler e : team) {
                summe += e.getStundensatz();
            }
            return summe;
        }

        public ArrayList<Entwickler> getEntwicklerNachLevel(Level level) {
            ArrayList<Entwickler> gefiltert = new ArrayList<>();
            for (Entwickler e : team) {
                if (e.getLevel() == level) {
                    gefiltert.add(e);
                }
            }
            return gefiltert;
        }
    }
}
