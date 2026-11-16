package einheit_05.uebung.uebung10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Forschender extends CampusMitglied {
    private String forschungsprojekt;
    private double budget;

    public Forschender(int id, String vorname, String nachname, LocalDate geburtsdatum, LocalDate beitrittsdatum, String forschungsprojekt, double budget) {
        super(id, vorname, nachname, geburtsdatum, beitrittsdatum, Rolle.FORSCHENDER);
        this.forschungsprojekt = forschungsprojekt;
        this.budget = budget;
    }

    @Override
    public String getZugangslevel() {
        return "Level 3 (Forschungslabore, Serverräume)";
    }
}
