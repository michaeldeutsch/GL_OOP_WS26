package einheit_05.fh;

import einheit_05.person.Geschlecht;
import einheit_05.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter m = new Mitarbeiter("Max", "Mustermann", LocalDate.of(1985, 5, 12), Geschlecht.MAENNLICH, true, 101, Arbeitsform.Vollzeit);
        Student s = new Student("Anna", "Musterfrau", LocalDate.of(2002, 10, 20), Geschlecht.WEIBLICH, true, 202401);
        Bachelor b = new Bachelor("Leon", "Beispiel", LocalDate.of(2003, 3, 15), Geschlecht.DIVERS, true, 202402);

        System.out.println("--- Instanz-Ausgaben ---");
        System.out.println(m);
        System.out.println(s);
        System.out.println(b);

        System.out.println("\n--- Polymorpher Aufruf von getInfo() ---");
        List<Person> personen = new ArrayList<>();
        personen.add(m);
        personen.add(s);
        personen.add(b);

        for (Person p : personen) {
            p.getInfo();
            p.gibStatus();
            p.tueIrgendwas();
        }

        System.out.println("\n--- Datumsberechnung mit Period ---");
        LocalDate heute = LocalDate.now();
        LocalDate geburtsdatum = s.getGeburtsdatum();
        Period alter = Period.between(geburtsdatum, heute);
        System.out.println(s.getVorname() + " ist " + alter.getYears() + " Jahre alt.");
    }
}
