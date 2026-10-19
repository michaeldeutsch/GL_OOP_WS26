package einheit_03.uebung;

import java.util.ArrayList;

public class Uebung09 {

    public static void main(String[] args) {
        Universitaet uni = new Universitaet("Technologie-Universität");

        Fakultaet informatik = new Fakultaet("Informatik");
        informatik.addProfessor(new Professor("Dr. Ada Lovelace", "Algorithmen"));
        informatik.addProfessor(new Professor("Dr. Alan Turing", "Künstliche Intelligenz"));
        informatik.addProfessor(new Professor("Dr. Grace Hopper", "Programmiersprachen"));

        Fakultaet wirtschaft = new Fakultaet("Wirtschaftswissenschaften");
        wirtschaft.addProfessor(new Professor("Dr. John Nash", "Spieltheorie"));
        wirtschaft.addProfessor(new Professor("Dr. Herbert Simon", "Künstliche Intelligenz"));

        uni.addFakultaet(informatik);
        uni.addFakultaet(wirtschaft);

        System.out.println("Universität: " + uni.getName());
        System.out.println("Gesamtzahl Professoren an der Universität: " + uni.getGesamtAnzahlProfessoren());

        System.out.println("\nSuche nach Fachgebiet 'Künstliche Intelligenz':");
        ArrayList<Professor> kiProfessoren = uni.sucheProfessorenNachFachgebiet("Künstliche Intelligenz");
        for (Professor p : kiProfessoren) {
            System.out.println("- " + p);
        }
    }

    private static class Professor {
        private static int counter = 0;

        private final int profId;
        private final String name;
        private final String fachgebiet;

        public Professor(String name, String fachgebiet) {
            counter++;
            this.profId = counter;
            this.name = name;
            this.fachgebiet = fachgebiet;
        }

        public int getProfId() {
            return profId;
        }

        public String getName() {
            return name;
        }

        public String getFachgebiet() {
            return fachgebiet;
        }

        @Override
        public String toString() {
            return "Prof. #" + profId + ": " + name + " (Fachgebiet: " + fachgebiet + ")";
        }
    }

    private static class Fakultaet {
        private final String name;
        private final ArrayList<Professor> professoren;

        public Fakultaet(String name) {
            this.name = name;
            this.professoren = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Professor> getProfessoren() {
            return professoren;
        }

        public void addProfessor(Professor prof) {
            if (prof != null && !professoren.contains(prof)) {
                professoren.add(prof);
            }
        }
    }

    private static class Universitaet {
        private final String name;
        private final ArrayList<Fakultaet> fakultaeten;

        public Universitaet(String name) {
            this.name = name;
            this.fakultaeten = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addFakultaet(Fakultaet fakultaet) {
            if (fakultaet != null && !fakultaeten.contains(fakultaet)) {
                fakultaeten.add(fakultaet);
            }
        }

        public int getGesamtAnzahlProfessoren() {
            int gesamt = 0;
            for (Fakultaet f : fakultaeten) {
                gesamt += f.getProfessoren().size();
            }
            return gesamt;
        }

        public ArrayList<Professor> sucheProfessorenNachFachgebiet(String fachgebiet) {
            ArrayList<Professor> treffer = new ArrayList<>();
            for (Fakultaet f : fakultaeten) {
                for (Professor p : f.getProfessoren()) {
                    if (p.getFachgebiet().equalsIgnoreCase(fachgebiet)) {
                        treffer.add(p);
                    }
                }
            }
            return treffer;
        }
    }
}
