package einheit_02.uebung;

import java.util.ArrayList;

public class Uebung03 {

    public static void main(String[] args) {
        ArrayList<String> teilnehmer = new ArrayList<>();
        teilnehmer.add("Anna");
        teilnehmer.add("Ben");
        teilnehmer.add("Clara");
        teilnehmer.add("David");

        String gesucht = "Clara";
        if (teilnehmer.contains(gesucht)) {
            System.out.println(gesucht + " ist in der Teilnehmerliste.");
        } else {
            System.out.println(gesucht + " ist nicht in der Liste.");
        }

        System.out.println("Größe vor dem Entfernen: " + teilnehmer.size());
        teilnehmer.remove("Ben");
        System.out.println("Größe nach dem Entfernen: " + teilnehmer.size());
        System.out.println("Aktuelle Liste: " + teilnehmer);
    }
}
