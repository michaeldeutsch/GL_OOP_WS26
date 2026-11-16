package einheit_05.uebung.uebung10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class CampusMitglied {
    private int id;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private LocalDate beitrittsdatum;
    private Rolle rolle;

    // Abstrakte Methode: Muss in Subklassen implementiert werden
    public abstract String getZugangslevel();

    // Finale Methode: Berechnet die Jahre am Campus
    public final int berechneJahreAmCampus() {
        if (beitrittsdatum == null) {
            return 0;
        }
        return Period.between(beitrittsdatum, LocalDate.now()).getYears();
    }

    // Finale Methode: Berechnet das Alter
    public final int berechneAlter() {
        if (geburtsdatum == null) {
            return 0;
        }
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }
}
