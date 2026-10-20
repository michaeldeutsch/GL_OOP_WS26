package einheit_03.uebung.uebung09;

import java.util.ArrayList;

public class Main {

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
}
