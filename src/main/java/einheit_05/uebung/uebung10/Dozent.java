package einheit_05.uebung.uebung10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

// Finale Klasse: Keine Subklassen erlaubt
@Getter
@Setter
@ToString(callSuper = true)
public final class Dozent extends CampusMitglied {
    private String lehrgebiet;
    private double gehalt;

    public Dozent(int id, String vorname, String nachname, LocalDate geburtsdatum, LocalDate beitrittsdatum, String lehrgebiet, double gehalt) {
        super(id, vorname, nachname, geburtsdatum, beitrittsdatum, Rolle.DOZENT);
        this.lehrgebiet = lehrgebiet;
        this.gehalt = gehalt;
    }

    @Override
    public String getZugangslevel() {
        return "Level 2 (Hörsäle, Dozentenbüros, Labore)";
    }
}
