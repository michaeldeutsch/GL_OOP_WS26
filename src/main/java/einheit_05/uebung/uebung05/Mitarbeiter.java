package einheit_05.uebung.uebung05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mitarbeiter {
    private int id;
    private String name;
    private LocalDate geburtsdatum;
    private LocalDate eintrittsdatum;

    public int berechneAlter() {
        if (geburtsdatum == null) {
            return 0;
        }
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }

    public int berechneDienstjahre() {
        if (eintrittsdatum == null) {
            return 0;
        }
        return Period.between(eintrittsdatum, LocalDate.now()).getYears();
    }

    public boolean hatJubilaeum(int jahre) {
        return berechneDienstjahre() >= jahre;
    }

    public String getFormatiertesProfil() {
        return "Mitarbeiter #" + id + ": " + name + " | Alter: " + berechneAlter()
                + " Jahre | Eintritt: " + eintrittsdatum + " (" + berechneDienstjahre() + " Dienstjahre)";
    }
}
